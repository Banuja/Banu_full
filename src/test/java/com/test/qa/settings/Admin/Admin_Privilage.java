package com.test.qa.settings.Admin;

import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

public class Admin_Privilage {
    @Test(priority = 2)
    public void adminPrivilageTest() throws Exception {
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/span[2]"); // Click user icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@href=\"#/settings/profile\"]"); // click Settings
        PageBase.staticWait(8);
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[2]"); // Check the page is in Settings

        /** Admin Privilege Configuration - ADMIN*/

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/div"); // click the Privilege Configuration
        MethodBase.click_ByXpath(" //*[@href=\"#/settings/plantAdminPrivilege\"]"); // click Plant admin privilage
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[1]"); // check the page is visible

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[2]/div"); // Select plant name Dropdown
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li[4]"); // select jaffna plant
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/label/span/input"); // Select all in checkbox
        PageBase.staticWait(6);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/button"); // Click Save button


    }
}
