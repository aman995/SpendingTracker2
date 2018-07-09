package com.Spending.appModule;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.Spending.utility.ConfigFileReader;
import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

public class TouchActionLib {
	
	
	static TouchAction action = null;
	
static 	Dimension size= null ;
	
	
			
public TouchAction SwipeRightToLeft(AppiumDriver<MobileElement> driver) throws InterruptedException	  {

	size= driver.manage().window().getSize();
	action = new TouchAction(driver);	
	Log.info("Selenium Touch action object created");
	int  endwidth = (int) (size.width*0.1);
	Log.info("Size width");
	int  startWidth  = (int) (size.width*0.8);
	Log.info("Size width");
	int  h1 = (int)  (size.height/2);
	Log.info("Size height");
	
	action.press(startWidth, h1).waitAction(Duration.ofMillis(2000)).moveTo(endwidth, h1).release().perform();
	
	Log.info("perporming action");
return action;
}

public TouchAction SwipeLeftToRight(AppiumDriver<MobileElement> driver) throws InterruptedException	  {

	size= driver.manage().window().getSize();
	action = new TouchAction(driver);	
	Log.info("Selenium Touch action object created");
	int  endwidth = (int) (size.width*0.1);
	Log.info("Size width");
	int  startWidth  = (int) (size.width*0.8);
	Log.info("Size width");
	int  h1 = (int)  (size.height/2);
	Log.info("Size height");
	
	action.press(startWidth, h1).waitAction(Duration.ofMillis(2000)).moveTo(endwidth, h1).release().perform();
	
	Log.info("perporming action");
return action;
}

public TouchAction SwipeLeftToRigth(AppiumDriver<MobileElement> driver) throws InterruptedException	  {

	size= driver.manage().window().getSize();
	action = new TouchAction(driver);	
	Log.info("Selenium Touch action object created");
	int  endwidth = (int) (size.width*0.8);
	Log.info("Size width");
	int  startWidth  = (int) (size.width*0.1);
	Log.info("Size width");
	int  h1 = (int)  (size.height/2);
	Log.info("Size height");
	
	action.press(startWidth, h1).waitAction(Duration.ofMillis(2000)).moveTo(endwidth, h1).release().perform();
	
	Log.info("perporming action");
return action;
}

public TouchAction SwipeDownToUp(AppiumDriver<MobileElement> driver) throws InterruptedException	  {

	size= driver.manage().window().getSize();
	action = new TouchAction(driver);	
	Log.info("Selenium Touch action object created");
	int  endHeight = (int) (size.height*0.1);
	Log.info("Size width");
	int  startHeight = (int) (size.height*0.8);
	Log.info("Size width");
	int  Width = (int)  (size.width/2);
	Log.info("Size height");
	
	action.press(Width, startHeight).waitAction(Duration.ofMillis(2000)).moveTo(Width, endHeight).release().perform();
	
	Log.info("perporming action");
return action;
}

public TouchAction SwipeUpToDown(AppiumDriver<MobileElement> driver) throws InterruptedException	  {

	size= driver.manage().window().getSize();
	action = new TouchAction(driver);	
	Log.info("Selenium Touch action object created");
	int  endHeight = (int) (size.height*0.8);
	Log.info("Size width");
	int  startHeight = (int) (size.height*0.1);
	Log.info("Size width");
	int  Width = (int)  (size.width/2);
	Log.info("Size height");
	
	action.press(Width, startHeight).waitAction(Duration.ofMillis(2000)).moveTo(Width, endHeight).release().perform();
	
	Log.info("perporming action");
return action;
}
 
public TouchAction LongPress(AppiumDriver<MobileElement> driver, WebElement element) throws InterruptedException{
	action = new TouchAction(driver);
	 action.longPress(element).perform().release();
	
	return action;
	
}

public void  switchToMode(String ModeType, AppiumDriver <MobileElement> driver)
{
ScreenOrientation currentRotation = driver.getOrientation();	
Log.info("Current Orienation "+currentRotation);
if(ModeType.equalsIgnoreCase("LANDSCAPE"))
{
	driver.rotate(ScreenOrientation.LANDSCAPE);

	Log.info("screen is rotated in landscape mode");
}
else if(ModeType.equalsIgnoreCase("PORTRAIT")) {
driver.rotate(ScreenOrientation.PORTRAIT);
Log.info("Screen is  roated in Portrait mode");
} 
try {
	Thread.sleep(5000);
}
catch(InterruptedException e) {
	
}
}

public void ScreenShot(AppiumDriver<MobileElement> driver) throws IOException {
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	Date date = new Date ();
	
	String filename= sdf.format(date);
	
	File des= driver.getScreenshotAs(OutputType.FILE);
	  
	FileUtils.copyFile(des, new File(ConfigFileReader.getInstance().ScreenShotPath()+filename+".png"));
	
	
}


/* Get the newest file for a specific extension */
public File getTheNewestFile(String filePath, String ext) {
    File theNewestFile = null;
    File dir = new File(filePath);
    FileFilter fileFilter = new WildcardFileFilter("*." + ext);
    File[] files = dir.listFiles(fileFilter);

    if (files.length > 0) {
        /** The newest file comes first **/
        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        theNewestFile = files[0];
    }

    return theNewestFile;
}
}
