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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), varListingName)

WebUI.comment('Categories')

if (varCategory == 'Category 1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 2') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 2'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 3') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 3'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 4') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 4'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 5') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 5'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 6') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 6'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 7') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 7'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 8') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 8'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 9') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 9'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 10') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 10'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 11') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 11'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 12') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 12'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 13') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 13'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 14') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 14'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 15') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 15'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 16') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 16'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 17') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 17'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 18') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 18'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 19') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 19'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category 20') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 20'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Item Cover Image')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), varImage)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.comment('Custom Fields')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/Custom Field Input'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Country')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), varDeliversTo)

WebUI.waitForElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), 
    0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Stock/Unlimited')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_SKU'), varSKU)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_MOQ'), varMOQ)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_Stocks'), varStock)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_price'), varPrice)

WebUI.comment('Delivery Method')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Pickup')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Click Upload Button')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inventory Page/button_ Upload Item'), 0)

