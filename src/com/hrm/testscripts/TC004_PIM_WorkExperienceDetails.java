package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_AddempPage;
import com.hrm.Pages.PIM_WorkExpPage;
import com.hrm.utility.Base;

public class TC004_PIM_WorkExperienceDetails {
	@Test
	public static void work()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_AddempPage.addemp("gallio","pomer");
		PIM_WorkExpPage.wk_experience("Suresh","Tester");
		LogoutPage.logout();
		Base.tearDown();
	}

}
