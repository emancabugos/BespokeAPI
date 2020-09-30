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
File orderStatusTmp = tmpDir.resolve('orderStatus.txt').toFile()

File itemSubtotalTmp = tmpDir.resolve('itemSubtotal.txt').toFile()

File itemShipCostTmp = tmpDir.resolve('itemCharge.txt').toFile()

File itemTotalTmp = tmpDir.resolve('itemTotal.txt').toFile()

File itemInvoiceTmp = tmpDir.resolve('itemInvoice.txt').toFile()

File POtmp = tmpDir.resolve('POtmp.txt').toFile()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Documents'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Documents'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_PurchaseOrder'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_PurchaseOrder'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

String orderNo = POtmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'), orderNo)

WebUI.comment('Change Status')

String orderStatus = orderStatusTmp.text.trim()

if (orderStatus == 'noChange') {
    WebUI.delay(1)
} else {
    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), orderStatus, 
        false)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/textlabel_OrderStatusUpdated'), 
        0)

    WebUI.click(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/button_Okay'))

    WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), 
        orderStatus, false, 0)
}

WebUI.comment('End of Change Status Code')

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Order'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Order'), orderNo)

String invoice = itemInvoiceTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Invoice'), invoice)

if (orderStatus == 'noChange') {
    WebUI.delay(1)
} else {
    WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/dropdown_OrderStatus'), 
        orderStatus, false, 0)
}

String itemSubTotal = itemSubtotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Subtotal'), itemSubTotal)

String shippingCost = itemShipCostTmp.text.trim()

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_ShippingCost'), shippingCost)

def finalsubtotal = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_Subtotal'))

def shipcost = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_ShippingCost'))

def adminFee = WebUI.getText(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_AdminCost'))

DecimalFormat df = new DecimalFormat('#,###.00')

def finalSub = finalsubtotal.replace(',', '')

def finalAF = adminFee.replace(',', '')

BigDecimal bdsubtotal = new BigDecimal(finalSub)

BigDecimal bdshipcost = new BigDecimal(shipcost)

BigDecimal bdadminFee = new BigDecimal(finalAF)

def finacost = (bdsubtotal + bdshipcost) - bdadminFee

WebUI.verifyEqual(df.format(finacost), WebUI.getText(findTestObject('Object Repository/SUPERBABY/SELLER/Purchase Order Details (B2C)/textlabelValue_TotalCost (1)')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

