package com.test.qa.cards.master.material;

import com.test.qa.cards.master.plant.PlantTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MaterialSubCategory extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((MaterialSubCategory.class)));
    @Test(groups = {"Smoke"}, priority = 13)
    public static void addMaterialSubCategorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Material SubCategory Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");// Add Material SubCategory

        /*
        To Check Validation
         */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"material_category\"]/div/div/div[1]");//material_category
//        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"subcategory_name\"]","");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Prefix can't be empty\"]","Prefix can't be empty");
        PageBase.staticWait((5));
        LOGGER.info("Prefix can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        PageBase.staticWait((5));
        LOGGER.info("Name can't be empty");

        /*
        Data Input
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"material_category\"]/div/div/div[1]");//material_category
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","MA");
        MethodBase.setText_ByXpath("//*[@id=\"subcategory_name\"]","Main Aggregate");
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save



    }

    @Test(groups = {"Smoke"}, priority = 14)
    public static void editMaterialSubCategorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Material SubCategory Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/span/a[1]/i");// Edit Material SubCategory
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div[3]/div/input");//material_category
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
        MethodBase.clear_ByXpath("//*[@id=\"prefix\"]","MR");
        MethodBase.clear_ByXpath("//*[@id=\"subcategory_name\"]","miner");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));




    }

//    @Test(groups = {"Smoke"}, priority = 15)
//    public  static void deleteMaterialSubCategorySmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Material SubCategory Field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[5]/td[5]/span/a[2]/a/i");// delete Material SubCategory
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]/span");//ok Confirm
//
//
//
//    }
}