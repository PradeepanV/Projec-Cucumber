package com.adactinpractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class AdactinProject_Runner extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		getBrowser("chrome");
		
//		getUrl("https://adactinhotelapp.com/");
//		navigateTo("https://www.facebook.com/");
//		navigateBack();
//		navigateForward();
//		navigateRefresh();
//		WebElement e = driver.findElement(By.id("username"));
//		inputValue(e,"pradeep321");
//		WebElement e1 = driver.findElement(By.id("password"));
//		inputValue(e1, "9T40ZB");
//		WebElement e2 = driver.findElement(By.id("login"));
//		clickOnButton(e2);
//		close();
//		quit();
		
//		getUrl("http://www.leafground.com/pages/Edit.html");
//		getTitle();
//		WebElement e3 = driver.findElement(By.xpath("//label[text()='Enter your email address']"));
//		getText(e3);
		 
//		takesScreenShot("C:\\Users\\viji\\eclipse-workspace\\8am_Batch\\Project\\Evidence\\leaf.png");
		
//		WebElement fe = driver.findElement(By.id("location"));
//		dropDown(fe, "byindex","2");
//		dropDown(fe, "byvisibletext","London");
//		getCurrentUrl();
		
//		WebElement element = driver.findElement(By.id("email"));
//		inputValue(element, "ram");
//		getAttribute(element);

//		getUrl("http://www.leafground.com/pages/radio.html");
//		WebElement element = driver.findElement(By.id("yes"));
//		radioButton(element);
//		clickOnButton(element);
		
//		getUrl("http://www.leafground.com/pages/Dropdown.html");
//		WebElement element = driver.findElement(By.cssSelector("[name='dropdown2']"));
//		isMultiple(element);
		
		
		
//		getUrl("http://www.leafground.com/pages/Dropdown.html");
//		WebElement element = driver.findElement(By.cssSelector("[name='dropdown2']"));
//		dropDown(element, "byindex", "2");
//		getFirstSelectedOption(element);
		
//		getUrl("http://www.leafground.com/pages/Dropdown.html");
//		WebElement element = driver.findElement(By.cssSelector("[name='dropdown2']"));
//		getoptions(element);
		
//		getUrl("http://www.leafground.com/pages/Dropdown.html");
//		WebElement element = driver.findElement(By.cssSelector("[name='dropdown2']"));
//		getoptions(element);
//		getAllSelectedOptions(element);          
		
//		getUrl("https://www.amazon.in/");                                //scroll up & down
//		scroll("window.scrollBy(0,4000)","");
		
//		getUrl("https://www.amazon.in/");
//		implicitWait(60, TimeUnit.SECONDS);
//		scroll("window.scrollBy(0,4000)","");
		
//		getUrl("http://www.leafground.com/pages/radio.html");
//		WebElement element = driver.findElement(By.id("yes"));
//		explicitWait(element);
		
//		getUrl("http://www.leafground.com/pages/Edit.html");
//		WebElement element = driver.findElement(By.xpath("//input[@value='Append ']"));
//		isDisplayed(element);
//		isSelected(element);
//		isEnabled(element);
		
//		getUrl("http://www.leafground.com/pages/checkbox.html");
//		WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//		chechBox(element);
		
		getUrl("http://www.leafground.com/pages/Alert.html");
//		WebElement element = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
//		alerts(element, "dismiss");
//		alerts(element, "accept");
		WebElement element = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		alertinputvalue(element,"ram", "accept");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
