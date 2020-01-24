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

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), 'Consumer', 
    false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Consumer Address'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Consumer Contact'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Consumer Email'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Consumer Firstname'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Consumer Lastname'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Consumer LoginID'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Delivery Address'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Delivery Method Name'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Consumer Parameters/Delivery Method'))

