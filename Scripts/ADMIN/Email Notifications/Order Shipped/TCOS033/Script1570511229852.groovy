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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), 'Order', 
    false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Booking End Time'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Booking'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/CheckInCheckOutHour'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Invoice No'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Order History URL'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Order ID'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Order Item String'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Order Item'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Paid'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Quantity'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Review Prompt Item String'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Show Time'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/Timestamp'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/Order Parameter/To Be Collected'))

