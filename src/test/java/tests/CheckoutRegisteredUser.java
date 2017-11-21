package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 18.01.2017.
 */
public class CheckoutRegisteredUser extends Fixture {

    @Test
    public void  checkoutAsRegisteredUser_Visa() {
        extentTest = extentReports
                .startTest("checkoutAsRegisteredUser_OvernightShipping_Visa")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.goToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        siteGenesis.categoryLandingPage.switchToVariationPDP();
        extentTest.log(LogStatus.INFO, "Switch to Variation PDP");
        siteGenesis.variationPDP.addVariationProductToCart();
        extentTest.log(LogStatus.INFO, "Add a product to the mini cart");
        siteGenesis.header.goToShoppingCartPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        siteGenesis.shoppingCartPage.goToLoginCheckoutPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Checkout page");
        siteGenesis.checkoutLoginPage.fillEmailField(EMAILFORREGISTEREDUSER);
        extentTest.log(LogStatus.INFO, "Fill in the email field");
        siteGenesis.checkoutLoginPage.fillPasswordField(PASSWORDFORREGISTEREDUSER);
        extentTest.log(LogStatus.INFO, "Fill in the password field");
        siteGenesis.checkoutLoginPage.logInAsRegisteredUser();
        extentTest.log(LogStatus.INFO, "Log in as a registered user");
        siteGenesis.shippingPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the  First Name field on the Shipping page");
        siteGenesis.shippingPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field on the Shipping page");
        siteGenesis.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        extentTest.log(LogStatus.INFO, "Fill in the address field #1");
        siteGenesis.shippingPage.fillAddressLine_2_Field("");
        extentTest.log(LogStatus.INFO, "Leave the address field #2 empty");
        siteGenesis.shippingPage.fillCityField(CITY);
        extentTest.log(LogStatus.INFO, "Fill in the city field");
        siteGenesis.shippingPage.fillZipField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the zip field");
        siteGenesis.shippingPage.selectState(STATE);
        extentTest.log(LogStatus.INFO, "Select state from the drop down field");
        siteGenesis.shippingPage.fillPhoneField(PHONE);
        extentTest.log(LogStatus.INFO, "Fill in the phone field");
        siteGenesis.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        extentTest.log(LogStatus.INFO, "Check the This is also my billing address checkbox");
        siteGenesis.shippingPage.selectOvernightShipping();
        extentTest.log(LogStatus.INFO, "Select Overnight Shipping");
        siteGenesis.shippingPage.goToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Billing page");
        siteGenesis.billingPage.fillCardName(CARDNAME_VISA);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        siteGenesis.billingPage.fillCardNumberRegisteredUser(CARDNUMBER_VISA);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        siteGenesis.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        siteGenesis.billingPage.fillSecurityCodeRegisteredUser(VISA_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        siteGenesis.billingPage.goToReviewPage();
        extentTest.log(LogStatus.INFO, "Switching to the Review page");
        siteGenesis.reviewPage.goToOrderReceiptPage();
        extentTest.log(LogStatus.INFO, "Switching to the Order Receipt page");
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        extentTest.log(LogStatus.INFO, "The order has been created successfully");
        siteGenesis.header.goToHomePage();
        extentTest.log(LogStatus.INFO, "Switching to Home page");
        siteGenesis.header.deleteAllCookies();

    }

    @Test
    public void checkoutAsRegisteredUser_GroundShipping_MasterCard(){
        extentTest = extentReports
                .startTest("checkoutAsRegisteredUser_GroundShipping_MasterCard")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.goToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        siteGenesis.categoryLandingPage.switchToVariationPDP();
        extentTest.log(LogStatus.INFO, "Switch to Variation PDP");
        siteGenesis.variationPDP.addVariationProductToCart();
        extentTest.log(LogStatus.INFO, "Add a product to the mini cart");
        siteGenesis.header.goToShoppingCartPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        siteGenesis.shoppingCartPage.goToLoginCheckoutPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Checkout page");
        siteGenesis.checkoutLoginPage.fillEmailField(EMAILFORREGISTEREDUSER);
        extentTest.log(LogStatus.INFO, "Fill in the email field");
        siteGenesis.checkoutLoginPage.fillPasswordField(PASSWORDFORREGISTEREDUSER);
        extentTest.log(LogStatus.INFO, "Fill in the password field");
        siteGenesis.checkoutLoginPage.logInAsRegisteredUser();
        extentTest.log(LogStatus.INFO, "Log in as a registered user");
        siteGenesis.shippingPage.fillFirstNameField(FIRSTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the  First Name field on the Shipping page");
        siteGenesis.shippingPage.fillLastNameField(LASTNAME);
        extentTest.log(LogStatus.INFO, "Fill in the Last Name field on the Shipping page");
        siteGenesis.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        extentTest.log(LogStatus.INFO, "Fill in the address field #1");
        siteGenesis.shippingPage.fillAddressLine_2_Field("");
        extentTest.log(LogStatus.INFO, "Leave the address field #2 empty");
        siteGenesis.shippingPage.fillCityField(CITY);
        extentTest.log(LogStatus.INFO, "Fill in the city field");
        siteGenesis.shippingPage.fillZipField(ZIP);
        extentTest.log(LogStatus.INFO, "Fill in the zip field");
        siteGenesis.shippingPage.selectState(STATE);
        extentTest.log(LogStatus.INFO, "Select state from the drop down field");
        siteGenesis.shippingPage.fillPhoneField(PHONE);
        extentTest.log(LogStatus.INFO, "Fill in the phone field");
        siteGenesis.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        extentTest.log(LogStatus.INFO, "Check the This is also my billing address checkbox");
        siteGenesis.shippingPage.goToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Billing page");
        siteGenesis.billingPage.fillCardName(CARDNAME_MASTERCARD);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        siteGenesis.billingPage.selectCardType(CARD_TYPE_2);
        extentTest.log(LogStatus.INFO, "Select Card Type from the drop down field");
        siteGenesis.billingPage.fillCardNumberRegisteredUser(CARDNUMBER_MASTERCARD);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        siteGenesis.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        siteGenesis.billingPage.fillSecurityCodeRegisteredUser(MASTERCARD_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        siteGenesis.billingPage.goToReviewPage();
        extentTest.log(LogStatus.INFO, "Switching to the Review page");
        siteGenesis.reviewPage.goToOrderReceiptPage();
        extentTest.log(LogStatus.INFO, "Switching to the Order Receipt page");
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        extentTest.log(LogStatus.INFO, "The order has been created successfully");
        siteGenesis.header.goToHomePage();
        extentTest.log(LogStatus.INFO, "Switching to Home page");
        siteGenesis.header.deleteAllCookies();
    }
}
