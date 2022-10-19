package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_LeaveListResetPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC019_LEAVE_LeaveListReset {
@Test
	
	public static void listreset()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		LEAVE_LeaveListResetPage.leavelistreset("2022-10-01","2022-10-10");
		LogoutPage.logout();
		Base.tearDown();
		
}
}
