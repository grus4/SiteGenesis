package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 24.11.2016.
 */
public class LoginTests extends  Fixture {


    @Test
    public void loginWithValidData() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.homePage.refreshPage();
        siteGenesis.header.switchToLoginPage();
        siteGenesis.loginPage.fillEmailField(EMAIL);
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        siteGenesis.loginPage.switchToMyAccount();
        Assert.assertTrue(siteGenesis.myAccountPage.isLogoutButtonIsAvailable(), "Logout button is not displayed");
        siteGenesis.header.logout();
    }

    @Test
    public void emptyFieldsValidationFotLoginForm() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToLoginPage();
        siteGenesis.loginPage.clickLoginButton();
        siteGenesis.loginPage.checkValidationForAllEptyFields();
    }

    @Test
    public void invalidDataValidationForEmailField() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToLoginPage();
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL);
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        siteGenesis.loginPage.clickLoginButton();
        siteGenesis.loginPage.checkValidationForInvalidData();
    }

    @Test
    public void invalidDataValidationForPasswordField() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToLoginPage();
        siteGenesis.loginPage.fillEmailField(EMAIL);
        siteGenesis.loginPage.fillPasswordField(INVALID_PASSWORD);
        siteGenesis.loginPage.clickLoginButton();
        siteGenesis.loginPage.checkValidationForInvalidData();
    }

    @Test
    public void invalidDataValidationForEmailAndPasswordFields(){
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToLoginPage();
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL);
        siteGenesis.loginPage.fillPasswordField(INVALID_PASSWORD);
        siteGenesis.loginPage.clickLoginButton();
        siteGenesis.loginPage.checkValidationForInvalidData();
    }
}
