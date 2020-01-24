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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('UI')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 'Basic Details')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Description'), 'Description')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Countries'), 'Countries')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Availability'), 'Availability')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Pricing'), 'Pricing')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Delivery'), 'Delivery')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Basic Details'), 'Basic Details')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Listing Name'), 'Listing Name*')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Category(s)'), 'Category(s)*')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_search category'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 'Select all')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select none'), 'Select none')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Item Cover Image ( Maxim'), 'Item Cover Image* ( Maximum 5 images )')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Images must be in a ratio of'), 
    'Images must be in a ratio of 1:1 and no larger than 2MB (recommended 600px x 600px)')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Description'), 'Description')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Item Description'), 'Item Description')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Countries'), 'Countries')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Delivers to'), 'Delivers to*')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), 'placeholder', 
    'Select Country', 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Availability'), 'Availability')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/availability_Country'), 'Country')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/availability_SKU'), 'SKU')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/availability_MOQ'), 'MOQ')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/availability_Stock'), 'Stock*')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_unlimited'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/availability_Unlimited'), 'Unlimited')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_purchasable'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/availability_Purchasable'), 'Purchasable')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Pricing'), 'Pricing')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/pricing_Country'), 'Country')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/pricing_Price'), 'Price*')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/pricing_Bulk Pricing'), 'Bulk Pricing:')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/pricing_Discount'), 'Discount')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Delivery'), 'Delivery')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/searcbar_delivery'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Upload Item Page/Item Upload/searcbar_delivery'), 'placeholder', 
    'Search delivery method', 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_search delivery'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/delivery_Delivery Method'), 'Delivery Method')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/delivery_Countries Delivering to'), 'Countries Delivering to')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/delivery_Available'), 'Available')

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/delivery_Pick-up Location'), 'Pick-up Location')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available2'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Item Upload/delivery_Available (1)'), 'Available')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

