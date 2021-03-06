import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/breadcrumbs_Home'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/breadcrumbs_Evaluation List'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/button_Add New List'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/table_LIST NAME'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/table_DATE CREATED'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/table_PRODUCTS'), 0)

WebUI.comment('Add/Edit Popup')

WebUI.click(findTestObject('CONSUMER/Evaluation List/button_Add New List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/textlabel_AddEdit list'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/textlabel_List Name'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/textbox_name'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/button_Save'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/icon_close'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation List/Add Edit Popup/icon_close'), FailureHandling.CONTINUE_ON_FAILURE)

