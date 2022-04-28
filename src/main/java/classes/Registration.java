package classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class Registration  extends BaseClass {
	
	public Registration() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Sign Up")	
	WebElement SignUpLink;
	
	public void clickOnSignUPLink() {
		SignUpLink.click();
		
	}
	
	
}
