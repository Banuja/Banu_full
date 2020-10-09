package com.test.qa.cards.testTrials.Rawmaterial;

import com.test.qa.cards.testTrials.Rawmaterial.aggregates.FineAggregates;
import com.test.qa.utils.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Trial extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FineAggregates.class));



    @Test(groups = {"Smoke"},priority = 1)
    public void MicronTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/a/div"), "Dashboard is not Displayed");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div");  //Test Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]");    //Raw material
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/a[1]/div");    //Aggregate
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a[1]/div/h1");    //FIne Aggregates
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a[1]/div");    //Micron Test
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div"), "Incomming sample table is not Displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]");  //Create Test
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[1]/div/div[1]/div/h4"), "75%Micron test table is displayed");
        LOGGER.info("75%Micron test table is displayed");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]", "Date can't be empty");
        LOGGER.info("Date can't be empty");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/span/div/input");  //Date
        PageBase.hitEnter();
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        Thread.sleep(2000);
        PageBase.staticWait(3);
        //Validation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[6]", "Trial values can't be empty");
        LOGGER.info("Trial values can't be empty");
        //First Trial
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","469.2");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[4]/input","244");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[5]/input","744");

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial

        // Second Trial
        Thread.sleep(2000);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","464.8");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[4]/input","244");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[5]/input","744");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(8);

        // Second Trial
        Thread.sleep(2000);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","466.3");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[4]/input","244");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[5]/input","744");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //View Result
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]"),"Generate Report table is displayed");
        LOGGER.info("Generate Report table is displayed");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/button");   //Generate Report
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button[2]");   //Submit
        PageBase.staticWait(2);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[2]/div[1]/span"),"Status Pass ");
        LOGGER.info("Status Pass");
    }
    @Test(groups = {"Smoke"},priority = 2)
    public void AggregateImpactValueTest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/a/div"), "Dashboard is not Displayed");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div");  //Test Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div");    //Raw material
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/a[1]/div");    //Aggregate
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a[1]");    //FIne Aggregates
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a[11]/div");    //Aggregate Impact Value Test
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div"), "Incomming sample table is not Displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]");  //Create Test
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[1]/div/div[2]/div"), "Aggregate Impact Value test table is displayed");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/span/div/input");  //Date
        PageBase.hitEnter();
        PageBase.staticWait(3);

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        Thread.sleep(2000);
        //First Trial
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","646");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]/input","309.9");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[3]/input","336.5");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[4]/input","82.1");
        PageBase.staticWait(3);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        //Second Trial
        Thread.sleep(2000);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","646");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]/input","309.9");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[3]/input","336.5");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[4]/input","80.9");
        PageBase.staticWait(3);
        Thread.sleep(2000);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(5);


        //Third Trial
        Thread.sleep(2000);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(8);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","646");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]/input","309.9");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[3]/input","336.5");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[4]/input","81.3");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //View Result
        PageBase.staticWait(5);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]"),"Generate Report table is displayed");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/button");   //Generate Report
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button[2]");   //Submit
        PageBase.staticWait(3);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 3)
    public void WaterAbsorbtion() throws Exception {

        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/a/div"), "Dashboard is not Displayed");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div");  //Test Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]");    //Raw material
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/a[1]/div");    //Aggregate
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a[1]/div/h1");    //FIne Aggregates
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a[1]/div");    //Micron Test
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div"), "Incomming sample table is not Displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]");  //Create Test
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[1]/div/div[1]/div/h4"), "75%Micron test table is displayed");
        LOGGER.info("75%Micron test table is displayed");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]", "Date can't be empty");
        LOGGER.info("Date can't be empty");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/span/div/input");  //Date
        PageBase.hitEnter();
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        Thread.sleep(2000);
        PageBase.staticWait(3);
        //Validation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[6]", "Trial values can't be empty");
        LOGGER.info("Trial values can't be empty");
        /**First Trial**/
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","612.2");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]/input","795.6");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[3]/input","664.7");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[5]/input","2.74");
        Thread.sleep(2000);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(5);
        /**Second Trial*/
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","652.1");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]/input","820.2");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[3]/input","407");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[5]/input","2.73");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(3);

        /**Third Trial*/
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"),"Test trial table is displayed");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","602.4");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]/input","790.6");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[3]/input","407");
        PageBase.staticWait(3);
        MethodBase.setText_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[5]/input","2.75");
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //View Result
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]"),"Generate Report table is displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/button");   //Generate Report
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button[2]");   //Submit
    }
    @Test(groups = {"Smoke"}, priority = 4)
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
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[6]", "Trial values can't be empty");
//        LOGGER.info("Trial values can't be empty");
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
    @Test(groups = {"Smoke"}, priority = 5)
    public void PhTest()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(05);
        //      MethodBase.assertEqual_Text_ByXpath("//*[@id=\\\"root\\\"]/div/section/section/header/ul/a/div",("Test trial table is diplayed"));
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/a/div"), "Dashboard is not Displayed");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div"); // click raw material test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/a[5]/div"); // click admixture test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div/a/div"); // click chemical test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//div[h1[@style=\"font-size: 20px; color: rgb(255, 255, 255); text-align: center; padding-top: 20px; font-family: Arial; width: 230px;\"]]/h1[text()=\"PH_Test\"]"); // click ph test
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[1]/div"), "Incomming sample table is not Displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/button");  //Create Test
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[1]/div/div[1]/div/h4"), "Ph test table is displayed");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div");    //Submit btn
        PageBase.staticWait(05);
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]", "Date can't be empty");
        LOGGER.info("Date can't be empty");
        MethodBase.click_ByXpath("//*[@id=\"date\"]/div");  //Date
        MethodBase.hitEnter();
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[1]/div[3]/div/div[1]/div[1]/span[1]");   //No of Test
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[1]/div[2]/div[2]/div/div/button");    //Submit btn
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[1]/h3"), "Test trial table is diplayed");
        //Validation
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[2]", "Trial values can't be empty");
        LOGGER.info("Trial values can't be empty");
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input","5.2");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial btn
        PageBase.staticWait(05);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input", "4.2");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial btn
        PageBase.staticWait(05);
        MethodBase.setText_ByXpath("/html/body/div[1]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/div[1]/input", "4.2");
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); //Trial btn
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]/div/div[2]/div/button"); // View Result
        PageBase.staticWait(05);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]"),"Generate Report table is displayed");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/button");   //Generate Report
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button[2]");   //Submit
        softAssert.assertAll();
    }
    @Test(groups = {"Smoke"}, priority = 6)
    public void AddCalibration() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(8);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button"); // click Add calibration
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/button[2]"); // save button
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div[2]", "Equipment Plant can't be empty");
        LOGGER.info("Equipment Plant can't be empty");
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div"); // click equipment
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"equipment_plant\"]/div/div"); // click plant equipment
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"employeeId\"]/div/div"); // click employee
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"calibrated_date\"]/div/input"); // select date
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        // MethodBase.click_ByXpath("/html/body/div[10]/div/div[2]/div/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div[2]/input"); // set due days
        MethodBase.setKey_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div[2]/input", Keys.ARROW_UP);
        PageBase.staticWait(8);
        MethodBase.setText_ByXpath("//*[@id=\"accuracy\"]","1234"); // set accuracy
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"calibrated_by\"]/label[1]/span[2]"); // calibrated type internal
        MethodBase.hitEnter();
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"status\"]/div/div"); // status
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","dfjnmnfghhgff"); // description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/button[2]"); // save button
        PageBase.staticWait(8);
        LOGGER.info("Plant Equipment Calibration Added Successfully ");
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[11]/div/i");   //Description
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("/html/body/div[17]/div/div[2]/div/div[2]/div[2]/p","dfjnmnfghhgff");
        MethodBase.click_ByXpath("/html/body/div[17]/div/div[2]/div/div[2]/div[3]/button");     //Close btn
        PageBase.staticWait(8);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"}, priority = 7)
    public void Report() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(8);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div"); // click equipment
        PageBase.staticWait(8);

        /**Report **/
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[10]/i");    //Report btn
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[3]/div/button[2]");
        PageBase.staticWait(8);

        /** Description**/
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[11]/div/i");   //Description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[12]/div/div[2]/div/div[2]/div[3]/button");     //Close btn
        PageBase.staticWait(8);

        /**Edit btn**/
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[12]/span/a[1]/i");     //Edit btn
        PageBase.staticWait(8);
        MethodBase.setText_ByXpath("//*[@id=\"accuracy\"]", "2445");    //Accurancy


        PageBase.staticWait(8);

        MethodBase.click_ByXpath("/html/body/div[13]/div/div[2]/div/div[2]/div[3]/button[2]");  //Save btn
        PageBase.staticWait(8);

        /**Delete btn**/
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[12]/span/a[2]/a/i");    //Delete Btn
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[14]/div/div/div/div[2]/div/div/div[2]/button[2]");     //Ok Btn
        PageBase.staticWait(8);
        LOGGER.info("Plant Equipment Calibration Successfully Deleted");
        softAssert.assertAll();
    }

}
