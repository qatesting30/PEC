package com.healthec.pec.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.healthec.pec.generic.utils.GetData;

public class DriverCall {
	
	public static WebDriver getDriverInstance()
	{
		WebDriver driver = null;
		String browserName = GetData.fromProperties("data", "BROWSER");
		String appUrl = GetData.fromProperties("data", "URL");
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", 
					"./driver-config/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"./driver-config/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./driver-config/MicrosoftWebDriver.exe");
			 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(appUrl);
		return driver;
	}

}
