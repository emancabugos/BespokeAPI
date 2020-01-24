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

WebUI.comment('Range01')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range01')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '0')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '20.75')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '15.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range02')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range02')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '20.76')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '40')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '30.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range03')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range03')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '40.01')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '60.75')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '45.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range04')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range04')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '60.76')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '80')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '60.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range05')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range05')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '80.01')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '100.75')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '75.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range06')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range06')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '100.76')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '120')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '90.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range07')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range07')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '120.01')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '140.75')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '105.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range08')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range08')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '140.76')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '160')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '120.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range09')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range09')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '160.01')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '180.75')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '135.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Range10')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'Range10')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '180.76')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '200')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '150.25')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/button_Add Delivery Option'), 
    0)

