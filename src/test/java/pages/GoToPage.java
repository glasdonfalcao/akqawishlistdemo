package pages;

/**
 * Created By: Glasdon Falcao on 30th June 2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoToPage extends BasePage {

    //*********Constructor*********
    public GoToPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Generic Page URL's*********

    String searchandaddproductURL = "https://www.bunnings.com.au/search/products?redirectFrom=Any";
    String wishlistURL = "https://www.bunnings.com.au/wish-lists/";


    //*********Page Methods*********

    //Go to Product Page
    public void goToProductPage (){
        driver.navigate().to(searchandaddproductURL);
    }

    //Go to WishList Page
    public void goToWishListPage (){
        driver.navigate().to(wishlistURL);
    }
}
