package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_DefineLeaveTypesPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC015_LEAVE_DefineLeavetype_Added {
@Test
	
	public static void leaveadd()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		LEAVE_DefineLeaveTypesPage.defineleave("Bank Work");
		LogoutPage.logout();
		Base.tearDown();
	}

}


