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

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Payment Page/dd_payment'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Payment Page/dd_payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/Payment Page/dd_payment'), 'Custom Payment', false)

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Payment Page/button_pay now'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Custom Payment/button_Accept'), 
    0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Custom Payment/textfield_Note'), 'test')

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Custom Payment/button_Accept'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Transaction Complete Page/textlabel_TransactionComplete'), 0)

