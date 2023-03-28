import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Step 1: Open https://demos.telerik.com/kendo-ui/dropdownlist/index'

WebUI.openBrowser('https://demos.telerik.com/kendo-ui/dropdownlist/index')
//Maximize current Windows
WebUI.maximizeWindow()

'Step 2: Click Categoties dropdown control'
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Demos/ddl_category'))

'Step 3: Select item on Categories dropdown'
String item = 'Beverages'
WebUI.click(findTestObject('Demos/lst_categorybytext',['text': item]))

'Step 4: Close browser'
WebUI.delay(3)
WebUI.closeBrowser()
