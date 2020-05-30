package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps extends Base {
    @Given("user connects to rest api")
    public void user_connects_to_rest_api() {
      System.out.println("user connects to rest api");
    }

    @When("user requests for resources with correct resource path")
    public void user_requests_for_resources_with_correct_resource_path() {
        System.out.println("user requests for resources with correct resource path");
    }

    @Then("user receives response with response code {int}")
    public void user_receives_response_with_response_code(Integer int1) {
        System.out.println("user receives response with response code {int}");
    }

    @Then("User is able to see the resources requested.")
    public void user_is_able_to_see_the_resources_requested() {
        System.out.println("User is able to see the resources requested.");
    }
}
