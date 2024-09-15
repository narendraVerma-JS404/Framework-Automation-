package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class TC006_EditLoc {
	
	public static void main(String[] args) throws Exception {
		
		GeneralNexus obj = new GeneralNexus();
		obj.openApplication();
		obj.login();
		Thread.sleep(4500);
		obj.adminMouseOver();
		Thread.sleep(4500);
		obj.enterFrame();
		obj.addLocationSearch();
		obj.editLocationSearch();
		Thread.sleep(5000);
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		
	}

}
