package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 16.01.2017.
 */
public class CategoryLandingPage extends Page{

    public CategoryLandingPage(WebDriverWrapper dr) {
        super(dr);
    }


    public void switchToStandardPDP() {
        web.clickElement("FirstProductInGrid");
        web.waitForElementPresent("AddToCartButton");
        web.waitForElementToBeClickable("AddToCartButton");

        if(web.isElementPresent("AddToCartButton")
                && web.isElementAvailable("AddToCartButton")){
            log.info("Switching to PDP was correct");
        } else {
            log.info("Switching to PDP was INCORRECT!");
            Assert.fail("Switching to PDP was INCORRECT!");
        }
    }

    public void switchToVariationPDP() {
        web.clickElement("SecondProductInGrid");
        web.waitForElementPresent("SizeSwatch");
        web.waitForElementToBeClickable("SizeSwatch");

        if( web.isElementAvailable("SizeSwatch")
                && web.isElementAvailable("SizeSwatch")){
            log.info("Switching to PDP was correct");
        } else {
            log.info("Switching to PDP was INCORRECT!");
            Assert.fail("Switching to PDP was INCORRECT!");
        }
    }
}
