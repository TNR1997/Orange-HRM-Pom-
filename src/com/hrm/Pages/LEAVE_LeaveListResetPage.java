package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class LEAVE_LeaveListResetPage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By leavelist=By.xpath("//*[@id=\"leave\"]/ul/li[5]/a/span");
	static By fromdate_textbox=By.xpath("//*[@id=\"txtFromDate\"]");
	static By todate_textbox=By.xpath("//*[@id=\"txtToDate\"]");
	static By all_chkbox=By.xpath("//*[@id=\"allCheck\"]");
	static By reset_btn=By.xpath("//*[@id=\"frmFilterLeave\"]/input[15]");
	
	
	
	
	public static void leavelistreset(String frdate,String todate)throws Exception{
		Thread.sleep(2000);
		 Actions ac=new Actions(driver);
			ac.moveToElement(driver.findElement(leave)).perform();
			Thread.sleep(2000);
			driver.findElement(leavelist).click();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(fromdate_textbox).clear();
			Thread.sleep(2000);
			driver.findElement(fromdate_textbox).sendKeys(frdate);
			Thread.sleep(2000);
			driver.findElement(todate_textbox).clear();
			Thread.sleep(2000);
			driver.findElement(todate_textbox).sendKeys(todate);
			Thread.sleep(2000);
			driver.findElement(all_chkbox).click();
			Thread.sleep(2000);
			driver.findElement(reset_btn).click();
			driver.switchTo().defaultContent();
			Reporter.log("Entered  Data Cleared");
			Log.info("Entered Data Cleared");
	}

}
