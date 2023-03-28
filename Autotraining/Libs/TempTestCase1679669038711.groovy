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


RunConfiguration.setExecutionSettingFile('C:\\Users\\KieuAnh\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Topic 11-12 Checkbox-Radio button-dropdown list\\TC09_Practice1_Demos_Singleslect_Dropdow\\20230324_214358\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Topic 11-12 Checkbox-Radio button-dropdown list/TC09_Practice1_Demos_Singleslect_Dropdow', new TestCaseBinding('Test Cases/Topic 11-12 Checkbox-Radio button-dropdown list/TC09_Practice1_Demos_Singleslect_Dropdow',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
