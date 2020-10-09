package com.test.qa.cards.testConfiguration.testNV;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class test01 extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

    @Test(priority = 1, groups = {"Smoke"})
    public void add_Test_method() {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
        PageBase.staticWait(5);

                                            /* validation */

        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//*[text()=\"Name can't be empty\"]", "Name can't be empty");
        PageBase.staticWait(5);
        LOGGER.info("Name can't be empty");
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]");// click cancel

                                            /* data added */

        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
        PageBase.staticWait(5);
        MethodBase.setText_ByID("test_name", "orange_test_02");//set test name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(5);
        LOGGER.info("Test Successfully Added ");
        PageBase.staticWait(5);
                                            /* test edit method */

//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/a[1]/i");//click edit
//        MethodBase.setText_ByID("test_name", "T_Test");//edit test name
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"); // edit name save
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]","Test Name is Already Exist");
//        LOGGER.info("Test Name is Already Exist");
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]"); //  click cancel
//        PageBase.staticWait(5);

         MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]/span/a[1]/i");//click edit
        MethodBase.setText_ByID("test_name", "True_Test_01");//edit test name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"); // edit name save
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//edit save page display
        PageBase.staticWait(5);
        LOGGER.info("Test Updated Successfully");
        PageBase.staticWait(5);

                                              /* delete method */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/a[2]/a/i");// click delete
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div[2]/div/div/div[2]/button[2]");
        LOGGER.info(" Test Successfully Deleted");
        softAssert.assertAll();
    }
}
