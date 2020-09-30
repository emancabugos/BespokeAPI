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

WebUI.callTestCase(findTestCase('SUPERBABY/ADMIN/Admin New Sidebar/Simple/29_redirectionFeatureToggle'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/button_featureEdit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Features Control/Delivery 2.0/Delivery 2.0 List Page/Complex/TC020'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_DeliveryOptionName'), 'Delivery 07')

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_arrowDown'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'), 'Singapore')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_SG'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_SG'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'), 'Philippines')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_PH'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_PH'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'), 'Malaysia')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_MY'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/checkbox_Country_MY'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/button_deleteCountry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/selected_Country'))

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), '2-3 days')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_WhereAreYouDelivering'), 'MAKATI')

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/textlabel_radioSelection'), 0)

WebUI.comment('Range 1')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '50')

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/label_Onwards'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '100')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option List/button_Add Delivery Option'), 0)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

