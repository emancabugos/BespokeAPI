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

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Item Name'), ItemName)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_SKU'), SKU)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/textfield_Quantity'), Quantity)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Text field_NM1'), textfield_NM1)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Text field_NM2'), textfield_NM2)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Hyperlink_NM'), textfield_HyperlinkNM)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Email_NM'), textfield_EmailNM)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Number_NM1'), textfield_NumberNM1)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Number_NM2'), '1')

WebUI.selectOptionByValue(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/dropdown_allCat_Drop Down_NM2'), 'allCat_Drop Down_NM1DD3', 
    false)

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0220BP100COMM5/textfield_allCat_Location_NM'), '1')

WebUI.comment('')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Text field_M1'), '1')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Text field_M2'), '1')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Hyperlink_M'), '1')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Email_M'), '1')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Percentage_M'), '1')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Number_M1'), '1')

WebUI.setText(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Number_M2'), '1')

WebUI.selectOptionByValue(findTestObject('ADMIN/Edit Item/Page_0613bpdiana/Required Custom fields/textfield_SP_Drop Down_M2'), 
    '', false)

