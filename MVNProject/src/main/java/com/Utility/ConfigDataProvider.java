package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
 private Properties pro;
	public ConfigDataProvider() throws Exception  {
		
		File src = new File(System.getProperty("user.dir")+"\\Config\\config.properties");
		FileInputStream file = new FileInputStream(src);
		pro = new Properties();
		pro.load(file);
	}
	public String getURL_stage() {
		return pro.getProperty("URL_stage");
	}
	


	
}