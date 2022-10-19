package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_Leavesummary_EmpLeaveSummaryPage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By leavesummary=By.xpath("//*[@id=\"leave\"]/ul/li[1]/a/span");
	static By empleaveSummary=By.xpath("//*[@id=\"leave\"]/ul/li[1]/ul/li/a/span");
	static By yearddown=By.xpath("/html/body/div/div/div[2]/form/table/tbody/tr[1]/td[3]/select");
	static By empnameddown=By.xpath("/html/body/div/div/div[2]/form/table/tbody/tr[1]/td[5]/select");
	static By leavetypeddown=By.xpath("/html/body/div/div/div[2]/form/table/tbody/tr[3]/td[5]/select");
	static By view_btn=By.xpath("//*[@id=\"btnView\"]");
	
	
	
	
	public static void empleave()throws Exception{
	
		Thread.sleep(2000);
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(leave)).perform();
	Thread.sleep(2000);
	Actions ac1=new Actions(driver);
	ac1.moveToElement(driver.findElement(leavesummary)).perform();
	Thread.sleep(2000);
	driver.findElement(empleaveSummary).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	Select st=new Select(driver.findElement(yearddown));
	st.selectByIndex(1);
	Reporter.log("Year 2022 selected");
	Log.info("Year 2022 Selected");
	Thread.sleep(2000);
	Select st1=new Select(driver.findElement(empnameddown));
	st1.selectByIndex(0);
	Reporter.log("All Employees Selected");
	Log.info("All Employees Selected");
	Thread.sleep(2000);
	Select st3=new Select(driver.findElement(leavetypeddown));
	st3.selectByIndex(0);
	Reporter.log("All Selected");
	Log.info("All Selected");
	Thread.sleep(2000);
	driver.findElement(view_btn).click();
	Reporter.log("Employee Leave status Page displayed");
	Log.info("Employee Leave Status Page Displayed");
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	}
}
