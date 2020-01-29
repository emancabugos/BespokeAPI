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

WebUI.comment('DASHBOARD')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Dashboard Page/textlabel_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Dashboard'), 'Dashboard')

WebUI.comment('INVENTORY')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inventory Page/textlabel_Your Item'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inventory Page/textlabel_Your Item'), 'Your Item')

WebUI.comment('UPLOAD')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Upload Item/textlabel_Basic Details'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Upload Item Page/Upload Item/textlabel_Basic Details'), 'Basic Details')

WebUI.comment('ORDERS')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Order Page/textlabel_Order History'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Order History'), 'Order History')

WebUI.comment('ABOUT US')

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/linktext_ABOUT US'), 0)

WebUI.click(findTestObject('Utilities/Footer/linktext_ABOUT US'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/Footer Redirection/div_ABOUT US'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Footer/Footer Redirection/div_ABOUT US'), 'ABOUT US')

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('TERMS OF SERVICE')

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/linktext_TERMS OF SERVICE'), 0)

WebUI.click(findTestObject('Utilities/Footer/linktext_TERMS OF SERVICE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/Footer Redirection/div_TERMS OF SERVICE'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Footer/Footer Redirection/div_TERMS OF SERVICE'), 'TERMS OF SERVICE')

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('PRIVACY POLICY')

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/linktext_PRIVACY POLICY'), 0)

WebUI.click(findTestObject('Utilities/Footer/linktext_PRIVACY POLICY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/Footer Redirection/div_PRIVACY POLICY'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Footer/Footer Redirection/div_PRIVACY POLICY'), 'PRIVACY POLICY')

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('RETURN POLICY')

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/linktext_RETURN POLICY'), 0)

WebUI.click(findTestObject('Utilities/Footer/linktext_RETURN POLICY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/Footer Redirection/div_RETURN POLICY'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Footer/Footer Redirection/div_RETURN POLICY'), 'RETURN POLICY')

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('FAQ')

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/linktext_FAQ'), 0)

WebUI.click(findTestObject('Utilities/Footer/linktext_FAQ'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/Footer Redirection/span_FAQ'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Footer/Footer Redirection/span_FAQ'), 'FAQ')

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('CONTACT US')

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/linktext_CONTACT US'), 0)

WebUI.click(findTestObject('Utilities/Footer/linktext_CONTACT US'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Utilities/Footer/Footer Redirection/span_Contact Us'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Footer/Footer Redirection/span_Contact Us'), 'Contact Us')

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

