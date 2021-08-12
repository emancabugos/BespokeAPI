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

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Homepage/search_Category100'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Search Result Page/click_SearchedItem'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Item Details/click_Negotiate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('MERCHANT_UPDATE/Chat/textfield_Chat Area'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT_UPDATE/Chat/textfield_Chat Area'), 0)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego B2B/Quotation Details/navigate_Inbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego B2B/Quotation Details/navigate_QoutationDetails'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego B2B/Chat Details Page/click_CreatQuotation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textlabel_IssueDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego B2B/Quotation Details/set_ValidityDate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego B2B/Combi Disc and Char/Fixed/01_EPFixedBC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Nego B2B/Chat Details Page/click_SendQuotation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

WebUI.mouseOver(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

