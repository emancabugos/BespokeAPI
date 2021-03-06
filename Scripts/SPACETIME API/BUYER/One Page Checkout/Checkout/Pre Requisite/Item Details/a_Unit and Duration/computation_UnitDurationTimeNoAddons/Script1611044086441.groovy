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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

DecimalFormat df = new DecimalFormat('#,###.00')

def itemprice = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabelvalue_ItemPrice'))

def qty = WebUI.getAttribute(findTestObject('SPACETIME API/BUYER/Item Details/textfield_DurationWithTime'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intqty = new BigDecimal(qty)

def fsubtotal = intitemprice * intqty

println(df.format(new BigDecimal(fsubtotal)))

asubtotal = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabevalue_SubTotalPrice'))

WebUI.verifyEqual(fsubtotal, asubtotal)

WebUI.delay(2)

WebUI.click(findTestObject('SPACETIME API/BUYER/Item Details/button_AddToCart'))

