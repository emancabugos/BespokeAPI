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

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/linktext_ClearAll'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/linktext_ContinueBrowsing'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/button_Previous'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/item_image'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/textlabel_currency'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/textlabel_price'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/button_CreatePurchaseOrder'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/item_image'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/textlabel_currency'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/textlabel_price'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Table/button_CreatePurchaseOrder'))

