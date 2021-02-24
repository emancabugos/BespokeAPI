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

WebUI.comment('Basic Details')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textlabel_Listing Name'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Listing Name'), 'NEGO - Disc Fixed & Charges Variants')

WebUI.comment('Categories')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category0percent'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category0percent'), FailureHandling.CONTINUE_ON_FAILURE)

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

WebUI.comment('Description')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Item Description'), 'DESCRIPTION 01')

WebUI.comment('Custom Field')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/weight'), '.25')

WebUI.comment('Shipping')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_pickup all'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Variants')

WebUI.callTestCase(findTestCase('SUPERBABY/SELLER/Add Item/B2B/Var/Variants'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/a_Next'))

WebUI.comment('Pricing Stock')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/PH'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/PH'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/SG'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/SG'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/MY'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/MY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('MOQ')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/MOQ Field/PH'), '1')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/MOQ Field/SG'), '1')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/MOQ Field/MY'), '1')

WebUI.comment('Variants StocksPrice')

WebUI.callTestCase(findTestCase('SUPERBABY/SELLER/Add Item/B2B/Var/Variants PricingStock'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT_UPDATE/Create new Listing_Country/button_Add Item_bottom'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), 0)

