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

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/textlabel_Customize the email'), 0)

if (WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable')))
 {
    WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/LinkText_Edit Welcome Mail'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Save1'), 0)
	
} else if (WebUI.verifyElementNotVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'))) {
    WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Enable'))

    WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/button_Enable'))

    WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'))

    WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/LinkText_Edit Welcome Mail'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Save1'), 0)

    if (true) {
        WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Show Cc  Bcc'))

        WebUI.click(findTestObject('ADMIN/Email Notifications/Welcome Mail/ToggleBtn_onoffswitch-inner'))

        WebUI.waitForElementClickable(findTestObject('ADMIN/Email Notifications/Welcome Mail/ToggleBtn_onoffswitch-inner'), 
            0)

        WebUI.click(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Show Cc  Bcc'))

        WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/textfield_SentFrom'), 0)

        WebUI.setText(findTestObject('ADMIN/Email Notifications/Welcome Mail/textfield_SentFrom'), 'qajanaluz@gmail.com')

        WebUI.setText(findTestObject('ADMIN/Email Notifications/Welcome Mail/textfield_subject'), 'Welcome Email Automation')

        WebUI.click(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Save1'))

        WebUI.verifyMatch('qajanaluz@mail.com', 'qajanaluz@mail.com', false)

        WebUI.verifyMatch('Welcome Email Automation', 'Welcome Email Automation', false)
    } else {
        WebUI.verifyElementClickable(findTestObject('ADMIN/Email Notifications/Welcome Mail/ToggleBtn_onoffswitch-inner'))

        WebUI.click(findTestObject('ADMIN/Email Notifications/Welcome Mail/ToggleBtn_onoffswitch-inner'))

        WebUI.waitForElementClickable(findTestObject('ADMIN/Email Notifications/Welcome Mail/ToggleBtn_onoffswitch-inner'), 
            0)

        WebUI.click(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Show Cc  Bcc'))

        WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/textfield_SentFrom'), 0)

        WebUI.setText(findTestObject('ADMIN/Email Notifications/Welcome Mail/textfield_SentFrom'), 'qajanaluz@gmail.com')

        WebUI.setText(findTestObject('ADMIN/Email Notifications/Welcome Mail/textfield_subject'), 'Welcome Email Automation')

        WebUI.click(findTestObject('ADMIN/Email Notifications/Welcome Mail/Btn_Save1'))

        WebUI.verifyMatch('qajanaluz@mail.com', 'qajanaluz@mail.com', false)

        WebUI.verifyMatch('Welcome Email Automation', 'Welcome Email Automation', false)
    }
}

