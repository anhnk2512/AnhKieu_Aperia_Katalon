import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//String type

	public static void stringsample(String[] args){
		String s1 = "    Hello World        ";
		System.out.println(s1);
		//xoa khoang trang
		String strstrim = s1.trim();
		println strstrim;

		//Get chieu dai cua chuoi
		String strlength = s1.length();
		println strlength;

		//checck startwith
		println("Check start with:" + s1.startsWith(" ") );

		//Check end with
		println("check end with:" + s1.endsWith(" "));

		//check equal
		String s2 = "    HELLO WORLD        ";

		println("Check equal:" + s1.equals(s2));

		//check equal is ignoreCase

		println("Check equalusIgnoreCase:" + s1.equalsIgnoreCase(s2));

		//Check contains
		println("Check contains:" + s1.contains("Hello"));

		//Replace string
		println("Check replace: " + s1.replace(" ","space"));

		//Covert chu thuong thanh chu hoa
		println("convert chu thuong thanh chu hoa:" + s1.toUpperCase());

		//Convert chua hoa thanh chu thuong
		println("convert chu hoa thanh chu thuong:" + s1.toLowerCase());

	}

println(stringsample('test'))