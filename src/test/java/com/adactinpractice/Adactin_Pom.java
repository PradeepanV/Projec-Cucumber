package com.adactinpractice;

import com.baseclass.BaseClass;
import com.pom.PageObjectManager;

public class Adactin_Pom extends BaseClass {
	
	public static void main(String[] args) {
		driver=getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");
		
		PageObjectManager paom = new PageObjectManager(driver);
		
		inputValue(paom.getLp().getUsername(),"pradeep321");
		inputValue(paom.getLp().getPassword(), "9T40ZB");
		clickOnButton(paom.getLp().getSubmit());
		
		dropDown(paom.getSh().getLocation(),"byindex", "3");
		dropDown(paom.getSh().getHotels(),"byindex","2");
		dropDown(paom.getSh().getRoomtype(),"byindex", "3");
		
		
	}

}
