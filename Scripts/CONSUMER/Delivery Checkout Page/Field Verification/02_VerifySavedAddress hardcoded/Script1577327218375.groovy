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

WebUI.comment('1st Address')

String fname1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1fname'))

String address1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1address'))

String country1 = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/Addresses/textlabel_1Country'))

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

WebUI.comment('Verification-1staddress')

WebUI.verifyMatch(fname1, fname, false)

WebUI.verifyMatch(address1, address, false)

WebUI.verifyMatch(country1, country, false)

WebUI.verifyMatch(state1, state, false)

WebUI.verifyMatch(city1, city, false)

WebUI.verifyMatch(postalCode1, postalcode, false)

WebUI.comment('Verification-2ndAddress')

WebUI.verifyMatch(fname2, findTestData('CONSUMER/Saved Address').getValue(1, 2), false)

WebUI.verifyMatch(address2, findTestData('CONSUMER/Saved Address').getValue(3, 2), false)

WebUI.verifyMatch(country2, country, false)

WebUI.verifyMatch(state2, state, false)

WebUI.verifyMatch(city2, city, false)

WebUI.verifyMatch(postalcode2, postalcode, false)

WebUI.comment('Verification-3rdAddress')

WebUI.verifyMatch(fname3, fname, false)

WebUI.verifyMatch(address3, address, false)

WebUI.verifyMatch(country3, country, false)

WebUI.verifyMatch(state3, state, false)

WebUI.verifyMatch(city3, city, false)

WebUI.verifyMatch(postalcode3, postalcode, false)

