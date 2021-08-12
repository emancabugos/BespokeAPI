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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Inventory'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Inventory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), 0)

WebUI.click(findTestObject('MERCHANT_UPDATE/Inventory/linktext_Create new listing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Basic Details')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textlabel_Listing Name'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Listing Name'), 'Test Permission')

WebUI.comment('Categories')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Category/category0percent'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/category0percent'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Service')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/tickbox_Negotiate_check-indicator'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('No Permission Add Image')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

WebUI.delay(2)

WebUI.comment('Description')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Create New Listing_Variants/textfield_Item Description'), 'DESCRIPTION 01')

WebUI.comment('No Permission for Custom Field PDF')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/weight'), '.25')

WebUI.verifyElementVisible(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/pdf1'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('MERCHANT/Upload Item Page/Custom Fields/Allcat/pdf1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

WebUI.comment('Shipping')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_deliver all'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/checkbox_pickup all'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('No Permission for Variants Image')

WebUI.callTestCase(findTestCase('SUPERBABY/SELLER/Add Item/B2B/Var/Variants Ctry Level'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/image_Variants'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('MERCHANT/Upload Item Page/Variants/image_Variants'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

WebUI.comment('No Permission for Add Item button')

WebUI.mouseOver(findTestObject('MERCHANT_UPDATE/Create new Listing_Country/button_Add Item_bottom'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

