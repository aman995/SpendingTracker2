package com.Spending.AppiumConfiguration;

import java.net.MalformedURLException;
import java.net.URL;

import com.Spending.pageObjects.Home_Page_Spending;
import com.Spending.utility.ConfigFileReader;
import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumManager {
	

String URL = ConfigFileReader.getInstance().getURL();
public static AndroidDriver <MobileElement>driver;	
AppiumServer AppiumServerStart =  new AppiumServer();
DesiredCapabilityAppium  dca = new DesiredCapabilityAppium();
Home_Page_Spending homePageSpending;


public AppiumDriver AppuimServerStarting(String deviceName_,  String UDID_ ,String platformversion_,String URL_,String callbackPort_,String BootstrapPort_,int Port,String Ipaddress_) {
	AppiumServerStart.StartAppiumServer( callbackPort_,BootstrapPort_,Port,Ipaddress_);
	try {
		driver=  new AndroidDriver<MobileElement>(new URL("http://"+URL_),dca.desiredCapability( UDID_, deviceName_));
		
	Log.info("Driver created successfully");
	return driver;
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		
		Log.error("Not able to create driver" +e.getMessage());
		e.printStackTrace();
	}
	
	return null;
}
 
public void AppiumServerStoping() {
	AppiumServerStart.StopAppiumServer();
	Log.info("stoping appium server");
}

}
