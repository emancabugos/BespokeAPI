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

WebUI.comment('Basic Details')

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/sidemenu_createListing'), 0)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/sidemenu_createListing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_listingName'), 0)

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_listingName'), 'per Custom 150min NOT 24/7 U')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/01_Category/Category 01'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/btn_Negotiate'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/browse_img'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('SPACETIME API/MERCHANT/Create Listing/03_Add Image/img_container'), 'C:\\\\Katalon\\\\BespokeAPI\\\\Images\\\\UN Items\\\\item2.jpg')

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/03_Add Image/btn_OK'), 0)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/03_Add Image/btn_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Description')

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_Item Description'), 0)

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_Item Description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.comment('Custom Fields')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/02_Custom Fields/m_textfield'), 'Textfield')

WebUI.comment('Pricing')

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_bookingType'), 'Default', false)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/sd_Custom'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_specifyServiceDuration'), 0)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_specifyServiceDuration'), 'Minute(s)', 
    false)

WebUI.delay(1)

for (int click = 0; click < 29; click++) {
    WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/increase_duration'))
}

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_price'), '25.52')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_maximumBookings'), '2')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_Add-On Name'), 'Extra Service')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_Surcharge'), '10.01')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/btn_ADD addOns'))

WebUI.comment('Schedule')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/toggle_247'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/text_operatingHours'), 0)

WebUI.comment('Location')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_address'), '29th floor Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_country'), 'Philippines', false)

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/text_State'), 'N/A')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textboxcity'), 'Makati')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_postalcode'), '1200')

WebUI.comment('Shipping')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/cb_availablePickup'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/cb_availableShipping'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/btn_Add Item'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/text_Inventory'), 0)

