package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Rus on 27.11.2016.
 */
public class CreateAccountTests extends Fixture {

    @Test
    public void createAccountWithValidData() {
        extentTest = extentReports
                .startTest("createAccountWithValidData")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Site Genesis Home Page");
        siteGenesis.header.goToCreateAccountPage();
        extentTest.log(LogStatus.INFO, "Switching to Create Account page");
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name field");
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        siteGenesis.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email and Confirm Email fields");
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field");
        siteGenesis.createAccountPage.fillConfirmPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Confirm Password field");
        siteGenesis.createAccountPage.clickApplyButton();
        extentTest.log(LogStatus.INFO, "Click on the Apply button");
        Assert.assertTrue(siteGenesis.myAccountPage.isLogoutButtonAvailable(), "New account is not created");
        extentTest.log(LogStatus.INFO, "A new Account has been created successfully");
        siteGenesis.header.logout();
        extentTest.log(LogStatus.INFO, "Log out");
        siteGenesis.header.deleteAllCookies();
    }

    @Test
    public void createAccountFormValidation_EmptyFields() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_EmptyFields")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Site Genesis Home Page");
        siteGenesis.header.goToCreateAccountPage();
        extentTest.log(LogStatus.INFO, "Switching to Create Account page");
        siteGenesis.createAccountPage.clickApplyButton();
        extentTest.log(LogStatus.INFO, "Click on the Apply button");
        siteGenesis.createAccountPage.assertValidationForAllEmptyFields();
        extentTest.log(LogStatus.INFO, "Error message is displayed under each empty field");
        siteGenesis.createAccountPage.deleteAllCookies();
    }


    @Test
    public void createAccountFormValidation_Re_RegisterTheSameUser() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_Re_RegisterTheSameUser")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Site Genesis Home Page");
        siteGenesis.header.goToCreateAccountPage();
        extentTest.log(LogStatus.INFO, "Switching to Create Account page");
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name field");
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        siteGenesis.createAccountPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the existing email in the Email field");
        siteGenesis.createAccountPage.fillConfirmEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the existing email in the Confirm Email field");
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field with valid data");
        siteGenesis.createAccountPage.fillConfirmPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Confirm password field with valid data");
        siteGenesis.createAccountPage.clickApplyButton();
        extentTest.log(LogStatus.INFO, "Click on the Apply button");
        siteGenesis.createAccountPage.assertFormValidation_Re_registerTheSameUser();
        extentTest.log(LogStatus.INFO, "Username already taken message is displayed correctly");
        siteGenesis.createAccountPage.deleteAllCookies();
    }

    @Test
    public void createAccountFormValidation_With_DifferentEmail_In_Email_And_ConfirmEmail_Fields() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_With_DifferentEmail_In_Email_And_ConfirmEmail_Fields")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Site Genesis Home Page");
        siteGenesis.header.goToCreateAccountPage();
        extentTest.log(LogStatus.INFO, "Switching to Create Account page");
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name field");
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        siteGenesis.createAccountPage.fillEmailField(PAYPAL_EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email field with valid data");
        siteGenesis.createAccountPage.fillConfirmEmailField(EMAILFORREGISTEREDUSER);
        extentTest.log(LogStatus.INFO, "Enter a password that differs from the password entered in the Email field");
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field with valid data");
        siteGenesis.createAccountPage.fillConfirmPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Confirm password field with valid data");
        siteGenesis.createAccountPage.clickApplyButton();
        extentTest.log(LogStatus.INFO, "Click on the Apply button");
        siteGenesis.createAccountPage.assertFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields();
        extentTest.log(LogStatus.INFO, "Mismatching passwords message is displayed correctly");
        siteGenesis.createAccountPage.deleteAllCookies();

    }

    @Test
    public void createAccountFormValidation_With_DifferentPassword_And_ConfirmPassword() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_With_DifferentPassword_And_ConfirmPassword")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Site Genesis Home Page");
        siteGenesis.header.goToCreateAccountPage();
        extentTest.log(LogStatus.INFO, "Switching to Create Account page");
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name field");
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        siteGenesis.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email and Confirm Email fields");
        siteGenesis.createAccountPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in the Password field with valid data");
        siteGenesis.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD);
        extentTest.log(LogStatus.INFO, "Enter a password that differs from the password entered in the Email field");
        siteGenesis.createAccountPage.clickApplyButton();
        extentTest.log(LogStatus.INFO, "Click on the Apply button");
        siteGenesis.createAccountPage.assertFormValidation_with_DifferentPassword_And_ConfirmPassword();
        extentTest.log(LogStatus.INFO, "Mismatching passwords message is displayed correctly");
        siteGenesis.createAccountPage.deleteAllCookies();
    }

    @Test
    public void createAccountFormValidation_PasswordLength() {
        extentTest = extentReports
                .startTest("createAccountFormValidation_PasswordLength")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open Site Genesis Home Page");
        siteGenesis.header.goToCreateAccountPage();
        extentTest.log(LogStatus.INFO, "Switching to Create Account page");
        siteGenesis.createAccountPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the First Name field");
        siteGenesis.createAccountPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field");
        siteGenesis.createAccountPage.fillEmailAndConfirmEmailFields(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the Email and Confirm Email fields");
        siteGenesis.createAccountPage.fillPasswordField(INVALID_PASSWORD_LENGTH);
        extentTest.log(LogStatus.INFO, "Enter an invalid password length in the Password field");
        siteGenesis.createAccountPage.fillConfirmPasswordField(INVALID_PASSWORD_LENGTH);
        extentTest.log(LogStatus.INFO, "Enter an invalid password length in the Confirm Password field");
        siteGenesis.createAccountPage.clickApplyButton();
        extentTest.log(LogStatus.INFO, "Click on the Apply button");
        siteGenesis.createAccountPage.assertFormValidation_with_IncorrectPasswordLength();
        extentTest.log(LogStatus.INFO, "Error message for incorrect Password length is displayed correctly");
        siteGenesis.createAccountPage.deleteAllCookies();
    }
}
