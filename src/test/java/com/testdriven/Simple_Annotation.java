package com.testdriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@Test
	private void men() {
		System.out.println("men");
	}
	
	@Test(priority = 10)
	public void women() {
	System.out.println("women");
	}
	
	@Test(priority = 20)
	public void child() {
		System.out.println("child");
		
	}
	@BeforeMethod
	public void signin() {
		System.out.println("signin");
	}
	@AfterMethod
	public void singout() {
		System.out.println("signout");
	}

}
