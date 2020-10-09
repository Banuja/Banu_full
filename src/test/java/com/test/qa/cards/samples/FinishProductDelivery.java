package com.test.qa.cards.samples;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class FinishProductDelivery extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"},priority = 1)
    public void AddFinishProductDelivery()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product delivery
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]"), "Finish Product Sample Issue is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div/button"); // click Add finish product
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div/div/div"); // click Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // select Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"mixDesignCode\"]/div/div");// click mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/ul/li"); // select mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]"); // click customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[13]/div/div/div/ul/li[2]");// select customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"projectId\"]/div/div"); // click project
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[14]/div/div/div/ul/li"); // select project
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"pourId\"]/div/div"); // click pour code
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[15]/div/div/div/ul/li[3]"); // select pour code
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"workOrderNo\"]","4545"); // work order number
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]","GG442"); // vehicle number
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]"); // Save button
        PageBase.staticWait(03);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 2)
    public void EditTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product delivery
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]"), "Finish Product Sample Issue is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[8]/span/a[1]/i"); // edit button
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div/div/div"); // click Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // select Raw material
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"mixDesignCode\"]/div/div");// click mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div/div/ul/li"); // select mix design
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]"); // click customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[13]/div/div/div/ul/li[2]");// select customer
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"projectId\"]/div/div"); // click project
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[14]/div/div/div/ul/li"); // select project
        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"pourId\"]/div/div"); // click pour code
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("/html/body/div[15]/div/div/div/ul/li[3]"); // select pour code
//        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"workOrderNo\"]","55"); // work order number
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]","mn55"); // vehicle number
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]"); // Save button
        PageBase.staticWait(03);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"},priority = 2)
    public void DeleteTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product delivery
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]"), "Finish Product Sample Issue is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[8]/span/a[2]/a/i"); // delete button
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok
        PageBase.staticWait(02);
        softAssert.assertAll();

    }


}
