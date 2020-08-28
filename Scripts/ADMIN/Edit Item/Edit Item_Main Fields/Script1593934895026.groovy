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

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textlabel_Edit Item'), 0)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Category'), 'Category 01')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/checkbox_searchedCategory'))

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Item Name'), '-edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Price'), '500')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_SKU'), 'edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textarea_Item Description'), 'edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Quantity'), '20000')

