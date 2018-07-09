	package com.Spending.AppiumConfiguration;

import java.io.File;
import java.util.Properties;

import org.testng.annotations.Test;

import com.Spending.utility.ConfigFileReader;
import com.Spending.utility.Log;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;

public class AppiumServer {
	


	int port =  Integer.parseInt(ConfigFileReader.getInstance().getPort());
String ipaddress = ConfigFileReader.getInstance().getipAddress();
AppiumDriverLocalService  AppiumServices;
String NodeJSPath = ConfigFileReader.getInstance().getNodeJsPath();
String Appiumjs = ConfigFileReader.getInstance().getAppiumjsPath();
String AppiumLog = ConfigFileReader.getInstance().getAppiumLog();
String OsName= System.getProperty("os.name");

void StartAppiumServer(String callbackPort_,String BootstrapPort_,int Port,String Ipaddress_) {
	
	
	if(OsName.contains("Windows")) {
		Log.info("Appium start for windows Machine");
	AppiumServices=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
			.usingDriverExecutable(new File((NodeJSPath))).withAppiumJS(new File((Appiumjs))).withIPAddress(Ipaddress_)
			.usingPort(Port).withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER,BootstrapPort_).withLogFile(new File((AppiumLog))));
	
	AppiumServices.start();
	Log.info("Appiumservice start");
	}
	else {
		Log.info("Appium start for Mac Machine ");
	}

	}
	
void StopAppiumServer() {
AppiumServices.stop();	

Log.info("AppiumService  stop ");
}	
}
