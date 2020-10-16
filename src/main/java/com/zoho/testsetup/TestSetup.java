package com.zoho.testsetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.zoho.utils.ConfigFileReader;
import com.zoho.utils.DriverFactory;
import com.zoho.utils.DriverManager;

public class TestSetup {

	public static WebDriver driver;
	public static Properties configProperty;
	public static ConfigFileReader configReader;

	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException {
		/*configProperty = new Properties();
		configProperty.load(new FileInputStream(
				"D:\\Workspace\\ZohoAutomation\\src\\test\\resources\\propertFiles\\config.properties"));
*/
		configReader=ConfigFactory.create(ConfigFileReader.class);
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriver driver = null;
		if (driver == null) {
			//driver = DriverFactory.createDriverInstance(configProperty.getProperty("browserName"));
			driver = DriverFactory.createDriverInstance(configReader.getBrowserName());

		}

		// navigate to zoho.com
		//DriverManager.getDriver().navigate().to(configProperty.getProperty("testSiteURL"));
		DriverManager.getDriver().navigate().to(configReader.getTestSiteURL());
		

	}

	@AfterMethod
	public void afterMethod() {
		DriverFactory.destroyDriver();
	}

}
