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
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.text.DecimalFormat as DecimalFormat
import java.text.NumberFormat as NumberFormat
import groovy.time.TimeCategory as TimeCategory
import java.text.SimpleDateFormat as SimpleDateFormat

// create directory to locate a temporary file
Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File itemNameTmp = tmpDir.resolve('itemName.txt').toFile()

File itemDescriptionTmp = tmpDir.resolve('itemDescription.txt').toFile()

File itemQuantityTmp = tmpDir.resolve('itemQuantity.txt').toFile()

File itemPriceTmp = tmpDir.resolve('itemPrice.txt').toFile()

File itemSubtotalTmp = tmpDir.resolve('itemSubtotal.txt').toFile()

File itemDiscountTmp = tmpDir.resolve('itemDiscount.txt').toFile()

File itemChargeTmp = tmpDir.resolve('itemCharge.txt').toFile()

File itemShipCostTmp = tmpDir.resolve('itemCharge.txt').toFile()

File itemTotalTmp = tmpDir.resolve('itemTotal.txt').toFile()

File itemInvoiceTmp = tmpDir.resolve('itemInvoice.txt').toFile()

File POtmp = tmpDir.resolve('POtmp.txt').toFile()

File orderStatusTmp = tmpDir.resolve('orderStatus.txt').toFile()

File chargeTmp = tmpDir.resolve('charge.txt').toFile()

File discountTmp = tmpDir.resolve('discount.txt').toFile()

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

itemNameTmp.text = itemName

def itemDescription = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_DescriptionValue'))

itemDescriptionTmp.text = itemDescription

def itemSubTotal = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal'))

itemSubtotalTmp.text = itemSubTotal

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

itemPriceTmp.text = price

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

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

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

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

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

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), deliveryMethod, 
        false)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

    WebUI.comment('Get Global Variable')

    def discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

    discountTmp.text = discount

    def charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

    chargeTmp.text = charge

    def shippingCost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

    itemShipCostTmp.text = shippingCost

    def total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

    itemTotalTmp.text = total

    WebUI.comment('Payment')

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), paymentMethod, 
        false)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), FailureHandling.CONTINUE_ON_FAILURE)

    if (paymentMethod == 'Stripe') {
        WebUI.callTestCase(findTestCase('Utilities/Stripe Checkout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
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

    itemInvoiceTmp.text = invoice

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Buyer PO Details')

    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/05_buyerDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Seller PO Details')

    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/06_sellerDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'AcceptedPrcnt') {
    WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Seller Inbox & Chat Details')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), 0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

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

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/SELLER/Create Quotation/dropdown_QTY'), 'Percentage', false)

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_PricePerUnit'), '10')

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_AddNewLine'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textbox_qty charge'), 0)

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textbox_qty charge'), '1')

    WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textbox_priceUnit charge'), '10')

    WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_SendQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Sent Quotation')

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

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

    WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/button_accept'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), deliveryMethod, 
        false)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

    WebUI.comment('Get Global Variable')

    def discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

    discountTmp.text = discount

    def charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

    chargeTmp.text = charge

    def shippingCost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

    itemShipCostTmp.text = shippingCost

    def total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

    itemTotalTmp.text = total

    WebUI.comment('Payment')

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), paymentMethod, 
        false)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), FailureHandling.CONTINUE_ON_FAILURE)

    if (paymentMethod == 'Stripe') {
        WebUI.callTestCase(findTestCase('Utilities/Stripe Checkout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
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

    itemInvoiceTmp.text = invoice

    WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Buyer PO Details')

    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/05_buyerDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('Seller PO Details')

    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/06_sellerDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'Pending') {
    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/02_pending'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'Cancelled') {
    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/03_cancelled'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (negoStatus == 'Rejected') {
    WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego Checkout (B2C Var)/04_rejected'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

