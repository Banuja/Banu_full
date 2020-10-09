package com.test.qa.cards.ResultandReport;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;


import java.util.logging.Logger;

public class RawMaterial extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(RawMaterial.class));

    @Test(priority = 1, groups = {"Smoke"})
    public void RawTestResult() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");// click result & report
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//click raw material test result
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div");//select subcatogory
        PageBase.staticWait(2);
        MethodBase.hitEnter();
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div/div");//select test name
        PageBase.staticWait(2);
        MethodBase.hitEnter();
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[3]/div/div/div");//select incoming sample
        PageBase.staticWait(2);
        MethodBase.hitEnter();
        PageBase.staticWait(2);
        Thread.sleep(2000);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]"); // Table view

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/i"); // Click details
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click ok
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/i");//click trial result
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/button/span/i");//click Cancelbtn
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[10]/i");//click result
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/button/span/i");//closeBtn
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[9]/i");//To Trial
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button");//view result
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a/div");//dashboard
        softAssert.assertAll();


        /**  Filter Option */


        // MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//filter
        // PageBase.staticWait(9);
        // MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div/div");//filter By material wise
        //PageBase.staticWait(8);
        // MethodBase.hitEnter();
        // PageBase.staticWait(2);
        // MethodBase.click_ByXpath("/html/body/div[6]/d" +
        //"iv/div[2]/div/div/div[2]/div/div[2]/div/div/div/div");//Filtering By between
        //PageBase.staticWait(9);
        // MethodBase.hitEnter();
//
//       MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[7]/i");//Details
//       MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/div/button[2]");//OkBtn

    }
}





