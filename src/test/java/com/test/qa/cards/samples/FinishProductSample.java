package com.test.qa.cards.samples;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class FinishProductSample extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"},priority = 1)
    public void TestResultTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); //click test more
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 2)
    public void TestResultCancelTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); // click test result
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@class=\"ant-btn\"]"); // click cancel
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 3)
    public void TestResultOkTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); // click test result
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@class=\"ant-btn ant-btn-default\"]"); // click ok
        softAssert.assertAll();
    }


    @Test(groups = {"Smoke"},priority = 4)
    public void DetailTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/i"); //click details
        PageBase.staticWait(02);
        softAssert.assertAll();
    }
    @Test(groups = {"Smoke"}, priority = 5)
    public void SearchTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[4]/span[2]"); // click plant search
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("/html/body/div[6]/div/div/div/div/input", "Peliyagoda"); // enter search value
        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@class=\"ant-btn ant-btn-primary ant-btn-sm\"]");
//        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 6)
    public void DeleteTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"), "Finish Product Sample is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/span/a[1]/a/i"); // click Delete button
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok
        PageBase.staticWait(02);
        softAssert.assertAll();
    }


}
