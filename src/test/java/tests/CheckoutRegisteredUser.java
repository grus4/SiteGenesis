package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Rus on 18.01.2017.
 */
public class CheckoutRegisteredUser extends Fixture {

    @Test
    public void checkoutAsRegisteredUser_Overnight_Visa() {
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
}
