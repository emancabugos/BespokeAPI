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

WebUI.callTestCase(findTestCase('CONSUMER/Buyer User Group List/a_NavigateUserGroup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Merchant User Group/column_GroupName'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Merchant User Group/linktext_AddNewUserGroups'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Add User Group/textfield_SearchMerchant'), 0)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Add User Group/checbox_SelectAll'), 0)

WebUI.click(findTestObject('SUPERBABY/SELLER/Add User Group/checbox_SelectAll'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/SELLER/Add User Group/button_Delete01'), 0)

WebUI.verifyElementClickable(findTestObject('SUPERBABY/SELLER/Add User Group/button_Delete01'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('SUPERBABY/SELLER/Add User Group/button_Delete01'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

