package com.adactinpractice;

import com.baseclass.BaseClass;
import com.pojoclass.Login_Page;
import com.pojoclass.Search_Hotel;
import com.pom.PageObjectManager;

public class Adactin_Pojo extends BaseClass {
	
	public static void main(String[] args) {
	
		driver=getBrowser("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		Login_Page lp = new Login_Page(driver);
		
		inputValue(lp.getUsername(), "pradeep321");
		inputValue(lp.getPassword(),"9T40ZB");
		clickOnButton(lp.getSubmit());
		
		Search_Hotel sh = new Search_Hotel(driver);
		
		dropDown(sh.getLocation(),"byindex", "3");
		dropDown(sh.getHotels(),"byindex","1");
		dropDown(sh.getRoomtype(),"byindex", "2");
		
		
		
	}
}
