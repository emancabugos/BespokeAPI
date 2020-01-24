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

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/icon_Delivery'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_Delivery'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/icon_label'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/icon_Review'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_Review'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textfield_FirstName'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_LastName'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textfield_LastName'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_ContactNo'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textfield_ContactNo'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_Email'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Delivery Checkout Page/textfield_Email'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/add_AddressBox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/logo_AddressBox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_AddDeliveryAddress'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/add_AddressBox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_AddreseeFirstName'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_AddreseeLastName'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeFirstName'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_AddreseeLastName'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlfield_Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_Country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/dropdown_Country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_City'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_City'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_State'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_State'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textlabel_PostalCode'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/textfield_State'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/DeliveryAddress/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

