package com.Spending.AppiumConfiguration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNgtest {

	@BeforeSuite	
public void BeforeSuit() {
	System.out.println("Before suit");
}

	@org.testng.annotations.BeforeTest
public void BeforeTest() {
	System.out.println("BeforeTest ");
}

	@org.testng.annotations.BeforeClass
public void BeforeClass() {
	System.out.println("Before class");
}

	@org.testng.annotations.BeforeMethod
public void BeforeMethod() {
	System.out.println("BeforeMethod");
}

	
	@org.testng.annotations.Test
public void Test() {
	System.out.println("T");
}
	
	@org.testng.annotations.Test
public void test1() {
	System.out.println("tt");
}


	@org.testng.annotations.AfterMethod
public void AfterMethod() {
	System.out.println("AfterMethod suit");
}

	
	@org.testng.annotations.AfterClass
public void AfterClass() {
	System.out.println("AfterClass");
}

@org.testng.annotations.AfterTest
public void AfterTest() {
	System.out.println("After Test");
}


@AfterSuite
public void AfterSuit() {
	System.out.println("After suit");
}








}
