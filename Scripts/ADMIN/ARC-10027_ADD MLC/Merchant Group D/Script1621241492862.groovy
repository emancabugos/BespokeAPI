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

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/button_Add new commission'))

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/a_Back'), 0)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission Name'), 'Merchant Group 4')

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Merchant Groups_Merchants'), 
    0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Merchant Groups_Merchants'))

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Search Merchant Groups'), 'User Group F', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_6th value'))

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'), 0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), 0)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), '0')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_Onwards'))

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission fee'), '99')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Total Range'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Commission'))

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/button_Add new commission'), 
    0)

WebUI.verifyTextPresent('Merchant Group D', false)

