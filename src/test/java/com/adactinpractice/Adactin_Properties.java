package com.adactinpractice;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helperfile.FileReadManager;
import com.pom.PageObjectManager;

public class Adactin_Properties extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		driver=getBrowser("chrome");
		
		getUrl(FileReadManager.getInstance_FRM().getInstance_CR().get_Url());
		
		PageObjectManager pom = new PageObjectManager(driver);
		
		inputValue(pom.getLp().getUsername(),FileReadManager.getInstance_FRM().getInstance_CR().get_Uname());
		inputValue(pom.getLp().getPassword(),FileReadManager.getInstance_FRM().getInstance_CR().get_Pass());
		clickOnButton(pom.getLp().getSubmit());
		
		
	}

}
