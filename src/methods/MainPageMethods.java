package methods;

import main.Constant;
import main.Logger;
import pageobjects.MainPage;

/**
 * Class that includes methods to verify the main/welcome screen
 * @author jctjavier
 */
public class MainPageMethods {
	
	/**
	 * Verify main page is displayed (main elements)
	 */
	public static void verifyMainPageIsDisplayed() {
		// Verify BOL image is displayed
		if (MainPage.bolImage.isDisplayed()) {
			Logger.logTestScript("Verify that the Bol image is displayed.", 
					"Bol image should be displayed.", "Bol image was displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the Bol image is displayed.", 
					"Bol image should be displayed.", "Bol image was NOT displayed.", Constant.FAILED);
		}
		
		// Verify bottom navigation is displayed
		if (MainPage.bottomNavigation.isDisplayed()) {
			Logger.logTestScript("Verify that the navigation menu is displayed.", 
					"Navigation menu should be displayed.", "Navigation menu was successfully displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the navigation menu is displayed.", 
					"Navigation menu should be displayed.", "Navigation menu was NOT displayed.", Constant.FAILED);
		}
		
		// Verify Account button is displayed
		if (MainPage.homeAccountBtn.isDisplayed()) {
			Logger.logTestScript("Verify that the Account button is displayed.", 
					"Account button should be displayed.", "Account button was successfully displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the Account button is displayed.", 
					"Account button should be displayed.", "Account button was NOT displayed.", Constant.FAILED);
		}
		
		// Verify Categories button is displayed
		if (MainPage.categoryBtn.isDisplayed()) {
			Logger.logTestScript("Verify that the Categories button is displayed.", 
					"Categories button should be displayed.", "Categories button was successfully displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the Categories button is displayed.", 
					"Categories button should be displayed.", "Categories button was NOT displayed.", Constant.FAILED);
		}
	} 
}
