package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 25.11.2016.
 */
public class LoginPage extends Page{
    public LoginPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void fillEmailField(String email) {
        web.input("EmailAddressField", email);
    }

    public void fillPasswordField(String password) {
        web.input("PasswordField", password);
    }

    public void switchToMyAccount() {
        web.clickButton("LoginButton");
        web.waitForElementPresent("LogoutLinkInMyAccount");
        web.waitForElementToBeClickable("LogoutLinkInMyAccount");

        if(web.isElementPresent("LogoutLinkInMyAccount")
                && web.isElementPresent("LogoutLinkInMyAccount")){
            log.info("Switching to My Account was correct");
        } else {
            log.error("Switching to My Account was INCORRECT!\n");
            Assert.fail("Switching to My Account was INCORRECT!\n");
        }
    }
}
