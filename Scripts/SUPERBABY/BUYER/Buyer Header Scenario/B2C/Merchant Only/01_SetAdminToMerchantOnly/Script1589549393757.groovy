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

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/sidemenu_Advanced'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/sidemenu_Advanced'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/sidemenu_Private Settings'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/sidemenu_Private Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/toggle_on off'), 0)


    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Private Settings/toggle_on off'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/span_Seller Sign Up'), 0)

    WebUI.click(findTestObject('ADMIN/Private Settings/span_Seller Sign Up'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Private Settings/textbox_page title'), 'Merchant Only')

WebUI.setText(findTestObject('ADMIN/Private Settings/textbox_about us'), 'Merchant Only')

WebUI.setText(findTestObject('ADMIN/Private Settings/textbox_WebsiteLink'), 'https://www.google.com')

WebUI.comment('Upload an image')

WebUI.click(findTestObject('ADMIN/Private Settings/Add Photo/button_Browse'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/input_thumb'), 0)

WebUI.uploadFile(findTestObject('ADMIN/Private Settings/input_thumb'), 'C:\\Katalon\\BespokeAPI\\Images\\Category\\1.png')

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Add Photo/button_ok'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/Add Photo/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Add Photo/button_add photo'), 0)

WebUI.click(findTestObject('ADMIN/Private Settings/Add Photo/button_add photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Private Settings/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/Private Settings On UI/button_View Buyer List'), 0)

