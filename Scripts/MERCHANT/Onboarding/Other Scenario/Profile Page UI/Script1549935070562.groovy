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

WebUI.comment('Header')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/search_bar'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_search'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/dropdown_category'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_inbox'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/language'), 0)

WebUI.comment('Body')

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Profile/breadcrumbs_Home'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/breadcrumbs_Home'), 'Home')

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/breadcrumbs_User Settings'), 'User Settings')

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_User Settings'), 'User Settings')

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Profile'), 'Profile')

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Address'), 'Address')

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Payment'), 'Payment')

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/button_Change'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Display Name'), 'Display Name')

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/User Settings/Profile/textbox_display_name'), 'placeholder', 
    'Enter your display name', 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/textbox_display_name'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Description'), 'Description')

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/textbox_description'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_First Name'), 'First Name')

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), 'placeholder', 'Pre-populated if can be pulled', 
    0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Last Name'), 'Last Name')

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/textbox_last_name'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Contact No.'), 'Contact No.')

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/textbox_contact'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/User Settings/Profile/textlabel_Seller Location'), 'Seller Location')

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/textbox_seller-location'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/User Settings/Profile/button_Next_profile'), 0)

WebUI.comment('Footer')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_ABOUT US'), 'ABOUT US')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_TERMS OF SERVICE'), 'TERMS OF SERVICE')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_PRIVACY POLICY'), 'PRIVACY POLICY')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_RETURN POLICY'), 'RETURN POLICY')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_FAQ'), 'FAQ')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_CONTACT US'), 'CONTACT US')

WebUI.verifyElementText(findTestObject('Utilities/Footer/textlabel_2016 All rights reserve'), 'ncd © 2016 All rights reserved')

