package com.healthec.pec.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
   public WebElement usernameTxtfield(){
	   return driver.findElement(By.id("txtLogin"));
   }
   public WebElement passwordTxtfield(){
	   return driver.findElement(By.id("txtPwd"));
   }
   public WebElement loginBtn(){
	   return driver.findElement(By.id("buttonlogin"));
   }
}
