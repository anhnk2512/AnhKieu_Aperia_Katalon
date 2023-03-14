import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Step 1 Open "https://demo.guru99.com/v4/"'
WebUI.openBrowser('https://demo.guru99.com/v4/')


//WebUI.refresh()

'Step 2: Click "here" link at the bottom'
WebUI.click(findTestObject('Object Repository/Guru99/lnk_here'))

//WebUI.verifyElementVisible(findTestObject('Object Repository/Guru99/page_add'))
//WebUI.verifyAlertPresent(5)
//WebUI.dismissAlert()

//WebUI.switchToWindowTitle('Guru99 Bank Home Page')

'Step 3: Input Email ID'

//refresh page
WebUI.refresh()

//check email ID show?
boolean textemail = WebUI.verifyElementNotPresent((findTestObject('Guru99/txt_emailid')), 30) 
println textemail
 
//Check neu email ID is prenset, input email ID
if (textemail == false)
{
  WebUI.setText(findTestObject('Guru99/txt_emailid'), 'katest@mail.com')
}
//else, click here again then set text for email ID
else
{
	WebUI.click(findTestObject('Object Repository/Guru99/lnk_here'))
	WebUI.setText(findTestObject('Guru99/txt_emailid'), 'katest@mail.com')
}


'Step 4: Click Submit button'

WebUI.click(findTestObject('Object Repository/Guru99/btn_submit'))

'Step 5: Get User ID and password'
//get user id
String userid = WebUI.getText(findTestObject('Guru99/txa_userid'))

//get password
String password = WebUI.getText(findTestObject('Guru99/txa_password'))

'Step 6: Navigate to https://demo.guru99.com/v4/ again'

WebUI.navigateToUrl('https://demo.guru99.com/v4/')

//maximize page
WebUI.maximizeWindow()

'Step 7: Input User ID and password at step 5'
//input User ID
WebUI.setText(findTestObject('Object Repository/Guru99/txt_userid'), userid)

//input password
WebUI.setText(findTestObject('Object Repository/Guru99/txt_password'), password)

'Step 8: Click Login button'
WebUI.click(findTestObject('Object Repository/Guru99/btn_login'))

'Step 9: Verify message: Welcome to Managers Page of Guru99 Bank displayed'

String welcome = WebUI.getText(findTestObject('Object Repository/Guru99/txa_welcome'))
WebUI.verifyEqual(welcome, "Welcome To Manager's Page of Guru99 Bank")

'Step 10: Close browser'
WebUI.delay(3)
WebUI.closeBrowser()
