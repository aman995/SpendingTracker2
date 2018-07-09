package com.Spending.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import com.Spending.utility.Log;
import io.appium.java_client.AppiumDriver;

public class Home_Page_Spending {
	
	
static  WebElement element = null;

public  WebElement balance(AppiumDriver driver) {
	try {
	element =driver.findElement(By.id("balance"));
	Log.info("Balance Element found ");
			return element ;}
	catch(NoSuchElementException e) {
		Log.error("Not balance element found" +e.getMessage());
	}
	return null;
}

public WebElement addExpence (AppiumDriver driver)
{
	try {
element =driver.findElement(By.id("addExpense"));
Log.info("Add Expence Element found");

return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Add Expence  element found" +e.getMessage());
	}
	return null;
	
}
	
public WebElement addIncome(AppiumDriver driver) 
{
    try {
	element =driver.findElement(By.id("addIncome"));
	Log.info("AddIncome Element found");
	return element;
    }catch(NoSuchElementException e) {
		Log.error("Not AddIncome element found" +e.getMessage());
	}
	return null;

		
}

public WebElement transactions(AppiumDriver driver) {
	
	try {
element =	 driver.findElement(By.xpath("//*[@text='Transactions']"));

Log.info("Transaction element found");
	 
return element;	
	}catch(NoSuchElementException e) {
		Log.error("Not Transaction element found" +e.getMessage());
	}
	return null;
}

public WebElement categories(AppiumDriver driver)

{try {
element = driver.findElement(By.xpath("//*[@text='Categories']"));

Log.info("Categories element found ");

return element;
}

catch(NoSuchElementException e) {
	Log.error("Not Categories element found" +e.getMessage());
}
return null;
}

public WebElement Accounts(AppiumDriver driver)
{
	try {
element = driver.findElement(By.xpath("//*[@text='Accounts']"));

Log.info("Account element found");

return element;}
	catch(NoSuchElementException e) {
		Log.error("Not Accounts element found" +e.getMessage());
	}
	return null;
}

public WebElement Spending(AppiumDriver driver)

{
	try {
element = driver.findElement(By.xpath("//*[@text='Spending']"));
Log.info("Spending Element found");

return element;
	}catch(NoSuchElementException e) {
		Log.error("Not Spending element found" +e.getMessage());
	}
	return null;

}

public WebElement RightArrow(AppiumDriver driver)
{
	try {
element = driver.findElement(By.xpath("//*[@text='>']"));

Log.info("Right Arrow Eleemnt found ");

return element;
}
	catch(NoSuchElementException e) {
	Log.error("Not RightArrow element found" +e.getMessage());
}
return null;

}


public WebElement LeftArrow(AppiumDriver driver) {
	
	try {
element = 	driver.findElement(By.xpath("//*[@text='<']"));
	Log.info("Left arrow Element found ");
	return element;
	}
	catch(NoSuchElementException e) {
		Log.error("Not Left Arrow element found" +e.getMessage());
	}
	return null;
	
}

public WebElement DateRange(AppiumDriver driver) {
	try {
	element = driver.findElement(By.id("dateRange"));
	Log.info("Date rage Element found ");
	return element;
	}
	catch(NoSuchElementException e) {
		Log.error("Not Date range element found" +e.getMessage());
	}
	return null;
	
}

public WebElement ElipseMoreOption(AppiumDriver driver)
{
	try {
	
element = driver.findElement(By.xpath("[@content-desc='More options']"));

Log.info("More Option element found");

return element;

}catch(NoSuchElementException e) {
	Log.error("Not More Option  element found" +e.getMessage());
}
return null;


}


}