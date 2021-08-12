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

WebUI.waitForElementPresent(findTestObject('CONSUMER/Settings/linktext_Profile'), 0)

WebUI.click(findTestObject('MERCHANT/User Settings/Profile/textlabel_Payment'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('COD')

WebUI.verifyElementNotClickable(findTestObject('MERCHANT/User Settings/Payment/COD/button_link account'))

WebUI.mouseOver(findTestObject('MERCHANT/User Settings/Payment/COD/button_link account'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.comment('Custom Payment')

WebUI.verifyElementNotClickable(findTestObject('MERCHANT/User Settings/Payment/custom/button_link custom'))

WebUI.mouseOver(findTestObject('MERCHANT/User Settings/Payment/custom/button_link custom'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.comment('Offline')

WebUI.verifyElementNotClickable(findTestObject('MERCHANT/User Settings/Payment/offline/button_link offline'))

WebUI.mouseOver(findTestObject('MERCHANT/User Settings/Payment/offline/button_link offline'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

WebUI.comment('Stripe')

WebUI.verifyElementNotClickable(findTestObject('MERCHANT/User Settings/Payment/stripe/button_link stripe'))

WebUI.mouseOver(findTestObject('MERCHANT/User Settings/Payment/stripe/button_link stripe'))

WebUI.verifyTextPresent('You need permission to perform this action', false)

