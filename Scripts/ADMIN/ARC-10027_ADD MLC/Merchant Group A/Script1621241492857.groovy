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

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission Name'), 'Merchant Group 1')

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Merchant Groups_Merchants'), 
    0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Merchant Groups_Merchants'))

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Search Merchant Groups'), 'User Group A', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_1st value'), 0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_1st value'))

WebUI.clearText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Search Merchant Groups'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Search Merchant Groups'), 'User Group B', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_2nd value'), 0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_2nd value'))

WebUI.clearText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Search Merchant Groups'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/input_Search Merchant Groups'), 'User Group C', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_3rd value'), 0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_3rd value'))

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'), 0)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), 0)

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), 0)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), '50')

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_To'), '100')

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission fee'), '0')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Total Range'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), 0)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), '101')

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_To'), '200')

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission fee'), '1')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Total Range'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), 0)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), '201')

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_To'), '300')

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission fee'), '99')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Total Range'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/a_ Add commission configuration'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), 0)

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_From'), '301')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/checkbox_Onwards'))

WebUI.setText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission fee'), '100')

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Total Range'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/button_Save Commission'))

WebUI.delay(0)

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/Page_0613bpdiana/button_Add new commission'), 
    0)

WebUI.verifyTextPresent('Merchant Group A', false)

