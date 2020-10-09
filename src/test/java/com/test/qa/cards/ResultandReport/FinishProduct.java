package com.test.qa.cards.ResultandReport;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class FinishProduct extends TestBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FinishProduct.class));

    @Test(priority = 1, groups = {"Smoke"})
    public void finishproductresult() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");//Result and report
        PageBase.staticWait(2);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[2]/div[1]");////finish product test result
        PageBase.staticWait(2);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("//html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/button");//filter
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div/div[2]/div/div[1]/div/div");//select filter
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div/div[2]/div/div[2]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("grade","35");
        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div/div[2]/div/div[2]/button");//search
        PageBase.staticWait(5);
        Thread.sleep(2000);
        softAssert.assertAll();

    }
}

