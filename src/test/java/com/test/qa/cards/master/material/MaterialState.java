package com.test.qa.cards.master.material;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MaterialState extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((MaterialCtaegory.class)));
    @Test(groups = {"Smoke"}, priority = 19)
    public static void addMaterialCtaegorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//Material  State  Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Material  State

        /*
        Validation Check
         */

        MethodBase.setText_ByXpath("//*[@id=\"material_state\"]","");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Material State can't be empty\"]","Material State can't be empty");
        LOGGER.info("Material State can't be empty");



          /*
      Input Data
         */


        MethodBase.setText_ByXpath("//*[@id=\"material_state\"]","Soli liquid Gas");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 20)
    public static void editMaterialCtaegorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//Material  State  Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i");//Edit Material  State
        MethodBase.clear_ByXpath("//*[@id=\"material_state\"]"," Liquid");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);


    }

//    @Test(groups = {"Smoke"}, priority = 21)
//    public static void deleteMaterialCtaegorySmokeTest() throws Exception {
//
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//Material  State  Field
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[3]/span/a[2]/a/i");//delete Material  State
//        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div[2]/div/div/div[2]/button[2]/span");//Confirm
//
//
//
//    }

}
