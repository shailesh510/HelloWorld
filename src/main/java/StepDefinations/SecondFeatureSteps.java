package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondFeatureSteps {
	int count;
	@Given("I have {int} Apples")
	public void i_have_Apples(int x) {
	    count = x;
	}

	@When("Sampu ate {int} Apples")
	public void sampu_ate_Apples(int y) {
		count = count-y;
	    	}


@Then("How many Apples remaining in my bag")
public void how_many_Apples_remaining_in_my_bag() {
System.out.println("There are "+count+" Apples remaining");

}
}
