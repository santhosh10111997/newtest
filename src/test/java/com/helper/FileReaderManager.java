package com.helper;

import java.io.IOException;

public class FileReaderManager {

 public static ConfigurationReader getInstance() throws IOException{
		
	 ConfigurationReader cr=new ConfigurationReader();
	 return cr;
	 
	}
	
}
