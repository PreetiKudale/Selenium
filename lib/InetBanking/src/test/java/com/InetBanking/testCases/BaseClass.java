package com.InetBanking.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;

public class BaseClass {
    public String baseURL = "https://stock.amolujagare.com/";
    public String username = "admin";
    public String password = "admin";
    public static WebDriver driver;
    public static Logger Logger;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        Logger = Logger.getLogger("POSNIC");
        PropertyConfigurator.configure("Log4j.properties");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
