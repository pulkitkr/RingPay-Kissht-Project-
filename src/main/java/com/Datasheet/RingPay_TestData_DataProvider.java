package com.Datasheet;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.utility.Utilities;

//import com.utils.Excel;

public class RingPay_TestData_DataProvider extends Utilities{
	
	public static String excelPath()
	{
		String os = System.getProperty("os.name");
		String path = System.getProperty("user.dir");
		String filePath;
		if(os.equalsIgnoreCase("windows 10")){
			filePath = path + "\\src\\main\\java\\com\\Datasheet\\RingPayAPI_TestData_" + "stage" + ".xlsx";

		}
		else{
			filePath = path + "//src//main//java//resources//RingPayAPI_TestData_" + "env" + ".xlsx";

			}
		return filePath;
	}

	@DataProvider(name = "RingPayAPI")
    public static Object[][] RingPayAPIData(String testCaseName) throws IOException{
		return getTestData(excelPath(), "RingPayData", testCaseName);
	}

}


