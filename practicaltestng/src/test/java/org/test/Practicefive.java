package org.test;

import org.testng.annotations.Test;

public class Practicefive {
	
	
	@Test(description = "test one will always run first")
	private void test01() {

		System.out.println("test 01");
	}
	
	
	@Test( dependsOnMethods = "test01",invocationCount = 2,invocationTimeOut = 10)
	private void test02() {

		System.out.println("test 02");

	}
	@Test(  dependsOnMethods = "test02",timeOut = 10)
	private void test03() {

		System.out.println("test 03");

	}
	

}
