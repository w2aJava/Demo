package com.zoho.pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoho.utils.TestUtils;

public class ZohoLoginPage {

	WebDriver driver = null;
	//By userEmailField=By.id("login_id");
	//By nextButton=By.id("nextbtn");
	//By passwordField=By.id("password");
	//By signInButton=By.xpath("//button//span[text()='Sign in']");
	By passwordError=By.xpath("//div[text()='Incorrect password. Please try again.']");
	
	@FindBy(id="login_id")
	WebElement userEmail;
	
	@FindBy(id="nextbtn")
	WebElement nextButton;
	
	@FindBy(xpath="//button//span[text()='Sign in']")
	WebElement signInButton;
	
	@FindBy(id="password")
	WebElement password;
	
	
	public ZohoLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterEmail(String email) {
		//WebElement emailField = driver.findElement(userEmailField);
		userEmail.clear();
		userEmail.sendKeys(email);
	}

	public void clickOnNextButton() {
		//driver.findElement(nextButton).click();
		nextButton.click();
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		
	}

	public void enterPassowrd(String pwd) {
		//driver.findElement(passwordField).clear();
		password.clear();
		
		//driver.findElement(passwordField).sendKeys(password);
		password.sendKeys(pwd);
	}

	public ZohoHomePage clickOnSignInButton() {
		//driver.findElement(signInButton).click();
		signInButton.click();
		if (TestUtils.isElementpresent(passwordError)) 
		{
			return null;//return the object of the current class(ZohoLoginPage)

			
		} else {
			return new ZohoHomePage(this.driver);
		}
	}

}
