package com.android.RingPayPages;

import org.openqa.selenium.By;

public class RingPayMerchantFlowPage {

	
//  public static By objCamPermRequired = By.xpath("//*[@text='Camera Permission required']");
  public static By objCamPermRequired = By.xpath("//*[contains(@text,'Camera Permission required')]");
  public static By objEnablePermission = By.xpath("//*[contains(@text,'Enable Permission')]");
  public static By objAllowPermissionPopup = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_message']");
  public static By objAllowPermissionBtn = By.xpath("//*[contains(@text,'While using the app')]");
  
  //QR Code
  public static By objScanQRCodeText = By.xpath("//*[contains(@text,'Scan any QR to get started')]");
  public static By obDontHaveQRCodeText = By.xpath("(//android.widget.TextView)[2]");
  //public static By obDontHaveQRCodeText = By.xpath("//*[contains(@text,'Don't have a QR code?')]");
  public static By objSignUpORLoginLink = By.xpath("//*[contains(@text,'Signup/Login')]");
  
  //Credit
  public static By objCreditAtZeroPopUp = By.xpath("//*[contains(@text,'Credit at Zero Charges?')]");
  public static By objYesPleaseText = By.xpath("//*[contains(@text,'Yes, please!!')]");
  public static By objZeroFeesText = By.xpath("//*[contains(@text,'Zero fees on all your transactions')]");
  public static By objKeepUsingQRText = By.xpath("//*[contains(@text,'Keep using Scan & Pay to save more')]");
  
  //Payment             Use your credit limit to complete this payment.
  public static By objUseCreditLimitText = By.xpath("//*[contains(@text,'Use your credit limit to complete this payment.')]");
  public static By objPayingTo = By.xpath("//*[contains(@text,'Paying to')]");
  public static By objPayTypeMethod = By.xpath("(//android.widget.TextView)[4]");
  public static By objUpiID = By.xpath("(//android.widget.TextView)[5]");
  public static By objBenefitMsg = By.xpath("(//android.widget.TextView)[6]");
  public static By objAmountTextField = By.xpath("//android.widget.EditText");
  public static By objTransactionMsg = By.xpath("(//android.widget.TextView)[8]");
  public static By objPayNowBtn = By.xpath("//*[contains(@text,'Pay Now')]");
  
  //login
  public static By objLoginPageHeader = By.xpath("//*[contains(@text,'Sign Up / Login')]");
  public static By objContinueWithMobileCTA = By.xpath("//*[contains(@text,'Continue with Mobile')]");
  public static By objContinueWithGoogleCTA = By.xpath("//*[contains(@text,'Continue with Google')]");
  public static By objContinueWithFacebookCTA = By.xpath("//*[contains(@text,'Continue with Facebook')]");
}
