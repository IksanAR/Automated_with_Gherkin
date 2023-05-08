package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.BaseClass;
import org.example.pages.LoginPage;

public class LoginStepsDev {

    @Before
    public void setup(){
        BaseClass.setDriver();
    }
    @Given("User open the web")
    public void userOpenTheWeb() {
        BaseClass.navigateToHome();
    }

//    @When("user input username")
//    public void userInputUsername() {
//        BaseClass.threadSleep();
//        LoginPage.inputUsername();
//    }

//    @And("user input password")
//    public void userInputPassword() {
//        LoginPage.inputPassword();
//    }

    @And("user click button login")
    public void userClickButtonLogin() {
        BaseClass.threadSleep();
        LoginPage.clickButtonLogin();
    }

    @Then("User redirect to page product list")
    public void userRedirectToPageProductList() {
        BaseClass.threadSleep();
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        LoginPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        LoginPage.inputPassword(password);
    }
}
