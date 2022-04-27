package testscripts;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import classes.Registration;

public class NavigateGoogleTest extends BaseClass {
	
	public NavigateGoogleTest() {
		super();
	}
	
	public BaseClass baseClass;
	public Properties prop;
	public WebDriver driver;
	public Registration registration;
	
	public String chromeDriverPath = System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe";
	//C:\Users\haridama67\automation_project\PlainSeleniumProject\src\main\java\drivers\chromedriver.exe
	@BeforeMethod
	public void setUp() {
		baseClass = new BaseClass();
		prop = new Properties();
		 
		System.out.println("the chrome driver path--->"+chromeDriverPath);
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void navigateGoogleTest() {
		registration = new Registration();
		driver.get("https://demo.guru99.com/test/newtours/");
		String title = driver.getTitle();
		System.out.println("the title is-->" + title);
		Assert.assertEquals(title, "Welcome: Mercury Tours");
		//registration.clickOnRegisterLink();
		//System.out.println("current url is -->"+driver.getCurrentUrl());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
