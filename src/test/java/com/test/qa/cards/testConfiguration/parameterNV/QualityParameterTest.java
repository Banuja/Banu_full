package com.test.qa.cards.testConfiguration.parameterNV;


import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class QualityParameterTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

    @Test(groups = {"Smoke"}, priority = 2)
    public void QualityParameterAddTest() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//click quality parameter
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");// Quality parameter page display
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");// add quality parameter
        MethodBase.setText_ByID("parameter_name","slump");//set parameter name
        MethodBase.click_ByXpath("//*[@id=\"materialSubCategoryId\"]/div/div");// click material subcategory
        Thread.sleep(3000);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save
        LOGGER.info("QualityParameter Successfully  Added");
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 3)
    public void QP_EditFunction() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click parameter NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//click quality parameter
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");// Quality parameter page display
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i"); // click edit
        PageBase.staticWait(8);
        MethodBase.setText_ByID("parameter_name","sieve_03");//set parameter name
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// click save
        PageBase.staticWait(8);
        LOGGER.info("Q_Parameter_Name Updated Successfully");
        softAssert.assertAll();
    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void QP_DeleteFunction() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");//click configration
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//click  parameter NV
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[2]/div[1]");//click quality parameter
        MethodBase.isDisplayed_ByXpath("//*[@style=\"font-size: medium; font-weight: 600; align-self: auto; padding: 10px;\"]");// Quality parameter page display
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/span/a[2]/a/i"); // click delete
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[2]/button[2]");//click delete ok btn
        PageBase.staticWait(8);
        LOGGER.info("Quality Parameter Successfully Deleted");
        softAssert.assertAll();
    }

}

