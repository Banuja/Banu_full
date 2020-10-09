package com.test.qa.settings.privillageConfiguration;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class TokiyoLog extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((TokiyoLog.class)));
    @Test(groups = {"Smoke"}, priority = 1)
    public static void logout() {

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");//Click icon
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@id=\"item_2$Menu\"]/li[3]");//Click LogOut
        PageBase.staticWait(8);


    }


    @Test(groups = {"Smoke"}, priority = 2)
    public static void balaAdminlogin() {

        MethodBase.setText_ByID("usernameOrEmail","nixsala27+3@gmail.com");
        MethodBase.setText_ByID("password","UV33d34f");
        MethodBase.click_ByXpath("//button");
        LOGGER.info("successful Login AS BATIICALLO Admin");
        PageBase.staticWait(5);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/p/li[1]");// Verify -Bati Admin TEXT
        LOGGER.info("Verify -Bati Admin TEXT");

    }

    @Test(groups = {"Smoke"}, priority = 3)
    public static void balaQClogin() {

        MethodBase.setText_ByID("usernameOrEmail","nixsala27+4@gmail.com");
        MethodBase.setText_ByID("password","e8Gs17K4");
        MethodBase.click_ByXpath("//button");
        LOGGER.info("successful Login AS BATIICALLO QC");
        PageBase.staticWait(5);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/p/li[1]");// Verify -Bati Admin TEXT
        LOGGER.info("Verify BATIICALLO QC TEXT");

    }


    @Test(groups = {"Smoke"}, priority = 4)
    public static void trincoAdminLogin() {

        MethodBase.setText_ByID("usernameOrEmail","nixsala27@gmail.com");
        MethodBase.setText_ByID("password","o2b310AB");
        MethodBase.click_ByXpath("//button");
        LOGGER.info("successful Login AS TRINCO ADMIN");
        PageBase.staticWait(5);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/p/li[1]");// Verify -Bati Admin TEXT
        LOGGER.info("Verify TRINCO ADMINTEXT");

    }





}
