package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HRMHooks {
	WebDriver driver;
	@Before()
public void projectStart() {
		driver=new ChromeDriver();
}
@After()
public void projectEnd() {
	driver.quit();
}


}
//Before--->io.cucumber.java.Before;
//After --->io.cucumber.java.After;