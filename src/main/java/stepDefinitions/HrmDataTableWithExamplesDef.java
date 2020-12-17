package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HrmDataTableWithExamplesDef {
	WebDriver driver;
	@Given(":you are on  login page")
	public void you_are_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	

	@When(":you enters {string} and {string}")
	public void you_enters_and(String userName, String passWord) {
		WebElement uname = driver.findElement(By.id("txtUsername"));
	     WebElement pWord = driver.findElement(By.id("txtPassword"));
	     uname.sendKeys(userName);
	     pWord.sendKeys(passWord);
	}

	@When(":you clicks login button")
	public void you_clicks_login_button() {
		driver.findElement(By.id("btnLogin")).click();
}
}