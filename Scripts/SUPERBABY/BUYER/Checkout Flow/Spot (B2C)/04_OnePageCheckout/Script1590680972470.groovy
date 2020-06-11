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

def any = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_SubTotal'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('checkoutFlow', 'actualsub', any)

def any = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('checkoutFlow', 'discount', any)

def any = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('checkoutFlow', 'charge', any)

def any = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('checkoutFlow', 'deliverycost', any)

def any = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('checkoutFlow', 'total', any)

if (payment == 'Stripe') {
    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 'Stripe', true)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Stripe_New/textfield_Email'), 
        0)

    WebUI.setText(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Stripe_New/textfield_Email'), 'test321@gmail.com')

    WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Stripe_New/textfield_CardNumber'), '4242 4242 4242 4242')

    WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Stripe_New/textfield_DateExpiry'), '1123')

    WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Stripe_New/textfield_CVC'), '123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Name'), 'Jane Doe')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Stripe_New/button_Pay'))
} else if (payment == 'Custom') {
    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), Custom, true)

    WebUI.scrollToElement(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), 0)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Custom Payment/button_Accept'), 
        0)

    WebUI.setText(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/Custom Payment/textfield_Note'), 'test')

    WebUI.delay(1)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'))
} else if (payment == 'Offline Payment') {
    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 'Offline Payment', 
        true)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'))

    WebUI.delay(1)
} else if (payment == 'Cash on delivery') {
    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 'Cash on delivery', 
        true)

    WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/dropdown_Payment'), 'Cash on delivery', 
    true)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/textlabel_PayButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

def any = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('checkoutFlow', 'invoice', any)

