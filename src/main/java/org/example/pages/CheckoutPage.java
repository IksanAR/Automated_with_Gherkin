package org.example.pages;

import org.example.data.CheckoutData;

import static org.example.base.BaseClass.driver;
import static org.example.locator.CheckoutLocator.*;

public class CheckoutPage {
    public static void clickCheckout() {
        driver.findElement(BTN_CHECKOUT).click();
    }

    public static void inputFirstName() {
        driver.findElement(INPUT_FIRSTNAME).sendKeys(CheckoutData.firstname);
    }

    public static void inputLastName() {
        driver.findElement(INPUT_LASTNAME).sendKeys(CheckoutData.lastname);
    }

    public static void inputZipCode() {
        driver.findElement(INPUT_ZIPCCODE).sendKeys(CheckoutData.zipcode);
    }

    public static void clickBtnContinue() {
        driver.findElement(BTN_CONTINUE).click();
    }

    public static void clickBtnFinish() {
        driver.findElement(BTN_FINISH).click();
    }

    public static String getCompleteText() {
     return driver.findElement(LABEL_COMPLETE_TEXT).getText();
    }
}
