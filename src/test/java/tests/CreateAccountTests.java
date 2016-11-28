package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 27.11.2016.
 */
public class CreateAccountTests extends Fixture {

    @Test
    public void createAccountWithValidData() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCreateAccountPage();
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        siteGenesis.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        siteGenesis.createAccountPage.fillConfirmPasswordField(PASSWORD);
        siteGenesis.createAccountPage.clickApplyButton();
        Assert.assertTrue(siteGenesis.myAccountPage.isLogoutButtonIsAvailable(), "New account is not created");
        siteGenesis.header.logout();
    }

    @Test
    public void createAccountFormValidation_emptyFields() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCreateAccountPage();
        siteGenesis.createAccountPage.clickApplyButton();
        siteGenesis.createAccountPage.checkValidationForAllEmptyFields();
    }

    @Test
    public void createAccountFormValidation_Re_registerTheSameUser() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCreateAccountPage();
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        siteGenesis.createAccountPage.fillEmailField(EMAIL);
        siteGenesis.createAccountPage.fillConfirmEmailField(EMAIL);
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        siteGenesis.createAccountPage.fillConfirmPasswordField(PASSWORD);
        siteGenesis.createAccountPage.clickApplyButton();
        siteGenesis.createAccountPage.checkFormValidation_Re_registerTheSameUser();
    }

    @Test
    public void createAccountFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCreateAccountPage();
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        siteGenesis.createAccountPage.fillEmailField(PAYPAL_EMAIL);
        siteGenesis.createAccountPage.fillConfirmEmailField(EMAILFORREGISTEREDUSER);
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        siteGenesis.createAccountPage.fillConfirmPasswordField(PASSWORD);
        siteGenesis.createAccountPage.clickApplyButton();
        siteGenesis.createAccountPage.checkFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields();
    }
}
