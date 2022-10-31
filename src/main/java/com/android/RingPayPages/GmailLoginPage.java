package com.android.RingPayPages;

import org.openqa.selenium.By;

public class GmailLoginPage {
	
	 public static By continueWithGmail=By.xpath("//*[@text='Continue with Google']");
	 
	 public static By addAnotherAccount=By.xpath("//*[@text='Add another account']");
	 
	 public static By txtSign_In=By.xpath("//*[@text='Sign in']");
	 
	 public static By enterEmailID=By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@text='Forgot email?']]]]");
	 
	 public static By nextButton=By.xpath("//*[@text='Next']");
	 
	 public static By enterPassword=By.xpath("//*[@class='android.widget.EditText']");
	 
	 public static By btnYesImIn=By.xpath("//*[@text='Yes, I’m in']");
	 
	 public static By btnIAgree=By.xpath("//*[@text='I agree']");
	 
	 public static By btnMore=By.xpath("//*[@text='More']");
	 
	 public static By txtKeepYourAccountUpdate=By.xpath("//*[@id='headingText']");
	 
	 public static By btnAccept=By.xpath("//*[@text='Accept']");
	 
	 public static By txtGoogleServices=By.xpath("//*[@text='Back up to Google Drive']");
	 
	 public static By selectGmailAccount (String user) {
	 return By.xpath("//*@text='"+ user +"']");
	 }
	 
	 public static By txtChooseAnAccount=By.xpath("//*[@text='Choose an account']");
	/* -----------------Add Phone Number Details-------------------------*/ 
	 public static By txtAddPhoneNumber=By.xpath("//*[@id='headingText']");
	 
	 public static By btnSkip=By.xpath("(//*[@id='view_container']/*[@class='android.view.View'])[4]");
	 
	 public static By btnAddphonenumberYesimin=By.xpath("(//*[@id='view_container']/*[@class='android.view.View'])[3]");
	 
	 /*---------------------------------------------------------------------------*/	

}
