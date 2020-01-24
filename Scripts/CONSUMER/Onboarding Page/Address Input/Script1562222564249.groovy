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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textfield_Address'), 0)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), 'Junelll')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastNameAddress'), 'DeLima')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Address'), '121 Paseo de Roxas, Legazpi Village')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), 'Philippines', false)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_State'), 'Metro Manila')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_City'), 'Makati')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_PostalCode'), '1229')

WebUI.click(findTestObject('CONSUMER/Settings/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/link_AddDeliveryAddress'), 0)

WebUI.click(findTestObject('CONSUMER/Settings/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/search_bar'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

