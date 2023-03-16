import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling


'Step 1 Open "https://demo.guru99.com/v4/"'
WebUI.openBrowser('https://demo.guru99.com/v4/')
//maximize page
//WebUI.maximizeWindow()

//WebUI.refresh()
'Step 2: Click "here" link at the bottom'
WebUI.click(findTestObject('Object Repository/Guru99/lnk_here'))

'Step 3: Input Email ID'
//delay
WebUI.delay(5)

//check ad present
if(WebUI.verifyElementPresent(findTestObject('Guru99/frm_ad'),3, FailureHandling.OPTIONAL)==true){
	//switch to ad iframe
	WebUI.switchToFrame(findTestObject('Guru99/frm_ad'), 0)
	//WebUI.doubleClick(findTestObject('Guru99/frm_ad'))
	//close the ad
	WebUI.click(findTestObject('Object Repository/Guru99/btn_closead'))

}
  //Switch to default page
	WebUI.switchToDefaultContent()
	
	//input email ID
	WebUI.setText(findTestObject('Object Repository/Guru99/txt_emailid'), 'katest@mail.com')
	
	'Step 4: Click Submit button'
	WebUI.click(findTestObject('Object Repository/Guru99/btn_submit'))
	
	//get user id
	'Step 5: Get User ID and password'
	String userid = WebUI.getText(findTestObject('Guru99/txa_userid'))
	
	//get password
	String password = WebUI.getText(findTestObject('Guru99/txa_password'))
	
	'Step 6: Navigate to https://demo.guru99.com/v4/ again'
	WebUI.navigateToUrl('https://demo.guru99.com/v4/')
	
	//maximize page
	WebUI.maximizeWindow()
	
	//input User ID
	'Step 7: Input User ID and password at step 5'
	WebUI.setText(findTestObject('Object Repository/Guru99/txt_userid'), userid)
	
	//input password
	WebUI.setText(findTestObject('Object Repository/Guru99/txt_password'), password)
	
	'Step 8: Click Login button'
	WebUI.click(findTestObject('Object Repository/Guru99/btn_login'))
	
	'Step 9: Verify message: Welcome to Managers Page of Guru99 Bank displayed'
	String welcome = WebUI.getText(findTestObject('Object Repository/Guru99/txa_welcome'))
	
	WebUI.verifyEqual(welcome, 'Welcome To Manager\'s Page of Guru99 Bank')
	
	'Step 10: Close browser'
	WebUI.delay(3)
	
	WebUI.closeBrowser()
