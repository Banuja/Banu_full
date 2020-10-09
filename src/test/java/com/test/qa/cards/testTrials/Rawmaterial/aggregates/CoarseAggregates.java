package com.test.qa.cards.testTrials.Rawmaterial.aggregates;

import com.test.qa.cards.testTrials.Rawmaterial.EquipmentAllInOne;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class CoarseAggregates extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EquipmentAllInOne.class));

    @Test(groups = {"Smoke"}, priority = 1)
    public void MoistureTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/a/div"), "Dashboard is not Displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div");  //Test Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]");    //Raw Material
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/a[1]/div");    //Aggregate
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//div[h1[@style=\"font-size: 20px; color: rgb(255, 255, 255); text-align: center; padding-top: 30px; font-family: Arial;\"]]/h1[text()=\"Coarse Aggregate\"]");    //Coarse Aggregate
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//div[h1[@style=\"font-size: 20px; color: rgb(255, 255, 255); text-align: center; padding-top: 20px; font-family: Arial; width: 230px;\"]]/h1[text()=\"Moisture \"]");   //MOisture Test
        PageBase.staticWait(3);
        softAssert.assertEquals(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div"),"Incoming sample is displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]");  //Create Test
        PageBase.staticWait(5);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[1]/div/div[2]/div"), "Moisture test table is displayed");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]", "Date can't be empty");
        LOGGER.info("Date can't be empty");
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/span/div/input");  //Date
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div");    //Submit btn
        Thread.sleep(2000);
        //Validation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[6]", "Trial values can't be empty");
        LOGGER.info("Trial values can't be empty");
        //First Trial
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div/input","309.9");
        PageBase.staticWait(3);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        //Second Trial
        Thread.sleep(2000);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div/input","336.5");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(5);

        //Third Trial
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div/input","309.9");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //View Result
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]"),"Generate Report table is displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/button");   //Generate Report
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button[2]");   //Submit
        PageBase.staticWait(2);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[2]/div[1]/span"),"Status Pass ");
        LOGGER.info("Status Pass");

    }

}
