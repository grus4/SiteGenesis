package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 16.01.2017.
 */
public class GuestCheckoutTests extends Fixture {

    //tests looks soo long and unreadable
    @Test
    public void guestCheckout_GroundShipping_VISA() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCLP();
        siteGenesis.categoryLandingPage.switchToStandardPDP();
        siteGenesis.standardPDP.addProductToCart();
        siteGenesis.header.switchToShoppingCart();
        siteGenesis.shoppingCartPage.switchToLoginCheckoutPage();
        siteGenesis.checkoutLoginPage.switchToGuestShippingPage();
        siteGenesis.shippingPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.shippingPage.fillLastNameField(LASTNAME);
        siteGenesis.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        siteGenesis.shippingPage.fillAddressLine_2_Field("");
        siteGenesis.shippingPage.fillCityField(CITY);
        siteGenesis.shippingPage.fillZipField(ZIP);
        siteGenesis.shippingPage.selectState(STATE);
        siteGenesis.shippingPage.fillPhoneField(PHONE);
        siteGenesis.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        siteGenesis.shippingPage.switchToBillingPage();
        siteGenesis.billingPage.fillEmailField(EMAIL);
        siteGenesis.billingPage.fillCardName(CARDNAME_VISA);
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_VISA);
        siteGenesis.billingPage.selectMonth(MONTH);
        siteGenesis.billingPage.selectYear(YEAR);
        siteGenesis.billingPage.fillSecurityCode(VISA_CVV);
        siteGenesis.billingPage.switchToReviewPage();
        siteGenesis.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        siteGenesis.header.switchToHomePage();
    }

    @Test
    public void guestCheckout_2DayExpress_MasterCard() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCLP();
        siteGenesis.categoryLandingPage.switchToStandardPDP();
        siteGenesis.standardPDP.addProductToCart();
        siteGenesis.header.switchToShoppingCart();
        siteGenesis.shoppingCartPage.switchToLoginCheckoutPage();
        siteGenesis.checkoutLoginPage.switchToGuestShippingPage();
        siteGenesis.shippingPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.shippingPage.fillLastNameField(LASTNAME);
        siteGenesis.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        siteGenesis.shippingPage.fillAddressLine_2_Field("");
        siteGenesis.shippingPage.fillCityField(CITY);
        siteGenesis.shippingPage.fillZipField(ZIP);
        siteGenesis.shippingPage.selectState(STATE);
        siteGenesis.shippingPage.fillPhoneField(PHONE);
        siteGenesis.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        siteGenesis.shippingPage.select2DayExpressShipping();
        siteGenesis.shippingPage.switchToBillingPage();
        siteGenesis.billingPage.fillEmailField(EMAIL);
        siteGenesis.billingPage.fillCardName(CARDNAME_MASTERCARD);
        siteGenesis.billingPage.selectCardType(CARD_TYPE_2);
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_MASTERCARD);
        siteGenesis.billingPage.selectMonth(MONTH);
        siteGenesis.billingPage.selectYear(YEAR);
        siteGenesis.billingPage.fillSecurityCode(MASTERCARD_CVV);
        siteGenesis.billingPage.switchToReviewPage();
        siteGenesis.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        siteGenesis.header.switchToHomePage();
    }

    @Test
    public void guestCheckout_Overnight_AmericanExpress() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCLP();
        siteGenesis.categoryLandingPage.switchToStandardPDP();
        siteGenesis.standardPDP.addProductToCart();
        siteGenesis.header.switchToShoppingCart();
        siteGenesis.shoppingCartPage.switchToLoginCheckoutPage();
        siteGenesis.checkoutLoginPage.switchToGuestShippingPage();
        siteGenesis.shippingPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.shippingPage.fillLastNameField(LASTNAME);
        siteGenesis.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        siteGenesis.shippingPage.fillAddressLine_2_Field("");
        siteGenesis.shippingPage.fillCityField(CITY);
        siteGenesis.shippingPage.fillZipField(ZIP);
        siteGenesis.shippingPage.selectState(STATE);
        siteGenesis.shippingPage.fillPhoneField(PHONE);
        siteGenesis.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        siteGenesis.shippingPage.selectOvernightShipping();
        siteGenesis.shippingPage.switchToBillingPage();
        siteGenesis.billingPage.fillEmailField(EMAIL);
        siteGenesis.billingPage.fillCardName(CARDNAME_AMEX);
        siteGenesis.billingPage.selectCardType(CARD_TYPE_3);
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_AMEX);
        siteGenesis.billingPage.selectMonth(MONTH);
        siteGenesis.billingPage.selectYear(YEAR);
        siteGenesis.billingPage.fillSecurityCode(AMEX_CVV);
        siteGenesis.billingPage.switchToReviewPage();
        siteGenesis.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
         siteGenesis.header.switchToHomePage();
    }

    @Test
    public void guestCheckout_2DayExpress_Discover() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCLP();
        siteGenesis.categoryLandingPage.switchToStandardPDP();
        siteGenesis.standardPDP.addProductToCart();
        siteGenesis.header.switchToShoppingCart();
        siteGenesis.shoppingCartPage.switchToLoginCheckoutPage();
        siteGenesis.checkoutLoginPage.switchToGuestShippingPage();
        siteGenesis.shippingPage.fillFirstNameField(FIRSTNAME);
        siteGenesis.shippingPage.fillLastNameField(LASTNAME);
        siteGenesis.shippingPage.fillAddressLine_1_Field(ADDRESS_1);
        siteGenesis.shippingPage.fillAddressLine_2_Field("");
        siteGenesis.shippingPage.fillCityField(CITY);
        siteGenesis.shippingPage.fillZipField(ZIP);
        siteGenesis.shippingPage.selectState(STATE);
        siteGenesis.shippingPage.fillPhoneField(PHONE);
        siteGenesis.shippingPage.selectUseTheSameAddressForBillingCheckbox();
        siteGenesis.shippingPage.select2DayExpressShipping();
        siteGenesis.shippingPage.switchToBillingPage();
        siteGenesis.billingPage.fillEmailField(EMAIL);
        siteGenesis.billingPage.fillCardName(CARDNAME_DISCOVER);
        siteGenesis.billingPage.selectCardType(CARD_TYPE_4);
        siteGenesis.billingPage.fillCardNumber(CARDNUMBER_DISCOVER);
        siteGenesis.billingPage.selectMonth(MONTH);
        siteGenesis.billingPage.selectYear(YEAR);
        siteGenesis.billingPage.fillSecurityCode(DISCOVER_CVV);
        siteGenesis.billingPage.switchToReviewPage();
        siteGenesis.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        siteGenesis.header.switchToHomePage();
    }
}
