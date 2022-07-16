package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver; // null driver

	@FindBy(id = "location") 
	private WebElement location; 
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "datepick_in")
	private WebElement checkindate;
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	@FindBy(id = "adult_room")
	private WebElement adultperroom;
	@FindBy(id = "child_room")
	private WebElement childrenperroom;
	@FindBy(id = "Submit")
	private WebElement searchhotelsubmit;
	@FindBy(id = "room_nos")
	private WebElement numberofrooms;

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSearchhotelsubmit() {
		return searchhotelsubmit;
	}

	public Search_Hotel(WebDriver driver2) { // parameterized constructor
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

}
