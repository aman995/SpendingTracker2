package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class IncomeExpenceCategory {

WebElement element = null;

public WebElement Search (AppiumDriver driver) {
try {
	element = driver.findElement(By.id("search_src_text"));
	Log.info("Search Text Element found");
	return element;	
}catch(NoSuchElementException e) {
	
	Log.error("Search text not  element found "+e);
}
return null;
	

}
	

public WebElement BackButton (AppiumDriver driver) {
try {
	element = driver.findElement(By.xpath("//*[@content-desc='Navigate up']"));
	Log.info("Back button  Element found");
	return element;	
}catch(NoSuchElementException e) {
	
	Log.error("Back button  element not found "+e);
}
return null;
	

}
	
public WebElement TypeExpence (AppiumDriver driver) {
try {
	element = driver.findElement(By.xpath("//*[@text='Clothes']"));
	Log.info("Type Expence  Element found");
	return element;	
}catch(NoSuchElementException e) {
	
	Log.error("Type Expence  element not  found "+e);
}
return null;
	

}


public WebElement TypeIncome (AppiumDriver driver) {
try {
	element = driver.findElement(By.xpath("//*[@text='Salary']"));
	Log.info("TypeIncome  Element found");
	return element;	
}catch(NoSuchElementException e) {
	
	Log.error("TypeIncome  element not  found "+e);
}
return null;
	

}


}
