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

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/sidemenu_Advanced'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/sidemenu_Advanced'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/sidemenu_Private Settings'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/sidemenu_Private Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/textlabel_Restricted Access Setting'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/toggle_on off'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/textbox_page title'), 0)

WebUI.setText(findTestObject('ADMIN/Private Settings/textbox_page title'), 'TRILLIA')

WebUI.setText(findTestObject('ADMIN/Private Settings/textbox_about us'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.setText(findTestObject('ADMIN/Private Settings/textbox_WebsiteLink'), 'arcadier.com')

WebUI.click(findTestObject('ADMIN/Private Settings/Add Photo/button_Browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Private Settings/input_thumb'), 'C:\\\\Katalon\\\\Image\\\\aurora.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Add Photo/button_ok'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/Add Photo/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Add Photo/button_add photo'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/Add Photo/button_add photo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Private Settings/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Private On/div_Configure Settings'), 0)

