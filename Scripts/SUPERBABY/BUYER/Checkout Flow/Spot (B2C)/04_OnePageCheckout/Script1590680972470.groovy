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

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 'Buyer1')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 'Checkout')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/dropdown_Country'), 'Philippines', 
    false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'Makati')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'NCR')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), '1200')

WebUI.comment('Get Variable')

def fname = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 
    'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputAddFname', fname)

def lname = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 
    'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputAddLname', lname)

def address = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 
    'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputAddress', address)

def country = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/dropdown_Country'), 
    'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputCountry', country)

def city = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputCity', city)

def state = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputState', state)

def postal = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), 
    'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Buyer Details', 'gvInputPostal', postal)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/button_Add'))

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

WebUI.selectOptionByIndex(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 1)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/button_collasePay'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 'Cash on delivery', 
    false)

WebUI.comment('Get Variable')

def subtotal = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_SubTotal'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('One Page Checkout', 'gvSubtotal', subtotal)

def discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('One Page Checkout', 'gvDiscount', discount)

def charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('One Page Checkout', 'gvCharge', charge)

def shippingCost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('One Page Checkout', 'gvShippingCost', shippingCost)

def total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('One Page Checkout', 'gvTotal', total)

WebUI.comment('Pay Now')

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'))

def invoice = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('One Page Checkout', 'gvInvoiceNo', invoice)

