package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_EmpList_DeleteRecordsPage;
import com.hrm.utility.Base;

public class TC005_PIM_Delete {
	@Test
	public static void deleteemp()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_EmpList_DeleteRecordsPage.deleteemp("Masthan");
		LogoutPage.logout();
		Base.tearDown();
		
		
	}
}
