import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 Open browser'
WebUI.openBrowser('http://the-internet.herokuapp.com/windows')
WebUI.maximizeWindow()

'Step 2 click here button'
WebUI.click(findTestObject('Object Repository/the-internet-herokuapp/Windows/lnk_clickhere'))

'Step 3 Switch to new tab'
WebUI.switchToWindowIndex(1)

'Step 4 Verify "New Windows" text display'
WebUI.verifyElementText(findTestObject('Object Repository/the-internet-herokuapp/Windows/txt_title'),'New Window' )

'Step 5 Close current tab'
WebUI.closeWindowTitle('New Window')

'Step 6 Switch to parent windows(tab 1)'
WebUI.switchToWindowIndex(0)

'Step 7 close Windows'
WebUI.delay(3)
WebUI.closeBrowser()