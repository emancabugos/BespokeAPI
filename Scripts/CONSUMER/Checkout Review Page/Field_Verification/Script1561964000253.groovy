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

WebUI.waitForElementVisible(findTestObject('null'), 0)

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.comment('Select a delivery')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.comment('Edit Delivery Details')

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_FirstName'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_LastName'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_ContactNo'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/textfield_Email'), '')

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeletePopup/button_Delete'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeletePopup/textlabel_Warning'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeletePopup/button_Okay'))

WebUI.verifyElementNotVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeletePopup/button_Delete'))

WebUI.comment('Add an Address')

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/add_AddressBox'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'), 0)

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeLastName'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlfield_Address'), '')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/dropdown_Country'), '', false)

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_City'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_State'), '')

WebUI.setText(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_PostalCode'), '')

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'), 0)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.waitForElementVisible(findTestObject('null'), 0)

WebUI.comment('Verify Updated Address')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.verifyElementText(findTestObject('null'), '')

WebUI.comment('Verify Previous functionality button')

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.waitForElementVisible(findTestObject('null'), 0)

