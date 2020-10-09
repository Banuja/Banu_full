package com.test.qa.cards.master.customer;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Project extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Project.class)));

    @Test(groups = {"Smoke"}, priority = 29)
    public static void addprojectSmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Project Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[3]/button");//Add Project


        /*
        Validation Checking
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Plant
        PageBase.staticWait(5);
        MethodBase.setText_ByID("project_name","");//project
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");//customer
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"contact_person\"]","");//contact_person
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"contact_no\"]","");//contact_no
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((8));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]", "Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Customer can't be empty\"]", "Customer can't be empty");
        LOGGER.info("Customer can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Person can't be empty\"]", "Contact Person can't be empty");
        LOGGER.info("Contact Person can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact No can't be empty\"]", "Contact No can't be empty");
        LOGGER.info("Contact No can't be empty");




        /*
       Data Input
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Plant
        MethodBase.setText_ByID("project_name","AVD project");//project
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");//customer
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"contact_person\"]","meera");//contact_person
        MethodBase.setText_ByXpath("//*[@id=\"contact_no\"]","0778965423");//contact_no
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }
    @Test(groups = {"Smoke"}, priority = 30)
    public static void editprojectSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Project Field
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[10]/span/a[1]/i");//Edit Project
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Plant
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ById("project_name", "Gram");//project
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");//customer
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"contact_person\"]", "");//contact_person
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"contact_no\"]", "0789653214");//contact_no
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((8));
    }



//    @Test(groups = {"Smoke"}, priority = 31)
//    public  static void deleteprojectSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Project Field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[10]/span/a[2]/a/i");//Delete
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");//Ok confirm
//
//    }

    }
