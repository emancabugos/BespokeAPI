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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Landing Page/button_Buyer Sign in'), 0)

WebUI.click(findTestObject('CONSUMER/Landing Page/button_Buyer Sign in'), FailureHandling.STOP_ON_FAILURE)

if (loginType == 'custom') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/textfield_username'), 0)

    WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_username'), username)

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_password'), password)

    WebUI.click(findTestObject('CONSUMER/Login Buyer/button_SignIn'))

    WebUI.callTestCase(findTestCase('CONSUMER/Settings/Simple/navigateTo_SettingsPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/button_Change'), 0)

    WebUI.comment('add Profile Image')

    WebUI.click(findTestObject('CONSUMER/Settings/button_Change'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1)

    WebUI.uploadFile(findTestObject('CONSUMER/Settings/a_upload/upload_Photo'), varImagePath)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/a_upload/button_AddPhoto'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/a_upload/button_AddPhoto'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.comment('add Display Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_DisplayName'), displayName)

    WebUI.comment('add First Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstName'), firstName)

    WebUI.comment('add Last Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastName'), lastName)

    WebUI.comment('add Email')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Email'), email)

    WebUI.comment('Contact No')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Contact'), contactNo)

    WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Next'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Next'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), 0)

    WebUI.comment('add First Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), firstName)

    WebUI.comment('add Last Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastNameAddress'), lastName)

    WebUI.comment('add Address')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Address'), address)

    WebUI.comment('add Country')

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), country, false)

    WebUI.comment('add State')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_State'), state, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('add City')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_City'), city, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('add Postal Code')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_PostalCode'), postalCode, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Add'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Add'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/link_AddDeliveryAddress'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Save'))
} else if (loginType == 'google') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'), 0)

    WebUI.click(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), 0)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), username)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_username'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_password'), password)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_password'))

    WebUI.callTestCase(findTestCase('CONSUMER/Settings/Simple/navigateTo_SettingsPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/button_Change'), 0)

    WebUI.comment('add Profile Image')

    WebUI.click(findTestObject('CONSUMER/Settings/button_Change'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1)

    WebUI.uploadFile(findTestObject('CONSUMER/Settings/a_upload/upload_Photo'), varImagePath)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/a_upload/button_AddPhoto'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/a_upload/button_AddPhoto'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.comment('add Display Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_DisplayName'), displayName)

    WebUI.comment('add First Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstName'), firstName)

    WebUI.comment('add Last Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastName'), lastName)

    WebUI.comment('add Email')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Email'), email)

    WebUI.comment('Contact No')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Contact'), contactNo)

    WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Next'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Next'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), 0)

    WebUI.comment('add First Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), firstName)

    WebUI.comment('add Last Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastNameAddress'), lastName)

    WebUI.comment('add Address')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Address'), address)

    WebUI.comment('add Country')

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), country, false)

    WebUI.comment('add State')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_State'), state, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('add City')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_City'), city, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('add Postal Code')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_PostalCode'), postalCode, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Add'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Add'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/link_AddDeliveryAddress'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Save'))
} else if (loginType == 'facebook') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/span_Facebook Login'), 0)

    WebUI.click(findTestObject('MERCHANT/Login Seller/button_Facebook Login'))

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_email'), username)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_password'), password)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Login Facebook/button_login'))

    WebUI.callTestCase(findTestCase('CONSUMER/Settings/Simple/navigateTo_SettingsPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/button_Change'), 0)

    WebUI.comment('add Profile Image')

    WebUI.click(findTestObject('CONSUMER/Settings/button_Change'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1)

    WebUI.uploadFile(findTestObject('CONSUMER/Settings/a_upload/upload_Photo'), varImagePath)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/a_upload/button_AddPhoto'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/a_upload/button_AddPhoto'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.comment('add Display Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_DisplayName'), displayName)

    WebUI.comment('add First Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstName'), firstName)

    WebUI.comment('add Last Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastName'), lastName)

    WebUI.comment('add Email')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Email'), email)

    WebUI.comment('Contact No')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Contact'), contactNo)

    WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Next'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Next'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), 0)

    WebUI.comment('add First Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), firstName)

    WebUI.comment('add Last Name')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastNameAddress'), lastName)

    WebUI.comment('add Address')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Address'), address)

    WebUI.comment('add Country')

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), country, false)

    WebUI.comment('add State')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_State'), state, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('add City')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_City'), city, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('add Postal Code')

    WebUI.setText(findTestObject('CONSUMER/Settings/textfield_PostalCode'), postalCode, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Add'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Add'))

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/link_AddDeliveryAddress'), 0)

    WebUI.click(findTestObject('CONSUMER/Settings/button_Save'))
}

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

