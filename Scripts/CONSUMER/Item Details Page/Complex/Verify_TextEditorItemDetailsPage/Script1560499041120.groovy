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

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/domainUpDown_Quantity'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_checkbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_radiobutton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Bold'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Italics'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Underline'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Strikethrough'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Number1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Number2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Bullet1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Bullet2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Quotation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_AlignLeft'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Center'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_AlignRight'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Justified'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Hyperlink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_heartEmoticon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_sadEmoticon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_blushEmoticon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_AlignRight'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Justified'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Hyperlink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_heartEmoticon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_sadEmoticon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_blushEmoticon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_specialCharacter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Styles'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Format'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Hyperlink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_Font'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_FontSize'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_FontColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Text Editor/textEditor_FontBackgroundColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

