package OpenBrowserInputs;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com");
        WebElement email = driver.findElement(By.name("identifier"));
        email.sendKeys("preet2711@gmail.com");
        WebElement btnNext = driver.findElement(By.name("V67aGc"));
        btnNext.click();


    }
}
