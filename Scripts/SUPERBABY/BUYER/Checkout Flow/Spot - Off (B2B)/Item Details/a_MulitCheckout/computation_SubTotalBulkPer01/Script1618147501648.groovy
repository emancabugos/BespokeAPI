import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

File fsubtotal1Tmp = tmpDir.resolve('fsubtotal1.txt').toFile()

File sellernameTmp = tmpDir.resolve('sellername.txt').toFile()

File itemnameTmp = tmpDir.resolve('itemname.txt').toFile()

DecimalFormat df = new DecimalFormat('#,###.00')

def fitemprice = WebUI.getText(findTestObject('SPACETIME API/BUYER/Item Details/textlabelvalue_ItemPrice'))

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '2')

def qty = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

qtyTmp.text = qty

//Computation Bulk percentage 

String fcom = 0.01

Float comfloat = Float.parseFloat(fcom)

println(comfloat)

BigDecimal intfitemprice = new BigDecimal(fitemprice)

BigDecimal intcomfloat = new BigDecimal(comfloat)

def bulkitemprice = intfitemprice * intcomfloat

println(df.format(new BigDecimal(bulkitemprice)))

//minus bulk item price

BigDecimal intbulkitemprice = new BigDecimal(bulkitemprice)

def itemprice = intfitemprice - intbulkitemprice

println(df.format(new BigDecimal(itemprice)))

//computation final sub total

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intqty = new BigDecimal(qty)

def qasubtotal = intitemprice * intqty

String lsubtotal = qasubtotal.setScale(2, BigDecimal.ROUND_HALF_UP)

println(df.format(new BigDecimal(lsubtotal)))

//convert subtotal

String newSub = lsubtotal

def newSubld = newSub.replace(',', '')

BigDecimal fsubtotal1 = new BigDecimal(newSubld)

println(fsubtotal1)

//Actual Subtotal

String asubtotal = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_SubTotalBulk'))

def fasubtotal = asubtotal.replace(',','')

String lasubtotal = new BigDecimal(fasubtotal)

println(lasubtotal)

WebUI.verifyEqual(lasubtotal, fsubtotal1, FailureHandling.CONTINUE_ON_FAILURE)

fsubtotal1Tmp.text = fsubtotal1

sellername = WebUI.getText(findTestObject('CONSUMER/Item Details Page/linktext_SellerName'))

sellernameTmp.text = sellername

itemname = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_ItemName'))

itemnameTmp.text = itemname

WebUI.delay(2)