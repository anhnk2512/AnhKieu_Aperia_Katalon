import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Step 1: Prepare list data to check on checkbox'
List<String> lstcheckbox = ["Anemia", "Cancer", "Bleeding Disorders", "Kidney Disease"]

'Step 2: Open https://automationfc.github.io/multiple-fields/'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

// Maximize current windows
WebUI.maximizeWindow()

'Step 3: Check follow list data tha prepared at step 1'
for(String item in lstcheckbox){
	WebUI.check(findTestObject('Object Repository/Automationfc/chk_allbytext',['text': item]))
}

'Step 4: close browser'
WebUI.delay(3)
WebUI.closeBrowser()