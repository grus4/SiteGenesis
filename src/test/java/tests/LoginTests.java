package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ITest;
import org.apache.bcel.classfile.Utility;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Rus on 24.11.2016.
 */
public class LoginTests extends Fixture {

    //move fixtures there cause ITestResult
    /*@BeforeMethod
    public static void beforeMethod(ITestResult testResult) {
        extentTest = extentReports.startTest(testResult.getTestName());
        extentTest.log(LogStatus.INFO, "<=== Start test - " + testResult.getTestName() + " ===>");

        log.info("<=== Start test - " + testResult.getTestName() + " ===>");
    }

    @AfterMethod
    public static void afterMethod(ITestResult testResult) {
        if (testResult.isSuccess()) {
            extentTest.log(LogStatus.INFO, "<=== Test - " + testResult.getTestName() + " is " + testResult.getStatus() + " ===>");
            log.info("<=== Test - " + testResult.getTestName() + " is " + testResult.getStatus() + " ===>");
        } else {
            extentTest.log(LogStatus.ERROR, "<=== Test - " + testResult.getTestName() + " is " + testResult.getStatus() + " ===>");
            log.error("<=== Test - " + testResult.getTestName() + " is " + testResult.getStatus() + " ===>");
            siteGenesis.screenShotMaker.takeScreenShot(testResult.getTestName());
        }
        log.info("<=== End test - " + testResult.getTestName() + " ===>");
        extentReports.endTest(extentTest);
        extentReports.flush();
    }*/




    @Test
    public void loginWithValidData() {
        extentTest = extentReports
                .startTest("loginWithValidData")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill Email field");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill Password Field");
        siteGenesis.loginPage.switchToMyAccount();
        extentTest.log(LogStatus.INFO, "Switch to My Account page");
        Assert.assertTrue(siteGenesis.myAccountPage.isLogoutButtonIsAvailable(), "Logout button is not displayed");
        extentTest.log(LogStatus.INFO, "Login to Account was correct");
        siteGenesis.header.logout();
        extentTest.log(LogStatus.INFO, "Logout from MyAccount");
    }

    @Test
    public void emptyFieldsValidationFotLoginForm() {
        extentTest = extentReports
                .startTest("emptyFieldsValidationFotLoginForm")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Leave empty fields and click the Login Button");
        siteGenesis.loginPage.checkValidationForAllEptyFields();
        extentTest.log(LogStatus.INFO, "Validation message appears under each field");
    }

    @Test
    public void invalidDataValidationForEmailWithMissingAt() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailWithMissingAt")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_MISSING_AT);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with missing at");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldWithMissingAddress() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldWithMissingAddress")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_MISSING_ADDRESS);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with missing address");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldWithSuperfluousText() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldWithSuperfluousText")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_SUPERFLUOUS_TEXT);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with SUPERFLUOUS_TEXT");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldCopyPasteFromAddressBookWithName() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldCopyPasteFromAddressBookWithName")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_COPY_PASTE_FROM_ADDRESS_BOOK_WITH_NAME);
        extentTest.log(LogStatus.INFO, "Fill in an invalid email with COPY_PASTE_FROM_ADDRESS_BOOK_WITH_NAME");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldWithTwoAt() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldWithTwoAt")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_COPY_WITH_TWO_AT);
        extentTest.log(LogStatus.INFO, "Fill in an INVALID_EMAIL_COPY_WITH_TWO_AT");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }

    @Test
    public void invalidDataValidationForEmailFieldSpecialCharacters() {
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailFieldSpecialCharacters")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_SPECIAL_CHARACTERS);
        extentTest.log(LogStatus.INFO, "Fill in an INVALID_EMAIL_SPECIAL_CHARACTERS");
        siteGenesis.loginPage.fillPasswordField(PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in a valid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email field");
    }


    //@Test
    public void invalidDataValidationForPasswordField() {
        extentTest = extentReports
                .startTest("invalidDataValidationForPasswordField")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in a valid email");
        siteGenesis.loginPage.fillPasswordField(INVALID_PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in an invalid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the password field");
    }

    //@Test
    public void invalidDataValidationForEmailAndPasswordFields(){
        extentTest = extentReports
                .startTest("invalidDataValidationForEmailAndPasswordFields")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.switchToLoginPage();
        extentTest.log(LogStatus.INFO, "Switching to Login page");
        siteGenesis.loginPage.fillEmailField(INVALID_EMAIL_MISSING_AT);
        extentTest.log(LogStatus.INFO, "Fill in an INVALID_EMAIL_MISSING_AT");
        siteGenesis.loginPage.fillPasswordField(INVALID_PASSWORD);
        extentTest.log(LogStatus.INFO, "Fill in an invalid password");
        siteGenesis.loginPage.clickLoginButton();
        extentTest.log(LogStatus.INFO, "Click the Login Button");
        siteGenesis.loginPage.checkValidationForInvalidData();
        extentTest.log(LogStatus.INFO, "Validation message appears under the email and password fields");

    }
}
