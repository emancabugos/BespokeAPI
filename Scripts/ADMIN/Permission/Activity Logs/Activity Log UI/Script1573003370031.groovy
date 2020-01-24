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

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log/sidemenu_Admin Permission'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/sidemenu_Admin Permission'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log/sidemenu_ActivityLog'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/img_beta1'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/sidemenu_ActivityLog'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/Admin Activity Log/textlabel_Activity Log'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/icon_notebook'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Permission/Admin Activity Log/textlabel_Activity Log'), 'Activity Log')

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/img_beta2'), 0)

WebUI.verifyTextPresent('Please note that this feature is in beta, if you face any difficulties kindly let us know!', false)

WebUI.verifyTextPresent('The feature will be available for Growth and Scale users when fully released.', false)

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyTextPresent('See 3 list of activities happening in your marketplace', false)

WebUI.verifyTextPresent('You can also export your log for external use', false)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/hyperlinktext_Login'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/hyperlinktext_Pages'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/hyperlinktext_Item'), 0)

WebUI.verifyTextPresent('From:', false)

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyTextPresent('To:', false)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/datepicker_toDate'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Permission/Admin Activity Log/button_Export Log'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

WebUI.closeBrowser()

