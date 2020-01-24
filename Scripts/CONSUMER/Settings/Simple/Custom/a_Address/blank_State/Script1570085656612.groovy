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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), 0)

WebUI.comment('add First Name')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), firstName)

WebUI.comment('add Last Name')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastNameAddress'), lastName)

WebUI.comment('add Address')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Address'), address)

WebUI.comment('add Country')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), country, false)

WebUI.comment('add State')

WebUI.clearText(findTestObject('CONSUMER/Settings/textfield_State'))

WebUI.comment('add City')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_City'), city, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('add Postal Code')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_PostalCode'), postalCode, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Add'), 0)

WebUI.click(findTestObject('CONSUMER/Settings/button_Add'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/link_AddDeliveryAddress'), 0)

