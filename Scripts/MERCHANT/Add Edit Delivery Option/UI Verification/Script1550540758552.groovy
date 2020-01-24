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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Delivery'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Header/button_Delivery'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Dashboard'), 0)

WebUI.verifyTextPresent('DASHBOARD', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Your Items'), 0)

WebUI.verifyTextPresent('YOUR ITEMS', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Upload'), 0)

WebUI.verifyTextPresent('UPLOAD', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Orders'), 0)

WebUI.verifyTextPresent('UPLOAD', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/image_translation'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/textlabel_EN'), 0)

WebUI.verifyTextPresent('EN', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/textlabel_sellername'), 0)

WebUI.verifyTextPresent(GlobalVariable.CustomMerchant, false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/dropdown_sellername'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Header/dropdown_sellername'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Purchases'), 0)

WebUI.verifyTextPresent('Purchases', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Settings'), 0)

WebUI.verifyTextPresent('Settings', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Change Password'), 0)

WebUI.verifyTextPresent('Change Password', false)

WebUI.waitForElementPresent(findTestObject('MERCHANT/Delivery Settings/Header/button_Logout'), 0)

WebUI.verifyTextPresent('Logout', false)

WebUI.comment('AddEditDelivery Option')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_Add Delivery Option'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Add  Edit Delivery option'), 
    0)

WebUI.verifyTextPresent('Add / Edit Delivery option', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Delivery Option Settings'), 
    0)

WebUI.verifyTextPresent('DELIVERY OPTION SETTINGS', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Delivery option name'), 
    0)

WebUI.verifyTextPresent('Delivery option name', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Delivers to'), 0)

WebUI.verifyTextPresent('Delivers to', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Minimum lead time'), 
    0)

WebUI.verifyTextPresent('Minimum lead time', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Where are you delivering'), 
    0)

WebUI.verifyTextPresent('Where are you delivering from', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Select if you would like'), 
    0)

WebUI.verifyTextPresent('Select if you would like to calculate shipping by total order weight or total order price', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Delivery Rate(s)'), 
    0)

WebUI.verifyTextPresent('DELIVERY RATE(S)', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textlabel_Where are you delivering'), 
    0)

WebUI.verifyTextPresent('Where are you delivering from', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivery option name'), 
    0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdowntxtfield_Delivers to'), 
    0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdown_delivers to'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_minimum_time'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivering_from (1)'), 
    0)

