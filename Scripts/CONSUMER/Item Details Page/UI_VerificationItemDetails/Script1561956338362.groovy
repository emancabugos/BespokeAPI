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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/a_Text Editor/domainUpDown_Quantity'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/linktext_Home'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/image_Item'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_ItemName'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/image_SellerImage'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/linktext_SellerName'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_PurchaseOrder'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_PricePerItem'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_Currency'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_price'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_Quantity'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_MinimumOrder'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_MOQValue'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_SubTotal'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_SubTotalPrice'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSupplier'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_TotalStocks'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_TotalStocksValue'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_Description'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_ItemDescription'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_DeliversTo'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_Pickup'))

WebUI.comment('To follow verification of custom fields')

