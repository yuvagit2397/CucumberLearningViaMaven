package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

//import hooks.Guru99;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Guru99_Pom;
import properties.FileReader;
import runner.TestRunner;

public class Guru99StepDef {
	public static WebDriver driver=TestRunner.driver;
	Guru99_Pom pm=new Guru99_Pom(driver);
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws IOException {
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		String url = FileReader.getInst().getUrl();
		driver.get(url);
	}

	@When("clicking submit button")
	public void clicking_submit_button() {
		pm.submit.click();
	}

	@Then("error msg shown")
	public void error_msg_shown() {
		String msg = pm.errormsg.getText();
		System.out.println(msg);
	}
	

	/*@Given("user opens the homepage")
	public void user_opens_the_homepage() {
		driver.get("http://demo.guru99.com/");
		
	}
*/
	@When("user enters email id")
	public void user_enters_email_id() {
		pm.email.sendKeys("yuvasri@gmail.com");
	}

	/*@And("click the submit button")
	public void click_the_submit_button() {
		pm.submit.click();
	}*/

	@Then("user got the access details")
	public void user_got_the_access_details() {
		String userid = pm.userdetail1.get(0).getText();
		String idValue = pm.userdetail1.get(1).getText();
		System.out.println(userid+" "+idValue);
		
		String pass = pm.userdetail2.get(0).getText();
		String passValue = pm.userdetail2.get(1).getText();
		System.out.println(pass+" "+passValue);
	}




}
