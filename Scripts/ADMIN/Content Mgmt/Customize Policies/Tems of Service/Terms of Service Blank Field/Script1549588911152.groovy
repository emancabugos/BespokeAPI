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

WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), '')

WebUI.click(findTestObject('ADMIN/Customize Policies/Terms of Service/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Customize Policies/Terms of Service/Error Toaster Message/div_Oops Something went wrong.'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/Error Toaster Message/div_You must add content to th'), 
    'You must add content to the terms of service section')

WebUI.verifyElementNotPresent(findTestObject('ADMIN/Customize Policies/Terms of Service/Error Toaster Message/div_You must add content to th'), 
    0)

