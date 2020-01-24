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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/logo_Marketplace'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/button_Search'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/Search Result Objects/Item Name'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/Search Result Objects/Item Name'))

MOQValue = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_MOQValue'))

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_QTY'), '2')

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_hideUnhide evaluate'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_addEvaluationlist'))

WebUI.clearText(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'))

WebUI.setText(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'), 'List Checkout')

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_Save'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_hideUnhide evaluate'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_AddtoEvaluation'))

WebUI.delay(5)

WebUI.comment('1st Address')

String fname1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1fname'))

String address1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1address'))

String country2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1Country'))

String state1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1State'))

String city1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1City'))

String postalCode1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1PostalCode'))

WebUI.comment('2nd address')

fname2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2name'))

address2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2address'))

country2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2Country'))

state2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2State'))

city2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2City'))

postalcode2 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2PostalCode'))

WebUI.comment('3rd Address')

fname3 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_3Name'))

address3 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_3Address'))

country3 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_3Country'))

state3 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_2State'))

city3 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_3City'))

postalcode3 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_3Postal'))

WebUI.comment('Verification')

WebUI.verifyMatch('', '', false)

