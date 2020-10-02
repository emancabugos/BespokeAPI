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

WebUI.waitForElementPresent(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/textfield_Search'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/textfield_Search'), 'Category 03')

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Category 03_checkboxes/checkbox_category 03'))

category03 = WebUI.getCSSValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Category 03_checkboxes/checkbox_category 03'), 
    'background-color')

println(category03)

WebUI.verifyMatch(category03, 'rgba(136, 135, 135, 1)', false)
//next

category31 = WebUI.getCSSValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Category 03_checkboxes/checkbox_category 031'), 
    'background-color')

println(category31)

WebUI.verifyMatch(category31, 'rgba(136, 135, 135, 1)', false)

category311 = WebUI.getCSSValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Category 03_checkboxes/checkbox_category 03112'), 
    'background-color')

println(category311)

WebUI.verifyMatch(category311, 'rgba(136, 135, 135, 1)', false)

category32 = WebUI.getCSSValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Category 03_checkboxes/checkbox_category 032'), 
    'background-color')

println(category32)

WebUI.verifyMatch(category32, 'rgba(136, 135, 135, 1)', false)

