package com.Spending.utility;

import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.testng.annotations.BeforeSuite;

public class Log {
	
	
	
	
static  Logger Log = Logger.getLogger(Log.class.getName());

 String Config;

	
public  static void PropertyConfig() {
 	PropertyConfigurator.configure(ConfigFileReader.getInstance().getLog());
}


	public  static void startTestCase(String TestCaseName) {
		Log.info("****************************************************************************************");
		 
		Log.info("****************************************************************************************");
	 
		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+TestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
	 
		Log.info("****************************************************************************************");
	 
		Log.info("****************************************************************************************");
	 
		
	}
	
	

	public static void endTedstCaseName(String TestcaseName)
	{Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
	 
		Log.info("X");
	 
		Log.info("X");
	 
		Log.info("X");
	 
		Log.info("X");
	 
		}
	

	public static  void error(String message) {
		 Log.error(message);
		 
	 }
	 
	 public static void info(String message)
	 {
		 Log.info(message);
	 }

}
