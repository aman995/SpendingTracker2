package com.Spending.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;

public class Expence_Income {

static WebElement element = null;


public WebElement transactionDate (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("transactionDate"));
	Log.info("transaction date element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("Transaction date element not found" +e.getMessage());
	}
	return null;
	}

public WebElement transactionCategory (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("transactionCategory"));
	Log.info("transaction Category element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("transaction Category element not found" +e.getMessage());
	}
	return null;
	}

public WebElement transactionAmount (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("transactionAmount"));
	Log.info("transaction Amount element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("transaction Amount element not found" +e.getMessage());
	}
	return null;
	}

public WebElement transactionRepeat (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("transactionRepeat"));
	Log.info("transaction Repeat element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("transaction Repeat element not found" +e.getMessage());
	}
	return null;
	}

public WebElement transactionNote (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("transactionNote"));
	Log.info("transaction  Note element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("transaction Note element not found" +e.getMessage());
	}
	return null;
	}

public WebElement repeatingDetailsHelp (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("repeatingDetailsHelp"));
	Log.info("repeating Details Help element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("repeating Details Help element not found" +e.getMessage());
	}
	return null;
	}

public WebElement transactionDetailsHelp (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("transactionDetailsHelp"));
	Log.info("transaction Details Help element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("transaction Details Help element not found" +e.getMessage());
	}
	return null;
	}

public WebElement save_transaction (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("save_transaction"));
	Log.info("save transaction element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("save transaction element not found" +e.getMessage());
	}
	return null;
	}

public WebElement income (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("income"));
	Log.info("income  element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("income element not found" +e.getMessage());
	}
	return null;
	}


public WebElement Expense (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.id("expense"));
	Log.info("expense  element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("expense element not found" +e.getMessage());
	}
	return null;
	}

public WebElement Navigateup (AppiumDriver driver)
{
	try {
	element= driver.findElement(By.xpath("//*[@content-desc='Navigate up']"));
	Log.info("cancel button element found");
	return element;
	}catch(NoSuchElementException e)
	{
		Log.error("cancel button  element not found" +e.getMessage());
	}
	return null;
	}


	
}
