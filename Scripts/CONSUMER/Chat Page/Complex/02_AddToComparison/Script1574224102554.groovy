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

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inbox/textlabel_Inbox'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textbox_search'), itemName)

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Inbox/icon_search'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inbox/textlabel_itemname'), itemName)

WebUI.click(findTestObject('MERCHANT/Inbox/textlabel_itemname'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Chat page/Offer Sent/textlabel_SentOffer'), 0)

WebUI.comment('Verify Offer')

WebUI.verifyElementText(findTestObject('CONSUMER/Chat page/Offer Sent/texlabel_Price'), price)

WebUI.verifyElementText(findTestObject('CONSUMER/Chat page/Offer Sent/textlabel_quantity'), quantity)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_up'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/container_empty'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'), 'Create new list', true)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Cancel'), 0)

WebUI.setText(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'), listname)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), 'text', listname, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), listname)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_down'))

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'))

