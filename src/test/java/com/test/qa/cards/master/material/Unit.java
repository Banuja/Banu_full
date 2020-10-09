package com.test.qa.cards.master.material;


import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.io.IOException;
import java.util.logging.Logger;

public class Unit extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Unit.class)));

    @Test(groups = {"Smoke"}, priority = 22)
    public static void addUnitSmokeTest() throws Exception {
        /*
To Check validation
         */


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[5]/div[1]");//unit field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add unit
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// to verify the unit layout
        MethodBase.setText_ByXpath("//*[@id=\"unit_name\"]", "");//unit_name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Unit can't be empty\"]","Unit can't be empty");
        LOGGER.info("Unit can't be empty");

        /*
    Data Input
         */

        MethodBase.setText_ByXpath("//*[@id=\"unit_name\"]", "Mo");//unit_name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);

    }


        @Test(groups = {"Smoke"}, priority = 23)
        public static void editUnitSmokeTest() {
        /*
        TO edit Details
        */

            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[5]/div[1]");//unit field
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i");//Click edit icon
            MethodBase.clear_ByXpath("//*[@id=\"unit_name\"]","ML");// clear existing data
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save

        }


    @Test(groups = {"Smoke"}, priority = 24)
    public  static void deleteUnitSmokeTest()  {


/*
TO Delete Details
 */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[5]/div[1]");//unit field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[3]/span/a[2]/a/i");//delete
        MethodBase.click_ByXpath("//span[text()=\"OK\"]");//ok

    }
    }


