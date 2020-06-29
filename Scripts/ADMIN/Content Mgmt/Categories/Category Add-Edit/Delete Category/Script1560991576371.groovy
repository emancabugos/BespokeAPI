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

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Category Delete'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Category Delete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/delete pop-up/textlabel_Are you sure you want to d'), 
    0)

WebUI.click(findTestObject('ADMIN/Categories/Category/delete pop-up/button_close'))

WebUI.comment('insert here verification')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Category Delete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/delete pop-up/textlabel_Are you sure you want to d'), 
    0)

WebUI.click(findTestObject('ADMIN/Categories/Category/delete pop-up/button_cancel'))

WebUI.comment('insert validation here')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Category Delete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/delete pop-up/textlabel_Are you sure you want to d'), 
    0)

WebUI.click(findTestObject('ADMIN/Categories/Category/delete pop-up/button_okay'))

WebUI.comment('insert validation here')

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/delete pop-up/Success delete Toaster/div_SuccessCategory successful'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Categories/Category/delete pop-up/Success delete Toaster/div_SuccessCategory successful'), 
    0)

