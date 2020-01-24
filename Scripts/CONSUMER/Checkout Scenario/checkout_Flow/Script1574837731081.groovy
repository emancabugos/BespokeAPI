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

WebUI.comment('Search Item')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), itemname)

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), itemname)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_MOQValue'), 0)

WebUI.comment('Computation of Sub Total')

WebUI.setText(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), quantityvalue)

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_price'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), 'value')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

DecimalFormat df = new DecimalFormat('#,###.00')

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_SubTotalPrice')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add to Evaluation Widget')

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_up'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/container_empty'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'), 'Create new comparison table', 
    true)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Cancel'), 0)

WebUI.setText(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'), listname)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), 'text', listname, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), listname)

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_delete'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'))

WebUI.comment('Evaluation Table')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/button_CreatePurchaseOrder'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Table/textlabel_ItemName'), itemname, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Evaluation Table/button_CreatePurchaseOrder'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_PostalCode'), postalcode)

WebUI.comment('Delivery Checkout Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

name = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Name'))

address = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Address'))

country = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Country'))

state = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_State'))

city = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_City'))

postalcode = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_PostalCode'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'))

WebUI.scrollToElement(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'), 0)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_radio1'))

WebUI.comment('Computation of Total Price')

actualSubtotal = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_SubTotalValue'))

WebUI.verifyEqual(df.format(subtotal), actualSubtotal)

delivery1 = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

delivery2 = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue2'))

WebUI.verifyEqual(delivery1, delivery2, FailureHandling.CONTINUE_ON_FAILURE)

def delivery = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdelivery = new BigDecimal(delivery)

def total = intsubtotal + intdelivery

println(df.format(new BigDecimal(total)))

WebUI.verifyEqual(total, WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_TotalValue')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'), 0)

