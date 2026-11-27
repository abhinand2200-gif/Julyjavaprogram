package Envtest.pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestEnvironmentdetails {
public WebDriver driver;
	
	@BeforeClass
	public void precondition() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ghg
	}
	@AfterClass
	public void postcondition() {
		driver.quit();
	}

}



