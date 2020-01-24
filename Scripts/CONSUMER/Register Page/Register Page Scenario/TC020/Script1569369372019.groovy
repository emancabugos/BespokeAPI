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

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_username'), 'unbuyer1')

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_password'), '')

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_reconfirm-password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_NotificationEmail'), 'arcadier.tester1@gmail.com')

WebUI.click(findTestObject('MERCHANT/Register Page/button_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Register Page/textbox_password'), 'value', '', 0)

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_username'), '')

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_password'), '')

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_reconfirm-password'), '')

WebUI.setText(findTestObject('MERCHANT/Register Page/textbox_NotificationEmail'), '')

