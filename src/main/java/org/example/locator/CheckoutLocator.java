package org.example.locator;

import org.openqa.selenium.By;

public interface CheckoutLocator {
    By BTN_CHECKOUT = By.xpath("//button[@id='checkout']");

    By INPUT_FIRSTNAME = By.xpath("//input[@id='first-name']");

    By INPUT_LASTNAME = By.xpath("//input[@id='last-name']");

    By INPUT_ZIPCCODE = By.xpath("//input[@id='postal-code']");

    By BTN_CONTINUE = By.xpath("//input[@id='continue']");

    By BTN_FINISH = By.xpath("//button[@id='finish']");

    By LABEL_COMPLETE_TEXT = By.xpath("//span[@class='title']");
}
