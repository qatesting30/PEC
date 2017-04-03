package com.healthec.pec.generic.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoSignIn {
	
	public static void signIn(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[contains(text(),'Signin')")).click();
	}

}
