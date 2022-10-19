package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_DefineDayOff_DayOffPage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By defineDaysoff=By.xpath("//*[@id=\"leave\"]/ul/li[2]/a/span");
	static By dayoff=By.xpath("//*[@id=\"leave\"]/ul/li[2]/ul/li[1]/a/span");
	
	
	
	
	
	
	public static void dayoff()throws Exception{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(leave)).perform();
		Thread.sleep(2000);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(driver.findElement(defineDaysoff)).perform();
		Thread.sleep(2000);
		driver.findElement(dayoff).click();
		Reporter.log("DayOff Page Opened" + "-" +"The total number of applied leave should be zero to change the weekends Message is Displayed");
		
		Log.info("DayOff Page Opened" + "-" +"The total number of applied leave should be zero to change the weekends message is Displayed");
	}

}
