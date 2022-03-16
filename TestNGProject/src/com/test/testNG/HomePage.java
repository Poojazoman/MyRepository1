package com.test.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	/*@BeforeMethod
	public void Precondition(){
		System.out.println("Home page before method");
	}*/
	@Test
	public void TC1(){
		System.out.println("I am Home page test case method");
	}
	/*@AfterMethod
	public void AfterCondition(){
		System.out.println("Home page after method");
	}*/
}
