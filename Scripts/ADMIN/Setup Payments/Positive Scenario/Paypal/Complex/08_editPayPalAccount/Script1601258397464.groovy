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

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_Paypal/button_ChangePaypalAccount'), 0)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_Paypal/button_ChangePaypalAccount'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_Paypal/textfield_email'), 0)

WebUI.setText(findTestObject('ADMIN/Setup Payments/a_Paypal/textfield_email'), 'hiveboxstaging02@yopmail.com')

WebUI.click(findTestObject('ADMIN/Setup Payments/a_Paypal/button_Next'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_Paypal/textfield_password'), 0)

WebUI.setText(findTestObject('ADMIN/Setup Payments/a_Paypal/textfield_password'), 'welcome8')

WebUI.click(findTestObject('ADMIN/Setup Payments/a_Paypal/button_Log In'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_Paypal/textlabelvalue_PaypalAccount'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Setup Payments/a_Paypal/textlabelvalue_PaypalAccount'), 'hiveboxstaging02@yopmail.com')

