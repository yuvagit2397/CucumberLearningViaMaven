package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionForVerifyEmpDetails {
	WebDriver driver;
	@Given("user is on directory page")
	public void user_is_on_directory_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userName = driver.findElement(By.id("txtUsername"));
	     WebElement passWord = driver.findElement(By.id("txtPassword"));
	     userName.sendKeys("Admin");
	     passWord.sendKeys("admin123");
	     driver.findElement(By.id("btnLogin")).click();
	     Thread.sleep(5000);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
	}

	@When("user enter the employee name {string}")
public void user_enter_the_employee_name(String name) {
		driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys(name);
		
	
	}

	@When("user choose jobtitle and location")
	public void user_choose_jobtitle_and_location() {
	driver.findElement(By.id("searchDirectory_job_title")).sendKeys("Sales Manager");
	driver.findElement(By.id("searchDirectory_location")).sendKeys("New York Sales Office");
	}

	@When("user click the search button")
	public void user_click_the_search_button() {
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		WebDriverWait Wait=new WebDriverWait(driver,10);
		Wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
		
	}

	@Then("employee details are verified")
	public void employee_details_are_verified() {
		String empName="Robert Craig";
		//b[text()='Robert Craig']
		WebElement element = driver.findElement(By.xpath("//b[text()='Robert Craig']"));
	   String text=element.getText();
	   Assert.assertEquals(empName, text);
	   System.out.println("emp details verified");
	
	}

	
}
