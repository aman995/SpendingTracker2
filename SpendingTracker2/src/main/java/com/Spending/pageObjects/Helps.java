package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class Helps {
static WebElement element = null;

WebElement Navigate(AppiumDriver driver)
{
	try {
		element=driver.findElement(By.xpath("//*[@content-desc='Navigate up']"));
Log.info("Navigate up element found");
return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Navigate up element found" +e.getMessage());
	}
	return null;
}
}
