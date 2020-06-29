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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Invoice List/dd_paymentdue'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/dd_paymentdue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Invoice List/tickbox_Past_PaymentDue'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/tickbox_Select All_PaymentDue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('SUPERBABY/BUYER/Invoice List/dd_paymentdue'), 'value', '2 Payment Due', 
    0)

WebUI.refresh()

