package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	
	@BeforeSuite
	private void beforesuite() {
		
		System.out.println("before suite");

	}
	@AfterSuite
	private void aftersuite() {
		
		System.out.println("after suite");
	}
	@BeforeClass
	private void beforeclass() {

		System.out.println("before class");
	}
	
	@AfterClass
	private void afterclass() {
		
		System.out.println("after class");

	}
	@BeforeMethod
	private void beforemethod() {

		System.out.println("before method");
	}
	@AfterMethod
	private void aftermethod() {

		System.out.println("after method");
	}
	@BeforeTest
	private void beforetest() {

		System.out.println("before test");
	}
	@AfterTest
	private void aftertest() {

		System.out.println("after test");
	}

	@Test
	private void test02() {
		System.out.println("test 02");
	}
}
