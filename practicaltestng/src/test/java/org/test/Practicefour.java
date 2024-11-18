package org.test;

import org.testng.annotations.Test;

public class Practicefour {
	
	
	@Test(groups = {"smoke","sanity"})
	private void test01() {

		System.out.println("test01 login");
	}
	
	@Test(groups = {"smoke"})
	private void test02() {

		System.out.println("test02 signup");

	}
	@Test(groups= {"sanity"})
	private void test03() {

		System.out.println("test03 main page");

	}
	@Test(groups="sanity")
	private void test04() {

		System.out.println("test04 main page");

	}
	@Test(groups= {"regression"})
	private void test05() {

		System.out.println("test05");

	}
	@Test(groups= {"regression"})
	private void test06() {

		System.out.println("test06");

	}

}
