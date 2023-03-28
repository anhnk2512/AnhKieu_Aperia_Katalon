import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'step 1: Open browser'

WebUI.openBrowser(GlobalVariable.Katalon_URL)

WebUI.waitForElementVisible(findTestObject('Object Repository/Katalon/txt_Username'), 1)

'step 2: Set Text (username)'

//wait for username visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Katalon/txt_Username'), 1)
//set text for username
WebUI.setText(findTestObject('Object Repository/Katalon/txt_Username'), GlobalVariable.Katalon_USER)

'step 3: Set Text (password)'

WebUI.setText(findTestObject('Object Repository/Katalon/txt_Password'),GlobalVariable.Katalon_PWD)

'Step 4: Click login button'

WebUI.click(findTestObject('Object Repository/Katalon/btn_Login'))
	
'step 5: Verify Text Present (verify button Book Appointment displayed)'

//verify button book Appointment displayed

WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/btn_Bookapointment'))

//get text of book apointment
String text = WebUI.getText(findTestObject('Object Repository/Katalon/btn_Bookapointment'))

//verify text is correct for the button
WebUI.verifyEqual(text, 'Book Appointment')

'Step 6: Close browser'
// delay 3s
WebUI.delay(3)
WebUI.closeBrowser()

