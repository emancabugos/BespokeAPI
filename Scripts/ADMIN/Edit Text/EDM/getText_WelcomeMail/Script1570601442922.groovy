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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_Hi'), 0)

strWelcome = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_Welcome'))

strHi = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_Hi'))

strWelcome2 = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_Welcome2'))

strWeHope = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_WeHope'))

strLogin = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_Login'))

strShopping = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_StartShopping'))

strRegards = WebUI.getText(findTestObject('ADMIN/Edit Text/Welcome Mail/textfield_Regards'))

WebUI.callTestCase(findTestCase('Utilities/ADMIN/email_Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Welcome to Kinly')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Buyer Invite'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Buyer Invite'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/button_Create Account'), 0)

WebUI.click(findTestObject('ADMIN/Gmail Page/button_Create Account'), FailureHandling.CONTINUE_ON_FAILURE)

