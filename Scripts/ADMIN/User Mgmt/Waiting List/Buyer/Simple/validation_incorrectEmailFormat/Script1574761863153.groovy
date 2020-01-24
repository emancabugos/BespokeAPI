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

WebUI.click(findTestObject('ADMIN/Waiting List/button_Invite Consumer'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/a_InviteBuyer/textarea_Email'), 0)

WebUI.comment('Incorrect Email Format')

WebUI.setText(findTestObject('ADMIN/Waiting List/a_InviteBuyer/textarea_Email'), invalidEmail)

WebUI.click(findTestObject('ADMIN/Waiting List/a_InviteBuyer/button_Send'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/a_InviteBuyer/toaster_Waiting'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Waiting List/a_InviteBuyer/toaster_Waiting'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Waiting List/a_InviteBuyer/toaster_Waiting'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Waiting List/a_InviteBuyer/button_close'))

WebUI.delay(1)

