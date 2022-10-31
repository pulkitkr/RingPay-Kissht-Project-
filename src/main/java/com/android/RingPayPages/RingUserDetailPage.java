package com.android.RingPayPages;

import org.openqa.selenium.By;

public class RingUserDetailPage {
	
	//First Name
		public static By objFirstName = By.xpath("//*[@text='First Name']/parent::android.view.ViewGroup");
		
		//Last Name
		public static By objLastName = By.xpath("//*[@text='Last Name']/parent::android.view.ViewGroup");
			
		//Email
		public static By objEmail = By.xpath("//*[@text='Email Address']/parent::android.view.ViewGroup");
		
		//DOB
		public static By objDOB = By.xpath("//*[@text='User Details']/parent::android.view.ViewGroup/following-sibling::android.widget.ScrollView/descendant::android.widget.TextView[@text='Date of Birth']/following-sibling::android.widget.TextView");
		
		public static By objDobText = By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup'])[5]/*[@text and @class='android.widget.TextView'])[2]");
		
		//Ok button
		public static By objOKBtn = By.xpath("//*[@text='OK']");
		
		//Gender
		public static By objGender = By.xpath("(//*[@text='Please fill details as per your government id proof.']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.ImageView)[2]");
		
		//DOB First field
		public static By objParentWheeler= By.xpath("//android.widget.LinearLayout");
		
		//None of the above button
		public static By objNone = By.xpath("//*[@resource-id='com.google.android.gms:id/cancel']");
		
		//Gender
		public static By objGenderMale = By.xpath("(//*[@text='Gender']/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView)[1]");
		
		//Register button
		public static By objRegisterBtn = By.xpath("//*[@text='Register']");
		
		//DOB - month
	    public static By objDatePickerMonth = By.xpath("(//*[@class='android.widget.NumberPicker'])[1]");
	    
	    //DOB - date
	    public static By objDatePickerDate = By.xpath("(//*[@class='android.widget.NumberPicker'])[2]");
	    
	    //DOB - year
	    public static By objDatePickerYear = By.xpath("(//*[@class='android.widget.NumberPicker'])[3]");
	    
	    //Sorry Msg
	    public static By objSorryMsg = By.xpath("//*[@text='Sorry!']");
	    
	    public static By objCannotBeProcessedMsg = By.xpath("//*[@text='Your application cannot be processed\r\n"
	    		+ "right now.']");
	    
	    public static By objHamburgerTab = By.xpath("(//*[@text='Sorry!']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup)[3]");
	    
	    public static By objProfileTabCompletedPercentage = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup'] and ./*[@text='40%']]]");
	    
	    public static By objLogoutBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text] and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ScrollView']]]");
	    
	    public static By objLogOutYesBtn = By.xpath("//*[@text='Yes']");
	    
	    public static By objAreYouSureLogOutMsg = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]/*[@text])[2]");
	    
	    //Offer Page
	    public static By objOfferPageHeader = By.xpath("//*[@text and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@class='android.view.ViewGroup']]]");
	    
	    public static By objIAcceptCheckBox = By.xpath("//*[@class='android.widget.CheckBox']");
	    
	    public static By objAcceptOfferBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and ./*[@text] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.CheckBox']]");
	    
	    //Set Pin
	    public static By objSetPinHeader = By.xpath("//*[@text and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]");
	    
	    public static By objEnterPin = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Submit']]]]]/*[@class='android.widget.TextView'])[2]");
	    
	    public static By objReEnterPin = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Submit']]]]]/*[@class='android.widget.TextView'])[7]");
	    
	    public static By objSubmitBtn = By.xpath("//*[@text='Submit']");
	    
	    //Cross close Button
	    public static By objCrossBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]]");
	    
	    //hamburger tab
	    public static By objHamburgerTabSuccess = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text]]]");

}
