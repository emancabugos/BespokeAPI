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

WebUI.callTestCase(findTestCase('MERCHANT/Delivery Settings/Delivery Settings UI/Redirection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/button_Add Delivery Option'), 
    0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Page_Delivery Settings Page/button_Add Delivery Option'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivery option name'), 
    0)

WebUI.verifyElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivery option name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivery option name'), 'Delivery 1')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/dropdown_delivers to'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/a_Select all'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/a_Select all'))

WebUI.scrollToElement(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_minimum_time'), 0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_minimum_time'), '1 - 7 days')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/textfield_delivering_from'), 'Philippines')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/Page_0201bp1/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_rate'), 'hello')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_start'), '1')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_range_end'), '4')

WebUI.setText(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/textfield_delivery_cost'), '1.00')

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Add Delivery Option/Delivery Rate/button_Save_Delivery Range'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/button_Delete'), 0)

WebUI.mouseOver(findTestObject('MERCHANT/Delivery Settings/button_Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

