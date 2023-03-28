import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 Open browser: https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html'
WebUI.openBrowser('https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html')
WebUI.maximizeWindow()

'Step 2: Prepare some items select: [January, February, April]'
List<String> lstmonth = ["January", "February", "April", "December"]

'Step 3: Click on Multiple select dropdown contron on Basic Select section'
WebUI.click(findTestObject('Object Repository/Multiple-select/ddl_multiselect_basic'))

'Step 4: Select item in dropdown base on prepared data at step 2'

for(String item in lstmonth){
	WebUI.check(findTestObject('Object Repository/Multiple-select/lst_multiselect_basic_bytext',['text': item]))
}
'Step 5: Close browser'
WebUI.delay(3)
WebUI.closeBrowser()