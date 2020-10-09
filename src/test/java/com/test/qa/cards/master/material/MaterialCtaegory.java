package com.test.qa.cards.master.material;

import com.test.qa.cards.master.plant.PlantTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MaterialCtaegory extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((MaterialCtaegory.class)));
    @Test(groups = {"Smoke"}, priority = 10)
    public  static void addMaterialCtaegorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//Material category field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Material category
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");//Page Verify
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.setText_ByXpath("//*[@id=\"category_name\"]","");//category_name
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","");//prefix
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Prefix can't be empty\"]","Prefix can't be empty");
        LOGGER.info("Prefix can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Main Type can't be empty\"]","Main Type can't be empty");
        LOGGER.info("Main Type can't be empty");
        PageBase.staticWait(5);




        /*
        Data Input
         */
        PageBase.staticWait(8);
        MethodBase.setText_ByXpath("//*[@id=\"category_name\"]","ceme");//category_name
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","SD");//prefix
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((8));



    }

    @Test(groups = {"Smoke"}, priority = 11)
    public static void editMaterialCtaegorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//Material category field
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/span/a[1]/i");//Edit Material category
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");
        MethodBase.clear_ByXpath("//*[@id=\"category_name\"]","Huge aggregate");//category_name
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"prefix\"]","BAS");//prefix
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    /*
    To Check Delete
     */

//    @Test(groups = {"Smoke"}, priority = 12)
//    public static void deleteMaterialCtaegorySmokeTest() throws Exception {
//
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//Material category field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[6]/td[5]/span/a[2]/a/i");//Delete
//        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div[2]/div/div/div[2]/button[2]/span");
//
//
//
//    }
}
