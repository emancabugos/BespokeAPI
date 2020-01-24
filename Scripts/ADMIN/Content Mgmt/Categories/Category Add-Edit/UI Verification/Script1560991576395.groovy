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

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Content Mgmt'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Content Mgmt'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/logo_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_AddACategory'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/textlabel_AddEdit a Category'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textlabel_AddEdit a Category'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textlabel_CATEGORY NAME (max no. of ch'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textfield_Category Name'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textlabel_Parent'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/dropdown_Parent'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/image_input image'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textfield_Browse image'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/button_Browse'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textlabel_Description(-Optional'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/textfield_category_description'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category/button_Save'))

WebUI.click(findTestObject('ADMIN/Categories/Category/button_Close'))

