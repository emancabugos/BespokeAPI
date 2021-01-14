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

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Landing Page/textlink_register signin'), 0)

WebUI.click(findTestObject('CONSUMER/Landing Page/textlink_register signin'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Onboarding/Non Private/button_create account'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Onboarding/Non Private/button_create account'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_username'), varUsername)

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_cofirm_password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Onboarding/Non Private/textbox_Register with Us_email'), varNotifEmail)

WebUI.click(findTestObject('MERCHANT/Onboarding/Non Private/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'), 0)

WebUI.click(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Buyer Seller Logout/textlink_settings'), 0)

WebUI.click(findTestObject('Utilities/Buyer Seller Logout/textlink_settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('PROFILE')

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Profile/button_Change'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Profile/button_Change'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), varImage)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_display_name'), varDisplayName)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), varFname)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_last_name'), varLname)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_contact'), varContact)

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), varCountry, false)

WebUI.scrollToElement(findTestObject('MERCHANT/User Settings/Profile/button_Next_profile'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT/User Settings/Profile/button_Next_profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('ADDRESS')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/textfield_Address'), 0)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstNameAddress'), varFname)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastNameAddress'), varLname)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Address'), varAddress)

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Settings/dropdown_Country'), varCountry, false)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_State'), varState)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_City'), varCity)

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_PostalCode'), varPostal)

WebUI.click(findTestObject('CONSUMER/Settings/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Settings/link_AddDeliveryAddress'), 0)

WebUI.click(findTestObject('CONSUMER/Settings/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

