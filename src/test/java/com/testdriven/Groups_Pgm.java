package com.testdriven;

import org.testng.annotations.Test;

public class Groups_Pgm {
	@Test(groups = "Sports")
	private void cricket() {
		 System.out.println("Cricket");
	}
	@Test(groups = "Sports")
	private void hockey() {
         System.out.println("Hockey");
     }
	@Test(groups = "Sports")
	private void football() {
         System.out.println("Football");
     }
	@Test(groups = "Subjects")
	private void physics() {
		System.out.println("Physics");	
	}
	@Test(groups = "Subjects")
	private void chemistry() {
        System.out.println("Chemistry");
	}
	
	

}
