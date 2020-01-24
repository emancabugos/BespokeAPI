import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/icon_Delivery'), 0)

WebUI.comment('Empty First Name')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_FirstName'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textfield_FirstName'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_FirstName'), '')

WebUI.comment('Empty Last Name')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_LastName'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textfield_LastName'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_LastName'), '')

WebUI.comment('Empty Contact No')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_ContactNo'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textfield_ContactNo'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_ContactNo'), '')

WebUI.comment('Empty Email')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_Email'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textfield_Email'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_Email'), '')

WebUI.comment('No selected address')

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/toaster_NoSelectedDelivery'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/toaster_NoSelectedDelivery'))

WebUI.waitForElementNotVisible(findTestObject('CONSUMER/Delivery Checkout Page/toaster_NoSelectedDelivery'), 0)

WebUI.comment('Empty Fields for Add Delivery Address popup')

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/add_AddressBox'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'))

WebUI.comment('Input values to all fields')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeLastName'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlfield_Address'), '')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/dropdown_Country'), '', false)

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_City'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_State'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_PostalCode'), '')

WebUI.comment('Empty First Name')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'), '')

WebUI.comment('Empty Last Name')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeLastName'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeLastName'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeLastName'), '')

WebUI.comment('Empty Address')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlfield_Address'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlfield_Address'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlfield_Address'), '')

WebUI.comment('Empty City')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_City'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_City'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_City'), '')

WebUI.comment('Empty Postal')

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_PostalCode'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_PostalCode'))

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_PostalCode'), '')

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Cancel'))

WebUI.waitForElementNotVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Cancel'), 0)

