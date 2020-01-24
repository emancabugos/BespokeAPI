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

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Drop Down', false)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), 'Dropdown Non-Mandatory')

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt1'), 0)

WebUI.delay(0)

WebUI.scrollToElement(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/button_addOpt'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/button_addOpt'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt3'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/button_addOpt'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt4'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/button_addOpt'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt5'), 0)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt1'), 'Select 1')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt2'), 'Select 2')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt3'), 'Select 3')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt4'), 'Select 4')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt5'), 'Select 5')

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_SelectCategories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 
    0)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 'Category 1')

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save2'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

