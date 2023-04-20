import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 Open https://www.javacodegeeks.com/'
WebUI.openBrowser('https://www.javacodegeeks.com/')
WebUI.maximizeWindow()

'Step 2 Wait for popup display'
boolean popupdisplay = WebUI.waitForElementVisible(findTestObject('Object Repository/Javacodegeeks/btn_closeadpopup'), 30)

'Step 3 if ad popup display, close it'
if(popupdisplay){
	WebUI.click(findTestObject('Object Repository/Javacodegeeks/btn_closeadpopup'))
}

'Step 4 Close browser'
WebUI.delay(3)
WebUI.closeBrowser()