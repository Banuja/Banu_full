package com.test.qa.Full_Code;

import com.test.qa.cards.ResultandReport.RawMaterial;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class ResultandReport extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(RawMaterial.class));

    @Test(priority = 72, groups = {"Smoke"})
    public void RawTestResult() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");// click result & report
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[1]");//click raw material test result
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[6]");//click more
        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[10]/span/i");//Click trail result
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/div/button[2]");//ok
//        PageBase.staticWait(10);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[12]/span/i");//View Report
//        PageBase.staticWait(10);
    }

    @Test(priority = 73, groups = {"Smoke"})
    public void finishproductresult() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");//Result and report
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[2]/div[1]");////finish product test result
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[8]/span/i");//comment
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/div/button[2]");//ok
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[9]/span/i");//trail result
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/div/button[2]");//Ok
        PageBase.staticWait(10);
        softAssert.assertAll();

    }
}
