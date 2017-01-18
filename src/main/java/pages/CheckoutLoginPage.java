package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 17.01.2017.
 */
public class CheckoutLoginPage extends Page{
    public CheckoutLoginPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void switchToShippingPage() {
        web.clickButton("CheckoutAsGuest");

        if(web.isElementPresent("FirstNameField")
                && web.isElementAvailable("FirstNameField")) {
            log.info("Switching to the Shipping page was correct");
        } else {
            log.error("Switching to the Shipping page was INCORRECT!\n");
            Assert.fail("Switching to the Shipping page was INCORRECT!");
        }
    }
}
