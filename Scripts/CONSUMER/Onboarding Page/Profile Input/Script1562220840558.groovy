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

WebUI.waitForElementVisible(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'), 0)

WebUI.click(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/linktext_Settings'), 0)

WebUI.click(findTestObject('CONSUMER/Settings/linktext_Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textlabel_UserSettings'), 0)

WebUI.click(findTestObject('CONSUMER/Settings/button_Change'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), 'C:\\Katalon\\Image\\jonel.png')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_DisplayName'), 'Junelll')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstName'), 'Junelll')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastName'), 'DeLima')

WebUI.verifyElementAttributeValue(findTestObject('CONSUMER/Settings/textfield_Email'), 'value', GlobalVariable.ConsumerNotif, 
    0)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Contact'), '+631234567890')

WebUI.click(findTestObject('CONSUMER/Settings/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)

