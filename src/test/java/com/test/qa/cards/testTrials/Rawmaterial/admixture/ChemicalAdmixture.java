package com.test.qa.cards.testTrials.Rawmaterial.admixture;

import com.test.qa.cards.testTrials.Rawmaterial.aggregates.FineAggregates;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class ChemicalAdmixture extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FineAggregates.class));
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
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
}
