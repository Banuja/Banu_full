package com.test.qa.cards.testConfiguration.parameterNV;
import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class ParameterMTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

    @Test(groups = {"Smoke"}, priority = 2)
        public void ParameterTest() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// parameter page display
        LOGGER.info("ParameterTest is Display");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click add parameter
        MethodBase.setText_ByID("parameter_name", "weight of the own sample ");//set parameter name
        MethodBase.click_ById(" parameterType");//click parameter type dropdown
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        LOGGER.info(" ParameterTest Successfully Added");
        softAssert.assertAll();
    }
//    @Test(groups = {"Smoke"}, priority = 3)
//        public void parameterValidation() throws Exception {
//            softAssert = new SoftAssert();
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click add parameter
//            PageBase.staticWait(8);
//            MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"); // click save btn
//            PageBase.staticWait(8);
//            MethodBase.assertEqual_Text_ByXpath("//*[@style=\"color: red; font-size: 12px; width: 300px; height: 2px;\"]","Parameter Name can't be empty"); // paramter name validation
//            LOGGER.info("Parameter Name can't be empty");
//            PageBase.staticWait(5);
//            MethodBase.assertEqual_Text_ByXpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]","Parameter Type can't be empty");// parameter type validation
//            LOGGER.info("Parameter Type can't be empty");
//            // MethodBase.escape();
//            MethodBase.click_ByXpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[1]"); // click cancel
//
//            softAssert.assertAll();
//    }

    @Test(groups = {"Smoke"}, priority = 4)
        public void parameterEditFunction() throws Exception {
            softAssert = new SoftAssert();
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
            PageBase.staticWait(8);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i");//Click Edit btn
            PageBase.staticWait(5);
            MethodBase.setText_ByID("parameter_name", "weight of the own sample_Data");//set parameter name
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
            PageBase.staticWait(5);
            LOGGER.info("Edit parameter_name Updated Successfully");
            softAssert.assertAll();
    }
    @Test(groups = {"Smoke"}, priority = 1)
        public void parameterDeleteFunction() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/span/a[2]/a/i");//click delete btn
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");// Conform Delete ok
        LOGGER.info("Can't delete this module ");
        softAssert.assertAll();
    }

    }


