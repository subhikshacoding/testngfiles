package org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practicesix {
	
	
	@Test
	@Parameters("name1")

	private void test01(String s) {

		System.out.println("name is"+s);
	}
	
	@Test
	@Parameters("ug")

	private void test02(String s) {

		System.out.println("clg is "+s);

	}
	

}
