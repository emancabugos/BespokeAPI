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

WebUI.callTestCase(findTestCase('MERCHANT/Location ID/Complex/Pre-Requisite BasicDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/PH'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/PH'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Pricing and Stocks/header_Pricing  Stock'), FailureHandling.CONTINUE_ON_FAILURE)

