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

File fsubtotalTmp = tmpDir.resolve('fsubtotal.txt').toFile()

File sellernameTmp = tmpDir.resolve('sellername.txt').toFile()

File itemnameTmp = tmpDir.resolve('itemname.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File chargeTmp = tmpDir.resolve('charge.txt').toFile()

File discountTmp = tmpDir.resolve('discount.txt').toFile()

File sfTmp = tmpDir.resolve('sf.txt').toFile()

File bfnameTmp = tmpDir.resolve('bfname.txt').toFile()

File blnameTmp = tmpDir.resolve('blname.txt').toFile()

File addressTmp = tmpDir.resolve('address.txt').toFile()

File countryTmp = tmpDir.resolve('country.txt').toFile()

File cityTmp = tmpDir.resolve('city.txt').toFile()

File stateTmp = tmpDir.resolve('state.txt').toFile()

File postalcodeTmp = tmpDir.resolve('postalcode.txt').toFile()

File prnumTmp = tmpDir.resolve('prnum.txt').toFile()

File ponumTmp = tmpDir.resolve('ponum.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

File grnotesTmp = tmpDir.resolve('grnotes.txt').toFile()

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_InvoiceNo'), invoiceTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_PONo'), ponumTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_RequisitionOrderNo'), 
    prnumTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_PurchaseOrderNo'), ponumTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_ReceivingNotes'), grnotesTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_ItemDescription'), itemnameTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Quantity'), qtyTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_UnitPrice'), itempriceTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_TotalCost'), fsubtotalTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_SubTotal'), fsubtotalTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Charge'), chargeTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_Discount'), discountTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_ShippingMethod'), sfTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/BUYER/Purchase Order Details (B2B)/textlabelValue_FinalTotalCost'), totalTmp.text, 
    FailureHandling.CONTINUE_ON_FAILURE)

