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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Edit'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Edit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), 0)

WebUI.sendKeys(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), 'edit!@#$%^&*()_+`~1234[];\'\\,./{}:"|<>?')

WebUI.click(findTestObject('ADMIN/Categories/Category/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('ADMIN/Categories/Category/label_edit popup'), 0)

