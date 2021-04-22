package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class EvenOddSteps {
	int x, y, result;

	@Given("user has {int} and {int}")
	public void user_has_and(Integer int1, Integer int2) {
		this.x = x;
		this.y = y;
	}

	@When("user adds both numbers")
	public void user_adds_both_numbers() {
		result = x + y;

	}

	@Then("verify addition result")
	public void addition_result_must_be_even() {
		
		int rem = result % 2;
		Assert.assertTrue("even no", rem == 0);
	}

}
