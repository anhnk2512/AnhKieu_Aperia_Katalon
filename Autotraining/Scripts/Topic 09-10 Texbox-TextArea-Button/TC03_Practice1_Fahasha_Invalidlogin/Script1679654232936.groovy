import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'step 1 Open https://www.fahasa.com/customer/account/create'
WebUI.openBrowser('https://www.fahasa.com/customer/account/create')
WebUI.maximizeWindow()

'step 2  Click to tab “Đăng nhập”'
WebUI.click(findTestObject('Object Repository/fahasa/tab_dangnhap'))

'Step 3 Verify button “Đăng nhập” disabled'

WebUI.verifyElementNotClickable(findTestObject('Object Repository/fahasa/btn_dangnhap'))

'Step 4 Input invalid “Số điện thoại/Email” và “Mật khẩu”'

WebUI.setText(findTestObject('Object Repository/fahasa/txt_username'), 'test@mail.com')

WebUI.setText(findTestObject('Object Repository/fahasa/txt_password'), '123456')

'Step 5 Verify button “Đăng nhập” enabled'

WebUI.verifyElementClickable(findTestObject('Object Repository/fahasa/btn_dangnhap'))

'step 6 Click to button “Đăng nhập”'
WebUI.click(findTestObject('Object Repository/fahasa/btn_dangnhap'))

'step 7 Verify message: Số điện thoại/Email hoặc Mật khẩu sai!'
WebUI.verifyElementText(findTestObject('Object Repository/fahasa/msg_invalid'), 'Số điện thoại/Email hoặc Mật khẩu sai!')

'step 8 close browser'
WebUI.delay(3)
WebUI.closeBrowser()
