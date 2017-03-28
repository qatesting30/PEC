package com.healthec.pec.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.healthec.pec.config.DriverCall;

public class LaunchPage {
	
	public static WebDriver driver;
	
	
	@Test
	public static void launchbrowserTest()
	{
		driver = DriverCall.getDriverInstance();
	}

}
