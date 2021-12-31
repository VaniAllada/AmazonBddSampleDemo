package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	//Variables Initialization 
		private Properties prop ;
		
		//Init method
		public Properties init_prop() {
			
			//Creating Object for Properties
			prop = new Properties();
			try { // try block for exception handling
				
				//Reading data through fileinput stream
				FileInputStream ip = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\AmazonBddDemo\\src\\main\\java\\com\\amazon\\properties\\config.properties");
				prop.load(ip);
			} catch(FileNotFoundException e) {  // catch block
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}		
			return prop;	 // Returning properties
		}

}
