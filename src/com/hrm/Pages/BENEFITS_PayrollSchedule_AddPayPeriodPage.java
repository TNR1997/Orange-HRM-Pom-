package com.hrm.Pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

	

	public class BENEFITS_PayrollSchedule_AddPayPeriodPage extends Base{
		static By benifit=By.xpath("/html/body/div[4]/ul/li[5]/a/span");
		static By payrollschedule=By.xpath("/html/body/div[4]/ul/li[5]/ul/li[2]/a/span");
		static By addpayperiod=By.xpath("//*[@id='benefits']/ul/li[2]/ul/li[2]/a/span");
		static By txt_payperiod=By.name("txtPayPeriodFromDate");
		static By txt_payperiodclose=By.name("txtPayPeriodCloseDate");
		static By txt_duedate=By.name("txtPayPeriodTimesheetDueDate");
		static By txt_checkdate=By.name("txtPayPeriodCheckDate");
		static By txt_to=By.name("txtPayPeriodToDate");
		static By save=By.xpath("//*[@id='saveBtn']");
		
		                  //functions
		public static void add_period(String pperiod,String periodclose,String duedate,String chkdate,String todate)throws Exception {
			WebElement  ele=driver.findElement(benifit);
			Actions ac=new Actions(driver);
			ac.moveToElement(ele).perform();
			Thread.sleep(2000);
			WebElement element=driver.findElement(payrollschedule);
			Actions ac1=new Actions(driver);
			ac1.moveToElement(element).perform();
			Thread.sleep(2000);
			driver.findElement(addpayperiod).click();
			driver.switchTo().frame("rightMenu");
			Thread.sleep(2000);
			driver.findElement(txt_payperiod).sendKeys(pperiod);
			Thread.sleep(2000);
			driver.findElement(txt_payperiodclose).sendKeys(periodclose);
			Thread.sleep(2000);
			driver.findElement(txt_duedate).sendKeys(duedate);
			Thread.sleep(2000);
			driver.findElement(txt_checkdate).sendKeys(chkdate);
			Thread.sleep(2000);
			driver.findElement(txt_to).sendKeys(todate);
			Thread.sleep(3000);
			driver.findElement(save);
			driver.switchTo().defaultContent();
		   Reporter.log("Pay Period Details Added");
			Log.info("Pay Period details added");
		}

	}



