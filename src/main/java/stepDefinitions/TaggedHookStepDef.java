package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookStepDef {
	@Given("buyer is in electronic shop")
	public void buyer_is_in_electronic_shop() {
	    System.out.println("buyer goes to the electronic shop");
	}

	@When("chooses acer brand")
	public void chooses_acer_brand() {
	    System.out.println("choosing acer laptop to buy");
	}

	@Then("pay the bill")
	public void pay_the_bill() {
	    System.out.println("pay the bill to shopkeeper");
	}

	@Given("buyer goes to mobileshop")
	public void buyer_goes_to_mobileshop() {
		 System.out.println("buyer goes to the mobile shop");
	}

	@When("chooses the iphone")
	public void chooses_the_iphone() {
		System.out.println("choosing acer iphone to buy");
	}

	@Given("buyer goes to the txtile")
	public void buyer_goes_to_the_txtile() {
		 System.out.println("buyer goes to the textile");

	}

	@When("selecting dresses")
	public void selecting_dresses() {
		System.out.println("chooses dhoti for him");
	}
	
	@Given("background test")
	public void background() {
		System.out.println("this is the background step");
	}


}
