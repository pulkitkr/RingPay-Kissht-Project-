package com.android.RingPayPages;

import org.openqa.selenium.By;


public class RingLoginPage {
	
	//Camera permission header
	public static By objCamPermHeader = By.xpath("//*[@text='Camera Permission required']");
	
	//camera permission popup
	public static By objCamPermPopUp = By.xpath("//*[@text='Enable Permission']");
	
	//Allow camera while using app foreground popup
	public static By objAllowCamera = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");
	
	//QR Code/ Don't have QR code? header
	public static By objQrCodeHeader = By.xpath("//*[@text=concat('Don', \"'\", 't have a QR code?')]");
	
	//Signup/Login link 
	public static By objLoginLink = By.xpath("//*[@text='Signup/Login']");
	
	//Signup/Login header
	public static By objLoginHeader = By.xpath("//*[@text='Sign Up / Login']");
	
	//Mobile login option
	public static By objLoginMobile = By.xpath("//*[@text='Continue with Mobile']");
	
	//Google Login option
	public static By objLoginGoogle = By.xpath("//*[@text='Continue with Google']");
	
	//Facebook Login option
	public static By objLoginFacebook = By.xpath("//*[@text='Continue with Facebook']");
	
	//Terms of services footer link text
	public static By objTermsLink_PrivacyFooter = By.xpath("//*[@text=' Terms of Services &  Privacy Policy']");
	
	//truecaller skip button
	public static By objTruSkipBtn = By.xpath("//*[@text='SKIP']");
	
	//None of the above button
	public static By objNoneBtn = By.xpath("//*[@resource-id='com.google.android.gms:id/cancel']");
	
	//Verify mobile header
	public static By objVerifyMobHeader = By.xpath("//*[@text='Verify Mobile']");
	
	//Enter mobile text field
	public static By objMobTextField = By.xpath("//*[@class='android.widget.EditText']");
	
	//Next button
	public static By objNextBtn = By.xpath("//*[@text='Next']");
	
	//Invalid mobile no text
	public static By objMobError = By.xpath("//*[@text=' Please enter valid mobile number']");
	
	//entered mob number
	public static By getEditMob(String editMob) {
	return By.xpath("//*[@text='OTP Sent To +91 "+ editMob +" ']");
	}
	//Enter OTP header
	public static By objOtpHeader = By.xpath("//*[@text='Enter OTP']");
	
