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

WebUI.comment('Verification of Home link text')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/a_Text Editor/domainUpDown_Quantity'), 0)

WebUI.click(findTestObject('CONSUMER/Item Details Page/linktext_Home'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textlabel_Categories'), 0)

WebUI.comment('Verification of Seller Name')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/a_Text Editor/domainUpDown_Quantity'), 0)

WebUI.click(findTestObject('CONSUMER/Item Details Page/linktext_SellerName'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Merchant Storefront/textfield_StorefrontSearch'), 0)

WebUI.verifyElementVisible(findTestObject('MERCHANT/Merchant Storefront/textfield_StorefrontSearch'))

WebUI.comment('Go to Homepage')

WebUI.click(findTestObject('CONSUMER/Homepage/logo_Marketplace'))

WebUI.waitForPageLoad(5)

WebUI.comment('Verification of Inbox Icon')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/a_Text Editor/domainUpDown_Quantity'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_Inbox'))

WebUI.comment('Go to Homepage')

WebUI.click(findTestObject('CONSUMER/Homepage/logo_Marketplace'))

WebUI.waitForPageLoad(5)

WebUI.comment('Verification of Inbox Icon')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/a_Text Editor/domainUpDown_Quantity'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ComparisonList'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation List/button_Add New List'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation List/button_Add New List'))

