package basepackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public WebDriver driver;
	public Properties prop ;
	String configFilePath = "C:\\Users\\haridama67\\automation_project\\PlainSeleniumProject\\src\\main\\java\\testdata\\config.properties";
	
	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/testdata/config.properties");
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
