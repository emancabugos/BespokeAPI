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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Invoice/navigate_InvoiceBuyer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SUPERBABY/BUYER/Invoice Details/button_Add new entry'))

WebUI.verifyElementNotClickable(findTestObject('SUPERBABY/BUYER/Invoice Details/button_Add new entry'))

WebUI.mouseOver(findTestObject('SUPERBABY/BUYER/Invoice Details/button_Add new entry'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

