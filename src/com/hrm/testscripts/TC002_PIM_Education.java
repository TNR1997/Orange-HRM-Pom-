package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_AddempPage;
import com.hrm.Pages.PIM_EducationPage;
import com.hrm.utility.Base;

public class TC002_PIM_Education {
@Test
	
	public static void education()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_AddempPage.addemp("sure","marrli");
		PIM_EducationPage.education_page("nagesh","shaik");
		LogoutPage.logout();
		Base.tearDown();
	}


}
