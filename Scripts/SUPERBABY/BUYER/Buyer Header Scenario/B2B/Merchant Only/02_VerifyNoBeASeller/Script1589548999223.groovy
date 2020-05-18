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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/linktext_Register'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/linktext_Register'), FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.ConsumerAccountType == 'custom') {
    WebUI.delay(1)

    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/textfield_username'), 0)

    WebUI.click(findTestObject('CONSUMER/Homepage/linktext_Register'), FailureHandling.STOP_ON_FAILURE)

    WebUI.acceptAlert()

    WebUI.acceptAlert()

    WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_username'), GlobalVariable.CustomConsumer)

    WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_password'), GlobalVariable.CustomPass)

    if (WebUI.verifyElementPresent(findTestObject('Utilities/Cookies/button_Accept Cookies'), 3) == true) {
        WebUI.waitForElementVisible(findTestObject('Utilities/Cookies/button_Accept Cookies'), 0)

        WebUI.click(findTestObject('Utilities/Cookies/button_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.click(findTestObject('CONSUMER/Login Buyer/button_SignIn'))
} else if (GlobalVariable.ConsumerAccountType == 'google') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'), 0)

    WebUI.click(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), 0)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_username'), GlobalVariable.GoogleConsumer)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_username'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Google Accounts/textbox_password'), GlobalVariable.GooglePass)

    WebUI.delay(1)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Google Accounts/button_next_password'))
} else if (GlobalVariable.ConsumerAccountType == 'facebook') {
    WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/span_Facebook Login'), 0)

    WebUI.click(findTestObject('MERCHANT/Login Seller/button_Facebook Login'))

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_email'), GlobalVariable.FacebookConsumer)

    WebUI.setText(findTestObject('ADMIN/Admin Login Page/Login Facebook/textbox_password'), GlobalVariable.FacebookPass)

    WebUI.click(findTestObject('ADMIN/Admin Login Page/Login Facebook/button_login'))
}

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/icon_Cart'), 0)

WebUI.verifyElementNotVisible(findTestObject('SUPERBABY/BUYER/Buyer Header/linktext_BEASELLER'), FailureHandling.STOP_ON_FAILURE)

