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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Haller')

WebUI.sendKeys(findTestObject('CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.comment('Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '2')

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

DecimalFormat df = new DecimalFormat('#,###.00')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal')), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddToCart'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ViewCart'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Cart/button_ContinueShoppingEmpty'), 0)

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

WebUI.waitForElementClickable(findTestObject('CONSUMER/Cart/button_Checkout'), 0)

WebUI.click(findTestObject('CONSUMER/Cart/button_Checkout'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/checkbox_DeliveryAddressSameAsBilling'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonReview'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_ShippingMethod'), 'Seller Price(SGD $ 10.00)', 
    false)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/collapse_buttonRequisition'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_Department'), 0)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_Department'), 'dianadepartment', 
    false)

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_Reason'), 'dianatest', false)

actualsub = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_SubTotal'))

discount = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Discount'))

charge = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Charge'))

deliverycost = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

total = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'))

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), 0)

invoice = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_InvoiceNo'), FailureHandling.STOP_ON_FAILURE)

