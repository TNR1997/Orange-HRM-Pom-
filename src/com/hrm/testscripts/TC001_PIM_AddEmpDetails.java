package com.hrm.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_AddempPage;
import com.hrm.utility.Base;
	
	
	public class TC001_PIM_AddEmpDetails {
		@Test
		public static void add()throws Exception
		{
			DOMConfigurator.configure("log4j.xml");
			Base.startup();
			Base.verifyTitle();
			LoginPage.login("nareshit","nareshit");
			PIM_AddempPage.addemp("pomerft","tregh");
			LogoutPage.logout();
			Base.tearDown();
		}
		

}
