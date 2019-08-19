package methods;

import main.Constant;
import main.Logger;
import pageobjects.MainPage;
import pageobjects.SearchBox;
import pageobjects.SearchResults;
import utils.Helper;

/**
 * Class that includes methods related to Search actions
 * @author jctjavier
 */
public class SearchMethods {
	
	/**
	 * Verifies that the Search Box is displayed on the main page
	 */
	public static void verifySearchIsDisplayedOnMainPage() {
		if (MainPage.searchBar.isDisplayed()) {
			Logger.logTestScript("Verify that the Search bar is displayed.", 
					"Search bar should be displayed.", "Search bar was successfully displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the Search bar is displayed.", 
					"Search bar should be displayed.", "Search bar was NOT displayed.", Constant.FAILED);
		}
	}
	
	/**
	 * Enter search term and click search glass
	 */
	public static void enterSearchTerm(String searchTerm) {
		MainPage.searchBar.click();
		SearchBox.searchTextBox.click();
		SearchBox.searchTextBox.sendKeys(searchTerm);
		if (SearchBox.searchTextBox.getText().equals(searchTerm)) {
			Logger.logTestScript("Verify that user was able to successfully input search term.", 
					"User should be able to input search term in search text box.", 
					"Search term " + SearchBox.searchTextBox.getText() + " was successfully entered.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that user was able to successfully input search term.", 
					"User should be able to input search term in search text box.", 
					"Search term " + searchTerm + " input was unsuccessful. Search text displayed is: " + SearchBox.searchTextBox.getText(), Constant.FAILED);
		}
		Helper.pressSearchKey();
	}
	
	/**
	 * Verify search results are displayed
	 * @param searchTerm
	 */
	public static void verifySearchResults(String searchTerm) {
		
		if (SearchResults.searchText.getText().equals(searchTerm)) {
			Logger.logTestScript("Verify that search text has not changed.", 
					"Search text should still be displayed and should have the same value.", 
					"Search term " + SearchResults.searchText.getText() + " was still displayed", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that search text has not changed.", 
					"Search text should still be displayed and should have the same value.", 
					"Search text displayed is: " + SearchResults.searchText.getText(), Constant.FAILED);
		}
		
		// Verify product list is displayed
		if (SearchResults.productList.isDisplayed()) {
			Logger.logTestScript("Verify search results are displayed.", 
					"Search results should be displayed.", 
					"Search results were successfully displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify search results are displayed.", 
					"Search results should be displayed.", 
					"Search results were successfully displayed.", Constant.FAILED);
		}
	}
}
