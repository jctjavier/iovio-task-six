package locators;

import java.util.ArrayList;

import utils.Helper;

/**
 * Locatores for Android and iOS
 * Note: iOS locators not yet available
 * @author jctjavier
 *
 */
public class SearchResultsLocators {
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
	
	public static String searchText() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/product_list_search_text");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String listViewChangeIcon() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/fProductListViewChangeButton");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String filterIcon() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/fProductListFilterIcon");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String filterText() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/fProductListFilter");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String productList() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/fProductListGridView");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
	
	public static String searchAmount() {
		ArrayList<String> locator = new ArrayList<String>();
		locator.add("com.bol.shop:id/product_list_search_amount_text");
		locator.add("ios");
		
		return locator.get(Helper.getIndex());
	}
}
