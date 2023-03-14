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
import javaVariable.javaVariable_sample as sample


 '1.boolean sample'
 
	public static void booleansample(String[] args){
		boolean flag = true;
		System.out.println(flag); // prints true
	}
	// print boolean sample
	
	println(booleansample('test'))

	'2. Int type'

	public static void intsample(String[] args){
		int range = -4564654;
		System.out.println(range);
	}
	
	//Print Int
	println(intsample('test'))

	'3.float type'
	public static void floatsample(String[] args){
		float floatnumber = 42.2;
		System.out.println(floatnumber);
	}
 //Print float
	println(floatsample('test'))
	
	'4.Double type'

	public static doublesample(){

		double doublenumber = -5465.5;
		return doublenumber;
	}
	
	//print double
	println(doublesample())

	