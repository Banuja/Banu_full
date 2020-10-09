package com.test.qa.settings.privillageConfiguration;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class SuperAdminPrivillage extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((SuperAdminPrivillage.class)));
    @Test(groups = {"Smoke"}, priority = 1)

    /*
  Check  From Balagoda Admin
     */
    public static void checkSuperAdmin() throws Exception {
        TokiyoLog.logout();
        PageBase.staticWait(5);
        TokiyoLog.balaAdminlogin();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");//Click icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/ul/li[2]/a");//click settings
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/div");//click Privilege config
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/ul/li[5]/a");//click Super Admin config




    }
}
