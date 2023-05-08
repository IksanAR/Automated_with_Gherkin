package org.example.pages;

import static org.example.base.BaseClass.driver;
import static org.example.locator.AddToCartLocator.*;

public class AddToCartPage {
    public static void chooseProduct() {
        driver.findElement(CHOOSE_PRODUCT).click();
    }

    public static void clickAddToCart() {
        driver.findElement(BTN_ADD_TO_CART).click();
    }

    public static void clickIconCart() {
        driver.findElement(BTN_ICON_CART).click();
    }
}
