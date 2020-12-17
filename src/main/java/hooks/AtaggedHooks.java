package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AtaggedHooks {
	@Before
	public void start() {
		System.out.println("buyer have some amount of money");
	}
	
	@Before("@laptop")
	public void laptop() {
		System.out.println("decided to buy a Latop");
	}
	
	@Before("@phone")
	public void phone() {
		System.out.println("decided to buy a smartphone");
	}

	@Before("@outfit")
	public void dress() {
		System.out.println("decided to buy a outfit");
	}

	@After
	public void end() {
		System.out.println("return to the home");
	}
	
	@After("@laptop")
	public void lap() {
		System.out.println("get the laptop bag also");
	}
	
	@After("@phone")
	public void pho() {
		System.out.println("get the iphone backcase also");
	}
	

}
