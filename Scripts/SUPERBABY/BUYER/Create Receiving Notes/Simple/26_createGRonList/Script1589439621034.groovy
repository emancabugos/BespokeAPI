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

WebUI.clearText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_QuantityReceived'))

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_DateReceived'), '')

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_DateReceivedTime'), '')

WebUI.setText(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/textfield_QuantityReceived'), '')

WebUI.click(findTestObject('SUPERBABY/BUYER/Create Receiving Notes/button_CreateReceipt'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_Apply'), 0)

