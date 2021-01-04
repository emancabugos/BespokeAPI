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

WebUI.comment('tick=Spot untick=Nego')

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'))

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'), 'class', 'classy-checkbox active', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_nego'), 'class', 'classy-checkbox ', 
    0)

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'))

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'), 'class', 'classy-checkbox active', 
    0)

WebUI.comment('tick=Nego untick=Spot')

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_nego'))

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'))

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_nego'), 'class', 'classy-checkbox active', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'), 'class', 'classy-checkbox ', 
    0)

WebUI.click(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_nego'))

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_nego'), 'class', 'classy-checkbox active', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT_UPDATE/Location ID/Basic Details/cb_spot'), 'class', 'classy-checkbox ', 
    0)

