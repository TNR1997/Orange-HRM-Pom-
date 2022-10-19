package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_DefineLeave_LeavetypeDeletePage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC016_LEAVE_LeaveType_Delete {
	@Test
	public static void leavedelete()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		Base.verifyTitle();
		LEAVE_DefineLeave_LeavetypeDeletePage.leavedelete();
		LogoutPage.logout();
		Base.tearDown();
	}

}


