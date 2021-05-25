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

WebUI.callTestCase(findTestCase('ADMIN/User Group/Navigate to User Group'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/User Group/Button_Create new Group'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Create New Group/textlabel_Group Name'), 0)

WebUI.setText(findTestObject('ADMIN/Create New Group/textfield_Group Name'), 'User Group I')

WebUI.click(findTestObject('ADMIN/Create New Group/textfield_Search Merchants'))

WebUI.click(findTestObject('ADMIN/Create New Group/textarea dd_Search Merchants'))

WebUI.setText(findTestObject('ADMIN/Create New Group/textarea dd_Search Merchants'), '17Seller')

WebUI.sendKeys(findTestObject('ADMIN/Create New Group/textarea dd_Search Merchants'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ADMIN/Create New Group/dd_Merchants 1'))

WebUI.click(findTestObject('ADMIN/Create New Group/Btn_Save'))

