package com.hrms.lib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralNexus extends GlobalNexus {

	//Standard Rule: To provide all Re-Usable fun:/methods related to whole application
	
	    public void openApplication() throws Exception {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Thread.sleep(3500);
		
		}
	    
	    public void login() throws Exception {
	    
	    driver.findElement(By.name(txt_loginame)).sendKeys(un);
	    driver.findElement(By.name(txt_password)).sendKeys(pw);
	    driver.findElement(By.name(btn_login)).click();
	    System.out.println("Login Completed");
	    Thread.sleep(4500);
	  
	    }
	    public void enterFrame() {
	    driver.switchTo().frame(Enter_Frame);
	    System.out.println("Enter into Frame");
	    	
	    }
	    public void exitFrame() {
	    driver.switchTo().defaultContent();
	    System.out.println("Exit into Frame");
	    	
	    }
	    
	    public void addEmployee() throws Exception {
	    	  
	    driver.findElement(By.xpath(Btn_add)).click();
	    driver.findElement(By.name(txt_eFn)).sendKeys(eFn);
	    driver.findElement(By.name(txt_ELn)).sendKeys(eLn);
	    driver.findElement(By.id(Btn_save)).click();
	    System.out.println("Employee Added Successfully");
	    Thread.sleep(4500);
	    }
	    
	    public void dltEmployee() throws Exception {
	    Select st = new Select(driver.findElement(By.xpath(Search_By)));
	    st.selectByVisibleText(dropDownValue);
	
		driver.findElement(By.xpath(Search_For)).sendKeys(Srch_For);
		driver.findElement(By.xpath(Search_btn )).click();
		driver.findElement(By.xpath(checkbox)).click();
		driver.findElement(By.xpath(Btn_Delete)).click();
		
		System.out.println("Delet Employee Successfully");
		String str = driver.findElement(By.xpath(Dlt_Stmt)).getText();
		System.out.println(str);
	    }
	    
	    public void smEdtEmp() {
	    	Select st = new Select(driver.findElement(By.name("loc_code")));
	    	st.selectByValue("1");
	    	//driver.findElement(By.xpath(Btn_SearchBy)).click();
	    	//driver.findElement(By.xpath(EmpFirstName )).click();
	    	driver.findElement(By.xpath(Search_For)).sendKeys(Srch_For);
	    	driver.findElement(By.xpath(Search_btn)).click();
	    	driver.findElement(By.xpath(Srch_empName)).click();
	    	System.out.println("Employee Search Method Successfully done!!!!!!");
	    }

	    
	    public void edtEmp() {
	    	
	    	driver.findElement(By.xpath(Edit_Btn)).click();        //Edit button
	    	driver.findElement(By.xpath(First_name)).clear();            //Employee First name:PD Page
	    	driver.findElement(By.xpath(last_name)).clear();            //Employee Last name :
	    	driver.findElement(By.xpath(First_name)).sendKeys(PD_Fn);     //Edit emp Name
	    	driver.findElement(By.xpath(last_name)).sendKeys(PD_Ln);     //Edit emp L.N
	    	driver.findElement(By.xpath(Save_btn )).click();
	    	System.out.println("Employee Name Change Successfully!!!!!");
	    }
	    
	    public void adminMouseOver() throws Exception {
	    	Actions ac = new Actions(driver);
	    	ac.moveToElement(driver.findElement(By.xpath(Admin_MM))).perform();
	    	Thread.sleep(3500);
	    	ac.moveToElement(driver.findElement(By.linkText(CIF_G))).perform();
	    	Thread.sleep(3600);
	    	ac.moveToElement(driver.findElement(By.linkText(loc_info))).perform();
	    	Thread.sleep(3900);
	    	driver.findElement(By.linkText(loc_info)).click();
	    	
	    }
	    public void add_Location() throws Exception {
	    	driver.findElement(By.xpath(add_btn)).click();
	    	driver.findElement(By.name(name_loc)).sendKeys(name_Loc);
	    	Select st = new Select(driver.findElement(By.xpath( dd_cnry_loc )));
	    	st.selectByValue(DD_Country);
	    	Thread.sleep(5500);
	    	driver.findElement(By.name(stat_p_lc)).sendKeys(StateProv);
	    	driver.findElement(By.name(edt_cty_lc)).sendKeys(city );
	    	
	    	driver.findElement(By.name(edt_add_lc)).sendKeys(Address);
	    	
	    	driver.findElement(By.name(edt_zc_lc)).sendKeys(zip_code );
	    	driver.findElement(By.name(edt_phn_lc )).sendKeys(Phone_no );
	    	driver.findElement(By.name(edt_fax_lc)).sendKeys(fax_Loc);
	    	driver.findElement(By.name(edt_cmnt_lc )).sendKeys(comment );
	    	driver.findElement(By.xpath(save_btn_lc)).click();
	    	Alert at = driver.switchTo().alert();            //Zip Code Alert message
	    	System.out.println(at.getText());
	    	at.accept();
	    	Thread.sleep(3500);	
	    	String adt=driver.findElement(By.xpath(Add_Succesfuly)).getText();
		    System.out.println(adt);
	    	System.out.println("Location Added Successfully");
	    }
	    
	    public void addLocationSearch() {
	    	
	    	Select st = new Select(driver.findElement(By.name("loc_code")));
	    	st.selectByValue("0");
	    	
	    	System.out.println("ID Select");
	    	driver.findElement(By.xpath(search_For)).sendKeys(Search_for);
	    	driver.findElement(By.xpath(search_btn)).click();
	    	System.out.println("Location id is displayed*************");
	    }
	    
	    public void retriveText() throws Exception {
	    	driver.findElement(By.xpath(add_btn)).click();	
	    	driver.findElement(By.xpath(save_btn_lc)).click();
	    
	    	Alert at = driver.switchTo().alert();
	    	System.out.println(at.getText());
	    	at.accept();
	    	Thread.sleep(3500);	
	    	
	    	System.out.println("All Retrive text present here");
	    	System.out.println(at.getText());
          
	    }
	    public void textRetrive() throws Exception {
	    	driver.findElement(By.xpath(add_btn)).click();
	    	
            String str= driver.findElement(By.xpath(Mandatory_field)).getText();
	    	System.out.println(str);
	    	
	    	String st= driver.findElement(By.xpath(Heading_CInfo)).getText();
		    System.out.println(st);
	    }
        
		public void wholeApplication() {
		    String sr= driver.findElement(By.xpath(Logo_Heading)).getText();
		    System.out.println(sr);
		    
		    String sf= driver.findElement(By.xpath(Footer_heading)).getText();
		    System.out.println(sf);
		    
		    String wt=driver.findElement(By.xpath(Welcome_text)).getText();
		    System.out.println(wt);
		    
		    
	    }
	    
	    public void editLocationSearch() throws Exception {
	    	driver.findElement(By.xpath(id_Loc)).click();
	    	driver.findElement(By.xpath(edt_btn_lc)).click();
	    	System.out.println("Company location page opened*********For Editing");
	    	driver.findElement(By.name(name_loc)).clear();
	    	driver.findElement(By.name(name_loc)).sendKeys(name_Loc);
	    	
	    	System.out.println("Name is cleared and Changed");
	    	
	    	Select vt = new Select(driver.findElement(By.xpath(dd_cnry_loc )));
	    	vt.selectByValue( DD_Country );
	    	driver.findElement(By.name(stat_p_lc)).clear();
	    	driver.findElement(By.name(stat_p_lc)).sendKeys(StateProv);
	    	driver.findElement(By.name(edt_cty_lc)).clear();
	    	driver.findElement(By.name(edt_cty_lc)).sendKeys(city );
	    	driver.findElement(By.name(edt_add_lc)).clear();
	    	driver.findElement(By.name(edt_add_lc)).sendKeys(Address);
	    	
	    	System.out.println("Location Changed Successfully");
	    	
	    	driver.findElement(By.name(edt_zc_lc)).clear();
	    	driver.findElement(By.name(edt_zc_lc)).sendKeys(zip_code);
	    	
	    	driver.findElement(By.name(edt_phn_lc)).clear();
	    	driver.findElement(By.name(edt_phn_lc )).sendKeys(Phone_no );
	    	
	    	driver.findElement(By.name(edt_fax_lc)).clear();
	    	driver.findElement(By.name(edt_fax_lc)).sendKeys(fax_Loc);
	    	
	    	driver.findElement(By.name(edt_cmnt_lc)).clear();
	    	driver.findElement(By.name(edt_cmnt_lc )).sendKeys(comment );
	    	
	    	driver.findElement(By.xpath(save_btn_lc)).click();
	    	Thread.sleep(5500);
	    	System.out.println("Location Added Successfully");
	    	
	    	System.out.println("All Things are changed and Testing Excellent");
	    }
	    
	    public void delete_Location() throws Exception {
	    	driver.findElement(By.xpath(chkBox)).click();
	    	
	    	driver.findElement(By.xpath(delet_btn)).click();
	    	Alert at = driver.switchTo().alert();            //Delete popup alert Alert message
	    	System.out.println(at.getText());
	    	at.accept();
	    	Thread.sleep(3500);	
	    	System.out.println("Delet Employee Successfully");
	    	
	    	String str= driver.findElement(By.xpath(Dlttxt_path)).getText();
	    	
	    	System.out.println(str);
	    	
	    }

	    public void logout() throws Exception{
	   	driver.findElement(By.linkText(link_logout)).click();
	   	System.out.println("Logout Completed");
	   	Thread.sleep(4600);
	   }
	    
	   public void closeApplication() {
	   	 driver.quit();
	       System.out.println("Application Closed");
	   }






}
