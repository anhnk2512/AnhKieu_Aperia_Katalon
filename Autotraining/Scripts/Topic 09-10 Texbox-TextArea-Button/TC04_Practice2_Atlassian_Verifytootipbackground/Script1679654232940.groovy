import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Step 1: Open https://atlassian.design/components/tooltip/examples'

 WebUI.openBrowser('https://atlassian.design/components/tooltip/examples')

//maximize page
WebUI.maximizeWindow()
WebUI.mouseOver(findTestObject('Atlassian/btn_hoverovertome'))

'Step 3: Verify tooltip "Hello Word"'
WebUI.verifyElementText(findTestObject('Object Repository/Atlassian/txt_hellowold'), 'Hello World')

'Step 4: Get background color of "Hover over me" button when hover'

String background = WebUI.getCSSValue(findTestObject('Atlassian/btn_hoveredovertome'),'background')
println background
//covert background clolorfind

String newbackground = utilites.Utilites.converRGBToHex(background)
println newbackground

'Step 5: Verify background color after hover is displayed correctly'
WebUI.verifyEqual(newbackground, '#0055cc')

'Step 6: Close browser'
//delay 5s
WebUI.delay(5)
WebUI.closeBrowser()