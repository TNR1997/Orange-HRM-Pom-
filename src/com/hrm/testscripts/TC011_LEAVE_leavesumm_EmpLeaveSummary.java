package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_Leavesummary_EmpLeaveSummaryPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC011_LEAVE_leavesumm_EmpLeaveSummary {
	@Test
	public static void leave()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		Base.verifyTitle();
		LEAVE_Leavesummary_EmpLeaveSummaryPage.empleave();
		LogoutPage.logout();
		Base.tearDown();
	}

}
