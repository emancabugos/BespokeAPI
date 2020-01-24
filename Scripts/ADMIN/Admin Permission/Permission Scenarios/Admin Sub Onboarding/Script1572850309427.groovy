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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('gmail.com')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), GlobalVariable.SubAdminNotif)

WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_username'))

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_password'), GlobalVariable.GooglePass)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_password'))

WebUI.comment('EDM search')

WebUI.waitForElementVisible(findTestObject('Utilities/Gmail/Seller Invite/textbox_search mail'), 0)

WebUI.setText(findTestObject('Utilities/Gmail/Seller Invite/textbox_search mail'), 'Admin Invite')

WebUI.sendKeys(findTestObject('Utilities/Gmail/Seller Invite/textbox_search mail'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Utilities/Gmail/Seller Invite/textlink_seller invite'), 0)

WebUI.click(findTestObject('Utilities/Gmail/Seller Invite/textlink_seller invite'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Utilities/Gmail/Seller Invite/button_Create Account'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Utilities/Gmail/Seller Invite/button_Create Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Utilities/Gmail/Seller Invite/button_Create Account'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Utilities/Gmail/Seller Invite/button_Create Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Sub Admin Register')

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Sub Admin Onboarding/input_Username'), 0)

WebUI.click(findTestObject('MERCHANT/Seller Register Page/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

