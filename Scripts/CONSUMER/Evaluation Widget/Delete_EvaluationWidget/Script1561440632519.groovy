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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Multiple Cat - w/bulk - percentage (weight) M')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Multiple Cat - w/bulk - percentage (weight) M')

WebUI.delay(10)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_QTY'), 0)

WebUI.setText(findTestObject('CONSUMER/Evaluation Widget/dropdown_QTY'), '2')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_AddtoEvaluation'))

WebUI.scrollToElement(findTestObject('CONSUMER/Evaluation Widget/button_AddtoEvaluation'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation Widget/button_AddtoEvaluation'), 0)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('CONSUMER/Evaluation Widget/button_AddtoEvaluation'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation List/Delete Popup/delete icon'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation List/Delete Popup/delete icon'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/p_Are you sure you want to del'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation Widget/a_Delete/p_Are you sure you want to del'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_Okay'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_Okay'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_DCancel'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_DCancel'), 0)

