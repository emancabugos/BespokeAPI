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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), '1 70V3 Cocaine')

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), 'value', 
    '1 70V3 Cocaine', 0)

WebUI.comment('150 Characters')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), 'Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymph')

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), 'value', 
    'Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymphetamine Methamphetamine Nymph', 
    0)

