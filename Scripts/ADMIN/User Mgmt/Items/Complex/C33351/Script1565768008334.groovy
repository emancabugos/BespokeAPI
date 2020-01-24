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

'Items found must be updated\r\n'
WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/textlink_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/textlink_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Items/linktext_Items'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Items/linktext_Items'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Items/button_DownloadCSV'), 0)

itemfound = WebUI.getText(findTestObject('ADMIN/User Mgmt/Items/value_itemsFound'))

WebUI.setText(findTestObject('ADMIN/User Mgmt/Items/textfield_search'), '')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/User Mgmt/Items/button_Search'))

WebUI.waitForElementAttributeValue(findTestObject('ADMIN/User Mgmt/Items/linktext_itemName'), '', '', 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Items/button_Delete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Items/button_popupDelete'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Items/button_popupDelete'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Items/toaster_deleteDesc'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/User Mgmt/Items/toaster_deletePopup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/User Mgmt/Items/toaster_deleteTitle'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/User Mgmt/Items/toaster_deleteDesc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

itemfound2 = WebUI.getText(findTestObject('ADMIN/User Mgmt/Items/value_itemsFound'))

WebUI.verifyLessThan(itemfound2, itemfound)

