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
    public void emptyFieldsValidationForCreateAccountForm() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCreateAccountPage();
        siteGenesis.createAccountPage.clickApplyButton();
        siteGenesis.createAccountPage.checkValidationForAllEmptyFields();
    }
}
