package com.healthec.pec.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.healthec.pec.config.DriverCall;
import com.healthec.pec.generic.utils.GetData;
import com.healthec.pec.ui.Loginpage;

public class LoginUC_001 {
	
	public static WebDriver driver;
	public static Loginpage lp;
	public static String un;
	public static String pwd;
	public static WebDriverWait wait;
	
	@BeforeTest
	public static void beforeLoginTest()
	{
		driver = DriverCall.getDriverInstance();
		    lp = new Loginpage(driver);
		    un =GetData.fromExcel("testData", "tdata001", 1, 0);
		   pwd =GetData.fromExcel("testData", "tdata001", 1, 1);
	}
	
	@Test
	public static void loginTC_001()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(lp.usernameTxtfield())).sendKeys(un);
		wait.until(ExpectedConditions.elementToBeClickable(lp.passwordTxtfield())).sendKeys(pwd);
		jse.executeScript("document.getElementById('buttonlogin').click();");
		
		//wait.until(ExpectedConditions.elementToBeClickable(lp.loginBtn())).click();
		//lp.usernameTxtfield().sendKeys(un);
		//lp.passwordTxtfield().sendKeys(pwd);
		//lp.loginBtn().click();
	}
  //@AfterTest
  public void tearDown()
  {
	  driver.close();
  }
}
