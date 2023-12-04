package steps;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
System.out.println("I am on the registration page");
        String url="https://abc9262.sg-host.com/";
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace 4\\JavaLearning\\chromedriver.exe");
//Instantiate a ChromeDriver class.driver = new ChromeDriver();
        WebDriver driver =new ChromeDriver(  );
        driver.get(("https://abc9262.sg-host.com/"));
        System.out.println( "open chromedriver successfully" );

    }
    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String string) {

        System.out.println("I enter a valid Username");
    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String string) {

        System.out.println("I enter a valid Email address");
    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String string) {

        System.out.println("I enter a valid Password");
    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        System.out.println("I submit the registration form");
    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {

        System.out.println("I should be automatically redirected to the customer login page");
    }


}
