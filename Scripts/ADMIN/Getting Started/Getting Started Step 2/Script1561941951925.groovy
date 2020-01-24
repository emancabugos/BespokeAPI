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

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Arcadier_image link'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Arcadier_image link'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Getting Started Step 2')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/div_Step 2  Add your categorie'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 2/div_Step 2  Add your categorie'), 'Step 2: Add your categories')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 2/step2_image'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 2/p_Fill your marketplace with c'), 'Fill your marketplace with categories to allow your merchants to add their items across.')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 2/div_Add Categories'), 0)

WebUI.comment('Click video tutorial')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/step2_video'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/Video Object/yt-formatted-string_How to Add'), 
    0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('Add Category')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/div_Add Categories'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/div_Add Categories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/Add Category/h1_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Add Category/a_Add a Category'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Add Category Popup/input_category_name'), 0)

WebUI.setText(findTestObject('ADMIN/Categories/Add Category Popup/input_category_name'), 'Category 1')

WebUI.click(findTestObject('ADMIN/Categories/Add Category Popup/div_Browse'))

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('ADMIN/Categories/Add Category Popup/input_thumb'), 'C:\\\\Katalon\\\\Image\\\\pic1.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Add Category Popup/div_btn btn-success btn-ok'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Add Category Popup/div_btn btn-success btn-ok'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Add Category Popup/a_Add Photo'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Add Category Popup/a_Add Photo'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Add Category Popup/input_btnSaveParentCategory'), 0)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Categories/Add Category Popup/input_btnSaveParentCategory'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/Add Category/Success Toaster/div_SuccessCategory was succes'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 2/Add Category/Success Toaster/div_Category was successfully'), 
    'Category was successfully saved.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Getting Started/Step 2/Add Category/Success Toaster/div_SuccessCategory was succes'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/Add Category/div_Im Done here'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Add Category/div_Im Done here'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

