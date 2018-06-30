package pages;

/**
 * Created By: Glasdon Falcao on 30th June 2018
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    //Click Method
    public void clickObject (By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    //Enter Text Method
    public void enterText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Verify Text Method
    public String verifyText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
}
