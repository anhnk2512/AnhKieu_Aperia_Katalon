
package utilites

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
import java.util.Random
import java.util.Set
//import java.util.*
import java.lang.IllegalArgumentException
import java.util.concurrent.ThreadLocalRandom
import java.util.List
import java.util.HashMap
import java.util.Map
//import java.util.HashSet
import java.util.ArrayList
import java.lang.Math

import internal.GlobalVariable

public class Utilites {
	//convert RGB to hexxa
	public static String converRGBToHex(String backgroundColor){
		String[] hexValue = backgroundColor.split("[, rgba()]+")
		int hexValue1 = Integer.valueOf(hexValue[1])
		int hexValue2 = Integer.valueOf(hexValue[2])
		int hexValue3 = Integer.valueOf(hexValue[3])
		String result = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
		return result
	}
	/**
	      * Get random number
	      * @param total
	      * @param numOfItems
	      * @return
	      */

	//get randome
	public static List<String> getRandom(int total, int numOfItems){
		Random rand = new Random()
		Set<String> set = new LinkedHashSet<Integer>();
		while(set.size() < numOfItems)
		{
			int random = rand.nextInt(total) + 1
			set.add(random.toString())
		}
		List<String> result = new ArrayList<>(set)
		return result
	}
}
