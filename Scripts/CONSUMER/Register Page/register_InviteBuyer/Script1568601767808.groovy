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

WebUI.navigateToUrl('https://www.gmail.com')

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_username'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_username'), GlobalVariable.ConsumerNotif)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_password'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_password'), GlobalVariable.GooglePass)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Buyer Invite')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Buyer Invite'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Buyer Invite'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/button_Create Account'), 0)

WebUI.click(findTestObject('ADMIN/Gmail Page/button_Create Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Register Page/textlabel_LoginAsBuyer'), 0)

if (GlobalVariable.ConsumerAccountType == 'custom') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Register Page/textfield_username'), 0)

    WebUI.setText(findTestObject('CONSUMER/Register Page/textfield_username'), GlobalVariable.CustomConsumer)

    WebUI.setText(findTestObject('CONSUMER/Register Page/textfield_password'), GlobalVariable.CustomPass)

    WebUI.setText(findTestObject('CONSUMER/Register Page/textfield_reconfirmpassword'), GlobalVariable.CustomPass)

    WebUI.setText(findTestObject('CONSUMER/Register Page/textfield_email'), GlobalVariable.ConsumerNotif)

    WebUI.click(findTestObject('CONSUMER/Register Page/button_SignUp'))
} else if (GlobalVariable.ConsumerAccountType == 'google') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'), 0)

    WebUI.click(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), 0)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), GlobalVariable.GoogleConsumer)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_username'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_password'))
} else if (GlobalVariable.ConsumerAccountType == 'facebook') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/span_Facebook Login'), 0)

    WebUI.click(findTestObject('MERCHANT/Login Seller/button_Facebook Login'))

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_email'), GlobalVariable.FacebookConsumer)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_password'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Login Facebook/button_login'))
}

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/button_language'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

