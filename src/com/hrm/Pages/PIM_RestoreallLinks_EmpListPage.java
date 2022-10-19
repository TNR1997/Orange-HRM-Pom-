package com.hrm.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrm.utility.Base;
import com.hrm.utility.Log;

public class PIM_RestoreallLinks_EmpListPage extends Base{
static By alllinks=By.tagName("a");
	
	
	public static void alllink()throws Exception{
		driver.switchTo().frame("rightMenu");
		List<WebElement> sw=driver.findElements(alllinks);
		Reporter.log("Here all Links:");
		Log.info("Here All Links:");
		for(WebElement link:sw)
		{
			Reporter.log(link.getText()+ "-" + link.getAttribute("href"));
			Log.info(link.getText() + "-" + link.getAttribute("href"));
			System.out.println(link.getText()+ "-" + link.getAttribute("href"));
		}
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Reporter.log("All Links Restored");
		Log.info("All Links Restored");

}
}
