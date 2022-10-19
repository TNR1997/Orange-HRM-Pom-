package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.BENEFITS_PayrollSchedule_AddPayPeriodPage;
import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.utility.Base;

public class TC020_BENEFITS_Payschedule_Payperiod {
@Test
	
	public static void payperiodadd()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		LoginPage.login("nareshit","nareshit");
		BENEFITS_PayrollSchedule_AddPayPeriodPage.add_period("2022-07-01","2022-09-30","2022-12-12","2022-11-11","2022-12-30");
		LogoutPage.logout();
		Base.tearDown();
	}

}


