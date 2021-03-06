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

WebUI.verifyElementPresent(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/filter_Category'), 0)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/filter_Category'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/search_Category'), 0)

WebUI.verifyElementPresent(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/checkbox_SelectAllCategory'), 0)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/checkbox_SelectAllCategory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementChecked(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/checkbox_SelectAllCategory'), 0)

WebUI.click(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/checkbox_SelectAllCategory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/checkbox_SelectAllCategory'), 0)

WebUI.refresh()

