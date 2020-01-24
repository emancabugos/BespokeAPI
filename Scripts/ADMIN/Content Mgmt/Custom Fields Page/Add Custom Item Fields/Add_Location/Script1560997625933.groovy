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

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Location', false)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), 'Location Mandatory')

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_SelectCategories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 
    0)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 'Category 4')

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 'Category 5')

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save2'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)
