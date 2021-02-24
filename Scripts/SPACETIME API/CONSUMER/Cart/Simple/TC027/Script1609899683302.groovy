import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('SPACETIME API/BUYER/Homepage/textfield_search'), 0)

WebUI.setText(findTestObject('SPACETIME API/BUYER/Homepage/textfield_search'), 'per Night Month D')

WebUI.click(findTestObject('SPACETIME API/BUYER/Homepage/button_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/CONSUMER/Search Result/text_serviceName'), 0)

WebUI.click(findTestObject('SPACETIME API/CONSUMER/Search Result/text_serviceName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/BUYER/Item Details/textfiled_Unit'), 0)

WebUI.setText(findTestObject('SPACETIME API/BUYER/Item Details/textfiled_Unit'), '1')

WebUI.click(findTestObject('SPACETIME API/BUYER/Item Details/button_AddToCart'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/BUYER/Header/icon_cart'), 0)

WebUI.click(findTestObject('SPACETIME API/BUYER/Header/icon_cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/CONSUMER/Cart/serviceName'), 0)

WebUI.verifyTextPresent('per Night Month D', false)

WebUI.click(findTestObject('SPACETIME API/CONSUMER/Cart/icon_delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME API/CONSUMER/Cart/Delete Popup/btn_Okay'), 0)

WebUI.click(findTestObject('SPACETIME API/CONSUMER/Cart/Delete Popup/btn_Okay'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

