package com.zoho.testcases;

import org.testng.annotations.Test;

import com.zoho.pages.ZoHoLandingPage;
import com.zoho.pages.ZohoHomePage;
import com.zoho.pages.ZohoLoginPage;
import com.zoho.testsetup.TestSetup;
import com.zoho.utils.DriverManager;

public class ValidateZohoLogin extends TestSetup {
	
	
	@Test
	public void validateZohoLoginWithValidCredentials()
	{
		ZoHoLandingPage landingPage= new ZoHoLandingPage(DriverManager.getDriver());
		ZohoLoginPage loginPage=landingPage.clickOnLoginLink();
		
		loginPage.enterEmail("learnautomation.easily@gmail.com");
		loginPage.clickOnNextButton();
		loginPage.enterPassowrd("Abc!@#123");
		ZohoHomePage homePage=loginPage.clickOnSignInButton();
		homePage.clickOnProfileEmoji();
		homePage.clickOnMyAccount();
		
	}

}
