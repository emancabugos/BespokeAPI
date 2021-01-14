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

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textlabel_Listing Name'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Listing Name'), 'Item01')

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

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item1.jpg')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

