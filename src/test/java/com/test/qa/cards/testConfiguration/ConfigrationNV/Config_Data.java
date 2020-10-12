package com.test.qa.cards.testConfiguration.ConfigrationNV;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Config_Data extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Config_Data.class));

    @Test(priority = 2, groups = {"Smoke"})
    public void addTestDetails() {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
        PageBase.staticWait(10);
        MethodBase.setText_ByID("test_name", "BC_Test");//set test name
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//save page display
        PageBase.staticWait(10);
        LOGGER.info("Test Successfully Added ");
        softAssert.assertAll();
    }

    @Test(priority = 3, groups = {"Smoke"})

    public void test_validation() {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        LOGGER.info("click config");
        MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add test
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(10);
        MethodBase.assertEqual_Text_ByXpath("//*[text()=\"Name can't be empty\"]", "Name can't be empty");
        PageBase.staticWait(10);
        LOGGER.info("Name can't be empty");
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]");// click cancel
        softAssert.assertAll();
    }

    @Test(priority = 4, groups = {"Smoke"})

    public void test_EditFunction() {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span/a[1]/i");//click edit
        MethodBase.setText_ByID("test_name", "TEST_01A");//edit test name
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]"); // edit name save
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");//edit save page display
        PageBase.staticWait(10);
        LOGGER.info("Test Updated Successfully");
        softAssert.assertAll();
    }

    @Test(priority = 1, groups = {"Smoke"})

    public void test_DeleteFunction() {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        MethodBase.click_ByXpath("//*[@style=\"color: rgb(255, 255, 255); background-color: rgb(24, 144, 255); padding-left: 8px; padding-right: 8px;\"]");// click testNV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/a[2]/a/i");// click delete
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");
        PageBase.staticWait(10);
        LOGGER.info(" Test Successfully Deleted");
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 5)

    public void ParameterTest() throws Exception {
        softAssert = new SoftAssert();//
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");// click parameter field
        PageBase.staticWait(10);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// parameter page display
        LOGGER.info("ParameterTest is Display");
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//click add parameter
        MethodBase.setText_ByID("parameter_name", "weight of the own sample ");//set parameter name
        MethodBase.click_ById(" parameterType");//click parameter type dropdown
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        LOGGER.info(" ParameterTest Successfully Added");
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 7)

        public void parameterValidation() throws Exception {
            softAssert = new SoftAssert();
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
            PageBase.staticWait(10);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
            PageBase.staticWait(10);
            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//click add parameter
            PageBase.staticWait(10);
            MethodBase.click_ByXpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]"); // click save btn
            PageBase.staticWait(10);
            MethodBase.assertEqual_Text_ByXpath("//*[@style=\"color: red; font-size: 12px; width: 300px; height: 2px;\"]","Parameter Name can't be empty"); // paramter name validation
//            LOGGER.info("Parameter Name can't be empty");
//            PageBase.staticWait(5);
//            MethodBase.assertEqual_Text_ByXpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]","Parameter Type can't be empty");// parameter type validation
//            LOGGER.info("Parameter Type can't be empty");
//             MethodBase.escape();
//            MethodBase.click_ByXpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[1]"); // click cancel
            softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 6)
    public void parameterEditFunction() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        PageBase.staticWait(10
        );
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// click parameter field
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[8]/td[3]/span/a[1]/i");//Click Edit btn
        PageBase.staticWait(10);
        MethodBase.setText_ByID("parameter_name", "Weight of the Mould value_1");//set parameter name
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(10);
        LOGGER.info("Edit parameter_name Updated Successfully");
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 8)
    public void parameterDeleteFunction() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");// click parameter field
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/span/a[2]/a/i");//click delete btn
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div[2]/div/div/div[2]/button[2]");// Conform Delete ok
        PageBase.staticWait(10);
        LOGGER.info("Can't delete this module ");
        MethodBase.escape();
        softAssert.assertAll();
    }


    /**
     * Manage Test Configuration
     */

    @Test(priority = 10,groups = {"Smoke"})
    public void Test_Parameters_View() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
        LOGGER.info("Manage Test Configuration Page is Display");
       PageBase.staticWait(10);
       MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/i");//click parametertest view
        PageBase.staticWait(10);
       MethodBase.isDisplayed_ById("rcDialogTitle0");// parameter page display
        PageBase.staticWait(10);
       LOGGER.info("Test Parameters is Display");
//       MethodBase.escape();
       /* delete */
      PageBase.staticWait(10);
      MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[7]/span/a/a/i");//delete
      PageBase.staticWait(10);
      MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div[2]/div/div/div[2]/button[2]");//delete confirm
         PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/button/span/i");//close icon

       /* Accepted value */
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/span/i");//Accepted value
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[5]/span/a[1]/i");//edit
        PageBase.staticWait(10);
        MethodBase.clear_ById("value","8");//edit value
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]");//save
        PageBase.staticWait(10);
//        MethodBase.escape();

      /* click equation*/
       MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/span/i");//click equation
       PageBase.staticWait(10);
       MethodBase.isDisplayed_ById("rcDialogTitle1");// equation page display
//        LOGGER.info("Equation Page is Display");
       MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[5]/span/a[1]/i");//edit Equation
       PageBase.staticWait(10);
       MethodBase.click_ById("equation_formula");//formula
       PageBase.staticWait(10);
       MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]");//save
       LOGGER.info("Equation updated Successfully ");
       MethodBase.escape();
    }


    @Test(priority = 11,groups = {"Smoke"})

    public void managetest_ConfigurationEdit() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
        LOGGER.info("Manage Test Configuration Page is Display");
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[1]/i");// click edit btn
        PageBase.staticWait(10);
        MethodBase.click_ById("coretest");//click keytest
        MethodBase.setText_ByID("description","Description");// set description
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(10);
        LOGGER.info("Updated Successfully");
          MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[9]/span/a[2]/a/i");// click delete
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div[2]/div/div/div[2]/button[2]");//delete confirm
        PageBase.staticWait(10);
        softAssert.assertAll();
    }
}
