package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 18.01.2017.
 */
public class ShippingPage extends Page{
    public ShippingPage(WebDriverWrapper dr) {
        super(dr);
    }

    public void fillFirstNameField(String firstName) {
        web.input("FirstNameField", firstName);

    }


    public void fillLastNameField(String lastName) {
        web.input("LastNameField", lastName);

    }

    public void fillAddressLine_1_Field(String address) {
        web.input("Address_1_Field", address);

    }

    public void fillAddressLine_2_Field(String address) {
        web.input("Address_2_Field", address);

    }

    public void fillCityField(String city) {
        web.input("CityField", city);

    }

    public void selectState(String state) {
        web.selectFromListByVisibleText("StateDropDown", state);

    }


    public void fillZipField(String zip) {
        web.input("ZipCodeField", zip);

    }

    public void fillPhoneField(String phone) {
        web.input("PhoneNumberField", phone);
    }

    public void selectUseTheSameAddressForBillingCheckbox() {
        web.selectCheckbox("UseTheSameAddressForBillingCheckbox", "Y");
    }

    public void switchToBillingPage() {
        web.waitForElementToBeClickable("ContinueToBillingButton");
        web.clickButton("ContinueToBillingButton");
        web.waitForElementPresent("CardNameField");
        web.waitForElementToBeClickable("CardNameField");

        if(web.isElementPresent("CardNameField")
                && web.isElementAvailable("CardNameField")) {
            log.info("Switching to Billing page was correct");
        } else {
            log.error("Switching to Billing page was INCORRECT!\n");
            Assert.fail("Switching to Billing page was INCORRECT!");
        }
    }

    public void select2DayExpressShipping() {
        web.clickElement("2DayExpressShipping");
    }

    public void selectOvernightShipping() {
        web.clickElement("OvernightShipping");
    }
}
