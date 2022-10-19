package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_DefineDayOff_DayOffPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC014_LEAVE_DefineDayoff_DayOff {
@Test
	
	public static void dayoff()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		Base.verifyTitle();
		LEAVE_DefineDayOff_DayOffPage.dayoff();
		LogoutPage.logout();
		Base.tearDown();
	}

}


