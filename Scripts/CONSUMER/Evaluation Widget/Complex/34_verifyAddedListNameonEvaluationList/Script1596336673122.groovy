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

WebUI.waitForElementPresent(findTestObject('CONSUMER/Homepage/icon_ComparisonList'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ComparisonList'))

WebUI.waitForElementPresent(findTestObject('CONSUMER/Evaluation List/breadcrumbs_Home'), 0)

WebUI.verifyTextPresent('My Comparison Table', false)

WebUI.verifyTextPresent('List Name Widget 01', false)

WebUI.verifyTextPresent('List Name Widget 02', false)

WebUI.verifyTextPresent('List Name Widget 03', false)

WebUI.verifyTextPresent('List Name Widget 04', false)

WebUI.verifyTextPresent('List Name Widget 05', false)

WebUI.verifyTextPresent('List Name Widget 06', false)

WebUI.verifyTextPresent('List Name Widget 07', false)

WebUI.verifyTextPresent('List Name Widget 08', false)

WebUI.verifyTextPresent('List Name Widget 09', false)

WebUI.verifyTextPresent('List Name Widget 10', false)

WebUI.verifyTextPresent('List Name Widget 11', false)

WebUI.verifyTextPresent('List Name Widget 12', false)

WebUI.verifyTextPresent('List Name Widget 13', false)

WebUI.verifyTextPresent('List Name Widget 14', false)

WebUI.verifyTextPresent('List Name Widget 15', false)

WebUI.verifyTextPresent('List Name Widget 16', false)

WebUI.verifyTextPresent('List Name Widget 17', false)

WebUI.verifyTextPresent('List Name Widget 18', false)

WebUI.verifyTextPresent('List Name Widget 19', false)

WebUI.verifyTextPresent('List Name Widget 20', false)

