package Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bat extends Base {
    @Given("user is on home page")
    public void user_is_on_home_page() {
       System.out.println("user is on home page");
    }

    @When("user enters valid login details")
    public void user_enters_valid_login_details() {
        System.out.println("user enters valid login details");
    }

    @Then("user login successful")
    public void user_login_successful() {
        System.out.println("user login successful");
    }

    @Then("User is able to see the home page")
    public void user_is_able_to_see_the_home_page() {
        System.out.println("User is able to see the home page");
    }

}
