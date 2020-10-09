package com.test.qa.cards.master.supplier;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class SupplierCategory extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((SupplierCategory.class)));
    @Test(groups = {"Smoke"}, priority = 38)
    public static void  addsupplierCategorySmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[2]/i");//Supplier
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Supplier

        /*
        Check Validation
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.setText_ByXpath("//*[@id=\"supplier_category\"]","");//supplier_category
        MethodBase.setText_ByXpath("//*[@id=\"supplierCategory_description\"]","");//supplierCategory_description
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Category can't be empty\"]","Category can't be empty");
        LOGGER.info("Category can't be empty");






/*
 Data Input
  */


       MethodBase.setText_ByXpath("//*[@id=\"supplier_category\"]","chem supplier");//supplier_category
        MethodBase.setText_ByXpath("//*[@id=\"supplierCategory_description\"]","description");//supplierCategory_description
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 39)
    public  static  void  editsupplierCategorySmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[2]/i");//Supplier
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[4]/td[3]/span/a[1]/i");//Edit Supplier
        MethodBase.clear_ByXpath("//*[@id=\"supplier_category\"]","Raw material supplier");//supplier_category
        MethodBase.clear_ByXpath("//*[@id=\"supplierCategory_description\"]","description chem supplier");//supplierCategory_description
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]","Category can't be empty");
//        LOGGER.info("Category can't be empty");



    }

//    @Test(groups = {"Smoke"}, priority = 40)
//    public static void  deletesupplierCategorySmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier NV
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[2]/i");//Supplier
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[5]/td[3]/span/a[2]/a/i");//Delete Supplier
////        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div[2]/div/div/div[2]/button[2]");//Delete confirm Supplier
//
//
//
//    }







}
