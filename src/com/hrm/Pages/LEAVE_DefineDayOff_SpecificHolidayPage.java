package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_DefineDayOff_SpecificHolidayPage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By defineDaysoff=By.xpath("//*[@id=\"leave\"]/ul/li[2]/a/span");
	static By specialholiday=By.xpath("//*[@id=\"leave\"]/ul/li[2]/ul/li[2]/a/span");
	static By add_btn=By.xpath("//*[@id=\"btnAdd\"]");
	static By nameofholiday_txtbox=By.xpath("//*[@id=\"txtDescription\"]");
	static By date_txtbox=By.id("txtDate");
	static By chk_box=By.name("chkRecurring");
	static By fullday_ddown=By.name("sltLeaveLength");
	static By save=By.xpath("//*[@id=\"saveBtn\"]");
	
	
	
	
	
	public static void specialholiday(String nameofhdy,String dateofleave)throws Exception{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(leave)).perform();
		Thread.sleep(2000);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(driver.findElement(defineDaysoff)).perform();
		Thread.sleep(2000);
		driver.findElement(specialholiday).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(add_btn).click();
		Thread.sleep(2000);
		driver.findElement(nameofholiday_txtbox).sendKeys(nameofhdy);
		Thread.sleep(2000);
		driver.findElement(date_txtbox).sendKeys(dateofleave);
		Thread.sleep(2000);
		driver.findElement(chk_box).click();
		Thread.sleep(2000);
		Select st=new Select(driver.findElement(fullday_ddown));
		st.selectByIndex(0);
		Thread.sleep(2000);
		Reporter.log("Full Day selected");
		Log.info("Full day selected");
		driver.findElement(save).click();
		Thread.sleep(2000);
		Reporter.log("Specific Holiday Date Created");
		Log.info("Specific Holiday Date Created");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

	}
}
