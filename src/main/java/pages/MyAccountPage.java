package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 25.11.2016.
 */
public class MyAccountPage extends Page{
    public MyAccountPage(WebDriverWrapper dr) {
        super(dr);
    }


    public boolean isLogoutButtonIsAvailable() {
        web.clickElement("LoginIcon");

        if(web.isElementPresent("LogOutButton")) {
            log.info("A User is logged in to the Account");
            return true;
        } else {
            log.error("A User is not logged in to the Account!!\n");
            Assert.fail("A User is not logged in to the Account!!");
            return false;
        }

    }
}
