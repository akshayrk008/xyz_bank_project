package utilities.browser.operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;

public class BrowserOperation {
	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

}
