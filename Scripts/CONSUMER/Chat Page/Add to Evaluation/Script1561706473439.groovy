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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/icon_inbox'), 0)

WebUI.click(findTestObject('Utilities/Header/icon_inbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textbox_search'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textbox_search'), varItemName)

WebUI.sendKeys(findTestObject('MERCHANT/Inbox/textbox_search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/status_PreApproved'), 0)

WebUI.click(findTestObject('MERCHANT/Inbox/status_PreApproved'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/message_box'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Chat page/a_Offer Action/textlabel_Add offer to comparison'), 0)

WebUI.click(findTestObject('CONSUMER/Chat page/a_Offer Action/button_Add to Evaluation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

