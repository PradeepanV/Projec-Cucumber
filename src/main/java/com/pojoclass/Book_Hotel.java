package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditcardnumber;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement creaditcardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement booknowbutton;

	public WebElement getBooknowbutton() {
		return booknowbutton;
	}

	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}

	public WebElement getCreaditcardtype() {
		return creaditcardtype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

}
