package Webapp_test_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class theme_change {
	
WebDriver driver;
	
	public theme_change(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Theme() {
		
		WebElement themeSelect = driver.findElement(By.id("theme"));
        Select select = new Select(themeSelect);
        select.selectByValue("dark");
        
        WebElement body = driver.findElement(By.tagName("body"));
        Assert.assertEquals("dark-theme", body.getAttribute("class"));
	}

}
