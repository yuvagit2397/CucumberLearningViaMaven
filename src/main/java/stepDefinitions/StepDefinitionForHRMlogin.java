package stepDefinitions;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import features.HRMHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForHRMlogin{
	WebDriver driver;
	
	/*Robert Craig
	*/

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		PageFactory.initElements(driver, HRMHooks.class);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
     WebElement userName = driver.findElement(By.id("txtUsername"));
     WebElement passWord = driver.findElement(By.id("txtPassword"));
     userName.sendKeys("Admin");
     passWord.sendKeys("admin123");
	}

	/*@And("^user clicks login button$")
	public void user_clicks_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}*/

	@Then("^user navigated to admin page$")
	public void user_navigated_to_admin_page() {
		String name="Welcome Admin";
		
        WebElement admin=driver.findElement(By.id("welcome"));
        String text=admin.getText();
       // System.out.println(text);
        //System.out.println(name);
        
        Assert.assertEquals(name, text);
        System.out.println("Assertion verfied");
        System.out.println("User is on Admin Page");
        
	}

}
