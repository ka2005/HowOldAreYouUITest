package com.howOldAreYou.stepDefinition;

import com.howOldAreYou.pages.UIPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UIPageStep {
    UIPage uiPage = new UIPage(Hooks.driver);

    @Given("User navigate to URL {string}")
    public void user_navigate_to_url(String string) {
        uiPage.openURL("https://howoldru.m-messiah.cc");
        System.out.println("print title is :" +  uiPage.title());
    }

    @When("User enter name in {string}")
    public void user_enter_name_in(String name) {
        uiPage.enterName(name);
    }

    @When("User enter dob in {string}")
    public void user_enter_dob_in(String date) {
        uiPage.enterBirthdayDate(date);
    }

    @When("User clicks submit button")
    public void user_clicks_submit_button() {
        uiPage.clickButton();
    }

    @Then("User see a successful message {string}")
    public void user_see_a_successful_message(String message) {
        String Text =  uiPage.resultsText();
        Assert.assertEquals(Text ,message);
    }

    @Then("User see a {string} under name field")
    public void user_see_a_under_name_field(String nameMessage) {
       String nameErrorMessageText  =   uiPage.nameFieldErrorMessage();
       Assert.assertEquals(nameErrorMessageText , nameMessage);
    }

    @Then("User see a {string} under birthday field")
    public void user_see_a_under_birthday_field(String birthdayMessage) {
        String  BirthdayErrorMessageText  =  uiPage.birthdayFieldErrorMessage();
        Assert.assertEquals(BirthdayErrorMessageText , birthdayMessage);
    }
}
