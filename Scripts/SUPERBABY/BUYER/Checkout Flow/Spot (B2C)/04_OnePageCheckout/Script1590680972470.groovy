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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_AddNewAddress'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 
    0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), firstName)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), lastName)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), address)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), country, 
    false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), address)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), city)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), state)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), postalCode)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/button_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0.5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), delivery, false)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), payment, false)

actualsub = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_SubTotal'))

discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

deliverycost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

invoice = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), FailureHandling.STOP_ON_FAILURE)

