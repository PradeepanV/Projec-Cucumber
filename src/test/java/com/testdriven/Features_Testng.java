package com.testdriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Features_Testng {
	
	WebDriver driver;
	@BeforeSuite(groups = "browser launch")
	private void setproperty() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	}
	@BeforeTest(groups = "browser launch")
	private void browserlaunch() {
		driver = new ChromeDriver();
	}
	@BeforeClass(groups = "browser launch")
	private void geturl() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test(priority = -2,invocationCount = 3,groups = "browser launch")
	private void refresh() {
		driver.navigate().refresh();
	}
	@Test(priority = -1,groups = "validcredentials")
	private void validcredentials() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("pradeep321");
		driver.findElement(By.id("password")).sendKeys("9T40ZB");
		driver.findElement(By.id("login")).click();
		System.out.println("login successfull");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@Ignore
	@Test(groups = "invalidcredentials")
	private void invalidusername() {
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
		driver.findElement(By.id("username")).sendKeys("PRADEEPAN33");
		driver.findElement(By.id("password")).sendKeys("9T40ZB");
		driver.findElement(By.id("login")).click();
		System.out.println("loginfailed1");
	}
	@Test(groups = "invalidcredentials",enabled = false)
	private void invalidpassword() {
		driver.findElement(By.id("username")).sendKeys("pradeep321");
		driver.findElement(By.id("password")).sendKeys("95556");
		driver.findElement(By.id("login")).click();
		System.out.println("loginfailed2");
	}
	@Test(priority = 1,groups = "Search Hotel")
	private void hotellocation() {
		WebElement e1 = driver.findElement(By.id("location"));
		Select s = new Select(e1);
		s.selectByIndex(4);
	}

	@Test(priority = 2,dependsOnMethods = "hotellocation",groups = "Search Hotel")
	private void hotels() {
		WebElement e2 = driver.findElement(By.id("hotels"));
		Select hotels = new Select(e2);
		hotels.selectByIndex(2);
	}
	@Test(priority = 3,groups = "Search Hotel")
	private void roomtype() {
	WebElement e3 = driver.findElement(By.cssSelector("[name='room_type']"));
	Select roomtype = new Select(e3);
	roomtype.selectByIndex(1);
	}
	@Test(priority = 4,groups = "Search Hotel")
	private void rooms() {
		WebElement e4 = driver.findElement(By.cssSelector("[id='room_type']"));
		Select rooms = new Select(e4);
		rooms.selectByIndex(1);
	}
	@Test(priority = 5,groups = "Search Hotel")
	private void inoutdate() {
		WebElement d4 = driver.findElement(By.id("datepick_in"));
		d4.clear();
		d4.sendKeys("02/07/2022");
		WebElement d5 = driver.findElement(By.id("datepick_out"));
		d5.clear();
		d5.sendKeys("03/07/2022");
	}
	@Test(timeOut = 5000,priority = 6,groups = "Search Hotel")
	private void search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 7,groups = "Select Hotel")
	private void selecthotel() throws InterruptedException, IOException {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.cssSelector("#continue")).click();
		
		driver.findElement(By.cssSelector("input#first_name")).sendKeys("pradeepan");
		driver.findElement(By.name("last_name")).sendKeys("V");
		driver.findElement(By.id("address")).sendKeys("1,abcd");
		driver.findElement(By.id("cc_num")).sendKeys("4567456745674567");
		WebElement d6 = driver.findElement(By.id("cc_type"));
		Select cct = new Select(d6);
		cct.selectByIndex(3);
		WebElement d7 = driver.findElement(By.id("cc_exp_month"));
		Select exp= new Select(d7);
		exp.selectByIndex(3);
		WebElement d8 = driver.findElement(By.id("cc_exp_year"));
		Select expm = new Select(d8);
		expm.selectByValue("2021");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\viji\\eclipse-workspace\\8am_Batch\\Project\\Evidence\\adactin-TestNg.png");
		FileUtils.copyFile(source, destination);
	}
	
	
	
}
