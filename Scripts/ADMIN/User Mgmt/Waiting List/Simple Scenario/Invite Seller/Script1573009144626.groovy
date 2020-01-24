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

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/textlink_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/textlink_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/sidemenu_Waiting List'), 0)

WebUI.click(findTestObject('ADMIN/Waiting List/sidemenu_Waiting List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/button_Invite Merchants'), 0)

WebUI.click(findTestObject('ADMIN/Waiting List/button_Invite Merchants'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/a_Invite Popup/textlabel_Invite your Merchant to on'), 0)

WebUI.setText(findTestObject('ADMIN/Waiting List/a_Invite Popup/textarea_email'), GlobalVariable.MerchantNotif)

WebUI.click(findTestObject('ADMIN/Waiting List/a_Invite Popup/button_send'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/a_Invite Popup/toaster_success'), 0)

WebUI.verifyElementNotPresent(findTestObject('ADMIN/Waiting List/a_Invite Popup/toaster_success'), 0)

