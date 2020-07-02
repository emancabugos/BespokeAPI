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

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Approval Workflow/textlink_Create new Approval Workflow'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/textlink_Create new Approval Workflow'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/text_Create Approval Workow'), 
    0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/textbox_Reason_workflow_name'), 'Approval - Workflow A')

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/checkbox_unlitmited'))

WebUI.setText(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/textbox_Approval(s) Needed_minimum_approver'), 
    '5')

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/dd_approver'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/checkbox_SelectAll'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/checkbox_SelectAll'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/checkbox_veto1'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/checkbox_veto1'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/button_Add New Flow'))

WebUI.waitForElementNotClickable(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/checkbox_unlitmited'), 
    0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/button_Save'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/Save Workflow Popup/btn_Save'), 
    0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Approval Workflow/Create Workflow/Save Workflow Popup/btn_Save'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Approval Workflow/textlink_Create new Approval Workflow'), 0)

