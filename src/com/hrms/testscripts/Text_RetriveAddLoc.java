package com.hrms.testscripts;

import com.hrms.lib.GeneralNexus;

public class Text_RetriveAddLoc {
	
public static void main(String[] args) throws Exception{
		
		GeneralNexus obj = new GeneralNexus();
		obj.openApplication();
		obj.login();
		Thread.sleep(4500);
		obj.adminMouseOver();
		Thread.sleep(4500);
		obj.enterFrame();
		obj.retriveText();
		Thread.sleep(3500);
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();

}
}
