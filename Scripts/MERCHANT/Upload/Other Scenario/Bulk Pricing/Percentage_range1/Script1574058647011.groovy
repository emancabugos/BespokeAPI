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

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/radiobutton_Percentage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '0')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '100')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '1')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '101')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '200')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '2')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '201')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '300')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '3')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '301')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '400')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '4')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '401')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '500')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '5')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '501')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '600')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '6')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '601')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '700')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '7')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '701')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '800')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '8')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '801')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '900')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '9')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '901')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '1000')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '10')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

