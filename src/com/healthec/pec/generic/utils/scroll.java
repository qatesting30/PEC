package com.healthec.pec.generic.utils;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class scroll{
	
	
	public static void scrollVertical(WebDriver driver)
	{
	   Dimension screen = driver.manage().window().getSize();	
	   int ht = screen.getHeight();
	   int wt = screen.getWidth();
	   
	   int starty =(int)(ht *0.8);
	   int endy = (int)(ht * 0.2);
	   int startx = (int)(wt/2);
	   int endx = (int)(wt/2);
	   
	  // driver.s
	}
	
	

}
