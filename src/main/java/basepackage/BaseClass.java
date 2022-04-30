package basepackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import util.UtilClass;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop ;
	public ExtentReports extentReports;
	public ExtentTest logger;
	
	
	
	
	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/testdata/config.properties");
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public static void initlization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		System.out.println("the page title after url load--->"+driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(UtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}
	
	

}
