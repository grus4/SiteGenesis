package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

/**
 * Created by Rus on 18.01.2017.
 */
public class CheckoutRegisteredUser extends Fixture {

    @Test
    public void checkoutAsRegisteredUser_OvernightShipping_Visa() {
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCLP();
        siteGenesis.categoryLandingPage.switchToVariationPDP();
        siteGenesis.variationPDP.addVariationProductToCart();
        siteGenesis.header.switchToShoppingCart();
        siteGenesis.shoppingCartPage.switchToLoginCheckoutPage();
        siteGenesis.checkoutLoginPage.fillEmailField(EMAILFORREGISTEREDUSER);
        siteGenesis.checkoutLoginPage.fillPasswordField(PASSWORDFORREGISTEREDUSER);
        siteGenesis.checkoutLoginPage.logInAsRegisteredUser();
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
        siteGenesis.billingPage.fillCardName(CARDNAME_VISA);
        siteGenesis.billingPage.fillCardNumberRegisteredUser(CARDNUMBER_VISA);
        siteGenesis.billingPage.selectMonth(MONTH);
        siteGenesis.billingPage.selectYear(YEAR);
        siteGenesis.billingPage.fillSecurityCodeRegisteredUser(VISA_CVV);
        siteGenesis.billingPage.switchToReviewPage();
        siteGenesis.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        siteGenesis.header.switchToHomePage();
    }

    @Test
    public void checkoutAsRegisteredUser_GroundShipping_MasterCard(){
        siteGenesis.homePage.openPage(SITE_URL);
        siteGenesis.header.switchToCLP();
        siteGenesis.categoryLandingPage.switchToVariationPDP();
        siteGenesis.variationPDP.addVariationProductToCart();
        siteGenesis.header.switchToShoppingCart();
        siteGenesis.shoppingCartPage.switchToLoginCheckoutPage();
        siteGenesis.checkoutLoginPage.fillEmailField(EMAILFORREGISTEREDUSER);
        siteGenesis.checkoutLoginPage.fillPasswordField(PASSWORDFORREGISTEREDUSER);
        siteGenesis.checkoutLoginPage.logInAsRegisteredUser();
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
        siteGenesis.billingPage.fillCardName(CARDNAME_MASTERCARD);
        siteGenesis.billingPage.selectCardType(CARD_TYPE_2);
        siteGenesis.billingPage.fillCardNumberRegisteredUser(CARDNUMBER_MASTERCARD);
        siteGenesis.billingPage.selectMonth(MONTH);
        siteGenesis.billingPage.selectYear(YEAR);
        siteGenesis.billingPage.fillSecurityCodeRegisteredUser(MASTERCARD_CVV);
        siteGenesis.billingPage.switchToReviewPage();
        siteGenesis.reviewPage.switchToOrderReceiptPage();
        Assert.assertTrue(siteGenesis.orderReceiptPage.isThankYouMessageAvailable(), "Thank you message is not displayed");
        siteGenesis.header.switchToHomePage();
    }
}
