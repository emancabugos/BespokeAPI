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

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery 2.0 List/button_Add Delivery Option'), 
    0)

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery 2.0 List/button_Add Delivery Option'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery Edit/textbox_delivery option name'), 
    0)

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery Edit/radio button_Onwards'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery Edit/textlabel_Unit'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery Edit/textlabel_Unit'), '')

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery Edit/textlink_Cancel'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/a_Delivery 2.0 List/button_Delete'), 0)

