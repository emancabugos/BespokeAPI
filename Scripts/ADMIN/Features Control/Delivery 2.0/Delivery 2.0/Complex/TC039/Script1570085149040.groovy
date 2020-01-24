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

'Empty Delivering From'
WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/textlabel_DeliveryOptionName'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_DeliveryOptionName'), 'Delivery 01')

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_arrowDown'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_SG'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'), 'Singapore')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_SG'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_SG'))

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), '1 Week')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_WhereAreYouDelivering'), '')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/end_Range'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_DeliveryRateName'), 'Rate 1')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/start_Range'), '1')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/end_Range'), '2')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_deliveryCost'), '1.50')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'))

WebUI.comment('Verification red highlight ')

WebUI.refresh()

