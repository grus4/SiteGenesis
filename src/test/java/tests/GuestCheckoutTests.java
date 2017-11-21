package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 16.01.2017.
 */
public class GuestCheckoutTests extends Fixture {

    @Test
    public void guestCheckout_GroundShipping_VISA() {
        extentTest = extentReports
                .startTest("guestCheckout_GroundShipping_VISA")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.goToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        siteGenesis.categoryLandingPage.goToStandardPDP();
        extentTest.log(LogStatus.INFO, "Switch to Standard PDP");
        siteGenesis.standardPDP.addProductToCart();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        siteGenesis.header.goToShoppingCartPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        siteGenesis.shoppingCartPage.goToLoginCheckoutPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Checkout page");
        siteGenesis.checkoutLoginPage.goToGuestShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Shipping page");
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
        siteGenesis.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        siteGenesis.billingPage.fillCardName(CARDNAME_VISA);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_VISA);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        siteGenesis.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        siteGenesis.billingPage.fillSecurityCode(VISA_CVV);
        extentTest.log(LogStatus.INFO, "Fill in the CVV field with correct data");
        siteGenesis.billingPage.goToReviewPage();
        extentTest.log(LogStatus.INFO, "Switching to the Review page");
        siteGenesis.reviewPage.goToOrderReceiptPage();
        extentTest.log(LogStatus.INFO, "Switching to the Order Receipt page");
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        extentTest.log(LogStatus.INFO, "The order has been created successfully");
        siteGenesis.header.goToHomePage();
        extentTest.log(LogStatus.INFO, "Switching to Home page");

    }

    @Test
    public void guestCheckout_2DayExpress_MasterCard() {
        extentTest = extentReports
                .startTest("guestCheckout_2DayExpress_MasterCard")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.goToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        siteGenesis.categoryLandingPage.goToStandardPDP();
        extentTest.log(LogStatus.INFO, "Switch to Standard PDP");
        siteGenesis.standardPDP.addProductToCart();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        siteGenesis.header.goToShoppingCartPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        siteGenesis.shoppingCartPage.goToLoginCheckoutPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Checkout page");
        siteGenesis.checkoutLoginPage.goToGuestShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Shipping page");
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
        siteGenesis.shippingPage.select2DayExpressShipping();
        extentTest.log(LogStatus.INFO, "Select 2 Day Express Shipping");
        siteGenesis.shippingPage.goToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Billing page");
        siteGenesis.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        siteGenesis.billingPage.fillCardName(CARDNAME_MASTERCARD);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectCardType(CARD_TYPE_2);
        extentTest.log(LogStatus.INFO, "Select Card Type from the drop down field");
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_MASTERCARD);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        siteGenesis.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        siteGenesis.billingPage.fillSecurityCode(MASTERCARD_CVV);
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
    public void guestCheckout_Overnight_AmericanExpress() {
        extentTest = extentReports
                .startTest("guestCheckout_Overnight_AmericanExpress")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.goToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        siteGenesis.categoryLandingPage.goToStandardPDP();
        extentTest.log(LogStatus.INFO, "Switch to Standard PDP");
        siteGenesis.standardPDP.addProductToCart();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        siteGenesis.header.goToShoppingCartPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        siteGenesis.shoppingCartPage.goToLoginCheckoutPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Checkout page");
        siteGenesis.checkoutLoginPage.goToGuestShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Shipping page");
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
        siteGenesis.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        siteGenesis.billingPage.fillCardName(CARDNAME_AMEX);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        siteGenesis.billingPage.selectCardType(CARD_TYPE_3);
        extentTest.log(LogStatus.INFO, "Select Card Type from the drop down field");
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_AMEX);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        siteGenesis.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        siteGenesis.billingPage.fillSecurityCode(AMEX_CVV);
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
    public void guestCheckout_2DayExpress_Discover() {
        extentTest = extentReports
                .startTest("guestCheckout_2DayExpress_Discover")
                .assignCategory("Smoke Testing");
        siteGenesis.homePage.openPage(SITE_URL);
        extentTest.log(LogStatus.INFO, "Open SiteGenesis Home Page");
        siteGenesis.header.goToCLP();
        extentTest.log(LogStatus.INFO, "Switch to CLP");
        siteGenesis.categoryLandingPage.goToStandardPDP();
        extentTest.log(LogStatus.INFO, "Switch to Standard PDP");
        siteGenesis.standardPDP.addProductToCart();
        extentTest.log(LogStatus.INFO, "Add product to the mini cart");
        siteGenesis.header.goToShoppingCartPage();
        extentTest.log(LogStatus.INFO, "Switching to the Shopping cart");
        siteGenesis.shoppingCartPage.goToLoginCheckoutPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Checkout page");
        siteGenesis.checkoutLoginPage.goToGuestShippingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Guest Shipping page");
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
        siteGenesis.shippingPage.select2DayExpressShipping();
        extentTest.log(LogStatus.INFO, "Select 2 Day Express Shipping");
        siteGenesis.shippingPage.goToBillingPage();
        extentTest.log(LogStatus.INFO, "Switching to the Billing page");
        siteGenesis.billingPage.fillEmailField(EMAIL);
        extentTest.log(LogStatus.INFO, "Fill in the email field on Billing page");
        siteGenesis.billingPage.fillCardName(CARDNAME_DISCOVER);
        extentTest.log(LogStatus.INFO, "Fill in the Card Name field");
        siteGenesis.billingPage.selectCardType(CARD_TYPE_4);
        extentTest.log(LogStatus.INFO, "Select Card Type from the drop down field");
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_DISCOVER);
        extentTest.log(LogStatus.INFO, "Fill in the Card Number field");
        siteGenesis.billingPage.selectMonth(MONTH);
        extentTest.log(LogStatus.INFO, "Select month from the drop down field");
        siteGenesis.billingPage.selectYear(YEAR);
        extentTest.log(LogStatus.INFO, "Select year from the drop down field");
        siteGenesis.billingPage.fillSecurityCode(DISCOVER_CVV);
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
