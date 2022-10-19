package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.BENEFITS_Payrollschedule_AddperiodResetPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC021_BENEFITS_PayrollSchedule_AddPperiodReset {
@Test
	
	public static void periodDetailsreset()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		BENEFITS_Payrollschedule_AddperiodResetPage.add_period("2022-06-12","2022-11-14","2022-12-03","2022-12-16","2023-01-25");
		LogoutPage.logout();
		Base.tearDown();
		
		
	}

}


