package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("click on the ‘Create an Account’ link")
    public void clickOnTheCreateAnAccountLink() {
        new HomePage().accountCreate();
    }


    @When("Verify the text ‘Create New Customer Account’")
    public void verifyTheTextCreateNewCustomerAccount() {

    }

    @When("user Should Register Account Successfully")
    public void userShouldRegisterAccountSuccessfully() {
    }

    @When("Enter First name")
    public void enterFirstName() {
        new HomePage().enterFirstName();
    }

    @When("Enter Last name")
    public void enterLastName() {
        new HomePage().enterLastName();
    }

    @When("Click on checkbox Sign Up for Newsletter")
    public void clickOnCheckboxSignUpForNewsletter() {

    }

    @When("Enter Email")
    public void enterEmail() {
        new HomePage().enterEmail();
    }

    @When("Enter Password")
    public void enterPassword() {
        new HomePage().enterPasswordField();
    }

    @When("Enter Confirm Password")
    public void enterConfirmPassword() {
        new HomePage().confirmPassword();
    }

    @And("Click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        new HomePage().clickOnCreateAccount();
    }

    @And("Verify the text 'Thank you for")
    public void verifyTheTextThankYouFor() {
    }

    @And("registering with Main Website Store.’")
    public void registeringWithMainWebsiteStore() {
    }

    @And("Click on down aero neare Welcome")
    public void clickOnDownAeroNeareWelcome() {
    }

    @And("Click on Sign Out link")
    public void clickOnSignOutLink() {
        new HomePage().clickOnSignOut();
    }

    @Then("Verify the text ‘You are signed out")
    public void verifyTheTextYouAreSignedOut() {
    }
}
