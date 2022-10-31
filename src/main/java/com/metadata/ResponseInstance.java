package com.metadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import static com.jayway.restassured.RestAssured.given;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import org.testng.Reporter;
import com.propertyfilereader.PropertyFileReader;
import com.utility.LoggingUtils;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseInstance {

	protected static Response resp = null;
	public static String assetSubType = "Empty";
	static LoggingUtils logger = new LoggingUtils();
	public static String searchContentID = null;
	public static String pageName = "shows";
	public static boolean trailer = false;
	public static String newEmailID = null;
	public static String newPassword = null;
	public static String sub = null;
	public static String AdvertiseId = "7e128be0-8f02-4eb4-93e4-e7382eb01d82";
	public static String GuestLanguage = "en-kn";

	public static Response getResponse() {
		resp = RestAssured.given().urlEncodingEnabled(false).when().get(
				"https://gwapi.zee5.com/content/collection/0-8-homepage?limit=20&page=1&item_limit=20&desc=no&version=6&translation=en&languages=en,kn&country=IN");
		return resp;
	}

	public static Response getResponse(String URL) {
		resp = RestAssured.given().urlEncodingEnabled(false).when().get(URL);
		System.out.println(resp.statusCode());
		return resp;
	}

	}
