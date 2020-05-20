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

'Keyword + PO Timestamp'
WebUI.waitForElementPresent(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/button_Search'), 0)

WebUI.setText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textfield_searchPurchaseOrder'), '')

WebUI.setText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/filter_POTimestamp'), '')

WebUI.click(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/dropdown_OrderStatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/a_OrderStatusDD/checkbox_OrderSelectAll'), 
    0)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/a_OrderStatusDD/checkbox_OrderCreated'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/dropdown_Buyer'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/a_AllBuyerDD/search_Buyer'), 0)

WebUI.setText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/a_AllBuyerDD/search_Buyer'), '')

WebUI.click(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/a_AllBuyerDD/checkbox_Buyer1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/button_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0.5)

WebUI.comment('Verification on Data on List')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_PRTimestamp'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_PRNo'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_PRStatus'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_POTimestamp'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_PONo'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_OrderStatus'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_Buyer'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_Seller'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_GRONo1'), '')

WebUI.verifyElementText(findTestObject('SUPERBABY/ADMIN/Purchase Order List B2B/textlabelValue_InvoiceNo'), '')

