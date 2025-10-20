package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Navigated to login page");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Entered valid credentials");
    }

    @Then("User should be navigated to the home page")
    public void user_should_be_navigated_to_the_home_page() {
        System.out.println("Successfully logged in");
    }
}
