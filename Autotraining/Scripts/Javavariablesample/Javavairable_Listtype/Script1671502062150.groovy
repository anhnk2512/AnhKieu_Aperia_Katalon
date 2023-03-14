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

public static listypesample(){
	
	//khoi tao list
	def list1 = [1,2,3]
	
	//add item to list using add()
	list1.add(4)
	println(list1)
  
	//khoi tao list khac
	def list2 =[5,6,7]
	
	//add list1 to list2
	list2.addAll(list1)
	println list2
	
	//khoi tao list string
	def list3 = ["apple","samsung","Microsoft"]
	//remove item using remove()
	list3.remove(2)
	println list3
	
	//add list 3 to list 4
	def list4 = ["Oracle","toyota"]
	list3.addAll(list4)
	println list3
	
	//print value using each()
	list3.each{println it}
	
	//Print value using eachWithIndex()
	list3.eachWithIndex{it, i -> println "$i: $it"}
	
	//print value using for()
	for(int i = 0; i < list3.size(); i++){
		println "item: $i, value: ${list3[i]}"
	}
	
}

println(listypesample())

