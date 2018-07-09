package com.Spending.Sanity;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.NotFoundException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Spending.AppiumConfiguration.AppiumManager;
import com.Spending.appModule.TouchActionLib;
import com.Spending.pageObjects.Accounts;
import com.Spending.pageObjects.AddNewCategories;
import com.Spending.pageObjects.Categories;
import com.Spending.pageObjects.Expence_Income;
import com.Spending.pageObjects.Helps;
import com.Spending.pageObjects.Home_Page_Spending;
import com.Spending.pageObjects.IncomeExpenceCategory;
import com.Spending.pageObjects.LongPressBar;
import com.Spending.pageObjects.TimePeriod;
import com.Spending.pageObjects.Transaction;
import com.Spending.utility.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.Setting;

public class SanityTestcaseRun extends Log {

public	AppiumDriver  driver;
	
Home_Page_Spending homePageSpending ;

Setting setting;

Accounts accounts;

Categories categories;

Helps helps;

TimePeriod timePeriod;

Transaction transaction;

IncomeExpenceCategory incomeExpenceCategory;

Expence_Income expenceIncome;

AppiumManager Appmanager = new  AppiumManager();

AddNewCategories AddNewCategories;

TouchActionLib touchAction;

LongPressBar longpressbar;


@Parameters({"deviceName_","UDID_","platformVersion_","URL_","callbackPort_","BootstrapPort_","Port_","Ipaddress_"})
@BeforeTest
void AppiumStarting(String deviceName_,  String UDID_ ,String platformversion_,String URL_,String callbackPort_,String BootstrapPort_,int Port_, String Ipaddress_){
	
	try {

	driver= Appmanager.AppuimServerStarting(deviceName_,UDID_,platformversion_,URL_,callbackPort_,BootstrapPort_,Port_,Ipaddress_);
	Log.info("Apppium Manger Start");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Log.info("implicit wait");
	}catch(NotFoundException e) {
		Log.error("Not able to start appium" + e.getMessage());
	}
	
 
}
 
@Test(priority=0)
void PageObjectCreation(){
	homePageSpending = new Home_Page_Spending();
	Log.info("HomePageSpending page Object creation");
	
	expenceIncome = new Expence_Income();
	Log.info("ExpenceIncome page object created ");
	
	incomeExpenceCategory  = new IncomeExpenceCategory();
	
	Log.info("incomeExpenceCategory page object created");
	
	transaction=new Transaction();
	Log.info("transaction object created");
	categories= new Categories();
	
	Log.info("Categories object created");
	AddNewCategories = new AddNewCategories();
	
	Log.info("Add new categories object created");
	
	touchAction = new TouchActionLib();
	
	Log.info("Touch Action class object created");
	
	longpressbar = new LongPressBar();
}

@Test(priority=1)
void TestCase001() throws Exception {
	Log.startTestCase("test case 001");

Log.info("Home Spending Object created");
homePageSpending.balance(driver).click();
Log.info("Clicking on banner");
homePageSpending.addIncome(driver).click();
Log.info("clicking on income");

Log.info("Expence_Income Object created ");

expenceIncome.transactionCategory(driver).click();

Log.info("click on transaction category");


Log.info("IncomeExpenceCategory Object Created");
incomeExpenceCategory.TypeIncome(driver).click();

 Log.info("Salary Selected");
expenceIncome.transactionAmount(driver).sendKeys("2000000");

Log.info("Amount entered");

expenceIncome.save_transaction(driver).click();
 Log.info("Click on donebutton");
 
 Log.endTedstCaseName("Test case 001");

}


@Test(priority=2)
void testCase002() {
	Log.startTestCase("Test Case 002 started");
	 homePageSpending.addExpence(driver).click();
	 Log.info("click on add expence");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeExpence(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.save_transaction(driver).click();
	 Log.info(" click on save button");
	 Log.endTedstCaseName("Test case 002 ended");
	
	
}

@Test(priority =3)
void testCase003() {
	Log.startTestCase("Test Case 003 started");
	homePageSpending.LeftArrow(driver).click();
	Log.info("Click on back button");
	 homePageSpending.addExpence(driver).click();
	 Log.info("click on add expence");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeExpence(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.save_transaction(driver).click();
	 Log.info(" click on save button");
	 Log.endTedstCaseName("Test case 003 ended");
	
	
}

@Test(priority=4)
void testCase004() {
	Log.startTestCase("Test Case 004 started");
	for(int i=0;i<=1;i++) {
	homePageSpending.RightArrow(driver).click();
	Log.info("Click on right button");
	}
	
	 homePageSpending.addExpence(driver).click();
	 Log.info("click on add expence");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeExpence(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.save_transaction(driver).click();
	 Log.info(" click on save button");
	 Log.endTedstCaseName("Test case 004 ended");
	
	
}

@Test(priority=5)
void testCase005() {
	Log.startTestCase("Test case started 005");
	
	homePageSpending.transactions(driver).click();
	Log.info("CLICK ON TRANSACTION");
	transaction.add(driver).click();
	 
	 Log.info("click on add button");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeExpence(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.save_transaction(driver).click();
	 Log.info(" click on save button");
	 Log.endTedstCaseName("Test case 005 ended");
	
	
}

@Test(priority=6)
void testCase006() {
	Log.startTestCase("Test case 006 started  ");
	
	transaction.add(driver).click();
	 
	 Log.info("click on add button");
	 expenceIncome.income(driver).click();
	 Log.info("click on income button");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeIncome(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.save_transaction(driver).click();
	 Log.info(" click on save button");
	 Log.endTedstCaseName("Test case 006 ended");
	
	
}

@Test(priority=7)
void testCase007() {
	
	Log.startTestCase("test case 007 started");
	transaction.add(driver).click();
	 
	 Log.info("click on add button");
	 expenceIncome.income(driver).click();
	 Log.info("click on income button");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeIncome(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.save_transaction(driver).click();
	 Log.info(" click on save button");
	 Log.endTedstCaseName("Test case 007 ended");
	
	
}

@Test(priority=8)
void testCase008() {
	
	Log.startTestCase("test case 008 started");
	transaction.add(driver).click();
	 
	 Log.info("click on add button");
	 expenceIncome.income(driver).click();
	 Log.info("click on income button");
	 expenceIncome.transactionCategory(driver).click();
	 Log.info("Click on expence category");
	 incomeExpenceCategory.TypeIncome(driver).click();
	 Log.info("Select expence category");
	 expenceIncome.transactionAmount(driver).sendKeys("5000");
	 Log.info("Enter amount");
	 expenceIncome.Navigateup(driver).click();
	 Log.info(" click on cancel  button");
	 Log.endTedstCaseName("Test case 008 ended");
	
	
}

@Test(priority=9)
void testCase009() {
	
	Log.startTestCase("test case 009 started");
	homePageSpending.categories(driver).click();
	Log.info("click on categoris button ");
	categories.add(driver).click();
	Log.info("Click on add button");
	AddNewCategories.CategoryName(driver).sendKeys("Firstone");
	Log.info("entered name");
	AddNewCategories.SaveCategories(driver).click();
	Log.info("Cliked on save button");
	 Log.endTedstCaseName("Test case 009 ended");
	
	
}

@Test(priority=10)
void testCase010() {
	
	Log.startTestCase("test case 010 started");
	categories.income(driver).click();
	Log.info("click on income tab" );
	categories.add(driver).click();
	Log.info("click on add categories tab");
	AddNewCategories.CategoryName(driver).sendKeys("Firstone");
	Log.info("Enter categories");
	AddNewCategories.SaveCategories(driver).click();
	Log.info("click on save button");
	 Log.endTedstCaseName("Test case 010 ended");
	
	
}

@Test(priority=11)
void testCase011() {
	
	Log.startTestCase("test case 010 started");
	categories.expence(driver).click();
	categories.add(driver).click();
	AddNewCategories.CategoryName(driver).sendKeys("Firstone");
	AddNewCategories.Cancel(driver).click();
	 Log.endTedstCaseName("Test case 011 ended");
	
	
}

@Test(priority=12)
void testCase012() {
	
	Log.startTestCase("test case 012 started");
	categories.income(driver).click();
	Log.info("Click on income tab");
	categories.add(driver).click();
	Log.info("click on add button");
	AddNewCategories.CategoryName(driver).sendKeys("Firstone");
	Log.info("enter categories");
	AddNewCategories.Cancel(driver).click();
	Log.info("Click on cancel button ");
	 Log.endTedstCaseName("Test case 012 ended");
	
	
}



/*
@Test(priority=1)
void TestTouchAction() throws InterruptedException {
	Log.startTestCase("Test Touch class");
	
	for(int i=0;i<=2;i++) {
	touchAction.SwipeRightToLeft(driver);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Log.endTedstCaseName("Test Touch class");
	
	}
	
}



@Test
void LogPressCheck() throws InterruptedException {
	Log.startTestCase("LongPress touch class");
	homePageSpending.categories(driver).click();
	Log.info("click on categories");
touchAction.LongPress(driver, incomeExpenceCategory.TypeExpence(driver));
Log.info("Log Press touch successfull");
longpressbar.Delete(driver).click();
	Log.endTedstCaseName("LogPress Touch class end");
}



@Test(priority=1)
void changeMode() throws IOException {
homePageSpending.balance(driver).click();
	
touchAction.ScreenShot(driver);

}

*/
@AfterTest
void AppiumStoping() {
	Appmanager.AppiumServerStoping();
	Log.info("Stop appium server");
	
}


}
