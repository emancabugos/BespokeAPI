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

WebUI.verifyElementVisible(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Email Notifications'))

WebUI.click(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Email Notifications'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'))

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Offer Declined'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Offer Declined'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/textlabel_Arcadier allows you to custo'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/textlabel_Arcadier allows you to custo'))

