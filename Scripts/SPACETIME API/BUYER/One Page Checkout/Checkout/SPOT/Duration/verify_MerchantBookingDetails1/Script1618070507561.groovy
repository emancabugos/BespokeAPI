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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

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

File deliveryTmp = tmpDir.resolve('delivery.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File total2Tmp = tmpDir.resolve('total2.txt').toFile()

File admincostTmp = tmpDir.resolve('admincost.txt').toFile()

File totalcostTmp = tmpDir.resolve('totalcost.txt').toFile()

DecimalFormat df = new DecimalFormat('#,###.00')

def com = 0.01

//Convert string commission to float
String fcom = com

Float comfloat = Float.parseFloat(fcom)

println(comfloat)

//Computation AdminFee
def adminfee = total2Tmp.text * comfloat

BigDecimal fadminfee = new BigDecimal(adminfee)

println(fadminfee)

String ladminfee = fadminfee.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ladminfee)

admincostTmp.text = ladminfee

//Get Actual Admin Fee
String actadminfee = WebUI.getText(findTestObject('SPACETIME API/MERCHANT/Booking Details Page/textlabelValue_AdminCost'))

def factadminfee = actadminfee.replace(',', '')

String lactadminfee = new BigDecimal(factadminfee)

println(lactadminfee)


//Verify expected to actual
WebUI.verifyMatch(ladminfee, lactadminfee, false)

WebUI.comment('Computation Transaction Total')

def transactotal = total2Tmp.text - adminfee

BigDecimal ftransactotal = new BigDecimal(transactotal)

println(ftransactotal)

String ltransactotal = ftransactotal.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ltransactotal)

totalcostTmp.text = ltransactotal

String actransactotal = WebUI.getText(findTestObject('SPACETIME API/MERCHANT/Booking Details Page/textlabelValue_TotalCost'))

def factransactotal = actransactotal.replace(',', '')

String lactransactotal = new BigDecimal(factransactotal)

println(lactransactotal)

WebUI.verifyMatch(ltransactotal, lactransactotal, false)

