package util;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	
	
	public static String getCurrentDateAndTime() {
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return dateFormat.format(currentDate);
	}
	
	
	public static String captureScreenshot(WebDriver driver ) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenShotPath = System.getProperty("user.dir")+"/screenshots/FreeCRM_"+UtilClass.getCurrentDateAndTime()+".png";
		try {
			FileHandler.copy(src, new File(screenShotPath));
			System.out.println("screen shot captured");
		} catch (Exception e) {
			System.out.println("unable to capture screen shot -->"+e.getMessage());
		}
		return screenShotPath;
		
	}
	
}
