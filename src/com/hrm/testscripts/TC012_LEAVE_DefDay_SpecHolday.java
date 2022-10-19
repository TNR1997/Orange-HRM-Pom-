package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_DefineDayOff_SpecificHolidayPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC012_LEAVE_DefDay_SpecHolday {
	@Test
	public static void holiday()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		Base.verifyTitle();
		LEAVE_DefineDayOff_SpecificHolidayPage.specialholiday("BirthDay","2023-10-02");
		LogoutPage.logout();
		Base.tearDown();
		
		
		
		
		
		
		
	}

}


