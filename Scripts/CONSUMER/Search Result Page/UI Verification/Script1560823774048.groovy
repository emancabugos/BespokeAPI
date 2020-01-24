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

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/textfield_Search'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/button_hamburger'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/linktext_Home'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/textfield_Search'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/textlabel_Sortby'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/dropdown_Sort'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/button_GridView'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/button_ListView'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/button_Filter'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/textlabel_Categories'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Search Result Page/textlabel_PriceRange'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Search Result Page/button_Reset'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Search Result Page/button_Apply'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/button_hamburger'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/linktext_Home'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/button_GridView'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/button_ListView'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/button_Filter'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/button_Reset'))

WebUI.verifyElementClickable(findTestObject('CONSUMER/Search Result Page/button_Apply'))

WebUI.click(findTestObject('CONSUMER/Search Result Page/button_Filter'))

WebUI.waitForElementNotVisible(findTestObject('CONSUMER/Search Result Page/textlabel_Categories'), 0)

WebUI.verifyElementNotVisible(findTestObject('CONSUMER/Search Result Page/textlabel_Categories'))

WebUI.verifyElementNotVisible(findTestObject('CONSUMER/Search Result Page/textlabel_PriceRange'))

