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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_MOQValue'), 0)

WebUI.comment('Computation of Sub Total')

WebUI.setText(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), quantityvalue)

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_price'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), 'value')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

DecimalFormat df = new DecimalFormat('#,###.00')

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_SubTotalPrice')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add to Evaluation Widget')

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_up'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/container_empty'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'), 'Create new comparison table', 
    true)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Cancel'), 0)

WebUI.setText(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'), listname)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), 'text', listname, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), listname)

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_delete'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'))



