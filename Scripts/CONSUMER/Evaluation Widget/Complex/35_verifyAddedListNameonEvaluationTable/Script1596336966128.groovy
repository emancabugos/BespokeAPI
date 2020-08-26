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

WebUI.click(findTestObject('CONSUMER/Evaluation List/table_LIST NAME'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'), 0)

WebUI.verifyOptionsPresent(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'), ['List Name Widget 01', 'List Name Widget 02'
        , 'List Name Widget 03', 'List Name Widget 04', 'List Name Widget 05', 'List Name Widget 06', 'List Name Widget 07'
        , 'List Name Widget 08', 'List Name Widget 09', 'List Name Widget 10', 'List Name Widget 11', 'List Name Widget 12'
        , 'List Name Widget 13', 'List Name Widget 14', 'List Name Widget 15', 'List Name Widget 16', 'List Name Widget 17'
        , 'List Name Widget 18', 'List Name Widget 19', 'List Name Widget 20', 'List Name Widget 21'])

