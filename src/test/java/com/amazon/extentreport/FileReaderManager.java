package com.amazon.extentreport;

import com.amazon.extentreport.FileReaderManager;

public class FileReaderManager {
	
	//EXTENT REPORT CREATION CODE
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static com.amazon.readconfigfile.ConfigFileReader configFileReader;

	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public com.amazon.readconfigfile.ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new com.amazon.readconfigfile.ConfigFileReader() : configFileReader;
	 }

}
