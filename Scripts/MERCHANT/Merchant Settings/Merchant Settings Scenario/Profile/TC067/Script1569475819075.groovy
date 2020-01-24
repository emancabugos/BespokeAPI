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
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_display_name'), 'UNSeller')

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_description'), 'Cool Milk Tea')

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), ' ')

WebUI.sendKeys(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_last_name'), 'Cool')

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_email'), 'arcadier.tester1@gmail.com')

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_contact'), '+63123456789')

WebUI.setText(findTestObject('MERCHANT/User Settings/Profile/textbox_seller-location'), 'Sorsogon')

WebUI.click(findTestObject('MERCHANT/User Settings/Profile/button_Next_profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/User Settings/Profile/textbox_first_name'), 'value', '', 0)

