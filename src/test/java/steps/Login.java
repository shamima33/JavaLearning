package steps;
import io.cucumber.java.en.*;
public class Login {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
     System.out.println("I am on the login page");
    }
    @When("I enter a valid Username")
    public void i_enter_a_valid_username() {
        System.out.println("I enter a valid Username");


    }
    @When("I enter a valid Password")
    public void i_enter_a_valid_password() {

        System.out.println("I enter a valid Username");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }
    @Then("I should revert to the login dashboard page")
    public void i_should_revert_to_the_login_dashboard_page() {
        System.out.println("I should revert to the login dashboard page");
    }
}
