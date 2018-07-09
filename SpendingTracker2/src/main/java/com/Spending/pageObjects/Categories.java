package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class Categories {
WebElement element =null;

public WebElement add(AppiumDriver driver) {
	try {
	element= driver.findElement(By.id("add"));
	Log.info("Add element found ");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Add element found" +e.getMessage());
	}
	return null;
	
}

public WebElement expence(AppiumDriver driver) {
	try {
	element= driver.findElement(By.id("expense"));
	Log.info("Expence element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Expence element found" +e.getMessage());
	}
	return null;
}

public WebElement income(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.id("income"));
	Log.info("income element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Income element found" +e.getMessage());
	}
	return null;
	}

public WebElement ElipseMoreOption(AppiumDriver driver) {
	try {
		element=	driver.findElement(By.xpath("//*[@content-desc='More options']"));
	Log.info("More options element found");
	return element;
	}catch(NoSuchElementException e) {
		Log.error("Not More options element found" +e.getMessage());
	}
	return null;
	}

}
