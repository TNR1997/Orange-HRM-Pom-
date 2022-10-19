package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_LeaveListPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC018_Leave_Leavelist {
@Test
	
	public static void leavelist()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		LEAVE_LeaveListPage.leavelist("2022-10-01","2022-10-10");
		LogoutPage.logout();
		Base.tearDown();
	}

}
