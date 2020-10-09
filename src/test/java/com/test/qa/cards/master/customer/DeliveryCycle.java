package com.test.qa.cards.master.customer;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DeliveryCycle extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((DeliveryCycle.class)));

    @Test(groups = {"Smoke"}, priority = 32)
    public static void adddeliveryCycleSmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
         MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//deliveryCycle Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add pour

        /*
        Check Validation
         */

        MethodBase.setText_ByXpath("//*[@id=\"pour_name\"]","");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"project\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Pour No can't be empty\"]","Pour No can't be empty");
        LOGGER.info("Unit can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Project can't be empty\"]","Project can't be empty");
        LOGGER.info("Project can't be empty");


        /*
       Input Data
         */

        MethodBase.setText_ByXpath("//*[@id=\"pour_name\"]","Plliar-09");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"project\"]/div/div");
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","project_entry");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 33)
    public static void editdeliveryCycleSmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//deliveryCycle Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[1]/i");//edit
        MethodBase.clear_ByXpath("//*[@id=\"pour_name\"]","p006");
        MethodBase.click_ByXpath("//*[@id=\"project\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.clear_ByXpath("//*[@id=\"description\"]","project descp");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

//    @Test(groups = {"Smoke"}, priority = 34)
//    public  static void deletedeliveryCycleSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//deliveryCycle Field
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[2]/a/i");//delete
//        PageBase.staticWait(2);
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]");// confirm
//        PageBase.staticWait(5);
//
//
//
//    }
}
