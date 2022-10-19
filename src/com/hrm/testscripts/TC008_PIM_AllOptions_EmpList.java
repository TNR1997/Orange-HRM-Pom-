package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_RestoreallOptions_DropDown_EmpListPage;
import com.hrm.utility.Base;

public class TC008_PIM_AllOptions_EmpList {
	@Test
	 
	 public static void options()throws Exception{
		 DOMConfigurator.configure("log4j.xml");
		 Base.startup();
		 Base.verifyTitle();
		 LoginPage.login("nareshit","nareshit");
		 PIM_RestoreallOptions_DropDown_EmpListPage.alloptions();
		 LogoutPage.logout();
		 Base.tearDown();
	}


}
