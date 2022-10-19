package com.hrm.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_LeaveAssignPage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By leaveAssign=By.xpath("//*[@id=\"leave\"]/ul/li[4]/a/span");
	static By empname_txtbox=By.name("txtEmployeeId");
	static By leavetypeDdown=By.name("sltLeaveType");
	static By fromDate_txtbox=By.xpath("//*[@id=\"txtLeaveFromDate\"]");
	static By fromtimeDdown=By.xpath("//*[@id=\"sltLeaveFromTime\"]");
	static By totimeDdown=By.xpath("//*[@id=\"sltLeaveToTime\"]");
	static By todate_txtbox=By.name("txtLeaveToDate");
	static By comment_box=By.name("txtComments");
	static By assign_btn=By.xpath("//*[@id=\"saveBtn\"]");
	
	
	
	
	public static void leaveassign(String empname,String frdate,String todate,String comment)throws Exception{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(leave)).perform();
		Thread.sleep(2000);
		driver.findElement(leaveAssign).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(empname_txtbox).sendKeys(empname);
		Thread.sleep(2000);
		WebElement sd=driver.findElement(empname_txtbox);
		sd.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		sd.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		sd.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		sd.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Select gh=new Select(driver.findElement(leavetypeDdown));
		gh.selectByIndex(2);
		Thread.sleep(2000);
		Reporter.log("Half day Leave selected");
		Log.info("Half Day Leave Selected");
		driver.findElement(fromDate_txtbox).sendKeys(frdate);
		Thread.sleep(2000);
		driver.findElement(todate_txtbox).sendKeys(todate);
	
		Thread.sleep(2000);
		driver.findElement(comment_box).sendKeys(comment);
		Thread.sleep(2000);
		driver.findElement(assign_btn).click();
		Thread.sleep(2000);
		Alert s=driver.switchTo().alert();
		Reporter.log(s.getText());
		Log.info(s.getText());
		s.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	    Reporter.log("Leave assigned");
	    Log.info("Leave Assigned");
	}

}
