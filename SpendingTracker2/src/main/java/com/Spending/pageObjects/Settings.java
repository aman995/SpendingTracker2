package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class Settings {
static WebElement element=null; 


WebElement timeperiod(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("timePeriod"));
	Log.info("time Period element found");
	return element ;
	}catch(NoSuchElementException e) {
		Log.error("Not time period element found" +e.getMessage());
	}
	return null;
	}

WebElement buggetMode(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("budgetMode"));
	Log.info("budget mode element found");
	
		return element;
		}catch(NoSuchElementException e) {
			Log.error("Not budgetMode element found" +e.getMessage());
		}
		return null;
}

WebElement carryOver(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("carryOver"));
	Log.info("Carry overf Element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not carryOver element found" +e.getMessage());
	}
	return null;
}

WebElement hideFuture(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("hideFuture"));
	Log.info("Hide future Element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not hideFuture element found" +e.getMessage());
	}
	return null;
}

WebElement dropBoxSync(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("dropboxSync"));
	Log.info("drop box Sync element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not dropboxsync element found" +e.getMessage());
	}
	return null;
	}
	
	WebElement showNote(AppiumDriver driver) {
		try {
			element=	driver.findElement(By.id("showNote"));
		Log.info("showNote element found");
		return element;
		}catch(NoSuchElementException e) {
			Log.error("Not shownote element found" +e.getMessage());
		}
		return null;
	}
	
WebElement currencySymbol(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("currencySymbol"));
	Log.info("currency Symbol element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not currency symobol element found" +e.getMessage());
	}
	return null;
}

WebElement summaryFont(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("summaryFont"));
	Log.info("Summary font Element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Summary Font element found" +e.getMessage());
	}
	return null;
}

WebElement tabsPosition(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("tabsPosition"));
	Log.info("Tabs position element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not tabsPosition element found" +e.getMessage());
	}
	return null;
}

WebElement reminders(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("reminders"));
	Log.info("Remainder Eleemnt found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not remainders element found" +e.getMessage());
	}
	return null;
	}
WebElement autoBackup(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("autoBackup"));
	Log.info("autoBackup Element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not autobackup element found" +e.getMessage());
	}
	return null;
	
}

WebElement localtips(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("localTips"));
	Log.info("localTips element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not localTips element found" +e.getMessage());
	}
	return null;
}

WebElement analytics(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("analytics"));
	Log.info("analytics element found" );
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not analytics element found" +e.getMessage());
	}
	return null;
	
	
}

WebElement passcode(AppiumDriver driver) {
	
	try {
		element=	driver.findElement(By.id("passcode"));
	Log.info("passcode Element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not passcode element found" +e.getMessage());
	}
	return null;
	}

WebElement Navigate(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.xpath("//*[@content-desc='Navigate up']"));
	Log.info("Navigate up element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not navigate up element found" +e.getMessage());
	}
	return null;
}

}
