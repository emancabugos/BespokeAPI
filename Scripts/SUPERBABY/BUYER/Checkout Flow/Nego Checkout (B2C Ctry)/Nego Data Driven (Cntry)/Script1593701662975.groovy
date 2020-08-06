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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('ITEM SEARCH')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), (itemName + ' ') + GlobalVariable.CustomMerchant)

WebUI.sendKeys(findTestObject('CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

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

//println(df.format(new BigDecimal(subtotal)))
WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_subAmount')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Click Nego')

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_Negotiate'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Chat Details Page - Buyer/textarea_SendMessage'), 0)

WebUI.setText(findTestObject('CONSUMER/Chat Details Page - Buyer/textarea_SendMessage'), 'send Quotation')

WebUI.sendKeys(findTestObject('CONSUMER/Chat Details Page - Buyer/textarea_SendMessage'), Keys.chord(Keys.ENTER))

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

if (negoStatus == 'AcceptedFixed') {
    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Seller Inbox & Chat Details')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/status_Enquiry'), 0)

    WebUI.click(findTestObject('MERCHANT/Inbox/status_Enquiry'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Create Quotation Page')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_IssueDate'), 0)

    String CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

    SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

    Calendar c = Calendar.getInstance()

    c.setTime(new Date())

    c.add(Calendar.DATE, 2 //Adds # of days
        )

    String FDATE = sdf.format(c.getTime())

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), (CDATE + ' - ') + FDATE)

    WebUI.verifyElementAttributeValue(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), 'value', 
        (CDATE + ' - ') + FDATE, 0)

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_PricePerUnit'), '10')

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_AddNewLine'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textbox_qty charge'), 0)

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textbox_qty charge'), '1')

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textbox_priceUnit charge'), '10')

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_SendQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Sent Quotation')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE //Adds # of days
        //Adds # of days
        //Adds # of days
        )

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Inbox/status_pre approved'), 0)

    WebUI.click(findTestObject('CONSUMER/Inbox/status_pre approved'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 0)

    WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 'Pending')

    WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/button_accept'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

    WebUI.selectOptionByIndex(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 1)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

    WebUI.comment('Get Global Variable')

    def discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

    def charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

    def shippingCost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

    def total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

    WebUI.comment('Payment')

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), paymentMethod, 
        false)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), FailureHandling.CONTINUE_ON_FAILURE)

    if (paymentMethod == 'Stripe') {
        WebUI.callTestCase(findTestCase('Utilities/Stripe Checkout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), 0)

        WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'))
    } else if (paymentMethod == 'Offline Payment') {
        WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
    } else if (paymentMethod == 'Custom Payment') {
        WebUI.waitForElementVisible(findTestObject('CONSUMER/Payment Page/Custom Payment/button_agree'), 0)

        WebUI.click(findTestObject('CONSUMER/Payment Page/Custom Payment/button_agree'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (paymentMethod == 'Cash on delivery') {
        WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.comment('Pay Now')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

    def invoice = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'))

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

    WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_InvoiceNo'), 
        invoice)

    WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_Subtotal'), 
        itemSubTotal)

    WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ChargeValue'), 
        charge)

    WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2C)/textlabelValue_Discount'), discount)

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

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), orderstatus, 
        false)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/textlabel_OrderStatusUpdated'), 
        0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/button_Okay'))

    WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), 
        orderstatus, false, 0)

    WebUI.comment('End of Change Status Code')

    WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Order'), 0)

    WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Order'), orderNo)

    WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Invoice'), invoice)

    WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Subtotal'), itemSubTotal)

    WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Charge'), charge)

    WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Discount'), discount)

    WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_ShippingCost'), 
        shippingCost)

    def finalsubtotal = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Subtotal'))

    def shipcost = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_ShippingCost'))

    def adminFee = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_AdminCost'))

    def finalSub = finalsubtotal.replace(',', '')

    BigDecimal bdsubtotal = new BigDecimal(finalSub)
	
	BigDecimal bdcharge = new BigDecimal(charge)
	
	BigDecimal bddiscount = new BigDecimal(discount)

    BigDecimal bdshipcost = new BigDecimal(shipcost)

    BigDecimal bdadminFee = new BigDecimal(adminFee)

    def finalcost = (((bdsubtotal + bdshipcost) + bdcharge) - bdadminFee) - bddiscount

    WebUI.verifyEqual(df.format(finalcost), WebUI.getText(findTestObject('Object Repository/SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_TotalCost (1)')), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'AcceptedPrcnt') {
    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'Pending') {
    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Seller Inbox & Chat Details')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/status_Enquiry'), 0)

    WebUI.click(findTestObject('MERCHANT/Inbox/status_Enquiry'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Create Quotation Page')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_IssueDate'), 0)

    String CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

    SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

    Calendar c = Calendar.getInstance()

    c.setTime(new Date())

    c.add(Calendar.DATE, 2)

    String FDATE = sdf.format(c.getTime())

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), (CDATE + ' - ') + FDATE)

    WebUI.verifyElementAttributeValue(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), 'value', 
        (CDATE + ' - ') + FDATE, 0)

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_PricePerUnit'), '10')

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_SendQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Sent Quotation')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Inbox/status_pre approved'), 0)

    WebUI.click(findTestObject('CONSUMER/Inbox/status_pre approved'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 0)

    WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 'Pending')

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'Cancelled') {
    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Inbox/status_pre approved'), 0)

    WebUI.click(findTestObject('CONSUMER/Inbox/status_pre approved'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 0)

    WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 'Pending')

    WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/button_cancel quote'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/Decline Popup/textlabel_Are you sure you want to decline this quotation'), 
        0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/Decline Popup/button_okay'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'Rejected') {
    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Seller Inbox & Chat Details')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/status_Enquiry'), 0)

    WebUI.click(findTestObject('MERCHANT/Inbox/status_Enquiry'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Create Quotation Page')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_IssueDate'), 0)

    String CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

    SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

    Calendar c = Calendar.getInstance()

    c.setTime(new Date())

    c.add(Calendar.DATE, 2)

    String FDATE = sdf.format(c.getTime())

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), (CDATE + ' - ') + FDATE)

    WebUI.verifyElementAttributeValue(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), 'value', 
        (CDATE + ' - ') + FDATE, 0)

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_PricePerUnit'), '10')

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_SendQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Sent Quotation')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Inbox/status_pre approved'), 0)

    WebUI.click(findTestObject('CONSUMER/Inbox/status_pre approved'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 0)

    WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 'Pending')

    WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/button_Decline'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/Decline Popup/textlabel_Are you sure you want to decline this quotation'), 
        0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/Decline Popup/button_okay'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

