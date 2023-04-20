import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 Open browser http://live.techpanda.org/index.php'
WebUI.openBrowser('http://live.techpanda.org/index.php')
WebUI.maximizeWindow()

'Step 2 Click Mobile link'
WebUI.click(findTestObject('Object Repository/Livetechpanda/lnk_mobile'))

'Step 3 Click on Add to Comapare button at Ihone area'
WebUI.click(findTestObject('Livetechpanda/lnk_AddIhonetoCompare'))

'Step 4 Verify selected Iphone to compare successfully'
//verify compare visible
String compare = WebUI.waitForElementVisible(findTestObject('Object Repository/Livetechpanda/ifr_compare'), 10)
if(compare){
	//Verify iphone is added to compare list
	WebUI.verifyElementVisible(findTestObject('Object Repository/Livetechpanda/lnk_iphoneaddcompare'))
	
	//get text message after iphone added to compare list
	String textiphone = WebUI.getText(findTestObject('Object Repository/Livetechpanda/txt_Iphoneadded'))
	
	//verify message after iphone added to compare list
	WebUI.verifyEqual(textiphone, 'The product IPhone has been added to comparison list.')
}

'Step 5 Click on Add to Compare button at Samsung Galaxy area'
WebUI.click(findTestObject('Livetechpanda/lnk_Addsamsungtocompare'))

'Step 6 Verify select Samsung Galaxy to compare successfully'
//Verify samsung is added to compare list
WebUI.verifyElementVisible(findTestObject('Object Repository/Livetechpanda/lnk_samsungaddedcompare'))

//get text message after samsung added to compare list
String textsamsung = WebUI.getText(findTestObject('Object Repository/Livetechpanda/txt_samsungadded'))

//Verify text message after samsung added to compare list
WebUI.verifyEqual(textsamsung, 'The product Samsung Galaxy has been added to comparison list.')

'Step 7: Click on button Compare'
WebUI.click(findTestObject('Object Repository/Livetechpanda/btn_compare'))

'Step 8 Switch to new window and verify the total of phone displayed is 2'
//switch by URL
WebUI.switchToWindowUrl('http://live.techpanda.org/index.php/catalog/product_compare/index/')

//Get total product
int totalproduct = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Livetechpanda/tbt_compareproducts'), 2).size()

//Verify having 2 phones
WebUI.verifyEqual(totalproduct, 2)

'Step 9 Switch to parent window, input Sony Xperia to search textbox'
//Switch by URL
WebUI.switchToWindowUrl('http://live.techpanda.org/index.php/mobile.html')

//string search
String textsearh = 's'

//Set text to search text box
WebUI.setText(findTestObject('Object Repository/Livetechpanda/txt_inputsearch'), textsearh)

'Step 10 Click on Search button'
WebUI.click(findTestObject('Object Repository/Livetechpanda/btn_searchbutton'))

'Step 11 Verify result after search'
//Verify name pruducts contains searching text
WebUI.verifyElementVisible(findTestObject('Object Repository/Livetechpanda/lst_resultsearch',['text': textsearh]))

'Step 12 close broser'
WebUI.delay(3)
WebUI.closeBrowser()

