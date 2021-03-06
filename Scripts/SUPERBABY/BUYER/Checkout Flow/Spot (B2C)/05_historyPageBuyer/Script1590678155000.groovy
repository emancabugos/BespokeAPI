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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

def orderNo = WebUI.getText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2C)/textlabelValue_OrderNo'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    0)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_OrderNo'), 
    orderNo)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_InvoiceNo'), 
    GlobalVariable.gvInvoiceNo)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/textlabelValue_Subtotal'), 
    GlobalVariable.itemSubtotal)


WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ChargeValue'), 
    GlobalVariable.gvCharge)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_DiscountValue'), 
    GlobalVariable.gvDiscount)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_ShippingCostValue'), 
    GlobalVariable.gvShippingCost)

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase History Details B2C/a_For Verification/final_TotalCost'), 
    GlobalVariable.gvTotal)

