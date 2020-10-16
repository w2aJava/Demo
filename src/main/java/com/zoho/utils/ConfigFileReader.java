package com.zoho.utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"file:src/test/resources/propertyFiles/config.properties"
})
public interface ConfigFileReader extends Config{
	
	@Key("testSiteURL")
	String getTestSiteURL();
	
	@Key("browsername")
	String getBrowserName();
	
	@Key("implicitWaitTime")
	int getImplicitWaitTimeOut();

}
