package com.testdriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@DataProvider
	private Object[][] login(){
		return new Object[][] {
			{"pradeep321","9T40ZB"},
			{"abcd","12345"}
		};
		
	}
	
	@Test(dataProvider = "login")
	private void credentials(String name,String pass) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("username"));
		e1.sendKeys(name);
		WebElement e2 = driver.findElement(By.id("password"));
		e2.sendKeys(pass);
		driver.findElement(By.id("login")).click();
	}
}
