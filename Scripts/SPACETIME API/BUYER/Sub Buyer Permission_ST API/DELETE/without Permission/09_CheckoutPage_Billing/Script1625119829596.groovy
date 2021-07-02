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

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Homepage/search_Category100'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Search Result Page/click_SearchedItem'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Item Details/computation_SubTotal_01'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Item Details/click_AddToCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Cart Page/navigate_Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Cart/checkbox_seller'))

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Cart Page/click_PayNow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/textlabel_ContactDetails'), 0)

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/One Page Requisition/add_Address'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_AddNewAddress'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 
    0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeFirstName'), 'Levi')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_AddresseeLastName'), 'Ackerman')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'Residencias de Manila')

WebUI.selectOptionByLabel(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_Address'), 'Philippines', 
    false)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_City'), 'Metro Manila')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_State'), 'Pandacan')

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/textfield_PostalCode'), '1011')

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/Address Popup/button_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0.5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Page Requisition/dropdown_BillingAddress'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_DeleteAddress'), 0)

WebUI.verifyElementPresent(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_DeleteAddress'), 0)

WebUI.verifyElementNotClickable(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_DeleteAddress'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('SUPERBABY/BUYER/One Page Requisition/button_DeleteAddress'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

