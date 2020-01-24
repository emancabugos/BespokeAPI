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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Landing Page/logo_marketplace'), 0)

WebUI.click(findTestObject('CONSUMER/Landing Page/button_Sign in as Seller'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Verify UI present')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Login Seller/back_button'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/back_button'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Login Seller/textlabel_Login as a Seller'), 'Login as a Seller')

WebUI.verifyElementText(findTestObject('MERCHANT/Login Seller/textlabel_Sign In'), 'Sign In')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/button_Google Login'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/button_Facebook Login'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Login Seller/textlabel_or'), 'or')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/textbox_username'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Login Seller/textbox_username'), 'placeholder', 'Email/Username', 
    0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/textbox_password'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Login Seller/textbox_password'), 'placeholder', 'Password', 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/checkbox_Remeber me'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Login Seller/textlabel_Remeber me'), 'Remember me')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/button_Sign In'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Login Seller/textlink_Forgotten your password'), 'Forgotten your password?')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Login Seller/button_Contact us'), 0)

