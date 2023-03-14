package javaVariable

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class javaVariable_sample {

	public static void booleansample(String[] args){
		boolean flag = true;
		System.out.println(flag); // prints true
	}

	// Int type

	public static void intsample(String[] args){
		int range = -4564654;
		System.out.println(range);
	}

	//float type
	public static void floatsample(String[] args){
		float floatnumber = 42.2;
		System.out.println(floatnumber);
	}

	//Double type

	public static doublesample(){

		double doublenumber = -5465.5;
		return doublenumber;
	}
}

