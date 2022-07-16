package com.testdriven;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	private void expectedexception() {
		int a= 10;
		int b=0;
		int c = a/b;
		System.out.println(c);
	}

}
