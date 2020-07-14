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

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/sidemenu_configuration'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/sidemenu_configuration'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/submenulink_Custom Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/icon1_CustomFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/pagelabel_CustomItemFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/textlabel_NotUsingEnglish'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/linktext_TranslateHere'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/icon2_CustomFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/textlabel_AdditionalFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/textlabel_MandatoryOrOptional'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/label_Filterby'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/columnhearder_FieldName'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/columnhearder_FieldType'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/columnhearder_CategoriesApplied'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom1_All categories'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom1_Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom1_Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom2_All categories'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom2_Drop Down'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom2_Sub-category'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom3_All categories'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom3_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom3_Text Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom4_All categories'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom4_Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom4_Text Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom5_All categories'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom5_Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/custom5_Price'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/icon_information'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/dropdown_Filterby'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/textlabel_NeedHelp'), FailureHandling.STOP_ON_FAILURE)

