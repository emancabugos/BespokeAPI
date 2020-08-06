import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.text.DecimalFormat as DecimalFormat
import java.text.NumberFormat as NumberFormat
import groovy.time.TimeCategory as TimeCategory
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Seller Inbox & Chat Details')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/status_Enquiry'), 0)

WebUI.click(findTestObject('MERCHANT/Inbox/status_Enquiry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Create Quotation Page')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_IssueDate'), 0)

String CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar c = Calendar.getInstance()

c.setTime(new Date())

c.add(Calendar.DATE, 2)

String FDATE = sdf.format(c.getTime())

WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), (CDATE + ' - ') + FDATE)

WebUI.verifyElementAttributeValue(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_ValidDate'), 'value', (CDATE + 
    ' - ') + FDATE, 0)

WebUI.setText(findTestObject('SUPERBABY/SELLER/Create Quotation/textfield_PricePerUnit'), '10')

WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_SendQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Sent Quotation')

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Inbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Inbox/status_pre approved'), 0)

WebUI.click(findTestObject('CONSUMER/Inbox/status_pre approved'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Quotation Details/value_status'), 'Pending')

WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/button_Decline'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Quotation Details/Decline Popup/textlabel_Are you sure you want to decline this quotation'), 
    0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Quotation Details/Decline Popup/button_okay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Create Quotation/button_CreateQuotation'), 0)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/buyer logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

