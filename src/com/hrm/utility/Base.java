package com.hrm.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Base {
public static WebDriver driver;
	
	
	public static void startup()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
	}
	
	public static void tearDown()
	{
		driver.quit();
		Reporter.log("Application Closed");
		Log.info("Application Closed");
	}
	public static void verifyTitle()
	{
		if(driver.getTitle().equals("OrangeHRM"))
		{
			Reporter.log("Title matched");
		}
		else
		{
			Reporter.log("Title is not matched :"  + driver.getTitle());
		}
	}
}
