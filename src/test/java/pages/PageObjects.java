package pages;

/**
 * Created By: Glasdon Falcao on 30th June 2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import objects.GeneralObjects;
import java.util.List;

public class PageObjects extends BasePage {

    public PageObjects(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Methods*********

    //Enter search string "paint" and perform search operation
    public void performSearch (String searchString){
        enterText(By.xpath(GeneralObjects.searchTextBoxXpath), searchString);
        clickObject(By.className(GeneralObjects.btnSearchClassname));
    }

    //Get list of products on search result page and click on first product
    public void selectFirstProductFromSearchResults () {
        List<WebElement> productList = driver.findElements(By.xpath(GeneralObjects.productListXpath));
        productList.get(0).click();
    }

    //Verify Product Is Added Successfully
    public void verifyProductAdded (String expectedText) {
        Assert.assertEquals(verifyText(By.xpath(GeneralObjects.addedButtonTextXpath)), expectedText);
    }

    //Verify Page Title and Product Code on Wish List Page
    public void verifyProductIsAddedOnWishListPageSuccessfully (String expectedPageTitle, String expectedProductCode) {
        Assert.assertEquals(verifyText(By.xpath(GeneralObjects.prodoctPageTitleWishListXpath)), expectedPageTitle);
        Assert.assertEquals(verifyText(By.xpath(GeneralObjects.prodoctCodeWishListXpath)), expectedProductCode);
    }
}