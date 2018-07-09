package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class Accounts {
static WebElement element= null;
	
WebElement add(AppiumDriver driver) {
	try {
	element= driver.findElement(By.id("add"));
	Log.info("Add element found ");
	return element;
	}
	catch(NoSuchElementException e) {
		Log.error("add element found" +e.getMessage());
	}
	return null;
}

WebElement ElipseMoreOption(AppiumDriver driver) {
	try {
	element=driver.findElement(By.xpath("//*[@content-desc='More options']"));
	Log.info("More Element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not More options element found" +e.getMessage());
	}
	return null;
	}


	
}
