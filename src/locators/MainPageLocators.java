package locators;

import java.util.ArrayList;

import utils.Helper;

/**
 * Main Page Locators for Android and iOS
 * Note: iOS locators not yet available
 * @author jctjavier
 */
public class MainPageLocators {

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
	
	public static String bolImage() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/home_welcome_bol_imageview");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String searchBar() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/home_search_bar");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String homeAccountBtn() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/home_account_button");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String categoryBtn() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/home_categories_button");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String bottomNavigation() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/aMainBottomNavigation");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
}
