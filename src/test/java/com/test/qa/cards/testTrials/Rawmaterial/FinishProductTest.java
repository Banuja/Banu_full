package com.test.qa.cards.testTrials.Rawmaterial;//package com.test.qa.cards.testTrials.Rawmaterial;
//
//import com.test.qa.utils.TestBase;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import utils.MethodBase;
//import utils.PageBase;
//
//public class FinishProductTest extends TestBase {
//    public SoftAssert softAssert;
//
//    @Test(groups = {"Smoke"}, priority = 1)
//    public void ConcreteSlumpTest() throws Exception {
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click finish product test
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div/h2"); // click concrete test
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click slump test
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div[2]/div/div"),"Slump test page is displayed");
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/button"); // click create test
////        MethodBase.click_ByXpath("//*[@id=\"date\"]/div/input"); // select date
////        MethodBase.hitEnter();
////        PageBase.staticWait(02);
////        MethodBase.setKey_ByXpath("//*[@id=\"noOfTrial\"]",Keys.ARROW_UP);
////        MethodBase.click_ByXpath("//*[@id=\"testSampleState\"]/div/div"); // material state
////        MethodBase.hitEnter();
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/div[2]/div/div[7]/div/button"); // submit btn
////        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div[2]/div/div/div/div/div[1]/p"), "Table is not displayed");
////        PageBase.staticWait(02);
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[9]/button"); // create test trial
////        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[1]"),"table is not displayed");
////        PageBase.staticWait(02);
////        MethodBase.setKey_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/input",Keys.ARROW_UP); // set number
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[2]/div[1]/div/div[2]/div/button"); // click trail
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div[2]/div[1]/div/div[2]/div/button"); // click view results
////        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]"),"table is not displayed");
////        MethodBase.click_ByXpath("//*[@id=\"comments\"]"); // comments
////        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[2]/div[2]/button"); // save btn
//        softAssert.assertAll();
//    }
//
//    @Test(groups = {"Smoke"}, priority = 2)
//    public void Concrete7DayStrengthTest(){
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click finish product test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div/h2"); // click concrete test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div/h1"); // click 7dayStrength test
//        PageBase.staticWait(02);
//        softAssert.assertAll();
//    }
//
//    @Test(groups = {"Smoke"}, priority = 3)
//    public void Concrete5StrengthTest(){
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click finish product test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div/h2"); // click concrete test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div/h1"); // click 5dayStrength test
//        PageBase.staticWait(02);
//        softAssert.assertAll();
//    }
//
//    @Test(groups = {"Smoke"}, priority = 4)
//    public void AggregateSlumpTest(){
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click finish product test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div"); // click aggregate test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div/h1"); // click slump test
//        PageBase.staticWait(02);
//        softAssert.assertAll();
//    }
//
//    @Test(groups = {"Smoke"}, priority = 5)
//    public void Aggregate7DayStrengthTest(){
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click finish product test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div"); // click aggregate test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div/h1"); // click 7daystrength test
//        PageBase.staticWait(02);
//        softAssert.assertAll();
//    }
//
//    @Test(groups = {"Smoke"}, priority = 6)
//    public void Aggregate5DayStrengthTest(){
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[1]/div"); // click finish product test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div"); // click aggregate test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[3]/div/h1"); // click 5daystrength test
//        PageBase.staticWait(02);
//        softAssert.assertAll();
//    }
//
//}
