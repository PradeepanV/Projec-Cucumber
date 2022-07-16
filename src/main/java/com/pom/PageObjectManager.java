package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojoclass.Book_Hotel;
import com.pojoclass.Login_Page;
import com.pojoclass.My_Itinerary;
import com.pojoclass.Search_Hotel;
import com.pojoclass.Select_Hotel;

public class PageObjectManager {
	public static WebDriver driver;

	private Login_Page lp;
	private Search_Hotel sh;
	private Select_Hotel selh;
	private Book_Hotel bh;
	private My_Itinerary mi;

	public My_Itinerary getMi() {
		mi = new My_Itinerary(driver);
		return mi;
	}

	public Select_Hotel getSelh() {
		selh = new Select_Hotel(driver);
		return selh;
	}

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Book_Hotel getBh() {
		bh = new Book_Hotel(driver);
		return bh;
	}

	public Login_Page getLp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Search_Hotel getSh() {
		sh = new Search_Hotel(driver);
		return sh;
	}

//	Login_Page lp = new Login_Page(driver);

//	Search_Hotel sh = new Search_Hotel(driver);
}
