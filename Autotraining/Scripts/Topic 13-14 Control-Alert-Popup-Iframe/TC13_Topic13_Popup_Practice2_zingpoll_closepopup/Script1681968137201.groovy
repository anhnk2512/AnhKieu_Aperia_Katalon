import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 open browser'
WebUI.openBrowser('https://www.zingpoll.com/')
WebUI.maximizeWindow()

'Step 2 click on Sign in tab'
WebUI.click(findTestObject('Object Repository/zingpoll/tab_signin'))

'Step 3 wait for popup display'
boolean poupsignindisplay = WebUI.waitForElementVisible(findTestObject('Object Repository/zingpoll/btn_closesignin'), 10)

'Step 4 Click on Sign in Button'
if(poupsignindisplay){
	WebUI.click(findTestObject('Object Repository/zingpoll/btn_signin'))
}

'Step 5 verify invalidaiotn message "Please enter your email/password"'
String invalidemail = WebUI.getText(findTestObject('Object Repository/zingpoll/txt_emailinvalidmessage'))
String invalidpassword = WebUI.getText(findTestObject('Object Repository/zingpoll/txt_passwordinvalidmessage'))

WebUI.verifyEqual(invalidemail, 'Please enter your email.')
WebUI.verifyEqual(invalidpassword,'Please enter your password')
WebUI.delay(5)

'Step 6 Close popup'
WebUI.click(findTestObject('Object Repository/zingpoll/btn_closesignin'))

'Step 7 Close browser'
WebUI.delay(3)
WebUI.closeBrowser()