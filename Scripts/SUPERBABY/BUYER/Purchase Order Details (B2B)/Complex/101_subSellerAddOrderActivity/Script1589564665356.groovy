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

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/linktext_Back'), 0)

WebUI.scrollToElement(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/dropdown_Stage'), 0)

WebUI.comment('Add Purchase Order')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/dropdown_Stage'), 'Purchase Order', 
    false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textfield_Event'), 'Purchase Order Sub Seller')

'No test data yet\r\n'
WebUI.uploadFile(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_UploadFile'), '')

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_AddNewEntry'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Timestamp'), 0)

WebUI.comment('Add Production')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/dropdown_Stage'), 'Production', false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textfield_Event'), 'Production Sub Seller')

'No test data yet\r\n'
WebUI.uploadFile(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_UploadFile'), '')

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/tab_Production'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_AddNewEntry'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Timestamp'), 0)

WebUI.comment('Add Shipping')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/dropdown_Stage'), 'Shipping', false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textfield_Event'), 'Shipping Sub Seller')

'No test data yet\r\n'
WebUI.uploadFile(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_UploadFile'), '')

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/tab_Shipping'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_AddNewEntry'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Timestamp'), 0)

WebUI.comment('Add Finance')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/dropdown_Stage'), 'Finance', false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textfield_Event'), 'Finance Sub Seller')

'No test data yet\r\n'
WebUI.uploadFile(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_UploadFile'), '')

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/tab_Finance'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_AddNewEntry'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Timestamp'), 0)

WebUI.comment('Add Certification')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/dropdown_Stage'), 'Certification', 
    false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textfield_Event'), 'Certification Sub Seller')

'No test data yet\r\n'
WebUI.uploadFile(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_UploadFile'), '')

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/tab_Certification'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/button_AddNewEntry'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Timestamp'), 0)

