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

WebUI.waitForElementPresent(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Seller'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Seller Header/icon_Seller'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/SELLER/Seller Sidebar/icon_Documents'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('SUPERBABY/BUYER/Buyer Sidebar/linktext_SubAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/SELLER/Merchant User Group/linktext_UserGroups'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Merchant User Group/linktext_UserGroups'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Merchant User Group/column_GroupName'), 0)

WebUI.verifyElementVisible(findTestObject('SUPERBABY/SELLER/Merchant User Group/column_GroupName'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('SUPERBABY/BUYER/Buyer User Groups List/button_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('SUPERBABY/BUYER/Buyer User Groups List/button_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

