import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Search Item')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

itemname = WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item02')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), itemname)

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/Page_Item Detail/span_Contact Supplier'), 0)

WebUI.comment('textfield1')

'customfieldtextlabel1'
customfieldtextlabel1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_textfield1'))

WebUI.verifyMatch(customfieldtextlabel1, 'SP_Text field_M1', false)

'customfieldtextlvalue1'
customfieldtextlvalue1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_textfieldvalue1'))

WebUI.verifyMatch(customfieldtextlvalue1, 'Text1', false)

WebUI.comment('textfield2')

customfieldtextlable2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_textfield2'))

WebUI.verifyMatch(customfieldtextlable2, 'SP_Text field_M2', false)

customfieldtextvalue2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_textfieldvalue2'))

WebUI.verifyMatch(customfieldtextvalue2, 'SP_Text field_M2', false)

WebUI.comment('TextEditor')

customfieldTexteditor = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_texteditor'))

WebUI.verifyMatch(customfieldTexteditor, 'SP_Text Editor_M', false)

customfieldTexteditorvalue = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_texteditorvalues'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(customfieldTexteditorvalue, 'TextEDITOR', false)

WebUI.comment('Hyperlink')

customfieldHyper = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_hyperlink'))

customfieldHypervalue = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/linktext_customfield_hyperlinkvalues'))

WebUI.comment('Email')

customfieldEmail = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_email'))

customfieldEmailvalues = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_emailvalue'))

WebUI.comment('Percentage')

customfieldpercent = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_percentage'))

customfieldpercentvalues = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_percentage (1)'))

WebUI.comment('Number')

customfieldnumber1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_number1'))

customfieldnumbervalues1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_numbervalues1'))

WebUI.comment('Number 2')

customfieldnumber2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_number2'))

customfieldnumbervalues2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_numbervalues2'))

WebUI.comment('Checkbox')

customfieldcheck1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkbox1'))

customfieldcheckvalues11 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkboxvalue1.1'))

customfieldcheckvalues12 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkboxvalue1.2'))

customfieldcheckvalues13 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkboxvalue1.3'))

WebUI.comment('Checkbox2')

customfieldcheck2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkbox2'))

customfieldcheckvalues21 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkboxvalue2.1'))

customfieldcheckvalues22 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkboxvalue2.2'))

customfieldcheckvalues23 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_checkboxvalue2.3'))

WebUI.comment('Dropdown')

customfielddrop1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_dropdown1'))

customfielddropvalue1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_dropdownvalues1'))

WebUI.comment('Dropdown2')

customfielddrop2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_dropdown2'))

customfielddropvalue2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_dropdownvalues1'))

WebUI.comment('location')

customfieldLocation = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_location'))

WebUI.comment('Date and Time')

customfieldDatetime1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_datetime1'))

customfieldDatetimevalues1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_datetimevalue1'))

WebUI.comment('Date and Time1')

customfieldDatetime2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_datetime2'))

customfieldDatetimevalues2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_datetimevalue2'))

WebUI.comment('PDF')

customfieldPDF = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_pdf'))

customfieldPDFValues = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_pdfvalues'))

WebUI.comment('Video')

customfieldVideo = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_customfield_embed'))

WebUI.comment('checkbox')

customfieldcheckboxSPC1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkbox1'))

customfieldcheckboxvaluesSPC11 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkboxvalues1.1'))

customfieldcheckboxvaluesSPC12 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkboxvalues1.2'))

customfieldcheckboxvaluesSPC13 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkboxvalues1.3'))

WebUI.comment('checkbox')

customfieldcheckboxSPC1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkbox2'))

customfieldcheckboxvaluesSPC21 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkboxvalues2.1'))

customfieldcheckboxvaluesSPC22 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkboxvalues2.2'))

customfieldcheckboxvaluesSPC23 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_checkboxvalues2.3'))

WebUI.comment('ddown')

customfieldddSPC1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_ddown1'))

customfieldddSPC11 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_ddownvalue1'))

WebUI.comment('ddown')

customfieldddSPC2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_ddown2'))

customfieldddSPC21 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPC_ddownvalue2'))

WebUI.comment('checkbox')

customfieldcheckSPG1 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkbox1'))

customfieldcheckSPG11 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkboxvalue1.1'))

customfieldcheckSPG12 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkboxvalue1.2'))

WebUI.comment('checkbox')

customfieldcheckSPG2 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkbox2'))

customfieldcheckSPG21 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkboxvalue2.1'))

customfieldcheckSPG22 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkboxvalue2.2'))

customfieldcheckSPG23 = WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_SPG_checkboxvalue2.3'))

WebUI.comment('Delivers To')

WebUI.getText(findTestObject('CONSUMER/Item Details Page/Page_Item Detail/Page_1112un/span_Delivers to'))

WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/p_All'))

WebUI.comment('Pickup Locations')

WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_PickupLocations'))

WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_PickupLocationvalue1'))

WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_PickupLocationvalue2'))

WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_PickupLocationvalue3'))

WebUI.getText(findTestObject('CONSUMER/Item Details Page/customfields/label_PickupLocationvalue4'))

WebUI.comment('verify match')

