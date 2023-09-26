package Webapp_teamcity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register_user {
	
	WebDriver driver;
	
	public register_user(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Register() {
		
		driver.findElement(By.name("reg-username")).sendKeys("gfusid");
		driver.findElement(By.name("reg-password")).sendKeys("gfusid");
		driver.findElement(By.name("reg-email")).sendKeys("gfusid");
		driver.findElement(By.tagName("button")).click();
	}

}
