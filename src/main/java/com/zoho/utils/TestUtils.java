package com.zoho.utils;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.zoho.testsetup.TestSetup;

public class TestUtils extends TestSetup{

	public static boolean isElementpresent(By by)
	{
		try
		{
			driver.findElement(by);
			return true;
		}
		catch(Throwable ex)
		{
			System.out.println("Catch block executed");
			return false;
		}
		
		/*List<WebElement> list=driver.findElements(by);
		if(list!=null)
			return true;
		else
			return false;*/
	}
	
	
	
}
