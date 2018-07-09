package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class LongPressBar {
static WebElement element ;
 
public WebElement Add(AppiumDriver driver) {
	try {
	element = driver.findElement(By.id("add"));
	Log.info("Add  Element found");
	return element;
	}catch(NoSuchElementException e){
		Log.error("Not Add element found" +e.getMessage());
	}
	
	return null;} 

public WebElement Delete(AppiumDriver driver) {
	try {
	element = driver.findElement(By.xpath("//*[@content-desc='More options']"));
	Log.info("Add  Element found");
	return element;
	}catch(NoSuchElementException e){
		Log.error("Not Add element found" +e.getMessage());
	}
	
	return null;} 

}
