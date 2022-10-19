package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_SalaryPage extends Base {
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photoupload=By.name("photofile");
	static By add_save=By.xpath("//input[@value='Save'][@type='button']");
	static By salary=By.xpath("//*[@id='paymentsLink']/span");
	static By paygradedrop=By.xpath("//*[@id='cmbSalaryGrade']");
	static By currencydrop=By.xpath("//*[@id='cmbCurrCode']");
	static By basicsalary=By.name("txtBasSal");
	static By payfrequencydrop=By.id("cmbPayPeriod");
   
    static By save=By.xpath("/html/body/form/div[13]/div[1]/div[2]/div[2]/div/div/input[1]");
    
    
                  //Functions
    public static void salaryemp(String empfir,String emplast) throws Exception {
    	
     driver.switchTo().frame("rightMenu");
      driver.findElement(salary).click();
           //Paygrade drop down
      Select st=new Select(driver.findElement(paygradedrop));
      st.selectByIndex(7);
      Thread.sleep(2000);
         //Currency drop down
      Select sel=new Select(driver.findElement(currencydrop));
         sel.selectByIndex(0);
         Thread.sleep(2000);
         driver.findElement(basicsalary).sendKeys("450000");
         Thread.sleep(2000);
               //Pay frequency dropdown
         Select st1=new Select(driver.findElement(payfrequencydrop));
              st1.selectByIndex(4);
              Thread.sleep(2000);
              driver.findElement(save).click();
              Thread.sleep(2000);
              driver.switchTo().defaultContent();
              Reporter.log("Salary details saved");
              Log.info("Salary details saved");
    }
}
