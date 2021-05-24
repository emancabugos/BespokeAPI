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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_AddACategory'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Categories/Category/dropdown_Parent'), 2)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), 'Category 04')

WebUI.click(findTestObject('ADMIN/Categories/Category/dropdown_Parent'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Categories/Category/dropdown_Parent'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Categories/Category/dropdown_Parent'), '-', false)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_Browse'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Categories/Category/image_input image'), 'C:\\\\Katalon\\\\BespokeAPI\\\\Images\\\\Category\\\\4.png')

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/button_upload check'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_upload check'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/button_upload save'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category/button_upload save'))

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Categories/Category/textfield_category_description'), 'Description4')

WebUI.click(findTestObject('ADMIN/Categories/Category/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/label_edit popup'), 0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Categories/Category/label_edit popup'), 0)

