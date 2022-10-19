package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_AddempPage extends Base {
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photoupload=By.name("photofile");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	
	       //functions
	public static void addemp(String empfir,String emplast)throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		Thread.sleep(2000);
		driver.findElement(txt_empfirstname).sendKeys(empfir);
		Thread.sleep(2000);
		driver.findElement(txt_emplastname).sendKeys(emplast);
		Thread.sleep(2000);
		WebElement file=driver.findElement(photoupload);
		file.sendKeys("D:\\photo.jpg");
		Thread.sleep(2000);
		driver.findElement(btn_save).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Reporter.log("Employee Details added");
		Log.info("Employee Details added");
	}

}
