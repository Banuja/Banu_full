package com.test.qa.cards.testConfiguration.ConfigrationNV;

import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Config extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

    @Test(priority = 1, groups = {"Smoke"})
    public void addTestDetails() throws Exception {
        softAssert = new SoftAssert();

                                /**
                                 * Test NV
                                 */
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
        PageBase.staticWait(5);
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");//Test page display
        LOGGER.info("Test Page is Display");
        PageBase.staticWait(5);

        /** T_Delete */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/a[2]/a/i");// click delete
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]"); // delete ok
        LOGGER.info(" Can't this modual Deleted");
        PageBase.staticWait(5);
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");//Test page display
        LOGGER.info("Test Page is Display");
        PageBase.staticWait(5);

        /** T_Add */

        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//*[text()=\"Name can't be empty\"]", "Name can't be empty");
        PageBase.staticWait(5);
        LOGGER.info("Name can't be empty");
        MethodBase.setText_ByID("test_name", "AB_Test");//set test name
        LOGGER.info("Test Name is Already Exist");
        MethodBase.setText_ByID("test_name", "M4_Test");//set test name
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//save page display
        PageBase.staticWait(5);
        LOGGER.info("Test Successfully Added ");
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");//Test page display
        LOGGER.info("Test Page is Display");
        PageBase.staticWait(5);

        /**T_Edit */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span/a[1]/i");//click edit
        MethodBase.setText_ByID("test_name", "TEST_True");//edit test name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"); // edit name save
        PageBase.staticWait(8);
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//edit save page display
        PageBase.staticWait(5);
        LOGGER.info("Test Updated Successfully");



                            /**
                             * parameter NV
                             * */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// parameter page display
        LOGGER.info("ParameterTest is Display");
        PageBase.staticWait(5);

        /** P_Delete */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/span/a[2]/a/i");//click delete btn
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");// Conform Delete ok
        LOGGER.info("Can't delete this module ");
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// parameter page display
        LOGGER.info("ParameterTest is Display");
        PageBase.staticWait(5);

       /** P_Add */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click add parameter
        MethodBase.setText_ByID("parameter_name", "weight of the own sample ");//set parameter name
        MethodBase.click_ById(" parameterType");//click parameter type dropdown
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        LOGGER.info(" ParameterTest Successfully Added");
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// parameter page display
        LOGGER.info("ParameterTest is Display");
        PageBase.staticWait(5);


    //    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click add parameter
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

   /** P_edit */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i");//Click Edit btn
        PageBase.staticWait(5);
        MethodBase.setText_ByID("parameter_name", "weight of the sample_Data");//set parameter name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(5);
        LOGGER.info("Edit parameter_name Updated Successfully");
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// parameter page display
        LOGGER.info("ParameterTest is Display");
        PageBase.staticWait(5);



                       /**
                        * Quality parameter
                        * */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//click quality parameter
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");// Quality parameter page display
        LOGGER.info("Quality parameter page is Display ");
        PageBase.staticWait(8);

        /** Q_P_Delete */

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/span/a[2]/a/i"); // click delete
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");//click delete ok btn
        PageBase.staticWait(8);
        LOGGER.info("Quality Parameter Successfully Deleted");

       /** Q_P_add  */

        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");// add quality parameter
        MethodBase.setText_ByID("parameter_name","slump");//set parameter name
        MethodBase.click_ByXpath("//*[@id=\"materialSubCategoryId\"]/div/div");// click material subcategory
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save
        LOGGER.info("QualityParameter Successfully  Added");
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");// Quality parameter page display
        LOGGER.info("Quality parameter page is Display ");
        PageBase.staticWait(8);

        /** Q_P_Edit */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i"); // click edit
        PageBase.staticWait(8);
        MethodBase.setText_ByID("parameter_name","sieve_05");//set parameter name
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save
        PageBase.staticWait(8);
        LOGGER.info("Q_Parameter_Name Updated Successfully");
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");// Quality parameter page display
        LOGGER.info("Quality parameter page is Display ");
        PageBase.staticWait(8);
        softAssert.assertAll();
    }

}
