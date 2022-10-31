package com.android.RingPayPages;

import org.openqa.selenium.By;

public class RingPromoCodeLogin {
	
	// Promocode Page header
    public static By objPromoCodePageHeaderText = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./parent::*[./parent::*[@class='android.widget.ScrollView']]]]/*[@text and @class='android.widget.TextView'])[1]");
    
    public static By objEnterAmt = By.xpath("//*[@class='android.widget.EditText']");
    
    public static By objRupeeSymbol = By.xpath("//*[@text='₹']");
    
    public static By objPayBtn = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ScrollView']]/*/*[@text and @class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup']])[2]");
    
    public static By objLoginPageHeader = By.xpath("//*[contains(@text,'Sign Up / Login')]");

}
