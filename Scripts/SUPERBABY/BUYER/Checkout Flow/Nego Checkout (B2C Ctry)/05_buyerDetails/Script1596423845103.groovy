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

WebUI.comment('Buyer PO Details')

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

def orderNo = WebUI.getText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

POtmp.text = orderNo

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.comment('Verify PO Details')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    0)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    orderNo)

String invoice = itemInvoiceTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_InvoiceNo'), 
    invoice)

String itemSubTotal = itemSubtotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_Subtotal'), 
    itemSubTotal)

String charge = chargeTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ChargeValue'), 
    charge)

String discount = discountTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2C)/textlabelValue_Discount'), discount)

String shippingCost = itemShipCostTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ShippingCostValue'), 
    shippingCost)

String total = itemTotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_TotalCost'), 
    total)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

