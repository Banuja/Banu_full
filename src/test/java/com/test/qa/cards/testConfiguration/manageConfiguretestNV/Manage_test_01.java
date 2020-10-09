package com.test.qa.cards.testConfiguration.manageConfiguretestNV;

import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;
import java.util.logging.Logger;


public class Manage_test_01 extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));
    /**
     * Manage Test Configuration
     */

    @Test(priority = 1,groups = {"Smoke"})
    public void Test_Parameters_View() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");// click manageconfiguretestNV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//click managetestfield
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
        LOGGER.info("Manage Test Configuration Page is Display");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/i");//click parametertest view
        MethodBase.isDisplayed_ById("rcDialogTitle0");// parameter page display
        LOGGER.info("Test Parameters is Display");
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[7]/span/a[1]/i");//click edit in parameter test
        PageBase.staticWait(8);
        MethodBase.isDisplayed_ById("rcDialogTitle1");//edit parameter page view
        LOGGER.info("Edit Test Parameter");
//                MethodBase.click_ByXpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/span/a[2]/a/i");//delete
        MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[2]");//click save btn
        PageBase.staticWait(10);
        LOGGER.info("Parameter Page updated Successfully ");
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/span/i");//Accepted value
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[6]/span/a[1]/i");//Edit accepeted value
        PageBase.staticWait(8);
        MethodBase.clear_ById("minimum","6");//Edit min
        PageBase.staticWait(5);
        MethodBase.clear_ById("maximum","10");//Edit max
        PageBase.staticWait(5);
        MethodBase.setText_ByID("value","7");
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");//click save btn
        PageBase.staticWait(10);
        LOGGER.info("Accepted Value updated Successfully ");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/i");//click equation
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/span/a[1]/i");//edit Equation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/div/button[2]");//click save btn
        PageBase.staticWait(10);
        LOGGER.info("Equation updated Successfully ");

        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-family: Roboto; color: white; text-align: center; padding: 10px;\"]");// page display
        LOGGER.info("Manage Test Configuration Page is Display");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[1]/i");// click edit btn
        PageBase.staticWait(8);
        MethodBase.click_ById("coretest");//click keytest
        MethodBase.setText_ByID("description","Description");// set description
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save btn
        PageBase.staticWait(8);
        LOGGER.info("Updated Successfully");
        //  MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[9]/span/a[2]/a/i/svg");// click delete
        softAssert.assertAll();
    }


}

