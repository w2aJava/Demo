package com.zoho.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoHoLandingPage {
	
	WebDriver driver=null;
	//By loginLink=By.linkText("Login");
	//By nextButton=By.id("nextbtn");
	
	@FindBy(linkText="Login")
	WebElement loginLink;
	
	@FindBy(id="nextbtn")
	WebElement nextButton;
	
	
	public ZoHoLandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//Mandatory step to perform
		
	}
	
	public ZohoLoginPage clickOnLoginLink()
	{
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(nextButton));
		return new ZohoLoginPage(this.driver);
	}
	
	

}
