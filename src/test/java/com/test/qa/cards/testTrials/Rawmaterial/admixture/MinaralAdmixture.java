package com.test.qa.cards.testTrials.Rawmaterial.admixture;//package com.test.qa.cards.testTrials.Rawmaterial.admixture;
//
//import com.test.qa.utils.TestBase;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import utils.MethodBase;
//import utils.PageBase;
//
//public class MinaralAdmixture extends TestBase {
//    public SoftAssert softAssert;
//
//    @Test(groups = {"Smoke"}, priority = 1)
//    public void minaralTest(){
//        softAssert = new SoftAssert();
//        PageBase.staticWait(03);
//        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[2]/div/div"); // click test trial
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div"); // click raw material test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/a[2]/div/h1"); // click admixture test
//        PageBase.staticWait(02);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/a[2]/div/h1"); // click minarel test
//        PageBase.staticWait(02);
//        softAssert.assertAll();
//    }
//}
