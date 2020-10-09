package com.test.qa.settings.plant_Admin;

import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Plant_Email extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Plant_Email.class));

    /**
     * Create new employee
     * @throws Exception
     */
    @Test(priority = 3, groups = {"Smoke"})
    public void AddEmployee() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[14]/a");//employee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//btnemployee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button");// Add employee

        MethodBase.setText_ByID("first_name","Sathu");//first_name
        MethodBase.setText_ByID("last_name","Sathush");//last_name
        MethodBase.click_ById("plant");   //click plant
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/ul/li[5]");
        MethodBase.click_ById("desigination");   //Designation
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//ul[li[@class=\"ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active\"]]/li[text()=\"Administrator\"]");
        MethodBase.setText_ByID("address","Point Pedro");//address
        MethodBase.setText_ByID("phoneno","0761789546");//phoneno
        MethodBase.setText_ByID("email","sathurya14+4@gmail.com");//email
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

    @Test(priority = 4, groups = {"Smoke"})
    public void Add() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[14]/a");//employee
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[3]");//btnemployee
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/ul/li[3]");   //Next page
        PageBase.staticWait(5);
        MethodBase.click_ById("add_user_7765");   //Click Add
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[3]/div/div");   //Select User Type
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[4]/div/div");   //Role
        MethodBase.hitEnter();
        MethodBase.escape();
        PageBase.staticWait(5);

    }

    @Test(priority = 5, groups = {"Smoke"})
    public void SetPlantAdminPrivilege() throws Exception {


        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");// dashboard
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[2]/a");// click settings
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/ul/li[3]/div"); // click privilage configuration
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/ul/li[2]");   //CLick Plant admin Privilege
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[2]/div");  //Click plant dropdown
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/ul/li[5]");   //Select Jaffna
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[2]/label/span/input");    //Check Equipment
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[3]/td[2]/label/span/input");    //Check Meterial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[4]/td[2]/label/span/input");    //Check Customer
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[6]/td[2]/label/span/input");    //Check Employe
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[13]/td[2]/label/span/input");   //Check Setting
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//div[button[@class=\"ant-btn sc-kgoBCf ewWveO\"]]/button");  //Click Save Changes
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[2]/div/div/ul/li[3]");// click Logut


        //Login as plant Admin
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/h3"),"Login Panel is displayed");
        MethodBase.setText_ByID("usernameOrEmail","sathurya14+4@gmail.com");  //Username
        PageBase.staticWait(5);
        MethodBase.setText_ByID("password","z19JTn74");    //Password
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button");   //Click Submit
        PageBase.staticWait(5);

        //Email points
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");// click icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[2]/a");// click settings
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[2]");    //CLick Mail config
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[2]/ul/li[1]"); //click email points
        PageBase.staticWait(3);
        MethodBase.clear_check("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]/label/span/input");  //Mix Design
        PageBase.staticWait(03);
    }




}
