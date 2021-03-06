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

WebUI.click(findTestObject('ADMIN/Users/button_Clear'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Users/textfield_Filter by'), 0)

WebUI.setText(findTestObject('ADMIN/Users/textfield_Filter by'), 'sellerlen')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Users/Page_0613bpdiana/datepicker_DateJoined'))

WebUI.setText(findTestObject('ADMIN/Users/Page_0613bpdiana/datepicker_DateJoined'), '20/04/2020 - 25/06/2020')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Users/Page_0613bpdiana/tickbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Users/button_Apply'))

WebUI.verifyTextNotPresent('sellerlen', false)

WebUI.comment('Positive')

WebUI.click(findTestObject('ADMIN/Users/button_Clear'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Users/textfield_Filter by'), 0)

WebUI.setText(findTestObject('ADMIN/Users/textfield_Filter by'), 'sellerlen')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Users/dropdown_User Type'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Users/Page_0613bpdiana/tickbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Users/button_Apply'))

WebUI.verifyTextNotPresent('sellerlen', false)

