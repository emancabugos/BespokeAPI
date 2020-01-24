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

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textfield_searchbar'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textfield_searchbar'), itemName)

WebUI.delay(2)

WebUI.waitForElementAttributeValue(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 'text', itemName, 0)

WebUI.click(findTestObject('MERCHANT/Inbox/textlabel_itemname'))

WebUI.comment('Send Offer')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/message_box'), 0)

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Create Offer'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), 0)

WebUI.setText(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), quantity)

WebUI.setText(findTestObject('MERCHANT/Chat/a_Send Offer/textbox_price'), offerPrice)

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Send Offer'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Header/icon_inbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textfield_searchbar'), 0)

