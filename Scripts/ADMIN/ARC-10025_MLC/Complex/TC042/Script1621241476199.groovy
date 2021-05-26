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
import org.openqa.selenium.Keys as Keys

WebUI.comment('SUb Admin')

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-10025 Merchant level commission/Value_1st Row EDIT'), 0)

WebUI.click(findTestObject('ADMIN/ARC-10025 Merchant level commission/Value_1st Row EDIT'))

WebUI.verifyTextPresent('Commission name', false)

comname = WebUI.getText(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission Name'))

WebUI.sendKeys(findTestObject('ADMIN/ARC-10027_ADD MLC/Page_0613bpdiana/textfield_Commission Name'), 'edit')

WebUI.click(findTestObject(null))

