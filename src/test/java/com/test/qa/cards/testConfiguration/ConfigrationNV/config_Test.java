package com.test.qa.cards.testConfiguration.ConfigrationNV;

import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

public class config_Test {

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
        MethodBase.setText_ByID("prefix","J011");//set prefix
        MethodBase.click_ByXpath("//*[@id=\"main_category\"]/div/div");//click main category
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div"); // click subcategory
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ById("material"); // click material
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.setText_ByID("description","data");// set description
        PageBase.staticWait(10);
        MethodBase.setText_ByID("procedure","procedure"); // set procedure
        PageBase.staticWait(10);
        MethodBase.click_ById("report_format"); // click reportformat
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.click_ById("coretest");//KeyTest
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div[2]/div[5]/button"); // click Submit button
        PageBase.staticWait(10);

        /** fill the data for second  step ,Checkbox button [TEST PARAMETER 02 ]  */

        PageBase.staticWait(10);

        PageBase.staticWait(10);

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[3]/label/span/input"); // Select Checkbox 02
        PageBase.staticWait(10);


        /** [TEST PARAMETER __ ]  */
        MethodBase.setText_ByXpath("//*[@id=\"abbrivation\"]","R"); // enter Abbravation

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/div/div");// Click Type
        PageBase.staticWait(10);
        PageBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"input\"]/div/div/div"); // input Method
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/div");// Click Unit
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        PageBase.staticWait(10);
        MethodBase.click_ById("check_relevant");// click relevent
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/form[2]/div/div/div/div/div[2]/div/div[3]/div/div[2]/button");//Submit Para
        PageBase.staticWait(10);
//

        /** fill the data for third   step [CONFEGRATION EQUATION 03 ]  */

////        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[3]/div"); // Config Equation
//        PageBase.staticWait(10);
//        MethodBase.clickText_ByID("//input[@id=\"2\"]","RESULT"); // Click Result radiobutton
//        MethodBase.click_ByXpath("//input[@id=\"2\"]");
//        PageBase.staticWait(10);
//
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div"); // click test parameter
//        MethodBase.hitEnter();
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/label/span/input"); // SELECT PARAMETER B
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/label/span/input"); // SELECT THE PARAMETER A
//        PageBase.staticWait(10);
//        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/textarea","(B-A)/B*100"); // Create Equation (B-A)/B*100
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div[3]/button");// CLICK Submit Equation
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[3]/button[1]"); // Click Next Button
//
//
//
//
///** fill the data for Fourth step [Accepcted Criteria 04 ]  */
//
////MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[4]"); // Click Number 4
//
//
//
////MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div[1]/p"); // Validate the page is Visible
////        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[2]/div[1]/label[1]/span[1]/input"); // Click Test
//        PageBase.staticWait(10);
//        MethodBase.clickText_ByID("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[2]/div[1]/label[1]/span[1]/input","Test"); // Click Test RadioButton
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[2]/div[1]/label[1]/span[1]/input");
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div"); // Click Select parameter
//        PageBase.staticWait(10);
//        MethodBase.hitEnter();
//
//        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[2]/div/div/div[1]/div/input","0"); // Minimum
//        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[2]/div/div/div[3]/div/input","3");// Maximum
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[3]/div[3]/div/label[2]/span/input"); // Click Relevent to Result
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[6]/button"); // Click Submit button
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div"); // Click Next Page
//
//        /** fill the data for Fifth step [REVIWE TEST 05 ]  */
//        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[3]/button[1]"); // Click DONE
////        MethodBase.assertEqual_Text_ByXpath("/div/div/div/span","Processing complete!"); // Check the validation page.

    }
}
