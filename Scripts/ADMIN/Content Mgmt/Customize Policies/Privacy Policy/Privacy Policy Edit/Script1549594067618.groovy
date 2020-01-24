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

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms of Service/textlink_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms of Service/textlink_Content Mgmt.'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms of Service/textlink_Customize Policies'), 0)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms of Service/textlink_Customize Policies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms of Service/icon_customize policy'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms of Service/tab_PRIVACY POLICY'), 0)

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms of Service/tab_PRIVACY POLICY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/privacy policy/textarea_privacy'), 
    0)

WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/privacy policy/textarea_privacy'), 'Sample Privacy Policy')

WebUI.click(findTestObject('ADMIN/Customize Policies/Privacy Policy/button_Preview'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms of Service/Preview/textlabel_Sample Terms of Service'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/Preview/textlabel_Sample Terms of Service'), 
    'Sample Privacy Policy')

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Privacy Policy/button_Save'), 0)

WebUI.click(findTestObject('ADMIN/Customize Policies/Privacy Policy/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Privacy Policy/Sucess Toaster Message/div_Successprivacy policy was'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Privacy Policy/Sucess Toaster Message/div_privacy policy was success'), 
    'privacy policy was successfully saved.')

WebUI.verifyElementNotPresent(findTestObject('ADMIN/Customize Policies/Privacy Policy/Sucess Toaster Message/div_privacy policy was success'), 
    0)

