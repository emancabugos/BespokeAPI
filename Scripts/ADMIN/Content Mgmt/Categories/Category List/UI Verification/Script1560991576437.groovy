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

WebUI.click(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/logo_Categories'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_Categories'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Categories header'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Your users dont use English'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlink_Translate Here'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_translate here'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_Categories desc'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Create categories for your s'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/button_AddACategory'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_CategoryNameheader'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_hamburger bar'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_Category Image'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_hamburger bar'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Category1'))

WebUI.comment('wala pang validations para sa mga sub categories')

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/button_Edit'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/button_Category Delete'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_Need Help'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Need help with categories'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlink_Categories'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/button_Support'))

WebUI.comment('Validation of Button and hyperlink responsiveness')

WebUI.comment('Translate Here navigation')

WebUI.click(findTestObject('ADMIN/Categories/Category List/textlink_Translate Here'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Translate page'), 0)

WebUI.comment('Translate Here icon - navigation')

WebUI.click(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Categories header'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/logo_translate here'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Translate page'), 0)

WebUI.comment('Need help with categories? hyperlink responsiveness')

WebUI.click(findTestObject('ADMIN/Categories/Category List/sidemenu_configuration'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/button_Categories'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Categories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Categories header'), 0)

WebUI.click(findTestObject('ADMIN/Categories/Category List/textlink_Categories'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/logo_arcadier'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('Support')

WebUI.click(findTestObject('ADMIN/Categories/Category List/button_Support'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Categories/Category List/textlabel_Support'))

