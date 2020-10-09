package com.test.qa.cards.testConfiguration.testNV;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class AddTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

    @Test(priority = 2, groups = {"Smoke"})
         public void addTestDetails() {
            softAssert = new SoftAssert();
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
            MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
            PageBase.staticWait(5);
            MethodBase.setText_ByID("test_name", "AB_Test");//set test name
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
            MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//save page display
            PageBase.staticWait(5);
            LOGGER.info("Test Successfully Added ");
            softAssert.assertAll();
    }

    @Test(priority = 3, groups = {"Smoke"})
        public void test_validation() {
            softAssert = new SoftAssert();
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
            LOGGER.info("click config");
            MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
            PageBase.staticWait(5);
            MethodBase.assertEqual_Text_ByXpath("//*[text()=\"Name can't be empty\"]", "Name can't be empty");
            PageBase.staticWait(5);
            LOGGER.info("Name can't be empty");
            MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]");// click cancel
            softAssert.assertAll();
        }

    @Test(priority = 4, groups = {"Smoke"})
        public void test_EditFunction() {
            softAssert = new SoftAssert();

            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
            MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span/a[1]/i");//click edit
            MethodBase.setText_ByID("test_name", "TEST_01");//edit test name
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"); // edit name save
            MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//edit save page display
            PageBase.staticWait(5);
            LOGGER.info("Test Updated Successfully");
            softAssert.assertAll();
    }
    @Test(priority = 1, groups = {"Smoke"})
        public void test_DeleteFunction() {
            softAssert = new SoftAssert();
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
            MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
            PageBase.staticWait(5);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/a[2]/a/i");// click delete
            MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");
            LOGGER.info(" Test Successfully Deleted");
            softAssert.assertAll();
        }
    }

