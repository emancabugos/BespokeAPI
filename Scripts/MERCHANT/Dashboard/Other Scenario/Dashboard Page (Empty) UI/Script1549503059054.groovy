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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Header')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), 'DASHBOARD')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), 'INVENTORY')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), 'UPLOAD')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), 'ORDERS')

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_inbox'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/language'), 0)

WebUI.comment('Body')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Dashboard'), 'Dashboard')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Last 24 Hrs'), 'Last 24 Hrs')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Last 7 Days'), 'Last 7 Days')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Last 30 Days'), 'Last 30 Days')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Total Sales'), 'Total Sales')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Total Orders'), 'Total Orders')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Total Visits'), 'Total Visits')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Avr Order By Rev'), 'Avr Order By Rev')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Avr Items Sold Per Order'), 'Avr Items Sold Per Order')

WebUI.verifyElementText(findTestObject('MERCHANT/Dashboard Page/textlabel_Sales'), 'Sales')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Dashboard Page/label_Days'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Dashboard Page/label_Weeks'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Dashboard Page/label_Months'), 0)

WebUI.comment('Footer')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_ABOUT US'), 'ABOUT US')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_TERMS OF SERVICE'), 'TERMS OF SERVICE')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_PRIVACY POLICY'), 'PRIVACY POLICY')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_RETURN POLICY'), 'RETURN POLICY')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_FAQ'), 'FAQ')

WebUI.verifyElementText(findTestObject('Utilities/Footer/linktext_CONTACT US'), 'CONTACT US')

WebUI.verifyElementText(findTestObject('Utilities/Footer/textlabel_2016 All rights reserve'), 'ncd © 2016 All rights reserved')

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Header Footer Redirection'), [:], FailureHandling.CONTINUE_ON_FAILURE)

