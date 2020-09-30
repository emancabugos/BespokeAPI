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

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Quantity'), '100')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Text field_M1'), 'edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Text field_M2'), 'edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Hyperlink_M'), 'edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Email_M'), 'edit')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Percentage_M'), '1')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Number_M1'), '1')

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Number_M2'), '1')

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/checkbox_SP_Check Box_M1_option3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/checkbox_SP_Check Box_M2CB3'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/dropdown_SP_Drop Down_M1'), 
    'SP_Drop Down_M1DD2', false)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/dropdown_SP_Drop Down_M2'), 
    'SP_Drop Down_M2DD3', false)

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/Page_0220BP100COMM5/textlabel_SP_Location_M'), 'edit')

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Date Time_Off_M1_date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Date Time_Off_M1_time'))

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Date  Time_On_M2_date'))

WebUI.click(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Date  Time_On_M2_time'))

WebUI.sendKeys(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textarea_SP_Video_M'), 'edit')

