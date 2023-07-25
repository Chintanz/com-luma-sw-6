package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OvernightDuffle extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    // By overNightDuffleText = By.xpath("//span[@class='base']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;
    //By qty = By.xpath("//input[@id='qty']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    // By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;
    //By addToCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    //By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public String getOverNightDuffelText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty) {
        sendTextToElement(qty, newQty);

    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddToCartText() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }


}
