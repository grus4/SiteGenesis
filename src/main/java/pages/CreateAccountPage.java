package pages;

import org.testng.Assert;
import utils.WebDriverWrapper;

/**
 * Created by Rus on 27.11.2016.
 */
public class CreateAccountPage extends Page{
    public CreateAccountPage(WebDriverWrapper dr) {
        super(dr);
    }



    public void fillFirstNameField(String firstName) {
        web.input("FirstName", firstName);
    }

    public void fillLastNameField(String lastName) {
        web.input("LastName", lastName);
    }

    public void fillEmailAndConfirmEmailFields(String email) {
        String newEmail = web.generateRandomEmail(email);
        web.input("EmailField", newEmail);
        web.input("ConfirmEmailField", newEmail);
    }

    public void fillPasswordField(String password) {
        web.input("Password", password);
    }

    public void fillConfirmPasswordField(String password) {
        web.input("ConfirmPassword", password);
    }

    public void clickApplyButton() {
        web.clickButton("ApplyButton");
    }

    public void checkValidationForAllEmptyFields() {
        checkValidationForEmptyFirstNameField();
        checkValidationForEmptyLastNameField();
        checkValidationForEmptyEmailField();
        checkValidationForEmptyConfirmEmailField();

    }

    public void checkValidationForEmptyFirstNameField(){
        if(web.isElementPresent("ErrorMessageForEmptyFirstNameField")
                && web.getElementText("ErrorMessageForEmptyFirstNameField").equals("This field is required.")){
            log.info("First Name Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("First Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is FirstNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyFirstNameField") + "\n"
                    + "FirstNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyFirstNameField"));
            Assert.fail("First Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is FirstNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyFirstNameField") + "\n"
                    + "FirstNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyFirstNameField"));

        }
    }

    public void checkValidationForEmptyLastNameField(){
        if(web.isElementPresent("ErrorMessageForEmptyLastNameField")
                && web.getElementText("ErrorMessageForEmptyLastNameField").equals("This field is required.")){
            log.info("Last Name Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Last Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is LastNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyLastNameField") + "\n"
                    + "LastNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyLastNameField"));
            Assert.fail("Last Name Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is LastNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyLastNameField") + "\n"
                    + "LastNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyLastNameField"));

        }
    }

    public void checkValidationForEmptyEmailField(){
        if(web.isElementPresent("ErrorMessageForEmptyEmail")
                && web.getElementText("ErrorMessageForEmptyEmail").equals("This field is required.")){
            log.info("Email Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is EmailNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyEmail") + "\n"
                    + "EmailNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyEmail"));
            Assert.fail("Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is EmailNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyEmail") + "\n"
                    + "EmailNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyEmail"));

        }
    }

    public void checkValidationForEmptyConfirmEmailField(){
        if(web.isElementPresent("ErrorMessageForEmptyConfirmEmail")
                && web.getElementText("ErrorMessageForEmptyConfirmEmail").equals("This field is required.")){
            log.info("Confirm Email Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Confirm Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmEmailNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmEmail") + "\n"
                    + "ConfirmEmailNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmEmail"));
            Assert.fail("Confirm Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmEmailNameErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmEmail") + "\n"
                    + "ConfirmEmailNameErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmEmail"));

        }
    }





}
