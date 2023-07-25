package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    By tops1 = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement createAccount;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Create New Customer Account')]")
    WebElement newCustomerAccount;

    @CacheLookup
    @FindBy(id = "firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "email_address")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(id = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "password-confirmation")
    WebElement enterConfirmPassword;


    @CacheLookup
    @FindBy(xpath = "//span[@xpath='1']")
    WebElement createAnAccountBtn;
    @CacheLookup
    @FindBy(xpath = "//button[@xpath='1']")
    WebElement clickArrow;
    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]")
    WebElement clickOnSignOut;




    public void mouseHoverOnWomenMenu() {
                mouseHoverToElement(womenMenu);

    }
    public void mouseHoverOnTops() {
        waitUntilVisibilityOfElementLocated(tops1, 20);
                mouseHoverToElement(tops);
    }
    public void clickOnJackets() {
                clickOnElement(jackets);
    }
    public void mouseHoverOnMenMenu() {
                mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottom() {
                mouseHoverToElement(bottomMenu);
    }
    public void clickOnPant() {
               clickOnElement(pants);
    }
    public void mouseHoverOnGearMenu() {
               mouseHoverToElement(gearMenu);
    }
    public void clickOnBags() {
               clickOnElement(bags);
    }
    public void accountCreate() {
        clickOnElement(createAccount);
    }
    public void newCustomer() {
        clickOnElement(newCustomerAccount);
    }
    public void enterFirstName() {
        sendTextToElement(firstName,"smith");
    }
    public void enterLastName() {
        sendTextToElement(lastName,"john");
    }
    public void enterEmail() {
        sendTextToElement(emailAddress,"asdf@homail.com");
    }
    public void enterPasswordField() {
        sendTextToElement(enterPassword,"Chintz11");
    }
    public void confirmPassword() {
        sendTextToElement(enterConfirmPassword,"Chintz11");
    }
    public void clickOnCreateAccount() {
        clickOnElement(createAnAccountBtn);
    }
    public void clickOnArrow() {
        clickOnElement(clickArrow);
    }
    public void clickOnSignOut() {
        clickOnElement(clickOnSignOut);
    }
























}
