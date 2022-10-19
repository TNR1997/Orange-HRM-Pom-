package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_Job_EmpListPage extends Base{
	static By job_click=By.xpath("//*[@id=\"jobLink\"]/span");
	static By btn_edit=By.xpath("//*[@id=\"btnEditJob\"]");
	static By jobtitle_ddown=By.xpath("//*[@id=\"cmbJobTitle\"]");
	static By emplyStatus=By.id("cmbType");
	static By eeocategory=By.id("cmbEEOCat");
	static By joineddate=By.id("txtJoinedDate");
	static By locationdropdown=By.xpath("//*[@id=\"cmbNewLocationId\"]");
	static By assign_btn=By.xpath("//*[@id=\"assignLocationButton\"]");
	static By save_btn=By.xpath("//*[@id=\"btnEditJob\"]");
	
	
	
	
	
	public static void job(String joindate)throws Exception{
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(job_click).click();
		Thread.sleep(2000);
		driver.findElement(btn_edit).click();
		Thread.sleep(2000);
		Select de=new Select(driver.findElement(jobtitle_ddown));
		de.selectByIndex(3);
		Thread.sleep(2000);
		Reporter.log("Software Tester Selected");
		Log.info("Software Tester Selected");
		Select de1=new Select(driver.findElement(emplyStatus));
		de1.selectByIndex(0);
		Thread.sleep(2000);
		Select de3=new Select(driver.findElement(eeocategory));
		de3.selectByIndex(14);
		Reporter.log("Software Selected");
		Log.info("Software Selected");
		Thread.sleep(2000);
		driver.findElement(joineddate).sendKeys(joindate);
		Thread.sleep(2000);
		Select de6=new Select(driver.findElement(locationdropdown));
		de6.selectByIndex(19);
		Reporter.log("NareshIT selected");
		Log.info("NareshIT Selected");
		Thread.sleep(2000);
		driver.findElement(assign_btn).click();
		Thread.sleep(2000);
		driver.findElement(save_btn).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		Reporter.log("Job Details Added");
		Log.info("Job Details Added");
		Thread.sleep(2000);
		
		
	}


}
