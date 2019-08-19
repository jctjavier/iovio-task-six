package pageobjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import locators.SearchBoxLocators;
import main.Setup;

/**
 * Class that instantiates the mobile elements used for Search Box/Section
 * @author jctjavier
 */
public class SearchBox {
	
	public static MobileElement searchTextBox = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchBoxLocators.searchTextBox()));
	public static MobileElement searchGlass = (MobileElement) Setup.appiumDriver.findElementByXPath(SearchBoxLocators.searchGlass());
}
