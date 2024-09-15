package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class Text_RetriveAll {

public static void main(String[] args) throws Exception{
		
		GeneralNexus obj = new GeneralNexus();
		obj.openApplication();
		obj.login();
		Thread.sleep(2000);
		obj.adminMouseOver();
		Thread.sleep(2000);
		obj.enterFrame();
		obj.textRetrive();
		Thread.sleep(3500);
		obj.exitFrame();
		obj.wholeApplication();
		obj.logout();
		obj.closeApplication();
}
}
