import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_first_name'), 'Tea')

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_last name'), 'Cool')

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_address'), '29th Flr Rufino Plaza V.A. Rufino Ave.')

WebUI.selectOptionByLabel(findTestObject('MERCHANT/User Settings/Address/dropdown_country'), '(Select Country)', false)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_state'), 'Philippines')

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_City'), 'Makati')

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_postal_code'), '1200')

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT/User Settings/Address/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/User Settings/Address/dropdown_country'), 'value', '', 0)

