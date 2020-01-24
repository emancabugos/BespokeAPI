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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), 'Category 1')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.comment('Item Cover Image')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), 'C:\\\\Katalon\\\\Image\\\\drug1.jpg')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Country')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), 'Philippines')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), 
    0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Stock/Unlimited')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_SKU'), 'SKU00001')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_MOQ'), '100')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_Stocks'), '10000')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_price'), '69.50')

WebUI.comment('Delivery Method')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Pickup')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Click Upload Button')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), 'TC123')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field'), 'value', '', 
    0)

