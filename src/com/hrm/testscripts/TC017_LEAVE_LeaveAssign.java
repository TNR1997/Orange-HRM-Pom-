package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_LeaveAssignPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC017_LEAVE_LeaveAssign {
@Test
	
	public static void leaveassign()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		Base.verifyTitle();
		LEAVE_LeaveAssignPage.leaveassign("shaik Masthan","2022-10-23","2022-10-24","Please Consider My leave letter");
		LogoutPage.logout();
		Base.tearDown();
		
		
		
		
		
	}

}


