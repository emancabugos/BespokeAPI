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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Choose Field Type')

if (varCustomFieldType == 'Checkbox') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Checkbox', 
        false)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), 0)

    for (int r = 0; r <= 7; r++) {
        WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.comment('Add Option')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_opt1'), varCustomFieldName + 'CB1')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_opt2'), varCustomFieldName + 'CB2')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option3'), varCustomFieldName + 'CB3')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option4'), varCustomFieldName + 'CB4')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option5'), varCustomFieldName + 'CB5')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option6'), varCustomFieldName + 'CB6')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option7'), varCustomFieldName + 'CB7')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option8'), varCustomFieldName + 'CB8')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option9'), varCustomFieldName + 'CB9')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option10'), varCustomFieldName + 'CB10')
} else if (varCustomFieldType == 'Date / Time picker') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Date / Time picker', 
        false)
} else if (varCustomFieldType == 'Drop Down') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Drop Down', 
        false)

    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/icon_addoptio'), 0)

    for (int r = 0; r <= 7; r++) {
        WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/icon_addoptio'), FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.comment('Add Option')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt1'), varCustomFieldName + 
        'DD1')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Dropdown/textfield_dropdownOpt2'), varCustomFieldName + 
        'DD2')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option3'), varCustomFieldName + 'DD3')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option4'), varCustomFieldName + 'DD4')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option5'), varCustomFieldName + 'DD5')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option6'), varCustomFieldName + 'DD6')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option7'), varCustomFieldName + 'DD7')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option8'), varCustomFieldName + 'DD8')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option9'), varCustomFieldName + 'DD9')

    WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option10'), varCustomFieldName + 'DD10')
} else if (varCustomFieldType == 'Email') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Email', false)
} else if (varCustomFieldType == 'Embed Video') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Embed Video', 
        false)
} else if (varCustomFieldType == 'Hyperlink / URL') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Hyperlink / URL', 
        false)
} else if (varCustomFieldType == 'Location') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Location', 
        false)
} else if (varCustomFieldType == 'Number') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Number', false)
} else if (varCustomFieldType == 'PDF File') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'PDF File', 
        false)
} else if (varCustomFieldType == 'Percentage') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Percentage', 
        false)
} else if (varCustomFieldType == 'Text Editor') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Text Editor', 
        false)
} else if (varCustomFieldType == 'Text Field') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Text Field', 
        false)
}

WebUI.comment('Field Name')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), varCustomFieldName)

WebUI.comment('Mandatory/NonMandatory')

if (varMandatoryNonMandatory == 'mandatory') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'), 0, FailureHandling.CONTINUE_ON_FAILURE)
} else if (varMandatoryNonMandatory == 'non-mandatory') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'))
}

WebUI.comment('Assign Category')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_SelectCategories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 
    0)

WebUI.comment('Category Assignment')

if (varAssignedCategory == 'All Cat') {
    WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/linktext_SelectAll'), 
        0)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/linktext_SelectAll'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varAssignedCategory == 'Category 01') {
    WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), varAssignedCategory, 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_1'))
} else if (varAssignedCategory == 'Category 2.1') {
    WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), varAssignedCategory, 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_2.1'))
} else if (varAssignedCategory == 'Category 3.1.1') {
    WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), varAssignedCategory, 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_3.1.1'))
} else if (varAssignedCategory == 'Category 3.1.1') {
    WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), varAssignedCategory, 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_max'))
}

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

