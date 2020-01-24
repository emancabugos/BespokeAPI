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

if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 1'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 1'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 2'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 3'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 4'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/checkbox 5'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-date'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-date'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-dropdown'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.selectOptionByLabel(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-dropdown'), 'Select 3', false)
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-email'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-email'), 'arcadierteam@gmail.com')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-location'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-location'), 'Rufino Pacific Tower')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-number'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-number'), '69')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-time'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-time'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-URL'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-URL'), 'www.arcadier.com')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-video'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom-video'), '<iframe width="640" height="480" src="https://www.youtube.com/embed/GsbOwc_hWcM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom_weight'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/custom_weight'), '1')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field edited'), 
    1, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field edited'), 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field'), 1, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Custom Fields/input_txt-field'), 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...')
} else if (WebUI.verifyElementPresent(findTestObject('MERCHANT/Upload Item Page/Custom Fields/PDF'), 0, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.uploadFile(findTestObject('MERCHANT/Upload Item Page/Custom Fields/PDF'), 'C:\\\\Katalon\\\\Image\\\\1mb.pdf')
}

