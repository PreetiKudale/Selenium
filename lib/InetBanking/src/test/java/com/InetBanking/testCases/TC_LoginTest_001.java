package com.InetBanking.testCases;


import com.InetBanking.pageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
    @Test
    public void loginTest()
    {
        driver.get(baseURL);
        Logger.info("Open URL");
        LoginPage lp= new LoginPage(driver);
        lp.setUserName("username");

        lp.setPassword("password");
        lp.clickSubmit();




    }

}
