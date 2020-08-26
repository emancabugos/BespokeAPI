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

WebUI.comment('Variants')

if (itemVariants == 'yes') {
    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/Variants/var1'), 'Blue', false)

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/Variants/var2'), 'Small', false)

    WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/Variants/var3'), 'Glass', false)

    def itemQuantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/Variants/textbox_quantity'), 'value')

    def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/Variants/textlabel_itemPrice'))
	
	itemPriceTmp.text = price

    def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/Variants/textbox_quantity'), 'value')

    def priceValue = price.replace(',', '')

    BigDecimal intprice = new BigDecimal(priceValue)

    BigDecimal intquantity = new BigDecimal(quantity)

    def subtotal = intprice * intquantity
} else if (itemVariants == 'no') {
    WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)

    def itemQuantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

    def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))
	
	itemPriceTmp.text = price

    def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

    def priceValue = price.replace(',', '')

    BigDecimal intprice = new BigDecimal(priceValue)

    BigDecimal intquantity = new BigDecimal(quantity)

    def subtotal = intprice * intquantity
}

WebUI.comment('CART PAGE')

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddToCart'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ViewCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Cart/button_ContinueShopping'), 0)

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

String subtotalTmp = itemSubtotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('CONSUMER/Cart/textlabel_subtotalValue'), subtotalTmp)

WebUI.waitForElementClickable(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_CartPayNow'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_CartPayNow'))

WebUI.comment('ONE PAGE CHECKOUT')

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), delMethod, false)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

WebUI.comment('Get Global Variable')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_SubTotal'), subtotalTmp)

def discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

itemDiscountTmp.text = discount

def charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

itemChargeTmp.text = charge

def shippingCost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

itemShipCostTmp.text = shippingCost

def total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

itemTotalTmp.text = total

WebUI.comment('Payment')

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), paymentMethod, 
    false)

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

orderStatusTmp.text = orderStatus

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot Checkout (B2C Var)/02_buyerPurchaseDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot Checkout (B2C Var)/03_sellerPurchaseDetails'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

