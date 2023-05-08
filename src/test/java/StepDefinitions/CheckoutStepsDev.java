package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.base.BaseClass;
import org.example.pages.CheckoutPage;
import org.testng.Assert;

public class CheckoutStepsDev {
    @And("user click button checkout")
    public void userClickButtonCheckout() {
        CheckoutPage.clickCheckout();
    }

    @And("user input firstname")
    public void userInputFirstname() {
        CheckoutPage.inputFirstName();
    }

    @And("user input lastname")
    public void userInputLastname() {
        CheckoutPage.inputLastName();
    }

    @And("user input zipcode")
    public void userInputZipcode() {
        CheckoutPage.inputZipCode();
    }

    @And("user click button continue")
    public void userClickButtonContinue() {
        CheckoutPage.clickBtnContinue();
    }

    @And("user click button finish")
    public void userClickButtonFinish() {
        CheckoutPage.clickBtnFinish();
    }

    @Then("user redirect to page checkout complete")
    public void userRedirectToPageCheckoutComplete() {
        Assert.assertEquals("Checkout: Complete!",CheckoutPage.getCompleteText());
    }

}
