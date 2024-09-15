package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class TC003_DltEmp {

	public static void main(String args[]) throws Exception {

		
        //Test Steps
GeneralNexus obj = new GeneralNexus();
obj.openApplication();
obj.login();
Thread.sleep(4500);
obj.enterFrame();
obj.dltEmployee();
Thread.sleep(5500);
obj.exitFrame();
obj.logout();
obj.closeApplication();
}
}
