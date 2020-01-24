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

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Terms of Service/icon_customize policy'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/textlabel_Customize your policies for'), 
    'Customize your policies for your own marketplace.')

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/tab_TERMS OF SERVICE'), 'TERMS OF SERVICE')

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/tab_PRIVACY POLICY'), 'PRIVACY POLICY')

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/tab_RETURN POLICY'), 'RETURN POLICY')

WebUI.verifyElementText(findTestObject('ADMIN/Customize Policies/Terms of Service/tab_FAQ'), 'FAQ')

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Terms of Service/button_Preview'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Customize Policies/Terms of Service/button_Save'), 0)

