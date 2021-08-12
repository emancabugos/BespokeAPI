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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddToCart'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/button_AddToCart'), 0)

WebUI.callTestCase(findTestCase('CONSUMER/Evaluation Widget/Simple/additem_EvaluationWidget'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'), 'Create new comparison table', 
    false)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Edit'), 0)

WebUI.verifyElementClickable(findTestObject('CONSUMER/Evaluation Widget/button_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CONSUMER/Evaluation Widget/button_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

