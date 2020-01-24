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

WebUI.comment('assume user is toggled on')

WebUI.waitForElementVisible(findTestObject('ADMIN/New Sidebar Menu/a_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/New Sidebar Menu/a_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/a_Users'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/a_Users'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/button_Invite Merchant'), 0)

WebUI.setText(findTestObject('ADMIN/User Mgmt/Users Page/textfield_searchdisplaynameNotif'), GlobalVariable.userdisabled)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/button_Search'))

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/toggle_usersettings'))

WebUI.delay(5)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Landing Page/button_Buyer Sign in'), 0)

WebUI.click(findTestObject('CONSUMER/Landing Page/button_Buyer Sign in'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/textfield_username'), 0)

WebUI.delay(5)

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_username'), GlobalVariable.userdisabled)

WebUI.delay(5)

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_password'), GlobalVariable.userdisabledpass)

WebUI.click(findTestObject('CONSUMER/Login Buyer/button_SignIn'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/toaster_OopsSorry Your login detai'), 0)

