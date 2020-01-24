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
import java.text.DecimalFormat as DecimalFormat

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_price'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), 'value')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

DecimalFormat df = new DecimalFormat('#,###.00')

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_SubTotalPrice')),
	FailureHandling.CONTINUE_ON_FAILURE)

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
