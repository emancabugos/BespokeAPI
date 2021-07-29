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

WebUI.click(findTestObject('SUPERBABY/SELLER/Add User Group/textfield_SelectMerchant'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Add User Group/textfield_SearchMerchant'), 0)

WebUI.setText(findTestObject('SUPERBABY/SELLER/Add User Group/textfield_SearchMerchant'), '')

WebUI.click(findTestObject('SUPERBABY/SELLER/Add User Group/checkbox_searchedUser'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('SUPERBABY/SELLER/Add User Group/textlabelvalue_DisplayName01'), 'text', 
    '', 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Add User Group/button_Save'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Merchant User Group/linktext_AddNewUserGroups'), 0)

