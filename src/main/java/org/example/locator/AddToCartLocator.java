package org.example.locator;

import org.openqa.selenium.By;

public interface AddToCartLocator {
    By CHOOSE_PRODUCT = By.xpath("//div[@class='inventory_item_name'][text()='Sauce Labs Bolt T-Shirt']");

    By BTN_ADD_TO_CART = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt'][text()='Add to cart']");

    By BTN_ICON_CART = By.xpath("//a[@class='shopping_cart_link']");
}
