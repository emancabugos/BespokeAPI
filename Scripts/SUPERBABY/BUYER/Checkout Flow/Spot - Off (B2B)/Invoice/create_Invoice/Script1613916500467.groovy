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

File grnotesTmp = tmpDir.resolve('grnotes.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice List/icon_create new invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'), ponumTmp.text)

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabel_popupSelectPONo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/button_popupYes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/SELLER/Invoice Details/button_CreateInvoice'), 0)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_PO no'), ponumTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_item description'), itemnameTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_quantity'), qtyTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_unit price'), itempriceTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_total cost'), fsubtotalTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_subtotal'), fsubtotalTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_charge'), chargeTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_discount'), discountTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_shipping cost'), sfTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SUPERBABY/SELLER/Invoice Details/value_total cost (2)'), totalTmp.text, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SUPERBABY/SELLER/Invoice Details/textfield_PaymentDure'), '01/03/2021')

WebUI.setText(findTestObject('SUPERBABY/SELLER/Invoice Details/textfield_Time'), '03:00 PM')

WebUI.setText(findTestObject('SUPERBABY/SELLER/Invoice Details/textfield_InvoiceRef'), 'automationtest101')

WebUI.click(findTestObject('SUPERBABY/SELLER/Invoice Details/button_CreateInvoice'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), 0)

invoice = WebUI.getText(findTestObject('SUPERBABY/BUYER/Invoice List/value_InvoiceNo'), FailureHandling.CONTINUE_ON_FAILURE)

 invoiceTmp.text = invoice
