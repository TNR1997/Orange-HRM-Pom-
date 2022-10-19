package com.hrm.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_DefineLeave_LeavetypeDeletePage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By leavetype=By.xpath("//*[@id=\"leave\"]/ul/li[3]/a/span");
	static By deleterecoed_chkbox=By.xpath("//*[@id=\"defineLeaveType\"]/table/tbody/tr[6]/td[1]/input");
	static By delete_btn=By.xpath("//*[@id=\"btnDel\"]");
	
	
	
	
	
	public static void leavedelete()throws Exception{
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(leave)).perform();
		Thread.sleep(2000);
		driver.findElement(leavetype).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(deleterecoed_chkbox).click();
		Thread.sleep(2000);
		driver.findElement(delete_btn).click();
		Thread.sleep(2000);
		Alert s=driver.switchTo().alert();
		Reporter.log(s.getText());
		Log.info(s.getText());
		s.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Reporter.log("LeaveType Record Deleted");
		Log.info("Leave Type Record Deleted");
	}

}
