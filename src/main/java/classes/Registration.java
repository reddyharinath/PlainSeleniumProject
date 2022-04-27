package classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basepackage.BaseClass;

public class Registration  extends BaseClass {
	
	public Registration() {
		super();
	}
	
	
	@FindBy(linkText = "REGISTER")	
	private WebElement registerLink;
	
	public void clickOnRegisterLink() {
		registerLink.click();
		//return driver.getCurrentUrl();
	}
}
