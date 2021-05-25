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

WebUI.verifyElementPresent(findTestObject('ADMIN/Users/invite_admin'), 0)

WebUI.click(findTestObject('ADMIN/Users/invite_admin'))

WebUI.verifyElementPresent(findTestObject('ADMIN/Users/modal_invite_admin'), 0)

WebUI.click(findTestObject('ADMIN/Users/button_Invite Consumer'))

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Invite Consumer modal/div_Invite your Consumer to on'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Invite Consumer modal/X_button'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Users/button_Invite Merchant'), 0)

WebUI.click(findTestObject('ADMIN/Users/button_Invite Merchant'))

WebUI.verifyElementPresent(findTestObject('ADMIN/User Mgmt/Invite Merchant Modal/textlabel_Invite your sellers to onb'), 
    0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Invite Merchant Modal/X_button_'))

