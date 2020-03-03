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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.comment('Search Item 01')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), itemName)

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), itemName)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddToCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/button_ViewCart'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ViewCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Cart/button_ContinueShopping'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Cart/button_Checkout'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout - Delivery Page/button_Next'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout - Delivery Page/selection_1stAddress'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout - Delivery Page/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/dropdown_Delivery'), 0)
