package com.test.qa.cards.samples;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class IncommingSample extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"Smoke"}, priority = 1)
    public void ViewMoreTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]"),"Incoming Sample page is not displayed"); // Incoming sample page displyed verification
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/i"); //click more
        PageBase.staticWait(3);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div[1]"),"More is not displayed"); // verification for more button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 2)
    public void TestandResult() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");                //IncommingSampleBtn
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@class=\"anticon anticon-experiment\"]"); //click test result
        PageBase.staticWait(3);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]"); // click ok
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 3)
    public void SummaryReport() {
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("Report_BT-CA-INC-0001"); // click Summary report
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]");//click ok button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 4)
    public void ProcessSampleTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("proccess_CL-AM-INC-0001"); // click process sample
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"processSample_quantity\"]","jhqqlkjkh"); //Quantity
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"unit_id\"]/div/div"); // click unit
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]");// save
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

//    @Test(groups = {"Smoke"}, priority = 5)
//    public void DeliveryReportTest() throws Exception {
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[4]/td[10]/span/i"); // click delivery report
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@class=\"ant-btn ant-btn-primary\"]"); // click ok
//        PageBase.staticWait(07);
//        softAssert.assertAll();
//    }

    @Test(groups = {"Smoke"}, priority = 6)
    public void EditTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("edit_BL-FA-INC-0002"); //edit button
        MethodBase.click_ByXpath("//*[@id=\"supplierCategory\"]/div");   //SuplierCatageryDrop
        MethodBase.hitEnter();
        PageBase.staticWait(02);;
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div"); // plant
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplierName\"]/div/div"); // click Supplier
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div");      //RawmaterialDrop
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]", "21450"); //VehicleNoTxt
        PageBase.staticWait(03);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); //savebt
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 7)
    public void DeleteTest( ) throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ById("delete_TR-FA-INC-0002"); //delete button
        MethodBase.click_ByXpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/button[2]"); // click ok button
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 8)
    public void AddIncommingSampleTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"supplierCategory\"]/div/div");   //SuplierCatageryDrop
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");              //PlantDrop
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplierName\"]/div/div"); // click Supplier
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div");      //RawmaterialDrop
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]", "6655"); //VehicleNoTxt
        PageBase.staticWait(03);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); //savebt
        PageBase.staticWait(02);
       // MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]", "abi"); //supplier soft assert
 //       MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]","Badulla"); //plant soft assert
   //     PageBase.staticWait(02);
//        MethodBase.assertEqual_Text_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]", "Manufactured sand");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/i"); //click more
//      //  MethodBase.assertEqual_Text_ByXpath("//*[@class=\"ant-col ant-col-8\"]", "Vehicle No");
        PageBase.staticWait(02);
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"}, priority = 9)
    public void ValidationTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");                //IncommingSampleBtn
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[2]"); //savebt
        PageBase.staticWait(02);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant Name can't be empty\"]", "Plant Name can't be empty"); // plant validation
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Supplier name can't be empty\"]", "Supplier name can't be empty"); // supplier validation
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Material Name can't be empty\"]", "Material Name can't be empty"); // Raw material validation
        PageBase.staticWait(5);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 10)
    public void AddIncomingCancelTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");  //Incoming sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button[1]"); //cancel button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 11)
    public void AddIncomingCloseTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"rcDialogTitle0\"]/div/i"); //close button
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 12)
    public void SearchTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");   //Samplemenu
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]"), "Incoming sample page is displayed");  //Incoming sample soft assert
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[3]/span[2]"); // click plant search
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("/html/body/div[4]/div/div/div/div/input", "Jaffna"); // enter search value
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div/div/button[1]");
        PageBase.staticWait(02);
        softAssert.assertAll();
    }

}

