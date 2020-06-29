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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Landing Page/textlink_be_a_seller'), 0)

WebUI.click(findTestObject('MERCHANT/Landing Page/textlink_be_a_seller'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/textfield_username'), 0)

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_username'), varUsername)

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_password'), 'welcome8')

WebUI.callTestCase(findTestCase('Utilities/Accept Cookies'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Login Buyer/button_SignIn'))

WebUI.comment('PROFILE')

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Profile/button_Change'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Profile/button_Change'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), varImage)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_display_name'), varDisplayName)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_description'), varDescription)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), varFname)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_last_name'), varLname)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_contact'), varContact)

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_seller-location'), varSellerLocation)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT/User Settings/Profile/button_Next_profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('ADDRESS')

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Address/textbox_first_name'), 0)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_first_name'), varFname)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_last name'), varLname)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_address'), varAddress)

WebUI.selectOptionByLabel(findTestObject('MERCHANT/User Settings/Address/dropdown_country'), varCountry, false)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_state'), varState)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_City'), varCity)

WebUI.setText(findTestObject('MERCHANT/User Settings/Address/textbox_postal_code'), varPostal)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT/User Settings/Address/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Address/address_box'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Address/button_next address'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Address/button_next address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('PAYMENT')

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Payment/COD/button_link account'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Payment/COD/button_link account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Payment/COD/button_okay'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Payment/COD/button_okay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/User Settings/button_Next_Payment'), 0)

WebUI.click(findTestObject('MERCHANT_UPDATE/User Settings/button_Next_Payment'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('PAYMENT TERMS')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/User Settings/button_Save_PaymentTerm'), 0)

WebUI.click(findTestObject('MERCHANT_UPDATE/User Settings/button_Save_PaymentTerm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/button_dropdownMenu'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/button_dropdownMenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/linktext_Logout'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/linktext_Logout'), FailureHandling.STOP_ON_FAILURE)

