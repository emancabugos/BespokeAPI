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

'Deleted Item of the admin is still present on the Purchase Details Page\r\n\r\n'
WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/button_Search'), 0)

WebUI.click(findTestObject('Utilities/Header/Consumer Header/arrow_down'))

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Consumer Header/link_PurchaseHistory'), 0)

WebUI.click(findTestObject('Utilities/Header/Consumer Header/link_PurchaseHistory'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Purchase History List/breadcrumb_PurchaseHistory'), 0)

'invoice\r\n'
WebUI.setText(findTestObject('CONSUMER/Purchase History List/textfield_Search'), '')

WebUI.delay(1)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), 'text', invoice, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), invoice.toLowerCase())

WebUI.click(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Purchase History Details/textlabel_InvoiceIDValue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

