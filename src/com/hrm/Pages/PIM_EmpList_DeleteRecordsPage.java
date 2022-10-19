package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_EmpList_DeleteRecordsPage extends Base {
	static By selectBydrop=By.id("loc_code");
    static By searchfor_txtbox=By.xpath("//*[@id=\"loc_name\"]");
    static By btn_search=By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]");
    static By chkbox1=By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[1]/td[1]/input");
    static By chkbox2=By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[2]/td[1]/input");
    static By chkbox3=By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[3]/td[1]/input");
    static By chkbox4=By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[5]/td[1]/input");
    static By chkbox5=By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[7]/td[1]/input");
    static By btn_delete=By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]");
    
    
    public static void deleteemp(String emplastname)throws Exception{
    	driver.switchTo().frame("rightMenu");
    	Thread.sleep(2000);
    	Select st=new Select(driver.findElement(selectBydrop));
    	st.selectByIndex(3);
    	Thread.sleep(2000);
    	driver.findElement(searchfor_txtbox).sendKeys(emplastname);
    	Thread.sleep(2000);
    	driver.findElement(btn_search).click();
    	Thread.sleep(2000);
    	driver.findElement(chkbox1).click();
    	Thread.sleep(2000);
    	driver.findElement(chkbox2).click();
    	Thread.sleep(2000);
    	driver.findElement(chkbox3).click();
    	Thread.sleep(2000);
    	driver.findElement(chkbox4).click();
    	Thread.sleep(2000);
    	driver.findElement(chkbox5).click();
    	Thread.sleep(2000);
    	driver.findElement(btn_delete).click();
    	Thread.sleep(2000);
    	driver.switchTo().defaultContent();
    	Reporter.log("Emp Records Deleted");
    	Log.info("Emp Records Deleted");
    }

}
