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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/dropdown_menu'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BuyerDocs'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_Receiving Notes'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_Receiving Notes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_CreateNewNote'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_CreateNewNote'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupSearchPONumber'), 0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_CreateNewNote'), GlobalVariable.PONum)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/button_popupYes'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/button_CreateReceipt'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabel_RequistionNo'), 
    GlobalVariable.invoice)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabe_ShippingMethod'), 
    GlobalVariable.deliverycost)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabel_UnitPrice'), 
    GlobalVariable.price)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabel_SubTotal_1'), 
    GlobalVariable.actualsub)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabel_SubTotal_1'), 
    GlobalVariable.actualsub)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabel_ShippingValue'), 
    GlobalVariable.deliverycost)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Requisition Order Approval/For Verification/textlabel_TotalCostFinal'), 
    GlobalVariable.totalcost)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_DateReceived'), date)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_DateReceivedTime'), time)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_QuantityReceived'), quantityReceived)

WebUI.click(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/button_CreateReceipt'), FailureHandling.STOP_ON_FAILURE)

