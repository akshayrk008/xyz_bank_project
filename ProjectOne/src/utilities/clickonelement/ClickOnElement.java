package utilities.clickonelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickOnElement {
	
	WebDriver driver;
	
	public ClickOnElement(WebDriver driver) {
		this.driver = driver;
	}
	
	 public void clickElement(By locator) {
	        WebElement element = driver.findElement(locator);
	        element.click();
	    }

}
