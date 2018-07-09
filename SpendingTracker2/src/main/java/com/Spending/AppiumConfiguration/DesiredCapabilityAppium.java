package com.Spending.AppiumConfiguration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.Spending.utility.ConfigFileReader;
import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class DesiredCapabilityAppium {

String OsName=System.getProperty("os.name");	

String PlatformVersion=ConfigFileReader.getInstance().getPlatformVersion();
String PlatformName=ConfigFileReader.getInstance().getPlatformName();
String DeviceName=ConfigFileReader.getInstance().getDeviceName();
String AppPackage=ConfigFileReader.getInstance().getapppackage();
String AppActivity=ConfigFileReader.getInstance().getappActivity();
String AppPath = ConfigFileReader.getInstance().getApkPath();

	public DesiredCapabilities capability;
	
	
	
	DesiredCapabilities desiredCapability(String UDID_, String deviceName_) {
		if(OsName.contains("Windows")) {
			Log.info("Desired cpability set for window manchine");
	 capability = new DesiredCapabilities();
	 Log.info("desired capability object created");
//capability.setCapability("platformVersion",PlatformVersion);
//Log.info("Platform version"+PlatformVersion);

capability.setCapability("udid", UDID_);
capability.setCapability("platformName", PlatformName);
Log.info("Platform Name"+PlatformName);
 capability.setCapability("deviceName",deviceName_);
Log.info("deviceName"+DeviceName);
capability.setCapability("app", AppPath);
Log.info("downloading app pn device");
//capability.setCapability("appActivity", AppActivity);

	return capability;
		}
		else {
			Log.info("Desired Capability set for Mac Machine");
			return null;
		}
	
	}
	
	
	
}
