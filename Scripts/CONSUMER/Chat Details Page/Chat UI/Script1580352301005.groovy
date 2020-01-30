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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), varItemName)

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/Search Result Objects/Item Name'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/Search Result Objects/Item Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details/textbox_quantity'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('CONSUMER/Item Details/textbox_quantity'), '100')

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Item Details/button_contact supplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.comment('Chat Page')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/message_box'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/textlabel_Inbox'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/icon_back'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/image_user'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/textlabel_username'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/textlabel_Member since'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/icon_send'), 0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.click(findTestObject('Utilities/Header/marketplace_logo'), FailureHandling.CONTINUE_ON_FAILURE)

