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
        MethodBase.setText_ByID("test_name", "BA_Test");//set test name
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
        MethodBase.setText_ByID("test_name", "TEST_01");//edit test name
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
    @Test(priority = 9,groups = {"Smoke"})

    /** Check the Validation for first page , Next Page button [CONFIGURE TEST 01 ] */
    public void test0() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configuration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//click configure test
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div/div[2]/span");//click configure test 1

        /** fill the data for first step , Next Page button  */

        MethodBase.click_ByXpath("//*[@id=\"test\"]/div");//click test drop down
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"test_type\"]/div");//click test type
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("prefix","J01");//set prefix
        MethodBase.click_ByXpath("//*[@id=\"main_category\"]/div/div");//click main category
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div"); // click subcategory
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"material\"]/div/div"); // click material
        MethodBase.hitEnter();
        MethodBase.setText_ByID("description","data");// set description
        MethodBase.setText_ByID("procedure","procedure"); // set procedure
        MethodBase.click_ById("report_format"); // click reportformat
        MethodBase.click_ById("coretest");//KeyTest
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[5]/button"); // click Submit button
        PageBase.staticWait(10);

        /** fill the data for second  step ,Checkbox button [TEST PARAMETER 02 ]  */

        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
        PageBase.staticWait(10);
        MethodBase.setText_ByXpath("//*[@id=\"parameter_name\"]","  Weight of oven dried Sample in air_8A");// enter parameter name
        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div");// click Parameter type
        PageBase.staticWait(10);
        MethodBase.hitEnter();


        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save
        PageBase.staticWait(10);

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
        PageBase.staticWait(10);
        MethodBase.setText_ByXpath("//*[@id=\"parameter_name\"]","Weight of saturated surface Dry sample in air_8B");// enter parameter name
        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div");// click Parameter type
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save


        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[1]/div/div/div[3]"); // Select Add Parameter
        PageBase.staticWait(10);
        MethodBase.setText_ByXpath("//*[@id=\"parameter_name\"]","  Water Absorption %_8C");// enter parameter name
        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div");// click Parameter type
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");// Click save

        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/label");// click checkbox
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[3]/label"); // Select Checkbox 02
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/label"); // Select Checkbox 03
        PageBase.staticWait(10);

        /** [TEST PARAMETER __ ]  */
        MethodBase.setText_ByXpath("//*[@id=\"abbrivation\"]","R"); // enter Abbravation

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/div/div");// Click Type
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/ul/li[3]"); // select Result
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div/div"); // click INPUT METHOD
        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/ul/li[1]");// click Calculation
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/div");// Click Unit
//        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/ul/li[2]");// Select  Unit
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[9]/label/span/input");// click relevent

        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[3]/span/input","B"); // enter Abbravation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[4]/div/div");// Click Type
        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/ul/li[1]"); // Click INPUT
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[5]/div/div"); // Click INPUT METHOD
        MethodBase.click_ByXpath("/html/body/div[9]/div/div/div/ul/li[2]");// click OBSERVE
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[7]/div/div");// Click Unit
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/ul/li[2]");// CLICK UNIT
        PageBase.staticWait(10);
        MethodBase.hitEnter();

        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/span/input","A"); // enter Abbravation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[4]/div/div");// Click Type
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[1]");// Click INPUT
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[5]/div/div");// click Input
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/ul/li[2]"); // CLICK OBSERVE
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[7]/div/div");// Click Unit
//        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // CLICK UNIT G
        PageBase.staticWait(10);
        MethodBase.hitEnter();

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[3]/div/div[2]/button"); // click submit parameter
        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/button[1]"); // click next page

        /** fill the data for third   step [CONFEGRATION EQUATION 03 ]  */

//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[3]/div"); // Config Equation
        PageBase.staticWait(10);
        MethodBase.clickText_ByID("//input[@id=\"2\"]","RESULT"); // Click Result radiobutton
        MethodBase.click_ByXpath("//input[@id=\"2\"]");
        PageBase.staticWait(10);

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div"); // click test parameter
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/label/span/input"); // SELECT PARAMETER B
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/label/span/input"); // SELECT THE PARAMETER A
        PageBase.staticWait(10);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/textarea","(B-A)/B*100"); // Create Equation (B-A)/B*100
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[3]/button");// CLICK Submit Equation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[3]/button[1]"); // Click Next Button




/** fill the data for Fourth step [Accepcted Criteria 04 ]  */

//MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[4]"); // Click Number 4



//MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div[1]/p"); // Validate the page is Visible
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[2]/div[1]/label[1]/span[1]/input"); // Click Test
        PageBase.staticWait(10);
        MethodBase.clickText_ByID("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[2]/div[1]/label[1]/span[1]/input","Test"); // Click Test RadioButton
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[2]/div[1]/label[1]/span[1]/input");
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div"); // Click Select parameter
        PageBase.staticWait(10);
        MethodBase.hitEnter();

        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[2]/div/div/div[1]/div/input","0"); // Minimum
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[2]/div/div/div[3]/div/input","3");// Maximum
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[3]/div/label[2]/span/input"); // Click Relevent to Result
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[6]/button"); // Click Submit button
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div"); // Click Next Page

        /** fill the data for Fifth step [REVIWE TEST 05 ]  */
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[3]/button[1]"); // Click DONE
//        MethodBase.assertEqual_Text_ByXpath("/div/div/div/span","Processing complete!"); // Check the validation page.

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
