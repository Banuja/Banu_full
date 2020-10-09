package com.test.qa.cards.mixDesign;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;
import java.util.logging.Logger;

public class MixDesign extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MixDesign.class));

     /*
    Validation check
     */

    @Test(groups = {"Smoke"}, priority = 1)
    public void MixDesignWithOutDataTest() throws Exception {

        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/button");//Click Add MixDesign button
//        MethodBase.isDisplayed_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[1]/div/div/p"); // Page display
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(10);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");//plant can't be empty
        LOGGER.info("Plant can't be empty");
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[1]/div/div[2]", "rawMaterial can't be empty");//rawMaterial can't be empty
        LOGGER.info("Grade can't be empty");
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div", "Date can't be empty");//Date can't be empty
        LOGGER.info("Date can't be empty");
        LOGGER.info("Validation checked successfully");

         /*

    Data Adding

     */
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Click Dropdown Plant
        PageBase.staticWait(10);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"SubCategory\"]/div/div/div");//click sub category
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ById("rawMaterialId"); //set rawMaterial
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div/input");//Click Calender
        PageBase.staticWait(5);
        MethodBase.hitEnter();
//        MethodBase.click_ByXpath("//*[@id=\"status\"]/div");//Click Dropdown for Status
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]/span/label/span/input");// click Checkbox1 River sand
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[1]/span/label/span/input"); // click Checkbox2 manufacture sand
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/button[1]");//Add quantity
        PageBase.staticWait(10);
        MethodBase.setText_ByID("Manufactured Sand","300");
        MethodBase.setText_ByID("Manufacture Soil", "350");
        PageBase.staticWait(5);
        MethodBase.selectDropDown("//select[@id=\"Manufactured Sand\"]", "g");
        MethodBase.selectDropDown("//select[@id=\"Manufacture Soil\"]", "g");
        MethodBase.click_ByXpath("//*[@style=\"background-color: rgb(0, 20, 34); color: white;\"]");//Submit button
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(5);
        LOGGER.info("Add Mix Design Data added Successfully");
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[1]/div/div/i");//close

    }

    /*
    delete
     */

    @Test(groups = {"Smoke"}, priority =2 )
    public void MixDesignDeleteSmokeTest() throws Exception {

        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[9]/span/a[2]/a/i");//delete
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/button[2]");//delete ok btn
        PageBase.staticWait(10);
        LOGGER.info("Delete checked");

    }

    /*
    Plus icon Add finish product
     */

    @Test(groups = {"Smoke"}, priority = 3)
    public void MixDesignPlusSmokeTest() throws Exception {

        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/span/i");//plus icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"equipmentId\"]/div/div");//equipment dropdown
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"finishProductCode\"]","57");//sample code
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div/input");//Click Calender
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
        PageBase.staticWait(10);
        LOGGER.info("Finish product added successfully");

    }

    /*
    Raw material delete
     */

    @Test(groups = {"Smoke"}, priority = 4)
    public void MixDesignRawSmokeTest() throws Exception {

        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[8]");//raw Material
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/span/a/a");//raw material data delete
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]");//delete ok btn
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/button");//close icon
        LOGGER.info("Raw material deleted");

    }

    /*
    view
     */

    @Test(groups = {"Smoke"}, priority = 5)
    public void MixDesignViewSmokeTest() throws Exception {

        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/i");//View more
        PageBase.staticWait(3);
        LOGGER.info("view more successfully");
    }

    /*
    edit
     */

//    @Test(groups = {"Smoke"}, priority = 6)
//    public void MixDesignEditmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
//        PageBase.staticWait(3);
//
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[9]/span/a[1]/i");//edit
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//Save
//        PageBase.staticWait(5);
//        LOGGER.info("Mix design details edit successfully");
//    }

    /*
    export
    import
    search
     */

    @Test(groups = {"Smoke"}, priority = 7)
    public void MixDesignSearchSmokeTest() throws Exception {

        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div"); //Click production list;
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div");   //Click MixDesign Navigation
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/button[1]");//Export
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/span/div[1]/span/button");//import
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/table/thead/tr/th[1]/span[2]");//Click  filter icon
        MethodBase.setText_ByXpath("/html/body/div[3]/div/div/div/div/input","RMC");//Pass Ok
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div/div/button[1]");//Search
//        MethodBase.click_ByXpath("/html/body/div[2]/div/div/div/div/div/button[1]");//Click  Search icon
//        MethodBase.click_ByXpath("/html/body/div[2]/div/div/div/div/div/button[2]");//clear
        PageBase.staticWait(5);
        LOGGER.info("export import search successfully");
    }
}
