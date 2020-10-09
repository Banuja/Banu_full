package com.test.qa.cards.master.employee;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Employee extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Employee.class)));
    @Test(groups = {"Smoke"}, priority = 47)
    public static void  addemployeeSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//btnemployee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/button");//export  button
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/span/div[1]/span/button");//import
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button");// Add employee
        /*
        Validation Checking
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.setText_ByID("first_name","");//first_name
        MethodBase.setText_ByID("last_name","");//last_name
        MethodBase.setText_ByID("address","");//address
        MethodBase.setText_ByID("phoneno","");//phoneno
        MethodBase.setText_ByID("email","");//email
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//clickPlantOption
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div");//selectDesignationOptioN
        PageBase.staticWait((8));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Last Name can't be empty\"]","Last Name can't be empty");
        LOGGER.info("Last Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]","Address can't be empty");
        LOGGER.info("Address can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact No can't be empty\"]","Contact No can't be empty");
        LOGGER.info("Contact No can't be empty");


        PageBase.staticWait((5));

        /*
        Data Input
         */
        MethodBase.setText_ByID("first_name","benjamin");//first_name
        MethodBase.setText_ByID("last_name","Bena");//last_name
        MethodBase.setText_ByID("address","Negamobo");//address
        MethodBase.setText_ByID("phoneno","0778967896");//phoneno
        MethodBase.setText_ByID("email","Ben@gmail.com");//email
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//clickPlantOption
        PageBase.staticWait(8);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div");//selectDesignationOptioN
        PageBase.staticWait((8));
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }
    @Test(groups = {"Smoke"}, priority = 48)
    public  static  void  editemployeeSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//btnemployee
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[7]/td[11]/span/a[1]/i");// edit button
        PageBase.staticWait(5);
        MethodBase.clear_ById("first_name","Hanna");//first_name
        PageBase.staticWait(5);
        MethodBase.clear_ById("last_name","Nanthu");//last_name
        PageBase.staticWait(5);
        MethodBase.clear_ById("address","Negamobo");//address
        PageBase.staticWait(5);
        MethodBase.clear_ById("phoneno","0778967896");//phoneno
        PageBase.staticWait(5);
//        MethodBase.clear_ById("email","Hanna@gmail.com");//email
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//clickPlantOption
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div");//selectDesignationOptioN
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

//    @Test(groups = {"Smoke"}, priority = 49)
//    public static void  deleteemployeeSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//btnemployee
//        PageBase.staticWait(3);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[11]/span/a[2]/a/i");//delete
//        Thread.sleep(1000);
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/div[2]/div/div/div[2]/button[2]");//ok
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");// Employee page display
//
//
//
//
//    }

//    @Test(groups = {"Smoke"}, priority = 50)
//    public static void  addcartEmployeeemployeeSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[14]");//employee
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//btnemployee
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[9]/td[8]/span/button");//add cart
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[3]/div/div/div/div[2]");//drop User Type
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[4]/div/div");//drop role
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
//        MethodBase.click_ByXpath("//span[text()=\"Add\"]");
//
//
//
//
//    }



}
