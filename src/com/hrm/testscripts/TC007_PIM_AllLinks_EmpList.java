package com.hrm.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.Pages.LogoutPage;
import com.hrm.Pages.PIM_RestoreallLinks_EmpListPage;
import com.hrm.utility.Base;

public class TC007_PIM_AllLinks_EmpList {
	@Test
	public static void links()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Base.startup();
		Base.verifyTitle();
		LoginPage.login("nareshit","nareshit");
		PIM_RestoreallLinks_EmpListPage.alllink();
		LogoutPage.logout();
		Base.tearDown();
	}


}
