package pageobjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import locators.SearchResultsLocators;
import main.Setup;

/**
 * Class that instantiates the mobile elements used for Search Results
 * @author jctjavier
 */
public class SearchResults {
	
	public static MobileElement searchText = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchResultsLocators.searchText()));
	public static MobileElement listViewChangeIcon = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchResultsLocators.listViewChangeIcon()));
	public static MobileElement filterIcon = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchResultsLocators.filterIcon()));
	public static MobileElement filterText = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchResultsLocators.filterText()));
	public static MobileElement productList = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchResultsLocators.productList()));
	public static MobileElement searchAmount = (MobileElement) Setup.appiumDriver.findElement(By.id(SearchResultsLocators.searchAmount()));
	
}
