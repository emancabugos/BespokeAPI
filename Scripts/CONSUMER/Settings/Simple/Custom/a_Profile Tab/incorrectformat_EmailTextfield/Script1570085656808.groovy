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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('add Display Name')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_DisplayName'), displayName)

WebUI.comment('add First Name')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_FirstName'), firstName)

WebUI.comment('add Last Name')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_LastName'), lastName)

WebUI.comment('add Email')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Email'), email)

WebUI.comment('Contact No')

WebUI.setText(findTestObject('CONSUMER/Settings/textfield_Contact'), '')

WebUI.scrollToElement(findTestObject('CONSUMER/Settings/button_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Settings/button_Next'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Settings/textfield_DisplayName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

