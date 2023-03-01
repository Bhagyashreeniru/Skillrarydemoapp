package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods to perform actions on
 * properties file
 * @author HP
 *
 */

public class PropertiesUtility {
	
	/**
	 * This method is used to initialize properties file
	 * @paramfilePath
	 */
	
	private Properties property;
	
	public void propertiesInitialization(String filePath) {
		FileInputStream fis=null;
		
		try {
			 fis=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * This method is used to read data from properties file
	 * @param key
	 * @return
	 */
	
	public String fetchProperty(String Key) {
		return property.getProperty(Key);
	}

}
