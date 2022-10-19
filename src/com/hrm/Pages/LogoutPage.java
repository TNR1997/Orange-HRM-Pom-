package com.hrm.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LogoutPage extends Base{
	static By link_logout=By.linkText("Logout");
	
	
	
	
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Logout completed");
		Log.info("Logout Completed");
	}

}
