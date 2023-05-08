package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.base.BaseClass;
import org.example.pages.AddToCartPage;

public class AddToCartStepsDev {
    @And("user choose product")
    public void userChooseProduct() {
        AddToCartPage.chooseProduct();
    }

    @And("user click button add to cart")
    public void userClickButtonAddToCart() {
        AddToCartPage.clickAddToCart();
    }

    @And("user click icon cart")
    public void userClickIconCart() {
        AddToCartPage.clickIconCart();
    }

    @Then("user redirect to page cart with list product")
    public void userRedirectToPageCartWithListProduct() {
        BaseClass.threadSleep();
    }
}
