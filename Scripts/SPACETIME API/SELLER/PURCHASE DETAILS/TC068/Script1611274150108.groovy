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

WebUI.waitForElementVisible(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/textlabel_Availability  Opening Hours'), 
    0)

WebUI.waitForElementPresent(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/textlabel_Availability  Opening Hours'), 
    0)

String mon = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_Monday08-00 - 1800'))

String tues = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_Tuesday08-00 - 1800'))

String wed = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_Wednesday08-00 - 1800'))

String thurs = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_Thursday08-00 - 1800'))

String fri = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_Friday08-00 - 1800'))

String sat = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_SaturdayClose'))

String sun = WebUI.getText(findTestObject('SPACETIME API/BUYER/Purchase Order Details/Page_Bespoke API  Purchase Order Details/Availability/p_SundayClose'))

println(orderstatus)

WebUI.verifyMatch(mon, '', false)

WebUI.verifyMatch(tues, '', false)

WebUI.verifyMatch(wed, '', false)

WebUI.verifyMatch(thurs, '', false)

WebUI.verifyMatch(fri, '', false)

WebUI.verifyMatch(sat, '', false)

WebUI.verifyMatch(sun, '', false)

