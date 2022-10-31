package com.android.RingPayPages;

import org.openqa.selenium.By;

public class MobileLoginPage {
	
	public static By objCrossBtnHomePopup=By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]]");

	public static By cameraPermissionRequired=By.xpath("//*[@text='Enable Permission']");
	
	public static By allowPermission=By.xpath("//*[@id='permission_allow_foreground_only_button']");
	
	
	public static By textDont_Have_a_QR_code=By.xpath("//*[@text=concat('Don', \"'\", 't have a QR code?')]");
	
	public static By signUp_loginLink=By.xpath("//*[@text='Signup/Login']");
	
	public static By continueWithMobileOpn=By.xpath("//*[@text='Continue with Mobile']");
	
	public static By continueWithNoneOfTheAbove=By.xpath("//*[@text='NONE OF THE ABOVE']");
	
	public static By continueWith=By.xpath("//*[@text='Continue with']");
			
	public static By enterMobileNumberTxtFeild=By.xpath("//*[@class='android.widget.EditText']");
	
	public static By nextBtnOfVerifyMobile=By.xpath("//*[@text='Next']");
	
	public static By enterOTPNumberFiled=By.xpath("//*[@class='android.widget.EditText']");

	
//	public static By basAiseHi=By.xpath("//*[@text='An OTP was sent to you']");
	
	/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	public static By txtResendOtp=By.xpath("//*[@text='Resend OTP']");
	
	public static By txtOtpTimeStamp=By.xpath("//*[@text=' 00:01']");
			
	public static By otpBoxDisable=By.xpath("//*[@focused='false']");
	
	public static By txtDidntReceiveOTP=By.xpath("//*[@text='Didn’t receive OTP?']");
	
	public static By txtEnterOTP=By.xpath("//*[@text='Enter OTP']");
	
	public static By txtAutoReadingOTP=By.xpath("//*[@text='Auto Reading OTP']");
	
	
	
	
	/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	/* Permission Tearm and conditions page */
	
	public static By btnReadAndAccept=By.xpath("//*[@text='Read & Accept']");
	public static By allow=By.xpath("//*[@text='Allow']");
	public static By calendar=By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup'])[5]/*[@class='android.widget.TextView'])[2]");
	public static By monthPick=By.xpath("//*[@class='android.widget.NumberPicker' and ./*[@text='Feb']]");
	public static By datePick=By.xpath("//*[@id='numberpicker_input' and (./preceding-sibling::* | ./following-sibling::*)[@text='02']]");
	public static By yearPick=By.xpath("//*[@id='numberpicker_input' and (./preceding-sibling::* | ./following-sibling::*)[@text='1996']]");
	public static By getCalendar=By.xpath("//*[@id='pickers']");
	
	
	
}
