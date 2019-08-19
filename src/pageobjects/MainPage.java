package pageobjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import locators.MainPageLocators;
import main.Setup;

/**
 * Class that instantiates the mobile elements used for Main Page
 * @author jctjavier
 */
public class MainPage {
	
	public static MobileElement bolImage = (MobileElement) Setup.appiumDriver.findElement(By.id(MainPageLocators.bolImage()));
	public static MobileElement searchBar = (MobileElement) Setup.appiumDriver.findElement(By.id(MainPageLocators.searchBar()));
	public static MobileElement homeAccountBtn = (MobileElement) Setup.appiumDriver.findElement(By.id(MainPageLocators.homeAccountBtn()));
	public static MobileElement categoryBtn = (MobileElement) Setup.appiumDriver.findElement(By.id(MainPageLocators.categoryBtn()));
	public static MobileElement bottomNavigation = (MobileElement) Setup.appiumDriver.findElement(By.id(MainPageLocators.bottomNavigation()));
	
}
