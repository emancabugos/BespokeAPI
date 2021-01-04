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

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/button_image selector'), 'style', 
    '', 0)

for (int pos = 1; pos <= 5; pos++) {
    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/button_image selector'), 0)

    WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/button_image selector'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.uploadFile(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Page_0928b2bcty/popup_upload image'), 'C:\\\\Katalon\\\\BespokeAPI\\\\Images\\\\UN Items\\\\item1.jpg')

    WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Page_0928b2bcty/icon_Upload Image_check'), 
        0)

    WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/Page_0928b2bcty/icon_Upload Image_check'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/button_image selector'), 'style', 
    'display: none;', 0)

