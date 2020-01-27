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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Landing Page/textlink_be_a_seller'), 0)

WebUI.click(findTestObject('MERCHANT/Landing Page/textlink_be_a_seller'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Non Private/button_create account'), 0)

WebUI.click(findTestObject('MERCHANT/Onboarding/Non Private/button_create account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_username'), 0)

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_username'), varUsername)

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_cofirm_password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_email'), varNotifEmail)

WebUI.click(findTestObject('MERCHANT/Onboarding/Non Private/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Usermenu/icon_dropdown'), 0)

WebUI.click(findTestObject('Utilities/Usermenu/icon_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Usermenu/textlink_Logout'), 0)

WebUI.click(findTestObject('Utilities/Usermenu/textlink_Logout'), FailureHandling.STOP_ON_FAILURE)

