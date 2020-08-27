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

WebUI.refresh()

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/checkbox_category2'))

String parentcat = WebUI.getCSSValue(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/checkbox_category2'), 'background-color')

String subcat1 = WebUI.getCSSValue(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/checkbox_category21'), 'background-color')

String subcat2 = WebUI.getCSSValue(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/checkbox_category22'), 'background-color')

WebUI.verifyMatch(parentcat, 'rgba(136, 135, 135, 1)', false)
WebUI.verifyMatch(subcat1, 'rgba(136, 135, 135, 1)', false)
WebUI.verifyMatch(subcat2, 'rgba(136, 135, 135, 1)', false)
