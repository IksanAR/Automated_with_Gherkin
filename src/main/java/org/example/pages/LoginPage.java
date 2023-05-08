package org.example.pages;

import org.example.data.AccountData;

import static org.example.base.BaseClass.driver;
import static org.example.locator.LoginLocator.*;

public class LoginPage {
    public static void inputUsername(String username) {
        driver.findElement(INPUT_USERNAME).sendKeys(username);
    }

    public static void inputPassword(String password) {
        driver.findElement(INPUT_PASSWORD).sendKeys(password);
    }

    public static void clickButtonLogin() {
        driver.findElement(BTN_LOGIN).click();
    }
}
