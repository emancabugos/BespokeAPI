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

WebUI.comment('cancel deletion')

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/button_Delete'), 0)

WebUI.click(findTestObject('ADMIN/Custom Domain/additional customdomain/button_Delete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/textlabel_Are you sure you want to d'), 
    0)

WebUI.click(findTestObject('ADMIN/Custom Domain/additional customdomain/button_cancel'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/textlabel_Are you sure you want to d'), 
    0)

WebUI.verifyTextPresent('abc', false)

WebUI.comment('successful deletion')

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/button_Delete'), 0)

WebUI.click(findTestObject('ADMIN/Custom Domain/additional customdomain/button_Delete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/textlabel_Are you sure you want to d'), 
    0)

WebUI.click(findTestObject('ADMIN/Custom Domain/additional customdomain/button_okay'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/textlabel_Are you sure you want to d'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/toaster_SuccessCustom domain was s'), 
    0)

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Custom Domain/additional customdomain/toaster_SuccessCustom domain was s'), 
    0)

WebUI.verifyTextNotPresent('abc', false)

