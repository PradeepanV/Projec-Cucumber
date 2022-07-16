package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\viji\\eclipse-workspace\\8am_Batch\\Project\\src\\main\\java\\com\\helperfile\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String get_Url() {
		 String url = p.getProperty("url");
		return url;
	}
	public String get_Uname() {
		String uname = p.getProperty("uname");
		return uname;
	}
	public String get_Pass() {
		String pass = p.getProperty("pword");
		return pass;
	}
	
	

}
