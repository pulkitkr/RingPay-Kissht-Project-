package com.android.RingPayPages;

import org.openqa.selenium.By;

public class UserRegistrationPage {
	
		//User Details Header
		public static By objUserDetailsHeader = By.xpath("//*[@text='User Details']");
		
		//First Name text field
		public static By objFirstName = By.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='First Name']]");
		
		//Last Name text field
		public static By objLastName = By.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Last Name']]");
		
		//Email Address text Field
		public static By objUserEmail = By.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Email Address']]");
		
		//DOB
		public static By objUserDOB = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Date of Birth']]");
		
		//ok button
		public static By objOK = By.xpath("//*[@text='OK']");
		
		//DOB - month
		public static By objDatePickerMonth = By.xpath("(//*[@class='android.widget.NumberPicker'])[1]");
		
		//DOB - date
		public static By objDatePickerDate = By.xpath("(//*[@class='android.widget.NumberPicker'])[2]");
		
		//DOB - year
		public static By objDatePickerYear = By.xpath("(//*[@class='android.widget.NumberPicker'])[3]");
		
		//Gender select
		public static By objGenderSelect = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@class='android.widget.TextView']])[2]");
		
		//Male gender
		public static By objMale = By.xpath("//*[@text='Male']");
		
		//Female gender
		public static By objFemale = By.xpath("//*[@text='Female']");
		
		//Register
		public static By objRegister = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Register']]");
		
		//First name error
		public static By objFirstNameError = By.xpath("//*[@text='Please enter valid first name']");
		
		//Last name error
		public static By objLastNameError = By.xpath("//*[@text='Please enter valid last name']");
		
		//DOB error
		public static By objDOBError = By.xpath("//*[@text='Please select Date of Birth']");
		
		//Email error
		public static By objEmailError = By.xpath("//*[@text='Please enter valid email id']");
		
		//Gender error
		public static By objGender = By.xpath("//*[@text='Please Select Gender.']");
		
		//Toast message
		public static By objToast = By.xpath("//android.widget.Toast[1]");
		
		//None of the above
		public static By objNoneOfAbove = By.xpath("//*[@text='NONE OF THE ABOVE']");
		
		//Internet error
		public static By objInternetError = By.xpath("//*[@text=' Check your connection & try again ']");
		
		//Okay got it button
		public static By objGotItBtn = By.xpath("//*[@text='Okay Got it']");
		
		//Your application can't process
		public static By objProcessError = By.xpath("//*[@text='Your application cannot be processed\nright now.']");
		
		//Offer page
		public static By objOfferHeader = By.xpath("//*[@text='Offer']");
		
		//Male option
		public static By objMaleOption = By.xpath("//*[@text='Male']");
		
		//Gender Cancel Button
		public static By objGenderCancelBtn = By.xpath("//*[@text='CANCEL']");

}
