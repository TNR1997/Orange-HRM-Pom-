package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_AddempPage;
import com.hrm.Pages.PIM_SalaryPage;
import com.hrm.utility.Base;

public class TC003_PIM_SalaryDetails {
	@Test
	public static void salary()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_AddempPage.addemp("Zare","Jari");
		PIM_SalaryPage.salaryemp("Dev","Bali");
		LogoutPage.logout();
		Base.tearDown();
	}

}
