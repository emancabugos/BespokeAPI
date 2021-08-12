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

WebUI.callTestCase(findTestCase('CONSUMER/Settings/Simple/navigateTo_SettingsPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Settings/button_Change'))

WebUI.verifyElementNotClickable(findTestObject('CONSUMER/Settings/button_Change'))

WebUI.mouseOver(findTestObject('CONSUMER/Settings/button_Change'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.verifyElementVisible(findTestObject('CONSUMER/User Custom Fields/upload_Admin_Image_ConsMer_No'))

WebUI.verifyElementNotClickable(findTestObject('CONSUMER/User Custom Fields/upload_Admin_Image_ConsMer_No'))

WebUI.mouseOver(findTestObject('CONSUMER/User Custom Fields/upload_Admin_Image_ConsMer_No'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.verifyElementVisible(findTestObject('CONSUMER/User Custom Fields/upload_Admin_Image_ConsMer_Yes'))

WebUI.verifyElementNotClickable(findTestObject('CONSUMER/User Custom Fields/upload_Admin_Image_ConsMer_Yes'))

WebUI.mouseOver(findTestObject('CONSUMER/User Custom Fields/upload_Admin_Image_ConsMer_Yes'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.verifyElementVisible(findTestObject('CONSUMER/User Custom Fields/upload_Admin_PDF_ConsMer_No'))

WebUI.verifyElementNotClickable(findTestObject('CONSUMER/User Custom Fields/upload_Admin_PDF_ConsMer_No'))

WebUI.mouseOver(findTestObject('CONSUMER/User Custom Fields/upload_Admin_PDF_ConsMer_No'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.verifyElementVisible(findTestObject('CONSUMER/User Custom Fields/upload_Admin_PDF_ConsMer_Yes'))

WebUI.verifyElementNotClickable(findTestObject('CONSUMER/User Custom Fields/upload_Admin_PDF_ConsMer_Yes'))

WebUI.mouseOver(findTestObject('CONSUMER/User Custom Fields/upload_Admin_PDF_ConsMer_Yes'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

