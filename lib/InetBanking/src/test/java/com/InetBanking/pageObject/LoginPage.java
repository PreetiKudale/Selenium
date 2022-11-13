package com.InetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver Idriver;

    public LoginPage(WebDriver rdriver)
    {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(name="username")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(name="password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="submit")
    @CacheLookup
    WebElement btnLogin;

    public void setUserName(String uname) {
        txtUserName.sendKeys("admin");
    }
    public void setPassword(String pwd) {
        txtUserName.sendKeys("admin");
    }
    public void clickSubmit() {
        btnLogin.click();
    }

}
