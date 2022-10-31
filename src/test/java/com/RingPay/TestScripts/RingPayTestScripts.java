package com.RingPay.TestScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.Utilities;
import com.android.RingPayPages.RingLoginPage;
import com.extent.ExtentReporter;
import com.utility.Utilities;

public class RingPayTestScripts {
	 //hello
//hello
//hello
	private com.business.RingPay.RingPayBusinessLogic ringPayBusiness;
	@BeforeTest
	public void Before() throws InterruptedException {
		Utilities.relaunch = true;
		ringPayBusiness = new com.business.RingPay.RingPayBusinessLogic("ring");
	}
	
	/*@Test
	@Parameters({"Valid_MobileNumber","validOTP"})
	public void playStore(String mob,String otp) throws Exception {
		ringPayBusiness.otpTimerStart(mob,otp);
		//ExtentReporter.jiraID = "PP-28";
	}*/
	
	
	@Test(priority = 0)
	@Parameters({"Valid_MobileNumber","EditValid_MobileNumber","LessThanTenDigits_MobileNumber","MoreThanTenDigits_MobileNumber","SpecialCharacters_MobileNumber","Space_MobileNumber","LessThanSixDigitOTP","InvalidOTP"})
    public void  User_Playstore_Flow(String validMob, String editMob, String lessThanTenMob, String moreThanTenMob,String specialCharMob, String spaceMob,String lessOtp, String invalidOtp) throws Exception {
		ringPayBusiness.User_Play_Store_Flow(validMob,editMob,lessThanTenMob,moreThanTenMob,specialCharMob,spaceMob,lessOtp,invalidOtp);
		RingLoginPage.getEditMob(editMob);
	} 
	
	@Test(priority = 1)
	@Parameters({"Month","Date","Year","Gender"})
	public void userRegistrationFlow(String month, String date, String year,String gender) throws Exception {
		ringPayBusiness.User_Registration_Flow(month,date,year,gender);
		
		//ringPayBusiness.dateOfBirth(month, date, year);
	}
	
	@Test(priority=2)
	public void merchantFlow() throws Exception{
		ringPayBusiness.merchantFlow();
	}
	
	/*@Test(priority = 1)
	@Parameters({"MobileNumber"})
	public void ringPayLogin(String mobileNumber) throws Exception {
		ringPayBusiness.ringPayLogin(mobileNumber);
		ExtentReporter.jiraID = "PP-29";
	}
	
	@Test(priority = 2)
	@Parameters({"MerchantID","exceedAmount","withinLimitAmount"})
	public void ringMerchantPay(String merchantID, String exceedAmount, String withinLimitAmount) throws Exception{
		ringPayBusiness.ringPaymentMerchant(merchantID,exceedAmount,withinLimitAmount);
		ringPayBusiness.ringPayTransactionDetails();
		ExtentReporter.jiraID = "PP-30";
	}
	
	@Test(priority = 3)
	@Parameters({"CVV","MobileNumber"})
	public void ringRepayment(String cvv,String reLoginMobNumber) throws Exception{
		ringPayBusiness.ringRepayment(cvv,reLoginMobNumber);
		ExtentReporter.jiraID = "PP-50";
	}
	
	@Test(priority = 4)
	public void ringLogout() throws Exception{
		ringPayBusiness.ringPayLogout();
		ExtentReporter.jiraID = "PP-51";
	}
	
	@Test(priority = 5)
	@Parameters({"OTP-URI"})
	public void ringOtpApi_Positive(String url) throws Exception {
		ringPayBusiness.valid_otp_200(url);
		ExtentReporter.jiraID = "PP-52";
	}
	
	@Test(priority = 6)
	@Parameters({"OTP-URI"})
	public void ringOtpApi_Negative(String url) throws Exception {
		ringPayBusiness.invalid_otp_400(url);
		ExtentReporter.jiraID = "PP-53";
	}
	
	@Test(priority = 7)
	@Parameters({"AuthenticationURI"})
	public void ringAuthApi_Positive(String url) throws Exception{
		ringPayBusiness.valid_auth_200(url);
		ExtentReporter.jiraID = "PP-54";
	}
	
	@Test(priority = 8)
	@Parameters({"AuthenticationURI"})
	public void ringAuthApi_Negative(String url) throws Exception{
		ringPayBusiness.invalid_auth_400(url);
		ExtentReporter.jiraID = "PP-55";
	}
	
	@AfterTest
	public void ringAppQuit() throws Exception{
		ringPayBusiness.TearDown();
	}*/
}
