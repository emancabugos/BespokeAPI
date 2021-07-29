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

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/button_Enable'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/LinkText_Edit Welcome Mail'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Start Selling'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/LinkText_Edit Account Suspended'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Change of Payment'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/LinkText_Edit Reset password'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit New Order'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Received Order'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Order PickUp'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Review Prompt'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Order Shipped'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Offer from Seller'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Offer Declined'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Seller Invite'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Buyer Invite'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Message from Seller'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Message from Buyer'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Email Template/linktext_Edit Invite Merchant SubAcct'))

