package Webapp_teamcity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	
	WebDriver driver;
	
	public login_page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Login() {
		
		driver.get("http://localhost:8083/webapp/");
		driver.findElement(By.xpath("//input[@name='unme']")).sendKeys("tarun");
		driver.findElement(By.xpath("//input[@name='psw']")).sendKeys("tarun");
		
	}
	

}
