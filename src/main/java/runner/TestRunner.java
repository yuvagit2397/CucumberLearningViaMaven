package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\yuvasri_revision\\CucumberLearningViaMaven\\src\\main\\java\\features\\TaggedHooks.feature",
							glue= { "stepDefinitions","hooks"},
							//dryRun=true,
							//strict=true,
							monochrome=true,
							//plugin= {"pretty","html:HtmlReport/Guru99loginreport"}
							//plugin= {"json:json/JsonHrmReport","html:HtmlReport/HRMLoginReport","junit:XMLReport/HrmXMLreport"}
							tags= {"@laptop"}
		)
public class TestRunner {
public static WebDriver driver;
	/*@BeforeClass
	public static void start() {
		driver=new ChromeDriver();
	}
	@AfterClass
	public static void end() {
		driver.quit();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//CucumberOptions
	 /*features
	 glue
	 dryrun
	 strict
	 monochrome
	 tags
	 format or plugin
	 */
	//com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/cucumber-reports/HrmExtrentreport.html
}
