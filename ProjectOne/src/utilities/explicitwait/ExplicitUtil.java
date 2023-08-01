package utilities.explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class ExplicitUtil {
	WebDriver driver;
	//int TimeUnit_SECOND;
	public ExplicitUtil(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	 public WebElement waitForVisibilityOfElement(By locator, int TimeUnit_SECOND) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit_SECOND));
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	 
	 public void waitForTextToBePresentInElement(By locator, String text, int TimeUnit_SECOND) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit_SECOND));
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
	    }
	 
	 public void waitForTitleToBe(String expectedTitle, int TimeUnit_SECOND) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit_SECOND));
	       // expectedTitle = driver.getCurrentUrl();
	        wait.until(ExpectedConditions.titleIs(expectedTitle));
	    }
	 
	 public void waitForUrlToBe(WebDriver driver, String expectedUrl, int timeoutInSeconds) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	            wait.until(ExpectedConditions.urlToBe(expectedUrl));
	        } catch (TimeoutException e) {
	            // Handle TimeoutException (if required)
	            System.out.println("Timeout waiting for URL: " + expectedUrl);
	        }
	 }

}
