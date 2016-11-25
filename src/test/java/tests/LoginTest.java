package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 24.11.2016.
 */
public class LoginTest extends  Fixture {


    @Test
    public void LoginWithValidData() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.homePage.refreshPage();
        siteGenesis.header.switchToLoginPage();
        siteGenesis.loginPage.fillEmailField(EMAIL);
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        siteGenesis.loginPage.switchToMyAccount();
        Assert.assertTrue(siteGenesis.myAccountPage.isLogoutButtonIsAvailable(), "Logout button is not displayed");
        siteGenesis.header.logout();
    }


}
