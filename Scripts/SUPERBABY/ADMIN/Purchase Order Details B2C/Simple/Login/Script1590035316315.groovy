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

WebUI.openBrowser('https://0220bp100comm5.test.arcadier.io/admin')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login Page/textbox_username'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Login Page/textbox_username'), '0220bp100comm5')

WebUI.setText(findTestObject('ADMIN/Admin Login Page/textbox_password'), 'welcome8')

WebUI.scrollToElement(findTestObject('ADMIN/Admin Login Page/button_SignIn'), 0)

WebUI.click(findTestObject('ADMIN/Admin Login Page/button_SignIn'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Transaction Details/Transaction Details/button_Payments Transactions'), 
    0)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction Details/Transaction Details/button_Payments Transactions'))

WebUI.scrollToElement(findTestObject('ADMIN/Transaction List and Details/Transaction Details/Transaction Details/button_Transactions'), 
    0)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction Details/Transaction Details/button_Transactions'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Transaction Details/Transaction Details/button_19052020 150755'), 
    0)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction Details/Transaction Details/button_19052020 150755'))

