package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_AddempPage;
import com.hrm.Pages.PIM_PersonalDetails_AddempPage;
import com.hrm.utility.Base;

public class TC009_PIM_PersonalDetails_EmpList {
	@Test
	public static void personal()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_AddempPage.addemp("Shareef","Mohhamed");
		PIM_PersonalDetails_AddempPage.personaldetails("Masthan","Shaik","Masthan","selenium");
		LogoutPage.logout();
		Base.tearDown();
		
		
		
		
		
		
		
	}

}


