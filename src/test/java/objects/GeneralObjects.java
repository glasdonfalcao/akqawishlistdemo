package objects;

/**
 * Created By: Glasdon Falcao on 30th June 2018
 */

public class GeneralObjects {

    //*********Object Locators*********
    public static final String searchTextBoxXpath = "//*[@id=\"headerMainMenu\"]//descendant::input[1]"; //good way to write xpath example
    public static final String btnSearchClassname = "search-container_btn-submit";
    //public static final String productListXpath = "//*[@id=\"content-layout_inside-anchor\"]/div[3]/div/div/section/div[3]/div/div[1]/section[1]/article[1]";
    public static final String productListXpath = "//*[@class='product-list product-list_grid4'][1]//descendant::article[1]";
    public static final String addedButtonTextXpath = "//*[@id=\"content-layout_inside-anchor\"]/section/div/div[2]/div[3]/div[2]/button/span";
    public static final String prodoctPageTitleWishListXpath = "//*[@id=\"content-layout_inside-anchor\"]/div[1]/section[2]/table/tbody/tr[1]/td[2]/a[2]/strong";
    public static final String prodoctCodeWishListXpath = "//*[@id=\"content-layout_inside-anchor\"]/div[1]/section[2]/table/tbody/tr[1]/td[2]/small";
    //public static final String productPageTitleXpath = "//*[@id='content-layout_inside-anchor']/section/div/div[1]/div[1]/div[2]/div/h1";
    public static final String productPageTitleXpath = "//*[@class='page-title']//descendant::h1";
    public static final String productCodeXpath = "//*[@id=\"content-layout_inside-anchor\"]/section/div/div[1]/div[1]/div[2]/span";
    public static final String btnAddToWishListClassname = "btn-add-wishlist";
}
