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
        checkValidationForEmptyPasswordField();
        checkValidationForEmptyConfirmPasswordField();

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
                    + "is ConfirmEmailErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmEmail") + "\n"
                    + "ConfirmEmailErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmEmail"));
            Assert.fail("Confirm Email Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmEmailErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmEmail") + "\n"
                    + "ConfirmEmailErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmEmail"));

        }
    }

    public void checkValidationForEmptyPasswordField(){
        if(web.isElementPresent("ErrorMessageForEmptyPassword")
                && web.getElementText("ErrorMessageForEmptyPassword").equals("This field is required.")){
            log.info("Password Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is PasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyPassword") + "\n"
                    + "PasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyPassword"));
            Assert.fail("Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is PasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyPassword") + "\n"
                    + "PasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyPassword"));

        }
    }

    public void checkValidationForEmptyConfirmPasswordField(){
        if(web.isElementPresent("ErrorMessageForEmptyConfirmPassword")
                && web.getElementText("ErrorMessageForEmptyConfirmPassword").equals("This field is required.")){
            log.info("Confirm Password Error Message for empty field is displayed correctly under the field");
        } else {
            log.error("Confirm Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmPasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmPassword") + "\n"
                    + "ConfirmPasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmPassword"));
            Assert.fail("Confirm Password Error Message for empty field is displayed INCORRECTLY!" + "\n"
                    + "is ConfirmPasswordErrorMessage present - " + web.isElementPresent("ErrorMessageForEmptyConfirmPassword") + "\n"
                    + "ConfirmPasswordErrorMessage - " + web.getElementText("ErrorMessageForEmptyConfirmPassword"));

        }
    }


    public void fillEmailField(String email) {
        web.input("EmailField", email);
    }

    public void fillConfirmEmailField(String confirmEmail) {
        web.input("ConfirmEmailField", confirmEmail);
    }

    public void checkFormValidation_Re_registerTheSameUser() {
        if(web.isElementPresent("ErrorMessageForTakenUserName")
                && web.getElementText("ErrorMessageForTakenUserName").equals("Username already taken.")) {
            log.info("Username already taken message is displayed correctly");
        } else  {
            log.error("Username already taken message is displayed INCORRECTLY!" + "\n"
            + "is ErrorMessageForTakenUserName present - " + web.isElementPresent("ErrorMessageForTakenUserName") + "\n"
            + "ErrorMessageForTakenUserName - " + web.getElementText("ErrorMessageForTakenUserName"));
            Assert.fail("Username already taken message is displayed INCORRECTLY!" + "\n"
                    + "is ErrorMessageForTakenUserName present - " + web.isElementPresent("ErrorMessageForTakenUserName") + "\n"
                    + "ErrorMessageForTakenUserName - " + web.getElementText("ErrorMessageForTakenUserName"));
        }
    }

    public void checkFormValidation_with_DifferentEmail_in_Email__and_ConfirmEmail_Fields() {
        if(web.isElementPresent("ErrorMessageMismatchingEmails")
                && web.getElementText("ErrorMessageMismatchingEmails").equals("Please enter the same value again.")){
            log.info("Error Message for Mismatching emails is displayed correctly");
        } else {
            log.error("Error Message for Mismatching emails is displayed INCORRECTLY!" + "\n"
            + "is Error Message for Mismatching emails present - " + web.isElementPresent("ErrorMessageMismatchingEmails") + "\n"
            + "Error Message for Mismatching emails - " + web.getElementText("ErrorMessageMismatchingEmails"));
            Assert.fail("Error Message for Mismatching emails is displayed INCORRECTLY!" + "\n"
                    + "is Error Message for Mismatching emails present - " + web.isElementPresent("ErrorMessageMismatchingEmails") + "\n"
                    + "Error Message for Mismatching emails - " + web.getElementText("ErrorMessageMismatchingEmails"));
        }

    }
}
