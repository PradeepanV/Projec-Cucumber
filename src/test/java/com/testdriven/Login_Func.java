package com.testdriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Func {
	WebDriver driver;
	@BeforeSuite(groups = "systemproperty")
	private void setproperty() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	}
	@BeforeTest(groups = "driver")
	private void browserlaunch() {
		driver = new ChromeDriver();
	}
	@BeforeClass(groups = "url")
	private void geturl() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test(priority = 0,groups = "validcredentials")
	private void validcredentials() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("pradeep321");
		driver.findElement(By.id("password")).sendKeys("9T40ZB");
		driver.findElement(By.id("login")).click();
		System.out.println("login successfull");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@Test(priority = 1,groups = "invalidusername")
	private void invalidusername() {
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
		driver.findElement(By.id("username")).sendKeys("PRADEEPAN33");
		driver.findElement(By.id("password")).sendKeys("9T40ZB");
		driver.findElement(By.id("login")).click();
		System.out.println("loginfailed1");
	}
	@Test(priority = 2,groups = "invalidpassword")
	private void invalidpassword() {
		driver.findElement(By.id("username")).sendKeys("pradeep321");
		driver.findElement(By.id("password")).sendKeys("95556");
		driver.findElement(By.id("login")).click();
		System.out.println("loginfailed2");
	
	}
	
	
	
	
}
