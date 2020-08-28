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

WebUI.comment('Search Item Name')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), itemName)

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), itemName)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '2')

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddToCart'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ViewCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Cart/button_ContinueShoppingEmpty'), 0)

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

WebUI.waitForElementClickable(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_CartPayNow'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_CartPayNow'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 1)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 'Cash on delivery', 
    false)

WebUI.comment('Pay Now')

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

