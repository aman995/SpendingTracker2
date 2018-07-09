package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class TimePeriod {
WebElement element = null;

WebElement weekly(AppiumDriver driver) {
	try {
		element=driver.findElement(By.id("weekly"));
	
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not weekly element found" +e.getMessage());
	}
	return null;
}

WebElement help(AppiumDriver driver) {
	try {
		element=driver.findElement(By.id("help"));
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not helps element found" +e.getMessage());
	}
	return null;
}

WebElement monthly(AppiumDriver driver) {
	try {
		element=driver.findElement(By.id("monthly"));
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not monthly element found" +e.getMessage());
	}
	return null;
}

WebElement yearly(AppiumDriver driver) {
	try {
		element=driver.findElement(By.id("yearly"));
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not yearly element found" +e.getMessage());
	}
	return null;
}

WebElement monthStartDay(AppiumDriver driver) {
	try {
		element=driver.findElement(By.id("monthStartDay"));
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not monthStartday element found" +e.getMessage());
	}
	return null;
}
}
