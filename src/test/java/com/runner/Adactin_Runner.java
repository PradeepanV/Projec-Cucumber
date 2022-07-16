package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test//java//com//featurefile//Adactin.feature", glue = "com.stepdefinition", monochrome = true,
dryRun = false, 
plugin = {
		"html:Reports/htmlreport.html", "json:Reports/jsonreport.json",
//		"com.cucmber.listener.ExtenCucumberFormatter:Reports/extentreport.html"

}

)

public class Adactin_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = BaseClass.getBrowser("chrome");
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
