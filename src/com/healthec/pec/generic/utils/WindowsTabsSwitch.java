package com.healthec.pec.generic.utils;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class WindowsTabsSwitch {
	
	public static void switchWindowsAndTabs(WebDriver driver, ArrayList<String>name)
	{
		name = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(name.get(1));
	}

}
