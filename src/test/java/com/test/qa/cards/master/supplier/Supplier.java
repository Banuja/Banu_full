package com.test.qa.cards.master.supplier;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Supplier extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Supplier.class)));
    @Test(groups = {"Smoke"}, priority = 35)
    public  static void  addsupplierSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier Nv
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Supplier Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[3]/div/button");//Add supplier
        /*
        Validation Check
         */
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"supplier_category\"]/div/div");//supplier_category
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_name\"]","");
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_contactno\"]","");//supplier_contactno
        MethodBase.setText_ByXpath("//*[@id=\"supplier_email\"]","");//supplier_email
        MethodBase.setText_ByXpath("//*[@id=\"supplier_address\"]","");//supplier_address
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Category can't be empty\"]","Category can't be empty");
        LOGGER.info("Category can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Number can't be empty\"]","Contact Number can't be empty");
        LOGGER.info("Contact Number can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Email can't be empty\"]","Email can't be empty");
        LOGGER.info("Email can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]","Address can't be empty");
        LOGGER.info("Address can't be empty");


        /*
        Data Input
         */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"supplier_category\"]/div/div");//supplier_category
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_name\"]","Mural");
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_contactno\"]","0774563219");//supplier_contactno
        MethodBase.setText_ByXpath("//*[@id=\"supplier_email\"]","Mural@gmail.com");//supplier_email
        MethodBase.setText_ByXpath("//*[@id=\"supplier_address\"]","colombo");//supplier_address
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }
    @Test(groups = {"Smoke"}, priority = 36)
    public static void  editsupplierSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier Nv
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Supplier Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[1]/i");//Edit Button
        PageBase.staticWait(5);
//        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button/span");//Validation work
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]/div/div");//supplier_category
//        MethodBase.selectMaterialDrop("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]/div/div",1);
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"supplier_name\"]","Mano");
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");
        MethodBase.hitEnter();

        PageBase.staticWait(5);
        PageBase.staticWait((5));
        MethodBase.clear_ByXpath("//*[@id=\"supplier_contactno\"]","0774563219");//supplier_contactno
        MethodBase.clear_ByXpath("//*[@id=\"supplier_email\"]","Mano@gmail.com");//supplier_email
        MethodBase.clear_ByXpath("//*[@id=\"supplier_address\"]","colombo");//supplier_address
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

//    @Test(groups = {"Smoke"}, priority = 37)
//    public  static void  deletesupplierSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier Nv
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Supplier Field
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/span/div[1]/span/button");
//        MethodBase.escape();
//////      PageBase.staticWait(5);
//////        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/button");
//////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/span/a[2]/a/i");
//////        MethodBase.click_ByXpath("//span[text()=\"OK\"]");
//
//
//
//    }



}
