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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'For Nego')

WebUI.sendKeys(findTestObject('CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.comment('Item Details Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 0)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '1')

WebUI.comment('Get Variable')

def itemName = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_ItemName'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemName', itemName)

def currencyCode = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_CurrencyCode'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'currencyCode', currencyCode)

def currencySymbol = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_CurrencySymbol'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'currencySymbol', currencySymbol)

def itemPrice = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_itemPrice'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemPrice', itemPrice)

def itemQuantity = WebUI.getAttribute(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), 'value')

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemQuantity', itemQuantity)

def itemSubTotal = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_Subtotal'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('Item Details', 'itemSubTotal', itemSubTotal)

println(GlobalVariable.itemSubTotal)

