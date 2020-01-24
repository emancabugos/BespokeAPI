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

WebUI.refresh()

WebUI.verifyElementVisible(findTestObject('ADMIN/Account Info/Account details/label_Old password'))

WebUI.setText(findTestObject('ADMIN/Account Info/Account details/label_Old password'), 'qwert')

WebUI.verifyElementVisible(findTestObject('ADMIN/Account Info/Account details/textbox_password'))

WebUI.setText(findTestObject('ADMIN/Account Info/Account details/textbox_password'), 'qaqw')

WebUI.verifyElementVisible(findTestObject('ADMIN/Account Info/Account details/textbox_confirm-password'))

WebUI.setText(findTestObject('ADMIN/Account Info/Account details/textbox_confirm-password'), 'test')

WebUI.click(findTestObject('ADMIN/Account Info/Account details/button_Save'))

WebUI.verifyElementText(findTestObject('ADMIN/Account Info/Account details/div_The passwords do not seem'), 'The passwords do not seem to match')

