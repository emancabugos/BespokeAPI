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

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Inventory'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Inventory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), 0)

WebUI.click(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textlabel_Listing Name'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Listing Name'), 'NEGO Pending' + ' ' + 
    GlobalVariable.CustomMerchant)

WebUI.comment('Categories')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category99percent'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category99percent'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Service')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), 'C:\\\\Katalon\\\\BespokeAPI\\\\Images\\\\UN Items\\\\item9.jpg')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Item Description'), 'Description08')

WebUI.comment('Custom Fields')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('MERCHANT/Upload/Other Scenario/CF_categorymax'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Price'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Price'), '100.2')

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_SKU'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_SKU'), 'SKU009')

WebUI.comment('Variants')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield__item-quantity'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield__item-quantity'), '50')

WebUI.comment('Delivery Method')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_pickup all'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Save')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), 0)

