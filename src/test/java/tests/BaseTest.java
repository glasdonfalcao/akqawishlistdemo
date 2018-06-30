package tests;

/**
 * Created By: Glasdon Falcao on 30th June 2018
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    //*************Environment Properties File********************
    final String appConfigPath = System.getProperty("appConfig");

    @BeforeClass
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\akqawishlistdemo\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
