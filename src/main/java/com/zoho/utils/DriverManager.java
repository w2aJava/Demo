package com.zoho.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static  WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return DriverManager.driver;
		
	}
	
	public static void setDriver(WebDriver driver)
	{
		DriverManager.driver=driver;
	}
	
	public static void maximizeBrowser()
	{
		DriverManager.getDriver().manage().window().maximize();
	}
	
	public static void setImplicitWait()
	{
		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
