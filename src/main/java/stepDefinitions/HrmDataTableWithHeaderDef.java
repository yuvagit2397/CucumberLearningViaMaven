package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HrmDataTableWithHeaderDef {
	WebDriver driver;
	@Given("you are on orangehrm login page")
	public void you_are_on_orangehrm_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("you enters orangehrm username and password")
	public void you_enters_orangehrm_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>>mapData=dataTable.asMaps(String.class, String.class);
		
		String userName = mapData.get(0).get("username");
		String passWord=mapData.get(0).get("password");
		WebElement uname = driver.findElement(By.id("txtUsername"));
	     WebElement pWord = driver.findElement(By.id("txtPassword"));
	     uname.sendKeys(userName);
	     pWord.sendKeys(passWord);
		
	}
	@When("you clicks orangehrm login button")
	public void you_clicks_orangehrm_login_button() {
		driver.findElement(By.id("btnLogin")).click();

	}
	
}
