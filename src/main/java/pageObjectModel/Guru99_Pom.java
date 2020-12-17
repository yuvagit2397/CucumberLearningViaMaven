package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Guru99StepDef;

public class Guru99_Pom {
	public static WebDriver driver;

	
	public static WebDriver getDriver() {
		return driver;
	}


	public static WebElement getSubmit() {
		return submit;
	}


	public static WebElement getErrorMsg() {
		return errormsg;
	}
	public static WebElement getEmail() {
		return email;
	}
	
	public static List<WebElement> getuserDet() {
		return userdetail1;
	}
	
	public static List<WebElement> getuserDetail() {
		return userdetail2;
	}

	@FindBy(name="btnLogin")
	public static WebElement submit;
	
	@FindBy(id="message9")
	public static WebElement errormsg;
	
	@FindBy(name="emailid")
	public static WebElement email;
	
	@FindBy(xpath="//table/tbody/tr[4]/td")
	public static List<WebElement> userdetail1;
	
	@FindBy(xpath="//table/tbody/tr[5]/td")
	public static List<WebElement> userdetail2;
	
	public Guru99_Pom(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		}

}
