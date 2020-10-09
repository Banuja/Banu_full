package com.test.qa.cards.master.equipment;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class PlantEquipment extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf((PlantEquipment.class)));

    @Test(groups = {"Smoke"}, priority = 7)
    public  static void addPlantEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Plant Equipment Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button");//Add plant Equipment Field
      /*
      Validation Check
       */
        MethodBase.setText_ByXpath("//*[@id=\"serial_no\"]","");
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(5);
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"brand_name\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"model_name\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Serial No can't be empty\"]","Serial No can't be empty");
        LOGGER.info("Serial No can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Equipment can't be empty\"]","Equipment can't be empty");
        LOGGER.info("Equipment can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Brand can't be empty\"]","Brand can't be empty");
        LOGGER.info("Brand can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Model can't be empty\"]","Model can't be empty");
        PageBase.staticWait((5));

         /*
      Data Input
       */

        MethodBase.setText_ByXpath("//*[@id=\"serial_no\"]","4569");
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"brand_name\"]","MOK");
        MethodBase.setText_ByXpath("//*[@id=\"model_name\"]","789dom");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","take equipment");
        MethodBase.click_ByXpath("//*[@id=\"calibrationExists\"]");
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));


    }
    @Test(groups = {"Smoke"}, priority = 8)
    public static void editPlantEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Plant Equipment Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/span/a[1]/i");//Edit plant Equipment Field
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.clear_ByXpath("//*[@id=\"brand_name\"]","yokl");
        MethodBase.clear_ByXpath("//*[@id=\"model_name\"]","7896lkj");
        MethodBase.clear_ByXpath("//*[@id=\"description\"]"," equipment take");
        MethodBase.click_ByXpath("//*[@id=\"calibrationExists\"]");
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));


//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/button");//Click Export
//        PageBase.staticWait((5));
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/span/div[1]/span/button");//Click Import
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[7]/div/i");//View Description

    }

    /*
    To Check Delete
     */

//    @Test(groups = {"Smoke"}, priority = 9)
//    public  static void deletePlantEquipmentSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
//        PageBase.staticWait(8);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/a[2]/a/i");// delete
//        PageBase.staticWait(5);
////        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/div[2]/div/div/div[2]/button[2]");//ok confirm
////        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");//verify if deleted
//
//
//
//    }
}
