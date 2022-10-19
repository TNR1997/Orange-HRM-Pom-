package com.hrm.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_WorkExpPage extends Base{
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photouload=By.name("photofile");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	static By experience=By.xpath("//*[@id='work_experienceLink']/span");
	static By employer=By.name("txtEmpExpEmployer");
	static By jobtitle=By.name("txtEmpExpJobTitle");
	static By comments=By.name("txtEmpExpComments");
	static By startdate=By.name("txtEmpExpFromDate");
	static By enddate=By.name("txtEmpExpToDate");
	static By internal=By.name("chkEmpExpInternal");
	static By save=By.xpath("/html/body/form/div[16]/div[1]/div[2]/div[2]/div/div/input[1]");
	static By chkbox=By.xpath("/html/body/form/div[16]/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/input");
	static By ad=By.xpath("//*[@id='parentPaneWorkExperience']/div[3]/div/input[1]");
	
	
	
	                     //functions
	public static void wk_experience(String emplyr,String jobttle)throws Exception {
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(experience).click();
		Thread.sleep(2000);
		driver.findElement(employer).sendKeys(emplyr);
		Thread.sleep(2000);
		driver.findElement(jobtitle).sendKeys(jobttle);
		Thread.sleep(2000);
		driver.findElement(comments).sendKeys("**********");
		Thread.sleep(2000);
		driver.findElement(startdate).sendKeys("2019-11-11");
		Thread.sleep(2000);
		driver.findElement(enddate).sendKeys("2022-09-12");
		Thread.sleep(2000);
		driver.findElement(internal).click();
		Thread.sleep(2000);
		driver.findElement(save).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
	   Reporter.log("Work Experience Details added");
		Log.info("work experience details added");

	}
}
