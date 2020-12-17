package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.a.as;

public class DataTableWithoutHeader {
	WebDriver driver;
	@Given("user is on orangehrm login page")
	public void user_is_on_orangehrm_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters orangehrm username and password")
	public void user_enters_orangehrm_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	String userName=dataTable.cell(0, 0);
	String passWord=dataTable.cell(0, 1);
	
	
		
		/*List<Object> asList = dataTable.asList(String.class);
		String userName = (String) asList.get(0);
		String passWord=(String) asList.get(1);
		*/
		
		WebElement uname = driver.findElement(By.id("txtUsername"));
	     WebElement pWord = driver.findElement(By.id("txtPassword"));
	     uname.sendKeys(userName);
	     pWord.sendKeys(passWord);
	}

	@And("user clicks orangehrm login button")
	public void user_clicks_orangehrm_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	
}
