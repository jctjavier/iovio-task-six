package locators;

import java.util.ArrayList;

import utils.Helper;

/**
 * Locators for Android and iOS
 * Note: iOS locators not yet available
 * @author jctjavier
 */
public class SearchBoxLocators {
	
	/**
	 * DO NOT REMOVE!
	 * This method is not used. 
	 * It is a template. 
	 * @return locator value
	 */
	public static String elementLocator() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("android");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}

	public static String searchTextBox() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/fSearchSuggestField");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String searchGlass() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("(//*[@resource-id='com.bol.shop:id/home_search_bar']/*/*[@class='android.widget.ImageView'])[1]");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
}
