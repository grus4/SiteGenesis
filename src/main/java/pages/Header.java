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
}
