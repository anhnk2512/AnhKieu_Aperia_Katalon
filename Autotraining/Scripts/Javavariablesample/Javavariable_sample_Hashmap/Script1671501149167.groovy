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

public static void hashmapsample(String[] args){
	//khoi tao
	def emptyMap =[:];

	//create map with provided data
	def map =["name":"Jana", "age":"4", "city": "HCM"];

	//add item to map
	map.put("mother", "KA");
	println map;

	//put map to map1
	def map1 = ["father": "AK"];
	map.putAll(map1);
	println map;

	//Get item by key
	String name = map.get("name");
	println name;

	//remove item by key
	map.remove("father");
	println map;

	//remove item using minus
	def minusMap = map.minus(["city": "HCM", "mother": "KA"]);
	println minusMap;

	//Update value
	map.replace("name", "Tom");

}

println(hashmapsample('test'))

public static void hashmapsample2(String[] args){
	//khoi tao map
	def map = ["name":"Jerry","age":45,"city":"New York","hobby":"singing"]
	
	//Print value using each
	map.each{entry -> println "$entry.key: $entry.value"}
}
println(hashmapsample2('test'))