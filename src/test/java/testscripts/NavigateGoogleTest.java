package testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import classes.Registration;

public class NavigateGoogleTest extends BaseClass {
	
	public NavigateGoogleTest() {
		super();
	}
	
	Registration registration;
	
	
	@BeforeMethod
	public void setUp() {
		initlization();
	}
	
	@Test
	public void navigateGoogleTest() {
		registration = new Registration();
		registration.clickOnSignUPLink();
		System.out.println("the page title --->"+driver.getTitle());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
