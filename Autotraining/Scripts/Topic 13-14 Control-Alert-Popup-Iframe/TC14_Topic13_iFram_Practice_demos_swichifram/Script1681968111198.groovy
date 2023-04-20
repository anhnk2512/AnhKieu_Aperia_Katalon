import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 Open browser https://demos.telerik.com/kendo-ui/editor/mvvm'
WebUI.openBrowser('https://demos.telerik.com/kendo-ui/editor/mvvm')
WebUI.maximizeWindow()

'Step 2: Switch to iframe'
WebUI.switchToFrame(findTestObject('Object Repository/Demos/ifra_editor'), 3)

'Step 3: Input text abc to texbox'
WebUI.setText(findTestObject('Object Repository/Demos/txt_editor'), 'abc')

'Step 4: Switch to default content'
WebUI.switchToDefaultContent()

'Step 5 Verify Header displayed "Enter some content"'
String header = WebUI.getText(findTestObject('Object Repository/Demos/txt_header'))
WebUI.verifyEqual(header, 'Enter some content')

'Step 6 close browser'
WebUI.delay(3)
WebUI.closeBrowser()