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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.callTestCase(findTestCase('SUPERBABY/SELLER/Purchase Order List (B2C)/a_NavigateToPOList'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/textfield_Search'), 'PO72484')

WebUI.sendKeys(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/SELLER/Purchase Order list (B2C)/dropdown_OrderStatus'), 'Ready for Pick-up', 
    false, 0)

