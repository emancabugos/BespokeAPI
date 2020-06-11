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

WebUI.comment('Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/variants_01'), var1, false)

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/variants_02'), var2, false)

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Item Details Page/variants_03'), var3, false)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), quantity)

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

DecimalFormat df = new DecimalFormat('#,###.00')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal')), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

