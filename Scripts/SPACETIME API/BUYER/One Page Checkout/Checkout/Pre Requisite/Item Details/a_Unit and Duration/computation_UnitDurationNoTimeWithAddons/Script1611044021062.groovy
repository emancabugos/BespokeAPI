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
import java.text.NumberFormat as NumberFormat

WebUI.click(findTestObject('SPACETIME API/BUYER/Item Details/button_AddOns'))

DecimalFormat df = new DecimalFormat('#,###.00')

def itemprice = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabelvalue_ItemPrice'))

def qty = WebUI.getAttribute(findTestObject('SPACETIME API/BUYER/Item Details/textfiled_DurationNoTime'), 'value')

def unit = WebUI.getAttribute(findTestObject('SPACETIME API/BUYER/Item Details/textfield_UnitWithTime'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intqty = new BigDecimal(qty)

def subtotal = intitemprice * intqty

println(df.format(new BigDecimal(subtotal)))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intunit = new BigDecimal(unit)

def fsubtotal = intsubtotal * intunit

println(df.format(new BigDecimal(fsubtotal)))

def addons = 10.01

def fisubtotal = fsubtotal + addons


//Convert Subtotal to String
//String newSub = fsubtotal
//def newSubld = newSub.replace(',', '')
//BigDecimal fnewSub = new BigDecimal(newSubld)
//println(newSubld)
asubtotal = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabevalue_SubTotalPrice'))

WebUI.verifyEqual(fisubtotal, asubtotal, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('SPACETIME API/BUYER/Item Details/button_AddToCart'))

