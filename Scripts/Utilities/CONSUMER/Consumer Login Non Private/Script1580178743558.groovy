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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/linktext_Register'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/linktext_Register'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/textfield_username'), 0)

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_username'), GlobalVariable.CustomConsumer)

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_password'), GlobalVariable.CustomPass)

if (WebUI.verifyElementPresent(findTestObject('Utilities/Cookies/button_Accept Cookies'), 2, FailureHandling.OPTIONAL) == 
true) {
    WebUI.waitForElementVisible(findTestObject('Utilities/Cookies/button_Accept Cookies'), 0)

    WebUI.click(findTestObject('Utilities/Cookies/button_Accept Cookies'))
} else {
    WebUI.delay(1)
}

WebUI.click(findTestObject('CONSUMER/Login Buyer/button_SignIn'))

