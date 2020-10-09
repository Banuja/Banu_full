package com.test.qa.settings.Admin;

import com.gargoylesoftware.htmlunit.Page;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

import java.lang.reflect.Method;

public class Admin_Emil extends TestBase {
    @Test(priority = 1)
    public void adminTest() throws Exception {
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i"); // Click user icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@href=\"#/settings/profile\"]"); // click Settings
        PageBase.staticWait(8);



/** <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Delete>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></Delete> */
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[2]"); // Click the Mail configration Dropdown
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@href=\"#/settings/emailpoint\"]"); // Click Email Point
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]/label/span/input"); // Click Plant Creation CheckBox
        PageBase.staticWait(5);
        MethodBase.click_ByXpath( "/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]/label/span/input"); // Click Meterial Creation CheckBox
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[2]/button");//Click Save Button

        Thread.sleep(1000);
//        MethodBase.click_ByXpath("//*[@href=\"#/settings/emailgroup\"]"); // Click Mail notification Configraion
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[4]/span/a[2]/a/i"); // click delete option
//        PageBase.staticWait(5);
//        Thread.sleep(1000);
//        MethodBase.click_ByXpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok for delete
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[1]/div/div/button");// Click Save change
//        PageBase.staticWait(5);

        /** Mail Configration - Email Point - ADMIN*/

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[2]"); // Click the Mail configration Dropdown
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@href=\"#/settings/emailpoint\"]"); // Click Email Point
        PageBase.staticWait(5);
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[1]"); // Check the page is in Email point
        
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]/label/span/input"); // Click Plant Creation CheckBox
        PageBase.staticWait(5);
        MethodBase.click_ByXpath( "/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]/label/span/input"); // Click Meterial Creation CheckBox
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[2]/button");//Click Save Button
        PageBase.staticWait(5);
//      MethodBase.isDisplayed_ByXpath("/html/body/div[2]/div/span/div"); // Email Point is update sucessfully

        /** Mail Configration - Email Notification Configration - ADMIN*/

        MethodBase.click_ByXpath("//*[@href=\"#/settings/emailgroup\"]"); // Click Mail notification Configraion
        PageBase.staticWait(5);
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[1]/div/button"); // check the page is in Mail notification config
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[1]/div/button"); // Click Add notification
        PageBase.staticWait(6);
//         MethodBase.isDisplayed_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[1]/div");//Check add email page is displayed

        /** Mail Configration - Email Notification Configration VALIDATION - ADMIN */
//        MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click submit button
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div",
//                "name can't be empty"); // Validation verify for Name in Email Group
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]",
//                "name can't be empty"); // Validation verify for Group Type in Email Group

        MethodBase.setText_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/input","AdminGroup"); // Enter Name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div/div/div"); // click dropdown on Group type
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click submit button
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/div[2]/table/tbody"); // check the table
        PageBase.staticWait(5);

//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/span/a[1]/i ");// Click editi button
//        MethodBase.clear_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/input","1"); // change the name to Admin_Groups
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click submit
//        PageBase.staticWait(5);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[3]/label/span/input"); // Click status
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[1]/div/div/button");// Click Save change
        PageBase.staticWait(5);
//        MethodBase.isDisplayed_ByXpath("/html/body/div[2]/div/span/div"); // check the Save update data

        /** Mail Configration - Mail Group Configration  - ADMIN     */
        MethodBase.click_ByXpath("//*[@ href=\"#/settings/adminconfiguration\"]"); // Click Mail Group configration
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div"); // Check the title Mal group Configratio n
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div[1]/div[1]/div[1]/div/div/div"); // select plant
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div[1]/div[1]/div[2]/div/div/div"); // Select Group name
        PageBase.staticWait(2);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div[1]/div[1]/div[3]/div/div/div"); // Click Reception
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div[1]/div[2]/div/div/div/div[1]/div/button"); // click add user group
        PageBase.staticWait(2);
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/table/thead/tr/th[1]/span/div/span[1]"); // click Mail group name
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/label/span/input"); // Click relevent Checkbox
        Thread.sleep(1000);
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/label/span/span"); // click the second user  checkbox
        PageBase.staticWait(6);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); // Click save button



    }
    }
