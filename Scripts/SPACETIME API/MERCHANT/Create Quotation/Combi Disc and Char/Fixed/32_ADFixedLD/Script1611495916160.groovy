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

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Discount/textfield_DiscountTypeValue1'), '10')

WebUI.verifyElementText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Discount/textlabel_DiscountTypeValue1'), 
    '10')

WebUI.verifyElementText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Quotation Price/value_Discount'), '10.00')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Discount/dropdown_Reason1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Discount/dropdown_Reason1'), 'Agreed Discount', 
    false)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Discount/dropdown_DiscountType1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Discount/dropdown_DiscountType1'), 'Fixed', 
    false)

WebUI.scrollToElement(findTestObject('SPACETIME API/MERCHANT/Create Quotation/linktext_AddNewLine'), 0)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Quotation/linktext_AddNewLine'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Charges/textfield_ChargeTypeValue2'), 
    0)

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Charges/textfield_ChargeTypeValue2'), '2')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Charges/textfield_ChargeTypeValueQTY2'), '2')

WebUI.verifyElementText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Charges/textlabel_ChargeTypeValue2'), 
    '4')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Charges/dropdown_Reason2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Charges/dropdown_Reason2'), 'Late Delivery', 
    false)

WebUI.verifyElementText(findTestObject('SPACETIME API/MERCHANT/Create Quotation/a_Quotation Price/value_Charge'), '4.00')

