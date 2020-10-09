package com.test.qa.cards.master.plant;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class PlantTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((PlantTest.class)));

    @Test(groups = {"Smoke"}, priority = 1)
    public static void addPlantSmokeTest() {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");//Plant Panel
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//Add plant

        /*
        To Check Validation
         */

        MethodBase.setText_ByID("plant_code", "");//plant_code
        PageBase.staticWait(5);
        MethodBase.setText_ByID("plant_name", "");//plant_name
        MethodBase.setText_ByID("plant_address", "");//plant_address
        MethodBase.setText_ByID("plant_contactno", "");//plant_contactno
        MethodBase.setText_ByID("fax", "");//fax
        MethodBase.setText_ByID("plant_description", "");//plant_description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Code can't be empty\"]", "Code can't be empty");
        LOGGER.info("Code can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]", "Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]", "Address can't be empty");
        LOGGER.info("Address can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Number can't be empty\"]", "Contact Number can't be empty");
       LOGGER.info("Contact Number can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Fax Number can't be empty\"]", "Fax Number can't be empty");
        LOGGER.info("Fax Number can't be empty");

         /*
        Input Data
         */

        MethodBase.setText_ByID("plant_code", "VT");//plant_code
        PageBase.staticWait(5);
        MethodBase.setText_ByID("plant_name", "Vatala");//plant_name
        MethodBase.setText_ByID("plant_address", "Vatala");//plant_address
        MethodBase.setText_ByID("plant_contactno", "0777436123");//plant_contactno
        MethodBase.setText_ByID("fax", "0777156122");//fax
        MethodBase.setText_ByID("plant_description", "select plant");//plant_description
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(8);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");

    }



    @Test(groups = {"Smoke"}, priority = 2)
    public  static void editPlantSmokeTest() {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[6]/td[7]/span/a[1]/i");//edit button
        PageBase.staticWait(8);
//        MethodBase.clear_ById("plant_code", "APY");//plant_code
//        PageBase.staticWait(10);
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Only 3 characters long!\"]", "Only 3 characters long!");//to restrict 3 UpperCase
        MethodBase.clear_ById("plant_name", "Ampara");//plant_name
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_address", "Ampara");//plant_address
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_contactno", "07711111111");//plant_contactno
        PageBase.staticWait(8);
        MethodBase.clear_ById("fax", "07711111111");//fax
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_description", "select plant");//plant_description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);



        /*
        Check Filter Option
         */


        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[1]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[3]/div/div/div/div/input","BT");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div/div/button[1]");// Click Search Button



        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[2]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[4]/div/div/div/div/input","Jaffna");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div/div/button[1]");// Click Search Button



        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[3]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[5]/div/div/div/div/input","Matala");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div/div/button[1]");// Click Search Button

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[4]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[6]/div/div/div/div/input","07789654231");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div/div/button[1]");


        /*
        To View Description icon
         */
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/i");//Click View Descriptuion
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button");
//        PageBase.staticWait(5);





    }

//    @Test(groups = {"Smoke"}, priority = 3)
//    public static void deletePlantSmokeTest() {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
//        PageBase.staticWait(6);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/span/a[2]/a/i");//delete
//        PageBase.staticWait(6);
//        MethodBase.click_ByXpath("/html/body/div[9]/div/div/div/div[2]/div/div/div[2]/button[2]/span");//confirm delete
//
//    }
}







