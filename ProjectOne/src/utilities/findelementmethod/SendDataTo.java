package utilities.findelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendDataTo {
	WebDriver driver;
	
	public SendDataTo(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendKeysToElement(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

}
