package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class Transaction {
	
	static WebElement element = null;
	
	public WebElement add(AppiumDriver driver) {
		try {
		element = driver.findElement(By.xpath("//*[@content-desc='Add']"));
		Log.info("Add elemnt found");
		return element;
		}
		catch(NoSuchElementException e) {
			
			Log.error("Not add element found" +e.getMessage());
		}
		return null;
	}

public 	WebElement nextPeriod(AppiumDriver driver){
		try {
	element = 	driver.findElement(By.id("nextPeriod"));
		Log.info("next period Eleemnt found");
		return element;
		}
		catch(NoSuchElementException e) {
			Log.error("not NextPeriod  element found" +e.getMessage());
		}
		return null;
		
	}
	
	public WebElement previousperiod(AppiumDriver driver) {
		try {
	element =	driver.findElement(By.id("previousPeriod"));
		Log.info("previous period element found");
return element;		
		}catch(NoSuchElementException e) {
			Log.error("not previousPeriod  element found" +e.getMessage());
		}return null;
	}

public WebElement export(AppiumDriver driver) {
	try {
element =	driver.findElement(By.id("export"));
	Log.info("Export element found");
	return element;}
	catch(NoSuchElementException e) {
		Log.error("not export  element found" +e.getMessage());
	}return null;
}

public WebElement filter(AppiumDriver driver) {
	try {
element =	driver.findElement(By.id("filter"));
	Log.info("filter element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("not filter  element found" +e.getMessage());
	}return null;
}

public WebElement Elipse(AppiumDriver driver) {
	try {
element=	driver.findElement(By.xpath("//*[@content-desc='More options']"));
	Log.info("More option element found");
	return element;
	}
	catch(NoSuchElementException e) {
		Log.error("not more options  element found" +e.getMessage());
	}
	return null;
	
}

}
