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
import java.text.DecimalFormat as DecimalFormat
import org.junit.After as After
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
	Files.createDirectory(tmpDir)
}

// Prepare File object
File itempriceTmp = tmpDir.resolve('itemprice.txt').toFile()

File qtyTmp = tmpDir.resolve('qty.txt').toFile()

File fsubtotalTmp = tmpDir.resolve('fsubtotal.txt').toFile()

File itemnameTmp = tmpDir.resolve('itemname.txt').toFile()

File chargeTmp = tmpDir.resolve('charge.txt').toFile()

File discountTmp = tmpDir.resolve('fsubtotal.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

WebUI.click(findTestObject('SPACETIME API/BUYER/Item Details/button_AddOns'))

DecimalFormat df = new DecimalFormat('#,###.00')

def itemprice = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabelvalue_ItemPrice'))

def qty = WebUI.getAttribute(findTestObject('SPACETIME API/BUYER/Item Details/textfield_DurationWithTime'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intqty = new BigDecimal(qty)

def subtotal = intitemprice * intqty

println(df.format(new BigDecimal(subtotal)))

def addons = 10.01

def fsubtotal = subtotal + addons

println(df.format(new BigDecimal(fsubtotal)))

fsubtotalTmp.text = fsubtotal

asubtotal = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabevalue_SubTotalPrice'))

WebUI.verifyEqual(fsubtotal, asubtotal, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('SPACETIME API/BUYER/Item Details/button_AddToCart'))

