package com.zoho.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver createDriverInstance(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.maximizeBrowser();
			DriverManager.setImplicitWait();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			DriverManager.setDriver(driver);
			DriverManager.maximizeBrowser();
			DriverManager.setImplicitWait();
		} else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			DriverManager.setDriver(driver);
			DriverManager.maximizeBrowser();
			DriverManager.setImplicitWait();
		}
		return DriverManager.getDriver();
	}
	
	public static void destroyDriver()
	{
		if(DriverManager.getDriver()!=null)
		{
			DriverManager.getDriver().quit();
		}
	}

}
