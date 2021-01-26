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

WebUI.comment('main buyer should be logged in')

WebUI.waitForElementVisible(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/Page_Bespoke API  Purchase Order Details/textfield_Event'), 
    0)

WebUI.waitForElementPresent(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/Page_Bespoke API  Purchase Order Details/textfield_Event'), 
    0)

String eventval = WebUI.setText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/Page_Bespoke API  Purchase Order Details/textfield_Event'), 
    'im the main buyer')

WebUI.uploadFile(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/Page_Bespoke API  Purchase Order Details/hyperlinktext_Attachment'), 
    'C:\\Users\\arcadier01\\Downloads\\dummy.pdf')

WebUI.click(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/Page_Bespoke API  Purchase Order Details/button_Add new entry'))

WebUI.verifyTextPresent(eventval, false)

