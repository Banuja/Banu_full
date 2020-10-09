package com.test.qa.settings.privillageConfiguration;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;


public class PlantRole extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((PlantRole.class)));
    @Test(groups = {"Smoke"}, priority = 6)
    /*
    Add Employee Cart -Master
     */
    public static void addEmployeeforConfiguration() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/ul/li[14]/a");//Employee NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[3]");//employee Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]");//btnemployee
        PageBase.staticWait(5);
        MethodBase.setText_ByID("first_name","Nirukshi");//first_name
        PageBase.staticWait(5);
        MethodBase.setText_ByID("last_name","Nada");//last_name
        PageBase.staticWait(5);
        MethodBase.setText_ByID("address","Jaffna");//address
        MethodBase.setText_ByID("phoneno","0778967896");//phoneno
        MethodBase.setText_ByID("email","nixsala27+2@gmail.com");//email
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//clickPlantOption
        PageBase.staticWait(8);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div");//selectDesignationOptioN
        PageBase.staticWait((8));
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/ul/li[3]");//Turn Page two
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[4]/td[8]/span/button");// Add cart
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@id=\"userType\"]/div/div");// Drop user type
        PageBase.staticWait((5));
        MethodBase.hitEnter();
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@id=\"role\"]/div/div");// Drop Role type
        PageBase.staticWait((5));
        MethodBase.hitEnter();
        PageBase.staticWait((8));
        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[4]/div/div/div");//Add
        MethodBase.escape();
        PageBase.staticWait(8);




    }

    @Test(groups = {"Smoke"}, priority = 7)
    public static void viewPlantRoleCheck() throws Exception {
        /*
        Privillage Checking For VIEW
         */
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");//Click icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/ul/li[2]/a");//click settings
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/div");//click Privilege config
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"sub2$Menu\"]/li[1]/a");//Click Plant Role
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/div/div/ul/li[3]/a");//Turn Page Two
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/table/tbody/tr[3]/td[2]");//Click Baticallo Plant Admin
        PageBase.staticWait(5);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div/div/div/div[2]/div/table/tbody/tr[3]/td[2]");//verify is added
        LOGGER.info("Baticallo Plant Admin Available in the Screen");
        MethodBase.click_ByXpath("//*[@id=\"sub2$Menu\"]/li[2]/a");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[1]/div[2]/div/div");//plant
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[1]/div");//Plant icon
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[1]/div");//Click Production Unit
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[2]/label/span/input");//Check Box Click
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[4]/td[2]/label/span/input");//VIEW production Unit
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr[4]/td[2]/label/span/input");//Create production unit
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//Save Changes Button
        PageBase.staticWait(5);





    }

    @Test(groups = {"Smoke"}, priority = 8)
    public static void UserRolePrivillage() throws Exception {

        /*
        Check Login AS Baticalo Admin
         */

        TokiyoLog.logout();
        PageBase.staticWait(8);
        TokiyoLog.balaAdminlogin();


        /*
       Login (balaAdminlogin) Other Plant Access : Settings For QC
         */
        TokiyoLog.logout();
        TokiyoLog.balaAdminlogin(); //Bala Admin
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/header/ul/li[4]/div/div/span[2]/span/span/i");//Click icon
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/ul/li[2]/a");//click settings
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/div");//click Privilege config
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/ul/li[3]/ul/li[3]/a");//Click Other Plant Access
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[2]/div/div");//Click  Plant Category
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);

        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[1]/div[3]/div"); // click user
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//ul[li[@class=\"ant-select-dropdown-menu-item\"]]/li[text()=\"BALAGOADA_QC\"]");//Select User
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/main/div[2]/div/div/div/div/div/div/table/tbody/tr/td[5]/span");//Click Allow Access Link
//        MethodBase.isDisplayed_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[1]/div");
        LOGGER.info("Request access to other plants");
        PageBase.staticWait(8);
//        MethodBase.clear_check("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/label[4]/span[1]/input");//Click Trinco
//        PageBase.staticWait(8);
//        MethodBase.clear_check("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/label[5]/span[1]/input");//Click Jaffna
//        PageBase.staticWait(8);
//        MethodBase.clear_check("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/label[6]/span[1]/input");//Click Vavaniya
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/div/button[2]");//Ok button
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none; width: auto; margin-left: -10px;\"]");//save
        PageBase.staticWait(8);
        TokiyoLog.logout();






        /*
       Login AS QC
         */
        PageBase.staticWait(10);
        TokiyoLog.balaQClogin();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV




    }




}
