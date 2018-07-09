package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class AddNewCategories {

	WebElement element = null;
	
	public WebElement SaveCategories(AppiumDriver driver) {
		try {
	element= 	driver.findElement(By.id("save_transaction"));
		Log.info("SaveCategories element found ");
		return element;
		}catch(NoSuchElementException e) {
			Log.error(" SaveCategories element not found" +e.getMessage());
		}
		return null;
		
	}
	
	public WebElement CategoryName(AppiumDriver driver) {
		try {
element= 		driver.findElement(By.id("categoryName"));
		Log.info("categoryName element found ");
		return element;
		}catch(NoSuchElementException e) {
			Log.error("categoryName element found" +e.getMessage());
		}
		return null;
		
	}
	
	public WebElement categoryColourText(AppiumDriver driver) {
		try {
	element= 	driver.findElement(By.id("categoryColourText"));
		Log.info("categoryColourText element found ");
		return element;
		}catch(NoSuchElementException e) {
			Log.error("Not categoryColourText element found" +e.getMessage());
		}
		return null;
		
	}
	
	public WebElement categoryIcon(AppiumDriver driver) {
		try {
	element= 	driver.findElement(By.id("categoryIcon"));
		Log.info("categoryIcon element found ");
		return element;
		}catch(NoSuchElementException e) {
			Log.error("Not categoryIcon element found" +e.getMessage());
		}
		return null;
		
	}
	
	public WebElement categoryDetailsHelp(AppiumDriver driver) {
		try {
	element=	driver.findElement(By.id("save_transaction"));
		Log.info("categoryDetailsHelp element found ");
		return element;
		}catch(NoSuchElementException e) {
			Log.error("Not categoryDetailsHelp element found" +e.getMessage());
		}
		return null;
		
	}
	
	public WebElement Cancel(AppiumDriver driver) {
		try {
	element=	driver.findElement(By.xpath("//*[@content-desc='Navigate up']"));
		Log.info("Add element found ");
		return element;
		}catch(NoSuchElementException e) {
			Log.error("Not Add element found" +e.getMessage());
		}
		return null;
		
	}
	
	
	
}
