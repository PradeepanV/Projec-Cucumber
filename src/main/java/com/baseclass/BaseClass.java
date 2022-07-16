package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void inputValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void clickOnButton(WebElement element) {
		element.click();
	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
//	public static String getTitle() {
//		String title = null;
//		title = driver.getTitle();
//		System.out.println("Title: "+title);
//		return title;
//	}
	public static void getText(WebElement element) {
		System.out.println("Text: "+element.getText());
	}
	public static void takesScreenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dstn= new File(path);
		FileUtils.copyFile(src, dstn);
	}
	public static void dropDown(WebElement element,String value,String i) {
		Select s = new Select(element);
		if (value.equalsIgnoreCase("byvalue")) {
			s.selectByValue(i);
		}
		else if (value.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(i);
		}
		else if (value.equalsIgnoreCase("byindex")) {
			int j = Integer.parseInt(i);
			s.selectByIndex(j);
			
		}
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurretnUrl: "+currentUrl);
	}
	public static void getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println("Attribute Value: "+attribute);
	}
	public static void radioButton(WebElement element) {
		element.click();
	}
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println("Multidropdown: "+multiple);
	}
	public static void getFirstSelectedOption (WebElement element) {              //check
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("FirstSelectedOption: "+firstSelectedOption.getText());
	}
	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement i : options) {
			System.out.println("GetOptions: "+i.getText());
		}
	}
	public static void getAllSelectedOptions(WebElement element) {                   //check
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement e : allSelectedOptions) {
			System.out.println("GetAllSelectedOpions: "+e.getText());
		}
	}
	public static void scroll(String value,String string) {
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeAsyncScript(value, string);
	}
	public static void implicitWait(long time,TimeUnit unit) {                          //check
		driver.manage().timeouts().implicitlyWait(time, unit);
	}	
	public static void explicitWait(WebElement element) {
		WebDriverWait ew= new WebDriverWait(driver, 30);
		ew.until(ExpectedConditions.visibilityOf(element));
	}
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("Element isdisplayed: "+displayed);
	}	
	public static  void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Element isenabled: "+enabled);
	}	
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("Element isselected: "+selected);
	}	
	public static void chechBox(WebElement element) {
		element.click();
	}	
	public static void alerts(WebElement element, String value) {
		element.click();
		Alert alert = driver.switchTo().alert();
		if (value=="accept") {
			alert.accept();
		}
		else {
			alert.dismiss();
		}
	}	
	public static void alertinputvalue(WebElement element , String value,String r) {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		if (r=="accept") {
			alert.accept();
		}
		else {
			alert.dismiss();
		}
	}	
	public static void iFrame() {
		
		
		
	}
		
	public static void cleardata(WebElement element) {
		element.clear();
	}
		

	
	




}
