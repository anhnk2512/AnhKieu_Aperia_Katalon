import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Step 1: Open https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

// Maximize current windows
WebUI.maximizeWindow()

'Step 2: Check all checkbox'
//Get total number of checkbox
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Automationfc/chk_all'), 3).size()

//check all checkbox
for(int i = 1; i <= total; i++){
	WebUI.check(findTestObject('Object Repository/Automationfc/chk_allbyindex',['index':i]))
}
'Step 3: Delay some second(about 3s)'
WebUI.delay(3)

'Step 4: Uncheck all checkbox'

for(int j = 1; j <= total; j++){
	WebUI.uncheck(findTestObject('Object Repository/Automationfc/chk_allbyindex',['index':j]))
}

'Step 5: close browser'
WebUI.delay(3)
WebUI.closeBrowser()