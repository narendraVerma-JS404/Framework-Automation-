package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class TC007_DeleteLoc {
	
	public static void main(String[] args) throws Exception{
		
		GeneralNexus obj = new GeneralNexus();
		obj.openApplication();
		obj.login();
		Thread.sleep(3000);
		obj.adminMouseOver();
		Thread.sleep(3500);
		obj.enterFrame();
		obj.addLocationSearch();
		Thread.sleep(3000);
		obj.delete_Location();
		Thread.sleep(3000);	
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
