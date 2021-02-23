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

File prnumTmp = tmpDir.resolve('prnum.txt').toFile()

File bfnameTmp = tmpDir.resolve('bfname.txt').toFile()

File blnameTmp = tmpDir.resolve('blname.txt').toFile()

File addressTmp = tmpDir.resolve('address.txt').toFile()

File countryTmp = tmpDir.resolve('country.txt').toFile()

File cityTmp = tmpDir.resolve('city.txt').toFile()

File stateTmp = tmpDir.resolve('state.txt').toFile()

File postalcodeTmp = tmpDir.resolve('postalcode.txt').toFile()



WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_SendRequest'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_AddNewAddress'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 
    0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 'Jane')

bfname = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 'value')

bfnameTmp.text = bfname

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 'Doe')

blname = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 'value')

blnameTmp.text = blname

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'Residencias de Manila')

address = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'value')

addressTmp.text = address

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/dropdown_Country'), 'Philippines', 
    false)

country = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/dropdown_Country'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

countryTmp.text = country

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'Metro Manila')

city = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'value')

cityTmp.text = city

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'Pandacan')

state = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'value')

stateTmp.text = state

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), '1011')

postalcode = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), 'value')

postalcodeTmp.text = postalcode

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/button_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0.5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_BillingAddress'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_BillingAddress'))

WebUI.delay(0.5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/select_addedAddress'), FailureHandling.STOP_ON_FAILURE)

