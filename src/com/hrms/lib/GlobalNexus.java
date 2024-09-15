package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class GlobalNexus {
	
	public WebDriver driver;
	
	//Standard:Rule: To provide TestData & objects related to whole application.
	
	          //*******TEST DATA*******\\
	            
	         //LOGIN PAGE
	
	         //DT         VAR            VV
	        public String url = "http://183.82.103.245/nareshit/login.php";
			public String un  = "nareshit";
			public String pw  = "nareshit";
			//*******TEST DATA : ADD EMPLOYEE *******\\
			public String eFn     = "Sachin";
			public String eLn     = "Dhoni";
			public String MdlName = "Nothing";
			public String Srch_For= "9347";      //Search For Name ===========>First name
			public String DltTxt  = "Successfully Deleted"; //stmt Dlt
			    
			
			//*******TEST DATA : EDIT EMPLOYEE *******\\
			public String PD_Fn     = "Gopal";
			public String PD_Ln     = "Selenium";
			
//========>OBJECT & ELEMENT<======================>OBJECT & ELEMENT <===================>OBJECT & ELEMENT<=======
			
			//*******OBJECT & ELEMENTS LOGIN DATA*******\\
			public String txt_loginame = "txtUserName";
			public String txt_password = "txtPassword";
			public String btn_login    = "Submit";
			public String link_logout  = "Logout";
			public String Btn_Clear    = "clear";
			
			//*******ADD Employee & OBJ / ELEMENTS DATA*******\\
			public String Enter_Frame  = "rightMenu";                     //LinkText
			public String Btn_add      = "//input[@value='Add']";         //Xpath
			public String txt_eFn      = "txtEmpFirstName";               //Name
			public String txt_ELn      = "txtEmpLastName";                //Name
			public String mdl_Name     = "//*[@id=\"txtEmpMiddleName\"]"; //Xpath
			public String choose_file  = "//*[@id=\"photofile\"]";        //Xpath
			public String Btn_save     = "btnEdit";                       //id
			public String Btn_reset    = "//*[@id=\"frmEmp\"]/div/div[1]/div[2]/div[2]/input[2]"; //Xpath
			public String Back_btn     = "//input[@type='button'][@value='Back']";//xpath
			
			//*******PERSONAL DETAILS & OBJ / ELEMENTS DATA*******\\
			
			public String Edit_Btn     = "//input[@id='btnEditPers']";    //Xpath
			public String First_name   = "//input[@id='txtEmpFirstName']";//Xpath
			public String last_name    = "//input[@id='txtEmpLastName']"; //Xpath
			public String Dob          = "//input[@id='DOB']";            //Xpath
			public String Dob_Box      = "//input[@name='btnDOB']";       //Xpath
			public String Save_btn     = "//input[@id='btnEditPers']";    //Xpath
			
			//*******EMPLOYEE INFORMATION BY SEARCH METHOD & OBJ / ELEMENTS DATA*******\\
			
			public String Search_By     = "//*[@id=\"loc_code\"]";    //Xpath
			public String Search_For    = "//*[@id=\"loc_name\"]";   //Xpath
			public String Search_btn    = "//input[@value='Search']";   //Xpath
			public String Srch_empName  = "/html/body/div/div[2]/form/table/tbody/tr[2]/td[3]/a";
			public String EmpFirstName  = "0";                      //DROPDOWN WITH SEL BY VALUE
		    public String dropDownValue = "Emp. ID";                //linktext
		    public String CheckBox_all  = "//*[@id=\"allCheck\"]";  //Xpath
		    public String checkbox      = "/html/body/div/div[2]/form/table/tbody/tr/td[1]/input";                             //Name
		    public String Btn_Delete    = "//input[@value='Delete']";  //xpath
		    public String Dlt_Stmt      = "/html/body/div/div[2]/form/div[2]/span";//Xpath
		    
//<====================Company Info : General Test Data<=============================>===========>

public String Ret_TxT   = "Successfully Added";  //Successfully Add Location
public String Ret_txt   = "Successfully Deleted"; //Successfully Delete Location
         
//Company Info : Locations Test Data

public String name_Loc  = "ARgentina";
public String Phone_no  = "7899897889";
public String city      = "Mumbai";
public String zip_code  = "abcdss";
public String comment   = "Hlo world";
public String fax_Loc   = "1065";
public String Address   = "Panvel";
public String StateProv = "Ameerpet shivabagh";
public String DD_Country= "IN";
public String Search_for= "LOC092";
public String Dlt_stmt  = "Successfully Deleted";
public String AdLoc_successfuly= "Successfully Added";
public String fld_mandatory = "Fields marked with an asterisk * are required.";

//***********************Company job menu Test Data************************//

		    
 //<================>//ADMIN MAIN MENU PAGE<=========================>OBJECT & ELEMENT<====================>
		    
 public String Admin_MM      = "//*[@id=\"admin\"]/a/span";             //xpath
 public String CIF_G         = "Company Info"; //LT
 public String Gen_info      = "General";       //LT

 
            //COMPANY INFO GENERAL
 public String Cmp_name      = "txtCompanyName";  //Name
 public String Tax_id        = "txtTaxID";        //Name
 public String DD_Ctry       = "cmbCountry";        //Name
 public String Adds_1        = "txtStreet1";        //Name
 public String Adds_2        = "txtStreet2";        //Name
 public String ciTy          = "cmbCity";        //Name
 public String zip_Cd        = "txtZIP";        //Name
 public String cmnt_txt      = "txtComments";        //Name
 public String naics         = "txtNAICS";        //Name
 public String Fax_txt       = "txtFax";        //Name
 public String State_pro     = "txtState";        //Name
 public String Save_BtnCIG   = "//*[@id=\"editBtn\"]";        //xpath
 public String Re_set_CIG    = "//*[@id=\"frmGenInfo\"]/div[2]/input[2]";        //xpath
 public String Edt_btn       = "//*[@id=\"editBtn\"]"; //xpath
 
 //ADMIN LOCATIONS DATA
 
 
public String loc_info      = "Locations";  //LT
public String searchBy_Btn  = "loc_code";  //Name
public String search_For    = "//input[@id='loc_name']";  //xpath
public String search_btn    = "//input[@value='Search']";  //xpath
public String ReSet_btn     = "/html/body/div/div[2]/form/div[3]/input[3]";  //xpath
public String add_btn       = "//input[@value='Add']";  //Relative xpath
public String delet_btn     = "//input[@type='button'][@value='Delete']";  // xpath
public String chkBox        = "/html/body/div/div[2]/form/table/thead/tr/td[1]/input";  //Name  :Select all
public String chk_Box       = " /html/body/div/div[2]/form/table/tbody/tr[4]/td[1]/input";  //Name :Perticular select
public String loc_name      = "/html/body/div/div[2]/form/table/tbody/tr[1]/td[3]/a";  //After Search location
public String id_Loc        = "/html/body/div/div[2]/form/table/tbody/tr[1]/td[2]/a";//id location
public String Dlttxt_path   = "/html/body/div/div[2]/form/div[2]/span";
public String Add_Succesfuly= "/html/body/div/div[2]/form/div[2]/span";  //Path add location successful

      //COMPNY INFO LOCATION EDIT

public String edt_btn_lc     = "//input[@id='editBtn']";  //xpath
public String name_loc       = "txtLocDescription";  //NAME
public String dd_cnry_loc    = "//select[@id='cmbCountry']";  //value
public String stat_p_lc      = "txtState";  //NAME
public String edt_cty_lc     = "cmbDistrict";  //NAME
public String edt_add_lc     = "txtAddress";  //NAME
public String edt_zc_lc      = "txtZIP";  //NAME
public String edt_phn_lc     = "txtPhone";  //NAME
public String edt_fax_lc     = "txtFax";  //NAME
public String edt_cmnt_lc    = "txtComments";  //NAME
public String save_btn_lc    = "//input[@id='editBtn']";  //REL:xpath
public String reSet_btn_lc   = "//input[@value='Reset']";  //REL:xpath
public String Ret_txt_lc     = "Successfully Added";   //Link text
public String Mandatory_field= "/html/body/div[1]/div[4]"; //xpath
public String Heading_CInfo  = "/html/body/div/div[3]/div[2]/div/h2";//xpath
public String Logo_Heading   = "//*[@id=\"companyLogoHeader\"]";//xpath
public String Footer_heading = "//*[@id=\"main-footer\"]";//xpath
public String Welcome_text   = "/html/body/div[3]/ul/li[1]";//xpath
public String Login_pageText = "/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[5]/td[2]/table/tbody/tr/td";
	
// ***************Company Job menu OBJECT/ELEMENTS*************************88\\
public String job_menu       = "/html/body/div[4]/ul/li[1]/ul/li[2]/a/span";
public String EditButton     = "//*[@id=\"editBtn\"]";
public String JobTitleName   = "//input[@id='txtJobTitleName']";
public String JobDiscripson  = "//textarea[@id='txtJobTitleDesc']";
public String PayGrd_DD      = "//*[@id=\"cmbPayGrade\"]";
public String Emp_status     = "//option[@value='EST001']";
public String AddpayGrade    = "//input[@value='Add Pay Grade']";
public String Text_addpay_nm = "//input[@id='txtSalGrdDesc']";
public String Mandatory_txt  = "/html/body/div/div[3]";
public String Back_button    = "/html/body/div/div[1]/input";//click back button and get popup
public String EditPaygrd     = "//*[@id=\"frmJobTitle\"]/input[6]";
public String Add_Ad         = "//*[@id=\"frmJobTitle\"]/div[1]/input[1]";  //popup
public String Remove         = "//*[@id=\"frmJobTitle\"]/div[1]/input[2]";  //popup
public String DropDBox       = "//*[@id=\"cmbUnAssEmploymentStatus\"]";
public String Add_empStatus  = "//input[@value='Add Employment Status']";
public String empedtStatus   = "//input[@id='txtEmpStatDesc']";   //employement status
public String Edt_empStats   = "//input[@value='Edit Employment Status']";//popup
public String save_button    = "//input[@id='btnEmpStat']";
public String Save_button    = "//input[@id='editBtn']";
public String Txt_Downside   = "/html/body/div[2]/div[4]";
public String Txt_mandatory  = "/html/body/div[2]/div[3]";
public String Succes_uplod   = "/html/body/div/div[2]/form/div[2]/span";

			

}
