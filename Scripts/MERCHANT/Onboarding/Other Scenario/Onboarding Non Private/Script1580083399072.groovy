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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BEASELLER'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BEASELLER'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Non Private/button_create account'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT_UPDATE/Login Seller/button_Create Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Login Seller/textfield_username_new'), varUsername)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Login Seller/textfield_password_new'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Login Seller/textfield_reConfirmPassword_new'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Login Seller/textfield_NotifEmail_new'), varNotifEmail)

WebUI.click(findTestObject('MERCHANT_UPDATE/Login Seller/button_SignUp_new'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/button_dropdownMenu'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/button_dropdownMenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/linktext_Logout'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/linktext_Logout'), FailureHandling.STOP_ON_FAILURE)

