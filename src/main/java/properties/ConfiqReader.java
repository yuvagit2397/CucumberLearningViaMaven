package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfiqReader {
	
	public static Properties prop=null;
	
	public ConfiqReader() throws IOException {
		File propPath=new File("D:\\yuvasri_revision\\CucumberLearningViaMaven\\src"
				+ "\\main\\java\\properties\\Property.properties");
		FileInputStream fin=new FileInputStream(propPath);
		prop=new Properties();
		prop.load(fin);
	}
	
	public static String getUrl() throws IOException {
		String url = prop.getProperty("url");
		return url;
		
	}
	
	public static String getBrowser() {
		String browser = prop.getProperty("browserName");
		return browser;
	}
	
}
