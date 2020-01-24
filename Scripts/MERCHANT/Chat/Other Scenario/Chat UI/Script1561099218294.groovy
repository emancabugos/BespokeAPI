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

WebUI.comment('UI')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/textlabel_Inbox'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/icon_back'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/image_user'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/textlabel_user location'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/textlabel_Member since'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Chat page/image_item'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Chat page/textlabel_item name'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Chat page/textlabel_price per item'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Chat page/textlabel_order quantity'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Chat page/textlabel_offer price'), 0)

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Create Offer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/a_Send Offer/textlabel_Special Offer'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/textlabel_Quantity'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/textlabel_offer price'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/textbox_price'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/textlabel_offer price'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/button_Back'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/a_Send Offer/button_Send Offer'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Chat/message_box'), 0)

WebUI.comment('Back')

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Back'), FailureHandling.CONTINUE_ON_FAILURE)

