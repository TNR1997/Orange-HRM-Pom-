package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_EducationPage extends Base{
	static By education=By.xpath("//*[@id='educationLink']/span");
	static By edu_drop=By.xpath("//*[@id='addPaneEducation']/table/tbody/tr[1]/td[2]/select");
	static By specialisation=By.name("txtEmpEduMajor");
	static By year=By.name("txtEmpEduYear");
	static By gpa=By.name("txtEmpEduGPA");
	static By startdate=By.name("txtEmpEduStartDate");
	static By enddate=By.name("txtEmpEduEndDate");
	static By save=By.xpath("//*[@id='btnAddEducation']");
	  
	                 //functions
	public static void education_page(String empfst,String emplst)throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(education).click();
		    //education drop down
		Select st=new Select(driver.findElement(edu_drop));
		st.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(specialisation).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(year).sendKeys("2022");
		Thread.sleep(2000);
		driver.findElement(gpa).sendKeys("8.3");
		Thread.sleep(2000);
		driver.findElement(startdate).sendKeys("2022-05-17");
		Thread.sleep(2000);
		driver.findElement(enddate).sendKeys("2022-08-26");
		
		Thread.sleep(2000);
		driver.findElement(save).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();	
		Reporter.log("Education details added");
		Log.info("Education details added");
	}

}
