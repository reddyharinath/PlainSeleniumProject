package testscripts;

import java.io.File;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import basepackage.BaseClass;
import classes.Registration;
import util.UtilClass;

public class NavigateGoogleTest extends BaseClass {
	
	public NavigateGoogleTest() {
		super();
	}
	
	Registration registration;
	
	
	@BeforeMethod
	public void setUp() {
		initlization();		
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FreeCRM_"+UtilClass.getCurrentDateAndTime()+".html"));
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		
	}
	
	@Test
	public void navigateGoogleTest() {
		
		logger = extentReports.createTest(" nvigate to CRM portal");
		registration = new Registration();
		logger.info("Registration class object created");
		registration.clickOnSignUPLink();
		logger.info("sign up link got clicked..");
		System.out.println("the page title --->"+driver.getTitle());
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		driver.close();
		
//		if (result.getStatus()==ITestResult.SUCCESS) {
//			logger.pass("passed", MediaEntityBuilder.createScreenCaptureFromPath(UtilClass.captureScreenshot(driver)).build());
//			
//		}
		extentReports.flush();
	}

}
