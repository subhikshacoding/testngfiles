package org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sixtwo {
	
	
	@Test
	@Parameters("name2")
	private void test01(String v) {

		System.out.println("name is"+v);
	}
	@Test
	@Parameters("ug")
	private void test02(String ug) {

			System.out.println(" clg is"+ug);
	}

}
