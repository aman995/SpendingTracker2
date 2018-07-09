package com.Spending.utility;

import java.util.ResourceBundle;

public class ConfigFileReader {
    private static ConfigFileReader config = new ConfigFileReader();
	
	ResourceBundle resourceBundle = ResourceBundle.getBundle("Configuration");
	
	private ConfigFileReader() {}
	
public static ConfigFileReader getInstance() {
	return config;
	
}
	
	public String getImplicitwait() {
		
		String implicitWait = resourceBundle.getString("ImplicitWait");
		
		return implicitWait;
	}

	public String getNodeJsPath() {
		String NodeJsPath = resourceBundle.getString("NodeJsPath");
		return NodeJsPath;
	}

	public String getAppiumjsPath() {
		String AppiumJsPath = resourceBundle.getString("AppiumJsPath");
		return AppiumJsPath;
	}

	public String getipAddress() {
		String ipAddress = resourceBundle.getString("ipaddress");
		return ipAddress;
	}

	public String getPlatformName() {
		String platformPath = resourceBundle.getString("platformName");
		return platformPath;
	}

	public String getPort() {
		String port = resourceBundle.getString("port");

		return port;
	}

	public String getPlatformVersion() {
		String platformVersion = resourceBundle.getString("platformVersion");
		return platformVersion;
	}

	public String getDeviceName() {
		String deviceName = resourceBundle.getString("deviceName");
		return deviceName;
	}

	public String getappActivity() {
		String appActivity = resourceBundle.getString("appActivity");
		return appActivity;
	}

	public String getapppackage() {
		String appPackage = resourceBundle.getString("appPackage");
		return appPackage;

	}

	public String getAppiumLog() {
		String appiumLog = resourceBundle.getString("AppiumLog");
		return appiumLog;
	}

	public String getURL() {
		String URL = resourceBundle.getString("URL");
		return URL;
	}

	public String getLog() {
		
		String LogPath = resourceBundle.getString("LogPath");
		return LogPath;
	}
	
	public String ScreenShotPath() {
		String ScreenShotPath = resourceBundle.getString("ScreenshotFilePath");
		
		return ScreenShotPath;

	}
public String getApkPath() {
	String ApkPath = resourceBundle.getString("AppPath");
	return ApkPath;
}
}