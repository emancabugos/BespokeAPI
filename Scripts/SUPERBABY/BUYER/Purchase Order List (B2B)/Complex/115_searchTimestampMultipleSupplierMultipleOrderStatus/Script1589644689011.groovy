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

'kuha muna ng POM ng supplier after makuha test data'
WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabel_PurchaseOrderHistory'), 
    0)

WebUI.verifyElementVisible(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textfield_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Keyword + Single Supplier')

WebUI.setText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/filter_Timestamp'), '')

WebUI.verifyElementClickable(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/filter_OrderStatus'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/filter_OrderStatus'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/search_OrderStatus'), 0)

'\r\n'
WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/checkbox_Created'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/checkbox_Delivered'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/linktext_Apply'))

WebUI.delay(0.5)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabelValue_Supplier'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order List (B2B)/textlabelValue_OrderStatus'), '')