	//OTP time text
	public static By otpTimerTxt = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]/*[@text])[2]");
	
	//Did not receive OTP
	public static By OtpTimeOut = By.xpath("//*[contains(text(),'receive OTP?']");
	
	//Auto-read OTP text
	public static By OtpAutoRead = By.xpath("//*[@text='Auto Reading OTP']");
	
	//Resend OTP txt
	public static By resendOtpTxt = By.xpath("//*[@text='Resend OTP']");
	
	//Wrong OTP text
	public static By OtpError = By.xpath("//*[@text='You have entered incorrect or expired OTP']");
	
	//Edit mobile number
	public static By objEditMobNo = By.xpath("//*[@text='Edit']");
	
	//OTP text place first
	public static By objOtpTxtField1 = By.xpath("//*[@class='android.widget.EditText']");
	
	//Ring permissions page (SMS, Location & Phone)
	public static By objRingPermissionsHeader = By.xpath("//*[@text='Permissions']");
	
	//Read & Accept button
	public static By objReadAcceptBtn = By.xpath("//*[@text='Read & Accept']");
	
	//Location access popup
	public static By objLocAccess = By.xpath("//*[@text='WHILE USING THE APP']");
	
	//Phone access popup
	public static By objPhoneAccess = By.xpath("//*[@text='ALLOW']");
	
	//SMS access popup
	public static By objSMSAccess = By.xpath("//*[@text='ALLOW']");
	
	//You have been chosen ad header
	
	public static By objAdHeader = By.xpath("//*[@text='You’ve been chosen!']");
	
	//Ad close button
	public static By objAdCloseBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]]");
	
	//available limit header 
	public static By objAvailLimitHeader = By.xpath("//*[@text='Available Limit']");
	
	//Scan QR Code button
	public static By objScanQRBtn = By.xpath("(((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[./parent::*[./parent::*[@class='android.widget.FrameLayout']]]]]]]]]/*[@class='android.view.ViewGroup'])[2]/*[@class='android.view.ViewGroup'])[1]/*/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]])[3]");
	
	//Use your credit limit header
	public static By objCreditLimitHeader = By.xpath("//*[@text='Use your credit limit to complete this payment.']");
	
	//receiver account UPI
	public static By objReceiverID = By.xpath("//*[@text='rpy.ipmerchant1234191702@icici']");
	
	//Money Text field
	public static By objPaymentField = By.xpath("//*[@class='android.widget.EditText']");
	
	//Exceeded limit error text
	public static By objExceedLimitMsg = By.xpath("//*[@text='You have entered a higher amount than your available limit. Re-enter the amount.']");
	
	//Pay now button
	public static By objPayNowBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Pay Now']]");
	
	//Confirm payment header
	public static By objConfPayHeader = By.xpath("//*[@text='Confirm Payment']");
	
	//Enter MPIN header
	public static By objPinHeader = By.xpath("//*[@text='Enter Transaction Security PIN']");
	
	//MPIN text field
	public static By objPinTxtField = By.xpath("//*[@class='android.widget.EditText']");
	
	//MPIN error message
	public static By objIncorrectPinTxt = By.xpath("//*[@text='Incorrect PIN']");
	
	//MPIN Continue button
	public static By objContinueBtn = By.xpath("//*[@text='Continue']");
	
	//Payment done page
	public static By objPaymentDoneHeader = By.xpath("//*[@text='Payment Done!']");
	
	//Payment Success message
	public static By objSuccessMsg = By.xpath("//*[@text='2 was successfully transferred using your']");
	
	//Available limit
	public static By objCurrentSpends = By.xpath("//*[@text='Current Spends']/following-sibling::android.widget.TextView");
	
	//Goto homepage button
	public static By objHomePageBtn = By.xpath("//*[@text='Go to Homepage']");
	
	//Recent transaction 
	public static By objRecentTrans = By.xpath("//*[@text='- ₹1.00']");
	
	//Transaction details header
	public static By objTransacDetailHeader = By.xpath("//*[@text='Transaction Details']");
	
	//Transaction number
	public static By objTransacNumber = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]]/*[@text])[9]");
	
	//Transaction button
	public static By objTransacBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Transactions'] and ./*[@class='android.view.ViewGroup']]");
	
	//Recent Transactions Header
	public static By objRecentTransHeader = By.xpath("//*[@text='Recent Transactions']");
	
	//Most recent transaction
	public static By objMostRecentTrans = By.xpath("(//*[@text='Si Creva Capital Pvt Ltd'])[1]");
	
	//Back button on transaction details page
	public static By objBackBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Transaction Details'] and ./*[@class='android.view.ViewGroup']]");
	
	//Pay early button for repayment
	public static By objPayEarlyBtn = By.xpath("//*[@text='Pay Early']");
	
	//Repayment page
	public static By objRepaymentHeader = By.xpath("//*[@text='Payment']");
	
	//Amount due radio button
	public static By objAmtDueBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.RadioButton']]]");
	
	//Total amount due 
	public static By objAmtDue = By.xpath("//*[@id='amount']");
	
	//Amount to be paid radio button
	public static By objAmtToBeBtn = By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]/*[@class='android.view.ViewGroup'])[1]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.RadioButton']])[2]");
	
	//Convenience fees text
	public static By objConvFeesTxt = By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[5]/*[@text])[2]");
	
	//Net Banking and Debit card button
	public static By objCardOptionBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Net Banking & Debit Card'] and ./*[@class='android.view.ViewGroup']]");
	
	//Ring test loan payment header
	public static By objLoanPaymentHeader = By.xpath("//*[@text='Test Loan payment']");
	
	//Card option 
	public static By objCardOption =  By.xpath("//*[@text='Card Visa, MasterCard, RuPay, and Maestro']");
	
	//Enter OTP repayment header 
	public static By objOtpRepaymentHeader = By.xpath("//*[@text='Enter OTP sent to +919731239214 to access Saved Cards']");
	
	//OTP Foreground allow button
	public static By objOtpForeAllow = By.xpath("//*[@text='Allow']");
	
	//Enter OTP text field
	public static By objOtpTextField = By.xpath("//*[@id='otp']");
	
	//Verify OTP button
	public static By objVerifyBtn = By.xpath("//*[@text='VERIFY']");
	
	//Your saved cards header
	public static By objSavedCardsHeader = By.xpath("//*[@text='YOUR SAVED CARDS']");
	
	//repayment fail card number
	public static By objRepayFailCardNo = By.xpath("//*[@id='card_number']");
	
	//repayment fail expiry date
	public static By objRepayFailCardExpiry = By.xpath("//*[@id='card_expiry']");
	
	//repayment fail card holder name
	public static By objRepayFailHolderName = By.xpath("//*[@id='card_name']");
	
	//repayment fail card cvv
	public static By objRepayFailCVV = By.xpath("//*[@id='card_cvv']");
	
	//repayment fail via card/net banking
	public static By objRepayFailPopup = By.xpath("//*[@text='Something went wrong, please try again after sometime.']");
	
	//repayment fail retry button
	public static By objRepayFailRetryBtn = By.xpath("//*[@text='RETRY']");
	
	//Hardcoded card select
	public static By objCardSelect = By.xpath("//*[@text='Card ending with 1111']");
	
	//CVV text field
	public static By objCVVField = By.xpath("//*[@class='android.widget.EditText']");
	
	//PAY footer button
	public static By objPayFooterBtn = By.xpath("//*[@class='android.widget.Button']");
	
	//Welcome to razorpay software pvt ltd header
	public static By objRazorPayHeader = By.xpath("//*[@text='Welcome to Razorpay Software Private Ltd Bank']");
	
	//Success button
	public static By objSuccessBtn = By.xpath("//*[@text='Success']");
	
	//Repayment successfull text
	public static By objRepaySuccessMsg = By.xpath("//*[@text='Your payment was successful']");
	
	//Go to home page
	public static By objGoHomePageBtn = By.xpath("//*[@text='Go to Homepage']");
	
	//Ring repayment received home page
	public static By objRepayReceivedLogo = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Ring Repayment']]");
	
	//Menu select
	public static By objTopMenu = By.xpath("//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Available Limit']]]");
	
	//Customer profile select
	public static By objProfileSelect = By.xpath("//*[@text='Your Profile is incomplete']");
	
	//Logout button 
	public static By objLogoutBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Logout']]");
	
	//Logout popup
	public static By objLogoutTxt = By.xpath("//*[@text='Are you sure you want to logout?']");
	
	//Logout yes button
	public static By objYesBtn = By.xpath("//*[@text='Yes']");
	
	//Are you enjoying No button
	public static By objNoBtn = By.xpath("//*[@text='No']");
	
	public static By txtBlockPhoneNoPopupMessage=By.xpath("//*[@text='Your Ring account has been temporarily blocked due to security reasons. Try again after 2 minutes.']");
	
	public static By btnOkGotIt=By.xpath("//*[@text='Ok, Got It!']");
	
	public static By objOkGotitBtn = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Ok, Got It!']]");
	
	
	
}
