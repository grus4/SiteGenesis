package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 16.01.2017.
 */
public class StandardPDP extends Page{

    public StandardPDP(WebDriverWrapper dr) {
        super(dr);
    }

    public void addProductToCart() {

        web.clickButton("AddToCartButton");
        web.waitForElementPresent("ViewCart");
        web.waitForElementToBeClickable("ViewCart");

        if(web.isElementPresent("ViewCart")){
            log.info("The product has been successfully added to the cart");
        } else {
            log.error("The product has been INCORRECTLY ADDED TO THE CART!");
            Assert.fail("The product has been INCORRECTLY ADDED TO THE CART!");
        }

    }
}
