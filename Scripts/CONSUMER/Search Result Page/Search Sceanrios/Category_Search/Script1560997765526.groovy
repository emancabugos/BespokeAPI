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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), '')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/button_hamburger'), 0)

WebUI.comment('Verification upon clicking hamburger menu')

WebUI.click(findTestObject('CONSUMER/Search Result Page/button_hamburger'))

WebUI.comment('Click category on Hamburger menu')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/linktext_ParentHeader'), '')

WebUI.comment('Verify list of categories')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/textlabel_Currency'), '')

WebUI.comment('Verify list of custom fields')

WebUI.comment('Verify breadcrumbs')

WebUI.comment('Verification upon selecting category on dropdown menu')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Search Result Page/dropdown_Category'), '', false)

WebUI.click(findTestObject('CONSUMER/Search Result Page/button_Search'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/linktext_ParentHeader'), '')

WebUI.comment('Verify list of categories')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/textlabel_Currency'), '')

WebUI.comment('Verify list of custom fields')

WebUI.comment('Verify breadcrumbs')

WebUI.comment('Select All Categories on categories dropdown menu')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Search Result Page/textlabel_Categories'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/textlabel_Currency'), '')

WebUI.comment('Verify list of custom fields')

WebUI.comment('Verify breadcrumbs')

WebUI.comment('Verification upon selecting category on dropdown menu')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Search Result Page/dropdown_Category'), '', false)

WebUI.click(findTestObject('CONSUMER/Search Result Page/button_Search'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/linktext_ParentHeader'), '')

WebUI.comment('Verify list of categories')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/textlabel_Currency'), '')

WebUI.comment('Verify list of custom fields')

WebUI.comment('Verify breadcrumbs')

