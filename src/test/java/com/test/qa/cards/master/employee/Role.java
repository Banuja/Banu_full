package com.test.qa.cards.master.employee;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Role extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Role.class)));
    @Test(groups = {"Smoke"}, priority = 44)
    public static void  addroleSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//roleMenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//addRole
        /*
        Validation Checking
         */
        MethodBase.setText_ByXpath("//*[@id=\"role_name\"]","");//txt role
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Role can't be empty\"]", "Role can't be empty");
        LOGGER.info("Role can't be empty");

        /*
        Data Input
         */
        MethodBase.setText_ByXpath("//*[@id=\"role_name\"]","Normal User");//txt role
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }


    @Test(groups = {"Smoke"}, priority = 45)
    public static  void  editroleSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//roleMenu
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[4]/td[2]/span/a[1]/i");//edit button
        MethodBase.clear_ByXpath("//*[@id=\"role_name\"]","controller");//txt role
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

//    @Test(groups = {"Smoke"}, priority = 46)
//    public static void  deleteroleSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//roleMenu
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[6]/td[2]/span/a[2]/a/i");//delete
//        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div[2]/div/div/div[2]/button[2]");//ok
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//verify the display
//
//
//
//    }

}
