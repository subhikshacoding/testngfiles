package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Praecticaltwo {
	
	private WebDriver driver;
	
	@BeforeTest
	private void beforetest() {
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://adactinhotelapp.com/");
		
		

	}
	@BeforeMethod
	private void beforemethod() {
		
		long tm = System.currentTimeMillis();
		System.out.println(tm);

	}
	@Test
	private void test01() {
		
		driver.findElement(By.id("username")).sendKeys("subhiksha");
		driver.findElement(By.id("password")).sendKeys("subhiksha31@M");
		driver.findElement(By.id("login")).click();

		
	}
	
	@AfterMethod
	private void aftermethod() {
		
		long tms = System.currentTimeMillis();
		System.out.println(tms);

	}
	
	@AfterTest
	private void aftertest() {

		driver.quit();
	}
}
