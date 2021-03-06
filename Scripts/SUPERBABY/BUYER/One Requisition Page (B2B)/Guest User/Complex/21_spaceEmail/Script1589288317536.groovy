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

WebUI.verifyElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/textfield_FirstName'))

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textfield_Email'), '                                                         ')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textfield_FirstName'), 'Jane')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textfield_LastName'), 'Doe')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textfield_Contact'), '0912345678')

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), FailureHandling.STOP_ON_FAILURE)

String errornotif = WebUI.getCSSValue(findTestObject('SUPERBABY/BUYER/One Page Requisition/textfield_Email'), 'border-color')

KeywordLogger log = new KeywordLogger()

log.logInfo(errornotif)

WebUI.verifyMatch(errornotif, 'rgb(202, 11, 11)', false)

