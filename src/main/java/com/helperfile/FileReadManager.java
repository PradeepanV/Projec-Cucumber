package com.helperfile;

import java.io.IOException;

public class FileReadManager {
	
	private FileReadManager() {
	
	}
	public static FileReadManager getInstance_FRM() {
		FileReadManager frm = new FileReadManager();
		return frm;
	}
	public ConfigurationReader getInstance_CR() throws IOException {
		ConfigurationReader creader = new ConfigurationReader();
		return creader;
	}
	
	

}
