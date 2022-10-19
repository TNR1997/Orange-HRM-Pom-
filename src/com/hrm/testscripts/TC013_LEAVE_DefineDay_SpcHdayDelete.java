package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LEAVE_DefineDayoff_SpcHolDayDeletePage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC013_LEAVE_DefineDay_SpcHdayDelete {
@Test
	
	public static void specifichdaydelete()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		LEAVE_DefineDayoff_SpcHolDayDeletePage.spcifichdayDelete();
		LogoutPage.logout();
		Base.tearDown();
		
		
		
		
		
		
	}

}


