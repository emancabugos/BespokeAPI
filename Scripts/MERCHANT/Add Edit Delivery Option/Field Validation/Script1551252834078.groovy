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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Page_0201bp1/a_Delivery'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Page_0201bp1/a_Delivery'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_Add Delivery Option'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_Add Delivery Option'))

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Delivery Settings/Header/a_Accept Cookies'), 0) == true) {
    WebUI.click(findTestObject('MERCHANT/Delivery Settings/Header/a_Accept Cookies'))
}

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save'), 
    0)

not_run: WebUI.scrollToElement(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save'), 
    0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save'))

WebUI.verifyTextPresent('DELIVERY RATE(S)', false)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'))

WebUI.scrollToElement(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), 
    0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'))

