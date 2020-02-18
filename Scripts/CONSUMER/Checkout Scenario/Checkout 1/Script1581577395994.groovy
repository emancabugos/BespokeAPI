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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Search Item with Variants')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item_01')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.comment('Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '2')

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

DecimalFormat df = new DecimalFormat('#,###.00')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal')), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddToCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/button_ViewCart'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ViewCart'))

WebUI.comment('Cart Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Cart/button_ContinueShopping'), 0)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('CONSUMER/Cart/textlabel_Price'), '0.00')

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

WebUI.delay(1)

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Cart/textlabel_Price')), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Cart/button_Checkout'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout - Delivery Page/button_Next'), 0)

WebUI.comment('Checkout - Delivery Page')

WebUI.click(findTestObject('CONSUMER/Checkout - Delivery Page/selection_1stAddress'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout - Delivery Page/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Page_0123bpth1/dropdown_Delivery'), 0)

WebUI.comment('Checkout - Review Page')

WebUI.click(findTestObject('CONSUMER/Page_0123bpth1/dropdown_Delivery'))

WebUI.selectOptionByIndex(findTestObject('CONSUMER/Page_0123bpth1/dropdown_Delivery'), 8, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Checkout Review Page')

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_ItemName'))

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_QuantityValue'))

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_Surcharge'))

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_QuantityValue'))

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_QuantityValue'))

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_QuantityValue'))

WebUI.getText(findTestObject('CONSUMER/Page_0123bpth1/textlabel_QuantityValue'))

