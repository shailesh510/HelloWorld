package StepDefinations;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {
int x,y,r;
@Given("Take two numbers from user")
public void take_two_numbers_from_user() {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter two numbers");
	x=sc.nextInt();
	y=sc.nextInt();
}

@When("we add those nymbers")
public void we_add_those_nymbers() {
    r=x+y;
}

@Then("addition result should be display")
public void addition_result_should_be_display() {
  System.out.println("Result :" +r);
}

}
