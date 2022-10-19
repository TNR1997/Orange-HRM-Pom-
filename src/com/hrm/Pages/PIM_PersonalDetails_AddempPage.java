package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_PersonalDetails_AddempPage extends Base {
	static By btn_edit=By.xpath("//input[@value='Edit'][@type='button']");
	static By txt_empnickname=By.name("txtEmpNickName");
	static By txt_nicno=By.name("txtNICNo");
	static By txt_sinno=By.name("txtSINNo");
	static By drodown=By.name("cmbNation");
	static By dob=By.name("DOB");
	static By gender=By.id("gender1");
	static By license=By.name("txtLicenNo");
	static By licenseExpire=By.name("txtLicExpDate");
	    static By save=By.xpath("//*[@id=\"btnEditPers\"]");  
	
	             //functions
	public static void personaldetails(String elstnm,String efstnm, String emnknm,String nicno)throws Exception {
		driver.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		driver.findElement(btn_edit).click();
		Thread.sleep(2000);
		driver.findElement(txt_empnickname).sendKeys(emnknm);
		Thread.sleep(2000);
		driver.findElement(txt_nicno).sendKeys(nicno);
		Thread.sleep(2000);
		driver.findElement(txt_sinno).sendKeys("78890");
		Thread.sleep(2000);
		Select st=new Select(driver.findElement(drodown));
		   st.selectByIndex(3);
		   Thread.sleep(2000);
		   driver.findElement(dob).sendKeys("1995-10-01");
		   Thread.sleep(2000);
		   driver.findElement(gender).click();
		   Thread.sleep(2000);
		   driver.findElement(license).sendKeys("AP78961087");
		   Thread.sleep(2000);
		   driver.findElement(licenseExpire).sendKeys("2045-10-10");
		   Thread.sleep(2000);
		   driver.findElement(save).click();
		   Thread.sleep(2000);
		   driver.switchTo().defaultContent();
		   Thread.sleep(2000);
		   Reporter.log("Personal Details Added");
		   Log.info("Personal details Added");
	}

}
