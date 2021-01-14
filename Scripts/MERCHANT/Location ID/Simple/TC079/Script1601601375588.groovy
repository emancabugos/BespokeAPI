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


WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Check Box_NM1 POM/label_allCat_Check Box_NM1'), 
    0)

String checkbox = WebUI.getText(findTestObject('MERCHANT_UPDATE/Location ID/Description/allCat_Check Box_NM1 POM/Page_0928b2bcty/section_allCat_Check Box')).trim()
   

WebUI.verifyMatch(checkbox, 'allCat_Check Box_NM1 allCat_Check Box_NM1CB1 allCat_Check Box_NM1CB2 allCat_Check Box_NM1CB3 allCat_Check Box_NM1CB4 allCat_Check Box_NM1CB5 allCat_Check Box_NM1CB6 allCat_Check Box_NM1CB7 allCat_Check Box_NM1CB8 allCat_Check Box_NM1CB9 allCat_Check Box_NM1CB10', 
    false)

