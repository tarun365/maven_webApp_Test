package teamcity_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webapp_teamcity.*;


public class test {
	
	WebDriver driver;
	login_page lp;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void login_page() {
		lp=new login_page(driver);
		lp.Login();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
