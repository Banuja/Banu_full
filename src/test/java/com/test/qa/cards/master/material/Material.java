package com.test.qa.cards.master.material;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Material extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((Material.class)));

    @Test(groups = {"Smoke"}, priority = 16)
    public static void addMaterialSubCategorySmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");//Material Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//Add Material
        PageBase.staticWait(5);

         /*
        To Check Validation
         */
//        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//sub_category
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/div");//material_nature
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"material_name\"]", "");//material_name
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]", "");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]", "");
        MethodBase.click_ByXpath("//*[@id=\"active\"]");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"SubCategory can't be empty\"]", "SubCategory can't be empty");
        LOGGER.info("SubCategory can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]", "Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Prefix can't be empty\"]", "Prefix can't be empty");
        LOGGER.info("Prefix can't be empty");






         /*
        To Data Input
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//sub_category
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/div");//material_nature
        PageBase.staticWait(5);
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"material_name\"]", "Optima-1717");//material_name
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]", "OPT");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]", "Take material");
        MethodBase.click_ByXpath("//*[@id=\"active\"]");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 17)
    public static  void editMaterialSubCategorySmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");//Material Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[5]/td[9]/span/a[1]/i");//Edit Material
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//sub_category
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/div");//material_nature
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"material_name\"]", "Optima-999");//material_name
        MethodBase.clear_ByXpath("//*[@id=\"prefix\"]", "OPt");
        MethodBase.clear_ByXpath("//*[@id=\"description\"]", "Take material");
        MethodBase.click_ByXpath("//*[@id=\"active\"]");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 18)
    public static void deleteMaterialSubCategorySmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");//Material Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/span/a[2]/a/i");//Delete Material
        MethodBase.click_ByXpath("//span[text()=\"OK\"]");//OK


    }
}
