package tests;

import org.testng.annotations.Test;

/**
 * Created by Rus on 24.11.2016.
 */
public class LoginTest extends  Fixture {


    @Test
    public void LoginWithValidData() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToLoginPage();
    }
}
