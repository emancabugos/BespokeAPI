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

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/menu_Configuration'), 0)

WebUI.click(findTestObject('ADMIN/Admin New Sidebar/menu_Configuration'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_Categories'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_Categories'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_CustomFields'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_ExternalLinks'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_Commission'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_CustomDomain'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_SetupPayments'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_FeatureToogle'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin New Sidebar/submenu_LoginMethod'), 0)

