package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties pro; 
	
	public ConfigurationReader() throws IOException {
    File f=new File("C:\\Users\\pavithra\\eclipse-workspace\\CucumTask\\src\\test\\java\\com\\helper\\ada.properties");
    FileInputStream fi=new FileInputStream(f);
     pro=new Properties();
    pro.load(fi);
    
	}
	
	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
	
	}
	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}
	
}
