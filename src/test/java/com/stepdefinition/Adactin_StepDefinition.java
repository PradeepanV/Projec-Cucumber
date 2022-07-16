package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helperfile.FileReadManager;
import com.pom.PageObjectManager;
import com.runner.Adactin_Runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_StepDefinition extends BaseClass {

	public static WebDriver driver = Adactin_Runner.driver;

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println(name);
	}

	@After
	public void afterHooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			takesScreenShot("C:\\Users\\viji\\eclipse-workspace\\8am_Batch\\AdactinCucumber\\Evidence");
		}
		Status status = s.getStatus();
		System.out.println(status);
	}

	@Given("user is launch the application")
	public void user_is_launch_the_application() throws IOException {
		getUrl(FileReadManager.getInstance_FRM().getInstance_CR().get_Url());
	}

	@When("user is enter the {string} in username field")
	public void user_is_enter_the_in_username_field(String username) {
		inputValue(pom.getLp().getUsername(), username);
	}

	@When("user is enter the {string} in password field")
	public void user_is_enter_the_in_password_field(String password) {
		inputValue(pom.getLp().getPassword(), password);
	}

	@Then("user is enter the submit button")
	public void user_is_enter_the_submit_button() {
		clickOnButton(pom.getLp().getSubmit());

	}

	@When("user is select the location")
	public void user_is_select_the_location() {
		dropDown(pom.getSh().getLocation(), "byindex", "2");

	}

	@When("user is select the hotel")
	public void user_is_select_the_hotel() {
		dropDown(pom.getSh().getHotels(), "byindex", "2");

	}

	@When("user is select the roomtype")
	public void user_is_select_the_roomtype() {
		dropDown(pom.getSh().getRoomtype(), "byvisibletext", "Double");

	}

	@When("user is select the number of rooms")
	public void user_is_select_the_number_of_rooms() {
		dropDown(pom.getSh().getNumberofrooms(), "byindex", "2");

	}

	@When("user is enter check in date")
	public void user_is_enter_check_in_date() {
		cleardata(pom.getSh().getCheckindate());
		inputValue(pom.getSh().getCheckindate(), "18/07/2022");
	}

	@When("user is enter check out date")
	public void user_is_enter_check_out_date() {
		cleardata(pom.getSh().getCheckoutdate());
		inputValue(pom.getSh().getCheckoutdate(), "20/07/2022");

	}

	@When("user is select adults per room")
	public void user_is_select_adults_per_room() {
		dropDown(pom.getSh().getAdultperroom(), "byindex", "2");
	}

	@When("user is select children per room")
	public void user_is_select_children_per_room() {
		dropDown(pom.getSh().getChildrenperroom(), "byindex", "3");
	}

	@Then("user is enter the search button")
	public void user_is_enter_the_search_button() {
		clickOnButton(pom.getSh().getSearchhotelsubmit());
	}

	@When("user is select the checkbox")
	public void user_is_select_the_checkbox() {
		clickOnButton(pom.getSelh().getCheckbox());

	}

	@Then("user is enter continue button")
	public void user_is_enter_continue_button() {
		clickOnButton(pom.getSelh().getSelecthotelsubmit());

	}

	@When("user enter first name")
	public void user_enter_first_name() {
		inputValue(pom.getBh().getFirstname(), "pradeepan");

	}

	@When("user enter last name")
	public void user_enter_last_name() {
		inputValue(pom.getBh().getLastname(), "v");

	}

	@When("user enter the billing address")
	public void user_enter_the_billing_address() {
		inputValue(pom.getBh().getAddress(), "1,abc");
	}

	@When("user enter credit card number")
	public void user_enter_credit_card_number() {
		inputValue(pom.getBh().getCreditcardnumber(), "1234567891234567");
	}

	@When("user enter credit card type")
	public void user_enter_credit_card_type() {
		dropDown(pom.getBh().getCreaditcardtype(), "byindex", "2");
	}

	@When("user enter expiry date")
	public void user_enter_expiry_date() {
		dropDown(pom.getBh().getCcexpmonth(), "byindex", "3");
		dropDown(pom.getBh().getCcexpyear(), "byvisibletext", "2022");
	}

	@When("user enter cvv number")
	public void user_enter_cvv_number() {
		inputValue(pom.getBh().getCvvnumber(), "123");
	}

	@Then("user enter book now button")
	public void user_enter_book_now_button() {
		clickOnButton(pom.getBh().getBooknowbutton());

	}

	@Then("user is enter my itinerary button")
	public void user_is_enter_my_itinerary_button() {
		clickOnButton(pom.getMi().getMyitinerary());

	}

}
