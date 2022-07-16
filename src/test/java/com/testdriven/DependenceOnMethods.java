package com.testdriven;

import org.testng.annotations.Test;

public class DependenceOnMethods {
	
	@Test(dependsOnMethods = "mobileOffer")
	private void diwaliOffer() {
		System.out.println("Diwali Offer");
	}
	@Test
	private void mobileOffer() {
		System.out.println("Mobile Offer");
	}
	@Test
	private void laptopOffer() {
		System.out.println("Laptop Offer");
	}

}
