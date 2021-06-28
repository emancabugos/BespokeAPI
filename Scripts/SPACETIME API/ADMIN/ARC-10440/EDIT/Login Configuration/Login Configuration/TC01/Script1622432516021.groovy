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
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/togglebutton_Google'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/togglebutton_Google'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/Arcadier Gmail'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/togglebutton_Facebook'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/togglebutton_Facebook'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/Arcadier_FB'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/togglebutton_Custom'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/togglebutton_Custom'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/Arcadier Custom'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/togglebutton_configurationFacebook'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/togglebutton_configurationFacebook'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/Connect FB'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/button_facebookSave'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/button_facebookSave'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/SaveFB'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/togglebutton_configurationGoogle'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/togglebutton_configurationGoogle'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/Connect Gmail'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Login Conguration/button_SaveGoogle'))

WebUI.mouseOver(findTestObject('ADMIN/Login Conguration/button_SaveGoogle'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Tooltip/Login Config/SaveGmail'))

