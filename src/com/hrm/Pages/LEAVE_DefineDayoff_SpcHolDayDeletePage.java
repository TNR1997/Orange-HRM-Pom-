package com.hrm.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrm.utility.Base;

public class LEAVE_DefineDayoff_SpcHolDayDeletePage extends Base{
	static By leave=By.xpath("//*[@id=\"leave\"]/a/span");
	static By defineDaysoff=By.xpath("//*[@id=\"leave\"]/ul/li[2]/a/span");
	static By specialholiday=By.xpath("//*[@id=\"leave\"]/ul/li[2]/ul/li[2]/a/span");
	static By deleterecord_chkbox=By.xpath("//*[@id=\"frmDeleteHolidays\"]/table/tbody/tr[3]/td[1]/input");
	static By delete_btn=By.xpath("//*[@id=\"btnDel\"]");
	
	
	
	
	
	
	public static void spcifichdayDelete()throws Exception{
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
		driver.findElement(deleterecord_chkbox).click();
		Thread.sleep(2000);
		driver.findElement(delete_btn).click();
		Thread.sleep(2000);
		Alert d=driver.switchTo().alert();
		Reporter.log(d.getText());
		d.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Reporter.log("Specific Holiday Record Delete");
	}

}
