package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_AddempPage;
import com.hrm.Pages.PIM_Job_EmpListPage;
import com.hrm.utility.Base;

public class TC010_PIM_Job_EmpList {
	@Test
	public static void job()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_AddempPage.addemp("Shaik","Masthan");
		PIM_Job_EmpListPage.job("12/11/2022");
		LogoutPage.logout();
		Base.tearDown();
		
	}

}


