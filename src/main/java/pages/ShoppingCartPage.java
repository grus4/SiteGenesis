package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 17.01.2017.
 */
public class ShoppingCartPage extends Page{
    public ShoppingCartPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void switchToLoginCheckoutPage() {
        web.clickButton("BottomCheckoutButton");

        if(web.isElementPresent("CheckoutAsGuest")
                && web.isElementAvailable("CheckoutAsGuest")) {
            log.info("Switching to Checkout LOgin Page was correct");
        } else {
            log.error("Switching to Checkout Login Page was INCORRECT!\n");
            Assert.fail("Switching to Checkout Login Page was INCORRECT!");
        }
    }
}
