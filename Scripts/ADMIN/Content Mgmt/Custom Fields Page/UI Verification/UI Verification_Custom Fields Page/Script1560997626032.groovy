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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/menulink_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/menulink_Content Mgmt.'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/pagelabel_CustomItemFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/icon2_CustomFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_AdditionalFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_ApplySpecificCategory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_FIELDNAME'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_MANDATORYFIELD'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_FIELDTYPE'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_searchedfiltered'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textlabel_AdditionalFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_SelectCategories'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save2'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Text Field', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textfeld_Searchable'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textfeld_Searchable'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textlabel_ALLOWSUSER'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/togglebutton_SearchbyField'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Hyperlink / URL', 
    false)

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textfeld_Searchable'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textlabel_ALLOWSUSER'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/togglebutton_SearchbyField'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Email', false)

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textfeld_Searchable'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/textlabel_ALLOWSUSER'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Textfield/togglebutton_SearchbyField'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Number', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Number/textlabel_MINIMUM'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Number/textlabel_MAXIMUM'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Number/textfield_minimum'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Number/textfield_maximum'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Number/textlabel_DECIMALPOINTS'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Number/tooglebutton_DecimalPoints'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Checkbox', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textlabel_FieldOptions'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textlabel_OPTIONS'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_checkbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textlabel_ADDOPTION'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Drop Down', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textlabel_FieldOptions'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textlabel_OPTIONS'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_checkbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textlabel_ADDOPTION'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Location', false)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Date / Time picker', 
    false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_DateTimePicker/textlabel_TIMENEEDED'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_DateTimePicker/togglebutton_timeneeded'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'PDF File', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_PDF File/textlabel_PDFFile'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Embed Video', false)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Embed Video/textlabel_Embed Video'), FailureHandling.STOP_ON_FAILURE)

