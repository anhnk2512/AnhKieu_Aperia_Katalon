import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\KieuAnh\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Topic 13-14 Control-Alert-Popup-Iframe\\TC11_topic13_practice1_Internetherokuapp_alerts\\20230412_180818\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Topic 13-14 Control-Alert-Popup-Iframe/TC11_topic13_practice1_Internetherokuapp_alerts', new TestCaseBinding('Test Cases/Topic 13-14 Control-Alert-Popup-Iframe/TC11_topic13_practice1_Internetherokuapp_alerts',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
