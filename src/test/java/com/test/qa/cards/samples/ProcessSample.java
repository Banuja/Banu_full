package com.test.qa.cards.samples;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class ProcessSample extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"},priority = 1)
    public void EditTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samlemenu
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");     //ProcessingSampleBtn
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-edit\"]");// click edit button
        MethodBase.setText_ByXpath("//*[@id=\"processSample_quantity\"]","55"); // edit
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); // click submit button
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 2)
    public void EditReturnTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samlemenu
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");     //ProcessingSampleBtn
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-edit\"]");// click edit button
        MethodBase.click_ByXpath("//*[@class=\"ant-btn\"]"); // click cancel button
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 3)
    public void SearchTest(){
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samlemenu
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");     //ProcessingSampleBtn
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/thead/tr/th[2]/span[2]"); // click incoming sample search
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("/html/body/div[4]/div/div/div/div/input", "Optima-100"); // enter search value
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div/div/button[1]"); // click search button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }
}
