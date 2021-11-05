package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {

	
	@Given("navigate to url")
	public void navigate_to_url() {
System.out.println("ajay");
	}

	@When("click on site")
	public void click_on_site() {
System.out.println("kumar");
	}

	@Then("validate result")
	public void validate_result() {
System.out.println("matam");
	}

}
