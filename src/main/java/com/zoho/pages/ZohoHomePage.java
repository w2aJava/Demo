package com.zoho.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoHomePage {

	WebDriver driver=null;
	
	public ZohoHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnProfileEmoji()
	{
		driver.findElement(By.id("ztb-profile-image")).click();
	}
	
	public void clickOnMyAccount()
	{
		driver.findElement(By.id("ztb-myaccount")).click();
	}
	
}
