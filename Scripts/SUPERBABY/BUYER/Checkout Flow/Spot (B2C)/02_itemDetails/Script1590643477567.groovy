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
import java.text.DecimalFormat as DecimalFormat
import org.openqa.selenium.Keys as Keys

WebUI.comment('Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '3')

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

def quantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

WebUI.comment('Get Variable')

def itemName = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_ItemName'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemName', itemName)

def itemDescription = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_DescriptionValue'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemDescription', itemDescription)

def currencyCode = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_CurrencyCode'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'currencyCode', currencyCode)

def currencySymbol = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_CurrencySymbol'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'currencySymbol', currencySymbol)

def itemPrice = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemPrice', itemPrice)

def itemQuantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemQuantity', itemQuantity)

def itemSubTotal = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemSubTotal', itemSubTotal)

DecimalFormat df = new DecimalFormat('#,###.00')

BigDecimal intprice = new BigDecimal(price)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(df.format(subtotal), WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_subAmount')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

