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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Purchase History List/textfield_Search'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/breadcrumb_Home'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/breadcrumb_PurchaseHistory'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/textlabel_PurchaseHistory'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/textfield_Search'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/column_Invoice'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/column_Timestamp'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/column_NoItem'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/column_OrderTotal'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/column_PaymentType'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Purchase History List/column_PaymentStatus'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/linktext_ABOUT'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/linktext_TERMSOFUSE'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/linktext_PRIVACY'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/linktext_RETURNS'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/linktext_CONTACT'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/linktext_FAQ'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/textlabel_copyright'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/imagebutton_Facebook'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/imagebutton_Instagram'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/imagebutton_Linkedin'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Footer/imagebutton_Twitter'))

