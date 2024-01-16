package org.PropertiesEX;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public String getPropData(String key) {
	
		try {
			FileInputStream fis = new FileInputStream("./src/test/resource/Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
			
		//	String value = prop.getProperty(key);
		//	return value;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		}
		public Properties getprop() {
			try {
				FileInputStream fis = new FileInputStream("./src/test/resource/config.properties");
				Properties prop = new Properties();
				prop.load(fis);
				return prop;
			} catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
}

