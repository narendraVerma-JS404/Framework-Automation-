package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class TC001_LoginLogout {
	
	public static void main(String args[]) throws Exception {

	
	         //Test Steps
	GeneralNexus obj = new GeneralNexus();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();

}
}
