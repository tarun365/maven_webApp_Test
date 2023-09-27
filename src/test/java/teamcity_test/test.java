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
	register_user ru;
	theme_change tc;
	update_profile up;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test(description = "Critical Functionality: User Login",priority=0)
	public void login_page() throws InterruptedException {
		lp=new login_page(driver);
		lp.Login();
	}
	
	@Test(description = "Critical Functionality: User Registrartion",priority=1)
	public void register_user() {
		ru=new register_user(driver);
		ru.Register();
		
	}
	
	@Test(description = "Non-Cr Functionality: Changing Theme",priority=2)
	public void theme_change() {
		tc=new theme_change(driver);
		tc.Theme();
		
	}
	
	@Test(description = "Non-Cr Functionality: Profile update",priority=3)
	public void update_profile() {
		up=new update_profile(driver);
		up.ProfileUpdate();
		
	}
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
