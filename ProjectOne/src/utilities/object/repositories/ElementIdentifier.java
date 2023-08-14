package utilities.object.repositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementIdentifier {

	private FileInputStream stream;
	private String RepositoryFile;
	private static Properties propertyFile = new Properties();

	/*
	 * 
	 * String path = System.getProperty("user.dir"); 
	 * Properties obj = new Properties(); 
	 * FileInputStream objfile = new
	 * FileInputStream(path+"\\resource\\ObjectRepo.properties"); 
	 * obj.load(objfile);
	 * 
	 */

	public ElementIdentifier(String FileName) {
		this.RepositoryFile = FileName;

		try {
			stream = new FileInputStream(RepositoryFile);
			propertyFile.load(stream);

		}

		catch (IOException e) {

			e.printStackTrace();

		}

	}
	
	public static By getobjectLocator(String LocatorName) {
		
		String LocatorProperty = propertyFile.getProperty(LocatorName);
		//System.out.println(LocatorProperty.toString());
		String locatorType = LocatorProperty.split(":")[0];
		String locatorValue = LocatorProperty.split(":")[1];
		
		System.out.println("Locator Type is:"+locatorType);
		System.out.println("Locato Value is:"+locatorValue);
		By LocatorValue = null;
		
		switch(locatorType.toUpperCase())
		{
		case "ID":
			LocatorValue = By.id(locatorValue);
			break;
		case "NAME":
			LocatorValue = By.name(locatorValue);
			break;
		case "CSSSELECTOR":
			LocatorValue = By.cssSelector(locatorValue);
			break;
		case "LINKTEXT":
			LocatorValue = By.linkText(locatorValue);
			break;
		case "PARTIALLINKTEXT":
			LocatorValue = By.partialLinkText(locatorValue);
			break;
		case "TAGNAME":
			LocatorValue = By.tagName(locatorValue);
			break;
		case "XPATH":
			LocatorValue = By.xpath(locatorValue);
			break;
		}
		return LocatorValue;
		
		
	}

}
