package com.vtiger.comcast.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @authorDeepak
 *
 */
public class FileUTiltiy {
	/**
	 * its used to read the data from commonData.properties File based on Key which you pass as an argument
	 * @param key
	 * @throwsThrowable
	 */
public String getPropertyKeyValue(String key) throws Throwable {
	FileInputStream fis = new FileInputStream("./data/productmodule.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	 String value = pobj.getProperty(key);
		return value;
	 
    }
}
