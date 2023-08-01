package utilities.selectactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectUtils {
	WebDriver driver;
	int Time_In_Sec;
	public SelectUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	 public void selectOptionByVisibleText(By dropdownLocator, String optionText) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time_In_Sec));
	        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
	        Select select = new Select(dropdown);
	        select.selectByVisibleText(optionText);
	    }
	 
	 public void selectOptionByIndex(By dropdownLocator, int index) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time_In_Sec));
	        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
	        Select select = new Select(dropdown);
	        select.selectByIndex(index);
	    }

}
