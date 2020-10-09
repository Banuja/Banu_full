package com.test.qa.settings.nonplant_user;

import com.test.qa.cards.master.equipment.EquipmentTest;
import com.test.qa.cards.master.equipment.PlantEquipment;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;


public class NonPlantUser_Privilage extends TestBase {

    private static SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 10)
    public void AddEmployeeTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div"); // click Master menu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]/a"); //click Employee NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]"); // click Employee sub nv
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button");// click Add employee
        MethodBase.setText_ByXpath("//*[@id=\"first_name\"]", "Thushi"); // enter first name
        MethodBase.setText_ByXpath("//*[@id=\"last_name\"]", "Kannan"); // enter last name
        MethodBase.click_ByXpath("//*[@id=\"plant\"]");// click plant name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"4\"]"); // select plant name
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div"); // click designation
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/ul/li[2]"); // select second
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"address\"]", "Jaffna");// enter address
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"phoneno\"]", "0779638534");// enter contact no
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"email\"]", "thushikannan20+3@gmail.com");// enter Enail
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");// save btt
        PageBase.staticWait(03);
        softAssert.assertAll();
    }


    @Test(groups = {"Smoke"}, priority = 2)
    public void AddUserTest() throws Exception {
//        softAssert = new SoftAssert();
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div"); // click Master menu
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]/a"); //click Employee NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]"); // click Employee sub nv
//        PageBase.staticWait(05);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/ul/li[3]/a"); // next page
//        PageBase.staticWait(03);
//        MethodBase.click_ById("add_user_7832"); //click ADD
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[3]/div/div"); // Select USer type
//        PageBase.staticWait(06);
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/ul/li[2]"); // select non plat user
//        MethodBase.hitEnter();
//        PageBase.staticWait(8);
//        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[4]/div/div/div/div"); // click role
//        PageBase.staticWait(02);
//        MethodBase.hitEnter();
//        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/button[2]"); // click save button
//        PageBase.staticWait(02);
//        softAssert.assertAll();
    }


    @Test(groups = {"Smoke"}, priority = 3)
    public void PrivilageTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[2]/a");// click settings
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/ul/li[3]/div"); // click privilage configuration
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/ul/li[6]/a"); // click non-plant user privilage
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/div[2]/div/div/div[1]");// click person
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li[3]"); // click select a person
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[3]/div/div/div[1]"); // click plant name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/ul/li[5]");// select plant name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[3]/div/div/div/div/div/div/table/tbody/tr[2]/td[2]/label/span/input");// tik Equipment
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[3]/div/div/div/div/div/div/table/tbody/tr[1]/td[2]/label/span/input");// tik plant
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/button");// click save changes
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"}, priority = 4)
    public static void LogoutTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[3]"); // click logout
        softAssert.assertAll();


/** Login As Non-Plant User */
        MethodBase.setText_ByXpath("//*[@id=\"usernameOrEmail\"]", "thushikannan20@gmail.com");// Login User Name for Non-plant user
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"password\"]", "31ec2FX3");// Login Password for Non-plant user
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button");// click login button
        PageBase.staticWait(8);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div/div/section/section/main/div"), "Non-plant user dashboard is not displayed"); // verification for NON-plant user dashboard
//        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/div");// click Jaffna
        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");// click master
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div/div/section/section/main/div"), "Master page is not displayed"); // verification for Master Page
//        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = "Smoke",priority = 5)
    public void EquipmentTest() throws Exception {
        softAssert = new SoftAssert();
        LogoutTest();
        EquipmentTest.addEquipmentSmokeTest();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a"); // click home button
        PageBase.staticWait(5);
        EquipmentTest.editEquipmentSmokeTest();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a"); // click home button
        PageBase.staticWait(5);

    }

    @Test(groups = "Smoke",priority = 6)
    public void PlantequipmentTest() throws Exception {
        softAssert = new SoftAssert();
        LogoutTest();
        PlantEquipment.addPlantEquipmentSmokeTest();
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a"); // click home button
        PageBase.staticWait(5);
        PlantEquipment.editPlantEquipmentSmokeTest();
        //MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a"); // click home button
        PageBase.staticWait(5);

    }
//
//    @Test(groups = "Smoke",priority = 6)
//    public void Planttest() throws Exception {
//        softAssert = new SoftAssert();
//        LogoutTest();
//        PlantTest.addPlantSmokeTest();
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a"); // click home button
//        PageBase.staticWait(5);
//        PlantTest.editPlantSmokeTest();
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[2]/div/a"); // click home button
//        PageBase.staticWait(5);
//        PlantTest.deletePlantSmokeTest();
//        PageBase.staticWait(5);
//        softAssert.assertAll();
//
//    }


    @Test(groups = "Smoke",priority = 6)
    public void UntikTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[2]/a");// click settings
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/ul/li[3]/div"); // click privilage configuration
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"sub2$Menu\"]/li[6]/a"); // click non-plant user privilage
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/div[2]/div/div/div[1]");// click person
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li[3]"); // click select a person
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[3]/div/div/div[1]"); // click plant name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/ul/li[5]");// select plant name
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[3]/div/div/div/div/div/div/table/tbody/tr[2]/td[2]/label/span/input");// tik Equipment
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/button");// click save changes
        PageBase.staticWait(02);
        LogoutTest();
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");// click master
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div/div/section/section/main/div"), "Master page is not displayed"); // verification for Master Page

        PageBase.staticWait(02);

        softAssert.assertAll();


    }

}
