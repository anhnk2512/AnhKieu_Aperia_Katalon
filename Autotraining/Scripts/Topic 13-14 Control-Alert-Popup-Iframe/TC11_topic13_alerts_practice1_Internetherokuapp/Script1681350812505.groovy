import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1: Open http://the-internet.herokuapp.com/javascript_alerts'
WebUI.openBrowser('http://the-internet.herokuapp.com/javascript_alerts')
WebUI.maximizeWindow()

'Step 2: Click on button Click for Js Prompt'
WebUI.click(findTestObject('Object Repository/the-internet-herokuapp/btn_jsPrompt'))

'Step 3: Wait for an alert to present in 5 seconds'
WebUI.waitForAlert(5)

'Step 4: Verify Alert text displayed: I am a JS prompt'
//get alert text
String alerttext = WebUI.getAlertText()
println alerttext
//verify alert text
WebUI.verifyEqual(alerttext, 'I am a JS prompt')

'Step 5: Input text to Alert. VD abc'
WebUI.setAlertText('abc')
WebUI.delay(5)

'Step 6: Click OK'
WebUI.acceptAlert()

'Step 7: Verify Alert text display You entered: abc'
String result1 = WebUI.getText(findTestObject('Object Repository/the-internet-herokuapp/txt_promptresult'))
println result1
WebUI.verifyEqual(result1, 'You entered: abc')

'Step 8: Click on button Click for JS Promnt again'
WebUI.click(findTestObject('Object Repository/the-internet-herokuapp/btn_jsPrompt'))
WebUI.delay(5)

'Step 9: Click Cancel'
WebUI.dismissAlert()

'Step 10: Verify Alert text displayed You enterd: null'
String result2 = WebUI.getText(findTestObject('Object Repository/the-internet-herokuapp/txt_promptresult'))
println result2
WebUI.verifyEqual(result2, 'You entered: null')

'Step 11: Close browser'
WebUI.delay(5)
WebUI.closeBrowser()