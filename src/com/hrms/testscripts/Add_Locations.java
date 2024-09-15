package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class Add_Locations {
	
	public static void main(String[] args) throws Exception{
		
		   //Test Steps
		GeneralNexus obj = new GeneralNexus();
		obj.openApplication();
		obj.login();
		Thread.sleep(4500);
		obj.adminMouseOver();
		Thread.sleep(4500);
		obj.enterFrame();
		obj.add_Location();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
