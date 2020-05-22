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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Header')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), 'DASHBOARD')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), 'INVENTORY')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 'UPLOAD')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), 'ORDERS')

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_inbox'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/language'), 0)

WebUI.comment('Body')

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_Your Item'), 'Your Item')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Inventory Page/button_ Upload Item'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Inventory Page/textbox_search-item'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Inventory Page/textbox_search-item'), 'placeholder', 'Search by item name', 
    0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Inventory Page/icon_Search'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_ITEM'), 'ITEM')

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_PRICE'), 'PRICE')

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_BULK PRICING'), 'BULK PRICING')

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_STOCK'), 'STOCK')

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_APPROVED'), 'PURCHASABLE')

WebUI.comment('Footer')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_ABOUT US'), 'ABOUT US')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_TERMS OF SERVICE'), 'TERMS OF SERVICE')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_PRIVACY POLICY'), 'PRIVACY POLICY')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_RETURN POLICY'), 'RETURN POLICY')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_FAQ'), 'FAQ')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_CONTACT US'), 'CONTACT US')

WebUI.verifyElementText(findTestObject('Utilities/Footer/textlabel_2016 All rights reserve'), 'ncd © 2016 All rights reserved')

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Header Footer Redirection'), [:], FailureHandling.CONTINUE_ON_FAILURE)

