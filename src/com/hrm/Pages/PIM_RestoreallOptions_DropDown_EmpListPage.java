package com.hrm.Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_RestoreallOptions_DropDown_EmpListPage extends Base {
     static By dropdown=By.id("loc_code");
	
	
	
	
	public static void alloptions()throws Exception{
		driver.switchTo().frame(0);
		Select sy=new Select(driver.findElement(dropdown));
		
		List<WebElement> ed=sy.getOptions();
		for(WebElement options:ed)
		{
			System.out.println(options.getText());
			Reporter.log(options.getText());
			Log.info(options.getText());
		}
		Thread.sleep(2000);
		Reporter.log("All options Retrieved");
		Log.info("All Options Retrieved");
		driver.switchTo().defaultContent();

}
}
