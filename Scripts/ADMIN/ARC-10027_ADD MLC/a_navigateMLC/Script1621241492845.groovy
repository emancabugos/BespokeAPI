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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin New Sidebar/menu_Configuration'), 0)

WebUI.click(findTestObject('ADMIN/Admin New Sidebar/menu_Configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin New Sidebar/submenu_Commission'), 0)

WebUI.click(findTestObject('ADMIN/Admin New Sidebar/submenu_Commission'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Commission/label_Merchant Level'), 0)

WebUI.click(findTestObject('ADMIN/Custom Commission/radio_button Mer Level'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Custom Commission/Btn_Configure mer Level'))

WebUI.delay(2)

