import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyMatch
import org.junit.After as After
import org.stringtemplate.v4.compiler.STParser.namedArg_return as namedArg_return
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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable
import java.text.DecimalFormat as DecimalFormat

DecimalFormat df = new DecimalFormat('#,###.00')

subtotal = GlobalVariable.subtotal = (df.format(subtotal))

WebUI.comment('Delivery Checkout Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

name = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Name'))

address = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Address'))

country = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Country'))

state = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_State'))

city = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_City'))

postalcode = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_PostalCode'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'))

WebUI.scrollToElement(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_ConsumerName'), name)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Address'), address)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Country'), country)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_City'), city)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_State'), state)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_PostalCode'), postalcode)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_radio1'))

WebUI.comment('Computation of Total Price')

actualSubtotal = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_SubTotalValue'))

WebUI.verifyEqual(df.format(subtotal), actualSubtotal)

delivery1 = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

delivery2 = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue2'))

WebUI.verifyEqual(delivery1, delivery2, FailureHandling.CONTINUE_ON_FAILURE)

def delivery = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdelivery = new BigDecimal(delivery)

def total = intsubtotal + intdelivery

println(df.format(new BigDecimal(total)))

WebUI.verifyEqual(total, WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_TotalValue')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'), 0)

invoice = WebUI.getText(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Transaction Complete Page/button_PurchaseHistory'))

WebUI.comment('Purchase History List')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Purchase History List/textfield_Search'), 0)

WebUI.sendKeys(findTestObject('CONSUMER/Purchase History List/textfield_Search'), invoice.toLowerCase())

WebUI.delay(1)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), 'text', invoice, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), invoice.toLowerCase())

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History List/tablecontent_Quantity'), quantityvalue)

ordertotal = WebUI.getText(findTestObject('CONSUMER/Purchase History List/tablecontent_Price'))

timestamp = WebUI.getText(findTestObject('CONSUMER/Purchase History List/tablecontent_Timestamp'))

WebUI.verifyEqual(df.format(total), ordertotal)

WebUI.comment('Verification on Purchase History Details')

WebUI.click(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'))

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_InvoiceIDValue'), invoice.toLowerCase(), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_TimestampValue'), timestamp, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_SubTotalValue'), df.format(subtotal), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_DeliveryCostsValue'), delivery, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_TotalValue'), df.format(total), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_PriceValue'), price, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_QtyValue'), quantityvalue, FailureHandling.CONTINUE_ON_FAILURE)

