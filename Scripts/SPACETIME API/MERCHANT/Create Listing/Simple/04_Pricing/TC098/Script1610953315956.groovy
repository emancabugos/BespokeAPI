import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/sidemenu_createListing'), 0)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/sidemenu_createListing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_bookingType'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_bookingType'), 'Default', false)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/sd_Custom'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_specifyServiceDuration'), 0)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_specifyServiceDuration'), 'Day(s)', false)

WebUI.delay(1)

for (int click = 0; click < 29; click++) {
    WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/increase_duration'))
}

WebUI.verifyElementAttributeValue(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_specifyServiceDuration'), 
    'value', '28', 0)

