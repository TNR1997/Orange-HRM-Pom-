package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_DefineLeaveTypesPage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By leavetype=By.xpath("//*[@id=\"leave\"]/ul/li[3]/a/span");
	static By add_btn=By.xpath("//*[@id=\"btnAdd\"]");
	static By leavetypename=By.name("txtLeaveTypeName");
	static By save_btn=By.xpath("//*[@id=\"saveBtn\"]");
	
	
	
	
	
	
	
	
	public static void defineleave(String leavename)throws Exception{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(leave)).perform();
		Thread.sleep(2000);
		driver.findElement(leavetype).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(add_btn).click();
		Thread.sleep(2000);
		driver.findElement(leavetypename).sendKeys(leavename);
		Thread.sleep(2000);
		driver.findElement(save_btn).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Reporter.log("Leave Type Added");
		Log.info("Leave Type Added");
	}

}
