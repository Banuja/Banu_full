package com.test.qa.cards.master.customer;

import com.test.qa.cards.master.material.MaterialCtaegory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Customer extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Customer.class)));

    @Test(groups = {"Smoke"}, priority = 26)
    public static void addcustomerSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[3]/button");//Add Customer

        /*
       Validation Checking
         */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@id=\"customer_plant\"]/div/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"customer_name\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"customer_email\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"customer_address\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"customer_contactno\"]","");
        PageBase.staticWait(5);
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        LOGGER.info("Name can't be empty");
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]","Address can't be empty");
//        LOGGER.info("Address can't be empty");
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact No can't be empty\"]","Contact No can't be empty");
//        LOGGER.info("Contact No can't be empty");


         /*
         Data Input
          */


        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"customer_plant\"]/div/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"customer_name\"]","Ano");
        MethodBase.setText_ByXpath("//*[@id=\"customer_email\"]","ano@gmail.com");
        MethodBase.setText_ByXpath("//*[@id=\"customer_address\"]","jaffna");
        MethodBase.setText_ByXpath("//*[@id=\"customer_contactno\"]","07789654231");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/button");


        /*
        View Plant Description
         */
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/i");//View descrition of plant
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/span/i");// Other plant
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div/label[1]/span[1]/input");//Check box plants
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");
    }



    @Test(groups = {"Smoke"}, priority = 27)
    public static void editcustomerSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Customer
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span/i");//View card Plant
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[9]/span/a[1]/i");//Edit Icon
        MethodBase.clear_ByXpath("//*[@id=\"customer_name\"]","Const");
        MethodBase.clear_ByXpath("//*[@id=\"customer_email\"]","Const@gmai.com");
        MethodBase.clear_ByXpath("//*[@id=\"customer_address\"]","Jaffna");
        MethodBase.clear_ByXpath("//*[@id=\"customer_contactno\"]","0771165321");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/button");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/span/i");//Allocate Plant view

    }

//    @Test(groups = {"Smoke"}, priority = 28)
//    public static void deletecustomerSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Customer
//        PageBase.staticWait(5);
//       MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[2]/a/i");//delete buuton
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div[2]/div/div/div[2]/button[2]");//Delete Confirm
//
//    }
}
