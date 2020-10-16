package com.zoho.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.testsetup.TestSetup;

public class validateZohoSignup extends TestSetup {

	/*
	 * @Test public void validateZohoSignupWithValidData() {
	 * 
	 * //open a chrome browser WebDriverManager.chromedriver().setup();
	 * WebDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * 
	 * //navigate to zoho.com driver.navigate().to("https://www.zoho.com/");
	 * 
	 * //click on free signup link
	 * driver.findElement(By.linkText("Free Sign Up")).click();
	 * 
	 * //enter email driver.findElement(By.id("emailfield")).sendKeys(
	 * "learnautomation.easily@gmail.com");
	 * 
	 * 
	 * //enter password
	 * driver.findElement(By.id("password")).sendKeys("Abc@12345");
	 * 
	 * //clickon the signup button
	 * driver.findElement(By.id("signup-termservice")).click();
	 * driver.findElement(By.id("signupbtn")).click();
	 * 
	 * 
	 * }
	 */

	 @Test
	public void validateZohoSignupWithInvalidEmail() throws InterruptedException {

		// click on free signup link
		driver.findElement(By.linkText("Free Sign Up")).click();

		Thread.sleep(3000);
		
		// enter email
		driver.findElement(By.id("emailfield")).sendKeys("learnautomation.easily@gmail.com");

		// enter password
		driver.findElement(By.id("password")).sendKeys("Abc!@#123");

		// clickon the signup button

		WebElement term = driver.findElement(By.id("tos"));
		term.click();

		TestSetup.driver.findElement(By.id("signupbtn")).click();

		WebElement emailFieldError =driver.findElement(By.id("emailfield-error"));

		Assert.assertTrue(emailFieldError.isDisplayed());

	}

	/*
	 * public void validateZohoSignupWithInvalidPassword() {
	 * 
	 * }
	 * 
	 * public void validateZohoSignupWithoutEmail() {
	 * 
	 * }
	 */
}
