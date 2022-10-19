package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_Reset_EmplistPage;
import com.hrm.utility.Base;

public class TC006_PIM_EmpList_Resetemp {
	@Test
	public static void resetemp()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_Reset_EmplistPage.resetdetails("masthan");
		LogoutPage.logout();
		Base.tearDown();
		
		
		
	}
}
