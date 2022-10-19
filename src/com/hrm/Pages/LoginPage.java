package com.hrm.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LoginPage extends Base{
	//test data
		static By txt_username=By.name("txtUserName");
		static By txt_password=By.name("txtPassword");
		static By login_btn=By.name("Submit");
		
		
		
		
		
		
		
		public static void login(String un,String pw)throws Exception{
			
			driver.findElement(txt_username).sendKeys(un);
			Thread.sleep(2000);
			driver.findElement(txt_password).sendKeys(pw);
			Thread.sleep(2000);
			driver.findElement(login_btn).click();
			Reporter.log("Login Completed");
			Log.info("Login Complted");
			Thread.sleep(2000);
		}

}
