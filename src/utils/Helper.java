package utils;

import com.google.common.collect.ImmutableMap;

import main.Configuration;
import main.Setup;

/**
 * Class for helper methods
 * @author jctjavier
 */
public class Helper {
	
	/** 
	 * Get the index depending on the value of currentDevice
	 * @return index
	 */
	public static int getIndex() {
		int index = -1;

		switch (Configuration.getCurrentDevice().toLowerCase()) {
		case ("android"):
			index = 0;
			break;
		case ("ios"):
			index = 1;
			break;
		default:
			System.out.println("Device not recognized. Current Specified Device: " + Configuration.getCurrentDevice());
		}
		
		return index;
	}
	
	/**
	 * For Android
	 * Method to press the Search key
	 */
	public static void pressSearchKey() {
		Setup.appiumDriver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	}
 }
