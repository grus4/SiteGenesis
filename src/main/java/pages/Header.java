package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 24.11.2016.
 */
public class Header extends Page {
    public Header(WebDriverWrapper dr) {
        super(dr);
    }

    public void switchToLoginPage() {
        web.clickElement("LoginIcon");
        web.waitForElementToBeClickable("LoginLink");
        web.clickLink("LoginLink");


        if(web.isElementPresent("LoginButton")
                && web.isElementAvailable("LoginButton")){
            log.info("Switching to Login page was correct");
        } else {
            log.error("Switching to Login page was INCORRECT!!\n");
            Assert.fail("Switching to Login page was INCORRECT!!");
        }
    }

    public void logout() {
        web.clickElement("LoginIcon");
        web.clickButton("LogOutButton");

    }

    public void switchToCreateAccountPage() {
        web.clickElement("LoginIcon");
        web.waitForElementToBeClickable("RegisterLink");
        web.clickLink("RegisterLink");

        if(web.isElementPresent("ApplyButton")
                && web.isElementAvailable("ApplyButton")) {
            log.info("Switching to Create Account page was correct");
        } else {
            log.error("Switching to Create Account page was INCORRECT!\n");
            Assert.fail("Switching to Create Account page was INCORRECT!");
        }
    }

    public void switchToCLP() {
        web.moveToElementAndClick("NewArrivalsCategory", "WomenSubcategory");

        if(web.isElementPresent("SortingDropDown")
                && web.isElementAvailable("SortingDropDown")){
            log.info("Switching to CLP was correct");
        } else {
            log.info("Switching to CLP was INCORRECT!");
            Assert.fail("Switching to CLP was INCORRECT!");
        }
    }

    public void switchToShoppingCart() {
        web.moveToElementAndClick("CartIcon", "ViewCart");
        web.waitForElementPresent("BottomCheckoutButton");
        web.waitForElementToBeClickable("BottomCheckoutButton");

        if(web.isElementPresent("BottomCheckoutButton")
                && web.isElementAvailable("BottomCheckoutButton")){
            log.info("Switching to the Shopping Cart was correct");
        } else {
            log.error("Switching to the Shopping Cart was INCORRECT!\n");
            Assert.fail("Switching to the Shopping Cart was INCORRECT!");
        }
    }

    public void switchToHomePage() {
        web.clickElement("Logo");
    }
}
