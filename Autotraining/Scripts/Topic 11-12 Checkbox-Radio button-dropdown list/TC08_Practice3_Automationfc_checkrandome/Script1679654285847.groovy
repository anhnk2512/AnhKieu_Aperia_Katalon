import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import utilites.Utilites


'Step 1: Open https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

// Maximize current windows
WebUI.maximizeWindow()

'Step 2: check random some checkbox'
//Get total number of checkbox
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Automationfc/chk_all'),30).size()

//Get some randome item
List<String> lstRandom = utilites.Utilites.getRandom(total, 3)
println lstRandom

//check random some checkbox
for(String index in lstRandom){
	WebUI.check(findTestObject('Object Repository/Automationfc/chk_allbyindex',['index':index]))
}

'Step 3: close browser'
WebUI.delay(3)
WebUI.closeBrowser()