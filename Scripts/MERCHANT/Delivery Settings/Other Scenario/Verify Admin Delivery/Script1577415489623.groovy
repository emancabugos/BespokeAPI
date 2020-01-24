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

WebUI.verifyTextPresent('Delivery A', false)

WebUI.verifyTextPresent('Delivery B', false)

WebUI.verifyTextPresent('Delivery C', false)

WebUI.verifyTextPresent('Delivery D', false)

WebUI.verifyTextPresent('Delivery E', false)

WebUI.verifyTextPresent('Delivery F', false)

WebUI.verifyTextPresent('Delivery G', false)

WebUI.verifyTextPresent('Delivery H', false)

WebUI.verifyTextPresent('Delivery I', false)

WebUI.verifyTextPresent('Delivery J', false)

WebUI.verifyTextPresent('Delivery K', false)

WebUI.verifyTextPresent('Delivery L', false)

WebUI.verifyTextPresent('Delivery Maximum Ch@racters2!#', false)

