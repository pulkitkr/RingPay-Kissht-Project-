package com.android.RingPayPages;

import org.openqa.selenium.By;

public class FacebookLoginPage {

	public static By continueWithFacebook = By.xpath("//*[@text='Continue with Facebook']");

	public static By txtFacebook = By.xpath("//*[@nodeName='A' and @width>0 and ./*[@nodeName='I']]");

	public static By enterUserIDOfFacebook = By.xpath("//*[@name='email']");

	public static By enterPasswordOfFacebook = By.xpath("//*[@name='pass']");

	public static By btnLoginOfFacebook = By.xpath("//*[@name='login']");

}
