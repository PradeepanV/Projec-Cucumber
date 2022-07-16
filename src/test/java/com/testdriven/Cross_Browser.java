package com.testdriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Cross_Browser {
	
	@DataProvider
	private Object[][] login(){
		return new Object[][] {{ "pradeep321","9T40ZB"}
		};
	}
	WebDriver driver;
	@Test(dataProvider = "login")
	private void chrome(String username,String password) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login")).click();
	}
	
	@Test(dataProvider = "login")
	private void firefox(String username, String password) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\viji\\eclipse-workspace\\8am_Batch\\Project\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		
	}
	

}
