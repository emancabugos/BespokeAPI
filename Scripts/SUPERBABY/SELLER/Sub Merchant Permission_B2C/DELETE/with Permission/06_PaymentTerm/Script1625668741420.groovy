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

WebUI.callTestCase(findTestCase('CONSUMER/Settings/Simple/navigateTo_SettingsPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('MERCHANT/User Settings/Payment Terms/tab_PaymentTerm'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Payment Terms/tab_PaymentTerm'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Payment Terms/linktext_Add Payment Term'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Payment Terms/linktext_Add Payment Term'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/User Settings/Payment Terms/textfield_Name'), 0)

WebUI.setText(findTestObject('MERCHANT/User Settings/Payment Terms/textfield_Name'), 'Test')

WebUI.setText(findTestObject('MERCHANT/User Settings/Payment Terms/textfield_TermsCondition'), 'Test')

WebUI.mouseOver(findTestObject('MERCHANT/User Settings/Payment Terms/button_Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

