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

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD1', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD2', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD3', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD4', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD5', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD6', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD7', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD8', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD9', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Custom Fields/dropdown_allCat_Drop Down_NM1'), 
    'allCat_Drop Down_NM1DD10', false, 0)

