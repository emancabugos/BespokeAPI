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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('SUPERBABY/SELLER/Create Invoice/textlink_back'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Invoice List/textlabel_Invoice List'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/textlink_Create new Invoice'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/textbox_PO number'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/textbox_PO number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/1st PO'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/1st PO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/Create Invoice Popup/button_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

