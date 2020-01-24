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

WebUI.comment('weight')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom_weight'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom_weight'), '1')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('checkbox')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 1'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 1'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 2'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 3'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 4'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 5'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('time')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-time'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-time'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('date')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-date'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-date'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('dropdown')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-dropdown'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-dropdown'), 'Select 3', false)
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('email')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-email'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-email'), 'arcadierteam@gmail.com')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('Video')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-video'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-video'), '<iframe width="640" height="480" src="https://www.youtube.com/embed/GsbOwc_hWcM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('URL')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-URL'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-URL'), 'www.arcadier.com')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('location')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-location'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-location'), 'Rufino Pacific Tower')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('number')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-number'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-number'), '69')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('PDF')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/PDF'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.uploadFile(findTestObject('MERCHANT/Upload Item Page/Custom Fields/PDF'), 'C:\\\\Katalon\\\\Image\\\\1mb.pdf')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('percentage')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/percentage'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/percentage'), '98')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('text editor')

if (WebUI.verifyElementPresent(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('Utilities/Text Editor Icon/Text Area/text area object/p'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Select All'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_BoldKeyboard shortcut CtrlB'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_ItalicKeyboard shortcut Ctrl'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_UnderlineKeyboard shortcut C'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Strikethrough'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Subscript'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_Superscript'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Utilities/Text Editor Icon/a_InsertRemove Bulleted List'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('text field edited')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field edited'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field edited'), 'EDITED CUSTOM FIELD')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

WebUI.comment('text field')

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field'), 'TEXT FIELD !@#$%^&*()_')
} else {
    WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)
}

