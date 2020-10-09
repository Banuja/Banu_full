package com.test.qa.settings.nonplant_user;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;


public class NonPlantUser_Email extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 9)
    public void Test() throws Exception {
        softAssert = new SoftAssert();
        NonPlantUser_Privilage.LogoutTest();
        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
//        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[2]/a"); // click Settings
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/ul/li[2]/div");// click mail configuration
        PageBase.staticWait(2);
        MethodBase.click_ByXpath("//*[@id=\"sub1$Menu\"]/li[2]/a");// click mail notification confiquration
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/div/div/div/div[1]/div/button"); // click Add notification
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]");// click submit button
        PageBase.staticWait(03);
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div","name can't be empty");
        PageBase.staticWait(03);
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]","name can't be empty");
        PageBase.staticWait(03);
        MethodBase.setText_ByXpath("//*[@id=\"name\"]","Mix Design GR5"); // set name
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"emailNotifications\"]/div/div");// click Group type
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li[1]"); // select group type
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]");// click submit button
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[4]/span/a[1]/i"); // click edit button
        PageBase.staticWait(03);
        MethodBase.setText_ByXpath("//*[@id=\"name\"]","1"); // set name
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]");// click submit button
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[3]/label/span/input"); // click status
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/div/div/div/div[1]/div/div/button"); // click save changes
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"sub1$Menu\"]/li[3]/a"); // click mail group configuration
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"groupemail\"]/div/div"); // click group name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li"); // select group name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"recipient\"]/div/div"); // click receip
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/ul/li[2]"); // select reciep
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[2]/div[1]/div[2]/div/div/div/div[1]/div/button"); // add group
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div/div/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]/label/span/input"); // tik
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]"); // click save
        PageBase.staticWait(03);
        softAssert.assertAll();
    }

}
