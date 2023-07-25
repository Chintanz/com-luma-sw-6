package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@class='product-item-link']")
    WebElement cronusYoga;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'][1]")
    WebElement size32;

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement blackColour;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Cronus ')]")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    public void mouseHoverOnCronusYogaPant() {
        mouseHoverToElement(cronusYoga);
    }

    public void clickOnSize() {
        clickOnElement(size32);
    }

    public void clickOnColor() {
        clickOnElement(blackColour);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getTextAfterAddToCart() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }
}
