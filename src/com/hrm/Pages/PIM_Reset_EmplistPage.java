package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_Reset_EmplistPage extends Base {
	static By selectBydrop=By.id("loc_code");
    static By searchfor_txtbox=By.xpath("//*[@id=\"loc_name\"]");
    static By reset_btn=By.xpath("/html/body/div/div[2]/form/div[2]/input[3]");
    
    
    
    
    
    
    
    public static void resetdetails(String emplastname)throws Exception{
   	 driver.switchTo().frame("rightMenu");
    	Thread.sleep(2000);
    	Select st=new Select(driver.findElement(selectBydrop));
    	st.selectByIndex(3);
    	Thread.sleep(2000);
    	driver.findElement(searchfor_txtbox).sendKeys(emplastname);
    	Thread.sleep(2000);
    	driver.findElement(reset_btn).click();
    	Thread.sleep(2000);
    	driver.switchTo().defaultContent();
    	Reporter.log("Emp Details Search Cleared");
    	Log.info("Emp Details Search Cleared");
    }

}
