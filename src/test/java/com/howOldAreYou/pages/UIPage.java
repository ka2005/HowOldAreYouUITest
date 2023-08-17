package com.howOldAreYou.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static Constants.WebdriverConstants.WAIT_TIME_MEDIUM;

public class UIPage extends BasePage {

    @FindBy(xpath = "//input[@id='inputName']")
    WebElement nameInputField;

    @FindBy(xpath = "//input[@id='inputBirthday']")
    WebElement birthdayInputField;

    @FindBy(xpath = "//button[@id='submitButton']")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id='resultDiv']")
    WebElement result;

    @FindBy(xpath = "//span[@id='help_name']")
    WebElement nameFieldMessage;

    @FindBy(xpath = "//span[@id='help_birthday']")
    WebElement birthdayFieldMessage;

    public UIPage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public String title() {
        String browserTitle = driver.getTitle();
        return browserTitle;
    }

    public void enterName(String name) {
        webDriverWait(WAIT_TIME_MEDIUM).until(ExpectedConditions.visibilityOf(nameInputField));
        nameInputField.sendKeys(name);
    }

    public void enterBirthdayDate(String date) {
        webDriverWait(WAIT_TIME_MEDIUM).until(ExpectedConditions.visibilityOf(birthdayInputField));
        birthdayInputField.sendKeys(date);
    }

    public void clickButton() {
        webDriverWait(WAIT_TIME_MEDIUM).until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();
    }

    public String resultsText() {
        webDriverWait(WAIT_TIME_MEDIUM).until(ExpectedConditions.visibilityOf(result));
        return result.getText();
    }

    public String nameFieldErrorMessage() {
        webDriverWait(WAIT_TIME_MEDIUM).until(ExpectedConditions.visibilityOf(nameFieldMessage));
        return nameFieldMessage.getText();
    }

    public String birthdayFieldErrorMessage() {
        webDriverWait(WAIT_TIME_MEDIUM).until(ExpectedConditions.visibilityOf(birthdayFieldMessage));
        return birthdayFieldMessage.getText();
    }
}
