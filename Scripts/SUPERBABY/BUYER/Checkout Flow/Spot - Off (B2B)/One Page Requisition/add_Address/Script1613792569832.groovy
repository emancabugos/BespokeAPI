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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_AddNewAddress'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 
    0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 'Jane')

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 'value')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 'Doe')

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 'value')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'Residencias de Manila')

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'value')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/dropdown_Country'), 'Philippines', 
    false)

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/dropdown_Country'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'Metro Manila')

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'value')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'Pandacan')

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'value')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), '1011')

WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), 'value')

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/button_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0.5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_BillingAddress'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_BillingAddress'))

WebUI.delay(0.5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/select_addedAddress'), FailureHandling.STOP_ON_FAILURE)

