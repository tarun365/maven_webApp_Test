package Webapp_test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class update_profile {
	
WebDriver driver;
	
	public update_profile(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ProfileUpdate() {
		
		driver.findElement(By.name("bio")).sendKeys("updated info");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
	}

}
