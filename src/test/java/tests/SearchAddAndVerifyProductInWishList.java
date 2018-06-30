package tests;

/**
 * Created By: Glasdon Falcao on 30th June 2018
 */

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.GoToPage;
import pages.PageObjects;
import objects.GeneralObjects;
import java.util.concurrent.TimeUnit;

public class SearchAddAndVerifyProductInWishList extends BaseTest {

    @Test (priority = 0)
    public void searchandaddproduct () throws InterruptedException {

        //*************PAGE INSTANTIATIONS*************
        PageObjects pageObjects = new PageObjects(driver,wait);
        GoToPage goToPageObjects = new GoToPage(driver,wait);

        //*************PAGE METHODS********************

        //Go to Product Page
        goToPageObjects.goToProductPage();

        //Enter Search Keyword To Search
        pageObjects.performSearch("paint");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        pageObjects.selectFirstProductFromSearchResults();

        String pagetitle = driver.findElement(By.xpath(GeneralObjects.productPageTitleXpath)).getText();
        String productcode = driver.findElement(By.xpath(GeneralObjects.productCodeXpath)).getText();
        driver.findElement(By.className(GeneralObjects.btnAddToWishListClassname)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //*************PRODUCT PAGE ASSERTION***********************
        pageObjects.verifyProductAdded("Added");

        //Go to Wish List Page
        goToPageObjects.goToWishListPage();

        //*************WISH LIST PAGE ASSERTIONS***********************
        pageObjects.verifyProductIsAddedOnWishListPageSuccessfully(pagetitle, productcode);
    }
}
