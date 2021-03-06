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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Documents'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_Documents'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_PurchaseOrder'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Sidebar/linktext_PurchaseOrder'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'), GlobalVariable.orderno)

WebUI.comment('Change Status')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), orderstatus, 
    false)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/textlabel_OrderStatusUpdated'), 
    0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/button_Okay'))

WebUI.waitForElementNotPresent(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/a_Change Status/button_Okay'), 
    0)

WebUI.verifyOptionPresentByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), orderstatus, 
    false, 0)

WebUI.comment('End of Change Status Code')

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    GlobalVariable.orderno)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_InvoiceNo'), 
    GlobalVariable.invoice)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_PaymentMethod'))

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_PaymentStatus'), 
    '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_ShippingCost'), 
    GlobalVariable.deliverycost)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_MLT'), 
    GlobalVariable.MLT)

WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order Details (B2C)/dropdown_OrderStatus'), 
    orderstatus, false, 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_Quantity'), 
    GlobalVariable.quantity)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_UnitPrice'), 
    GlobalVariable.price)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_Subtotal'), 
    GlobalVariable.actualsub)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_SubTotalValue'), 
    GlobalVariable.actualsub)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ChargeValue'), 
    '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_DiscountValue'), 
    '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ShippingCostValue'), 
    GlobalVariable.deliverycost)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_TotalCost'), 
    GlobalVariable.totalcost)

