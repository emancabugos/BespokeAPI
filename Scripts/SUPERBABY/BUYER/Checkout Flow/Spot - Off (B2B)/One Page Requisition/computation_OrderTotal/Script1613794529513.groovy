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

DecimalFormat df = new DecimalFormat('#,###.00')

def subtotal = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_SubTotal'))

def del = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_ShippingCost'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdel = new BigDecimal(del)

def ftotal = intsubtotal + intdel

println(df.format(new BigDecimal(ftotal)))

atotal = WebUI.getText(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabelValue_Total'))

WebUI.verifyEqual(ftotal, atotal, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

