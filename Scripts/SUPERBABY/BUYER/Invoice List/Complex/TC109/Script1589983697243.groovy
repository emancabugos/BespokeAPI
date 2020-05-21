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

'Search Invoice No & Stripe'
WebUI.setText(findTestObject('SUPERBABY/BUYER/Invoice List/textbox_search'), '')

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/ddicon_payment method'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Invoice List/tickbox_Select All_PaymentMethod'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/tickbox_Stripe'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/Invoice List/text_apply'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0.5)

WebUI.comment('')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_ExternalInvoiceNo'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_DateCreated'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_PaymentDue'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_PONo'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_Supplier'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_currencyCode'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_currencySymbol'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_AmountToBeCollected'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_Payment'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Invoice List/value_PaymentStatus'), '')

WebUI.refresh()

