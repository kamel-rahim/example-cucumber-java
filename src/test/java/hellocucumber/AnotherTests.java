package hellocucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnotherTests {
    @Given("Hello")
    public void hello() {
        // Write code here that turns the phrase above into concrete actions
       assert(true);
    }
    @When("World")
    public void world() {
        // Write code here that turns the phrase above into concrete actions
        assert(true);
    }
    @Then("cucumber")
    public void cucumber() {
        // Write code here that turns the phrase above into concrete actions
        assert(true);
    }


}
