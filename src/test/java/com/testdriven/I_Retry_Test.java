package com.testdriven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Retry_Test {
	
	@Test
	private void credentials1() {
		String expected = "ram";
		String actual = "ram";
		Assert.assertEquals(actual, expected);
	}
	@Test(retryAnalyzer = Retry_Class.class)
	private void credentials2() {
		String expected = "jai";
		String actual= "ram";
		Assert.assertEquals(actual, expected);
		
	}

}
