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
import org.openqa.selenium.Keys as Keys
import java.text.DecimalFormat as DecimalFormat
import java.text.NumberFormat as NumberFormat
import groovy.time.TimeCategory as TimeCategory
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('ITEM SEARCH')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), (itemName + ' ') + GlobalVariable.CustomMerchant)

WebUI.sendKeys(findTestObject('CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.comment('Variants')

if (itemVariants == 'yes') {
    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/Variants/var1'), 'Blue', false)

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/Variants/var2'), 'Small', false)

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/Variants/var3'), 'Glass', false)
} else if (itemVariants == 'no') {
    WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)
}

WebUI.comment('Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), itemQty)

WebUI.delay(1)

WebUI.comment('Get Variable')

def itemName = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_ItemName'))

def itemDescription = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_DescriptionValue'))

def currencyCode = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_CurrencyCode'))

def currencySymbol = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_CurrencySymbol'))

def itemPrice = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

def itemQuantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

def itemSubTotal = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal'))

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

DecimalFormat df = new DecimalFormat('#,###.00')

def priceValue = price.replace(',', '')

BigDecimal intprice = new BigDecimal(priceValue)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_subAmount')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('CART PAGE')

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddToCart'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ViewCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Cart/button_ContinueShopping'), 0)

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

WebUI.waitForElementClickable(findTestObject('CONSUMER/Cart/button_create Requisition'), 0)

WebUI.click(findTestObject('CONSUMER/Cart/button_create Requisition'))

WebUI.comment('ONE PAGE CHECKOUT')

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

WebUI.selectOptionByIndex(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 1)

WebUI.comment('Get Global Variable')

def discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

def charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

def shippingCost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

def total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Complete Transaction')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

def reqOrder = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'))

WebUI.comment('Buyer PO Details')

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

def orderNo = WebUI.getText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.comment('Verify PO Details')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    0)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    orderNo)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_RequisitionOrderNo'), 
    reqOrder)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_Subtotal'), 
    itemSubTotal)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ShippingCostValue'), 
    shippingCost)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_TotalCost'), 
    total)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Documents'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Documents'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_PurchaseOrder'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_PurchaseOrder'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'), orderNo)

WebUI.comment('Change Status')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order List (B2B)/dropdown_OrderStatus'), orderstatus, 
    false)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/textlabel_OrderStatusUpdated'), 
    0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/button_Okay'))

WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order List (B2B)/dropdown_OrderStatus'), orderstatus, 
    false, 0)

WebUI.comment('End of Change Status Code')

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Order'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Order'), orderNo)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2B)/textlabelValue_RequisitionOrderNo'), 
    reqOrder)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Subtotal'), itemSubTotal)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_ShippingCost'), shippingCost)

def finalsubtotal = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Subtotal'))

def shipcost = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_ShippingCost'))

def finalSub = finalsubtotal.replace(',', '')

BigDecimal bdsubtotal = new BigDecimal(finalSub)

BigDecimal bdshipcost = new BigDecimal(shipcost)

def finacost = bdsubtotal + bdshipcost

WebUI.verifyEqual(df.format(finacost), WebUI.getText(findTestObject('Object Repository/SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_TotalCost (1)')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Invoice')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Invoice'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Invoice'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Invoice List/textlink_Create new Invoice'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/textlink_Create new Invoice'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/textbox_PO number'), 0)

WebUI.setText(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/textbox_PO number'), orderNo)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/textlabel_Select the PO No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/button_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Invoice/textbox_payment'), 0)

//String CDATE1 = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())
SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar CDATE2 = Calendar.getInstance()

CDATE2.setTime(new Date())

CDATE2.add(Calendar.DATE, 2 //Adds # of days
    )

String FDATE = sdf.format(CDATE2.getTime())

element = WebUiCommonHelper.findWebElement(findTestObject('SUPERBABY/SELLER/Create Invoice/textbox_payment'), 30)

def driver = DriverFactory.getWebDriver()

    ((driver) as JavascriptExecutor).executeScript('arguments[0].value=arguments[1]', element, FDATE)

//WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Invoice/textbox_payment'), FDATE)
String CTIME2 = new SimpleDateFormat('HH:mm a').format(Calendar.getInstance().getTime())

WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Invoice/textbox_time'), CTIME2)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Invoice/value_invoice no'), 0)

WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Invoice/textbox_invoice ref'), 'REF' + reqOrder)

WebUI.click(findTestObject('SUPERBABY/SELLER/Create Invoice/button_Create Invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Invoice List/row1_invoice'), 0)

invoiceNumber = WebUI.getText(findTestObject('SUPERBABY/SELLER/Invoice List/row1_invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice List/row1_external invoice'), 'REF' + reqOrder)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'))

WebUI.comment('Create GR')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_Receiving Notes'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_Receiving Notes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_CreateNewNote'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_CreateNewNote'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'), 0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'), orderNo)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabel_popupSelectPONo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/button_popupYes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/button_CreateReceipt'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_DateReceived'), FailureHandling.CONTINUE_ON_FAILURE)

String CTIME1 = new SimpleDateFormat('HH:mm a').format(Calendar.getInstance().getTime())

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_DateReceivedTime'), CTIME1)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_QuantityReceived'), quantity)

WebUI.click(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/button_CreateReceipt'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabelValue_PONo'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabelValue_PONo'), orderNo)

WebUI.comment('Pay Invoice')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_Invoice'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_Invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), invoiceNumber)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Invoice Details/button_Pay this Invoice'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice Details/button_Pay this Invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Payment Page/dd_payment'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Payment Page/dd_payment'), paymentMethod, false)

WebUI.click(findTestObject('SUPERBABY/BUYER/Payment Page/button_pay now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

