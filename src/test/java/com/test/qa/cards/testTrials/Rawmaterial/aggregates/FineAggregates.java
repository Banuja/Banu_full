package com.test.qa.cards.testTrials.Rawmaterial.aggregates;

import com.test.qa.cards.testTrials.Rawmaterial.EquipmentAllInOne;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class FineAggregates extends TestBase {
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
}
