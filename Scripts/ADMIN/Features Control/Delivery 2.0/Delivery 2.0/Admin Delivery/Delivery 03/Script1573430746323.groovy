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

WebUI.callTestCase(findTestCase('SUPERBABY/ADMIN/Admin New Sidebar/Simple/68_redirectionDelivery'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Features Control/Delivery 2.0/Delivery 2.0 List Page/Complex/TC020'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_DeliveryOptionName'), 'Delivery 03')

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

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '0')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '20.75')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '15.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 2')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 02')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '20.76')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '40')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '30.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 3')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 03')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '40.01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '60.75')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '45.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 4')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 04')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '60.76')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '80')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '60.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 5')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 05')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '80.01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '100.75')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '75.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 6')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 06')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '100.76')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '120')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '90.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 7')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 07')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '120.01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '140.75')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '105.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 8')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 08')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '140.76')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '160')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '120.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 9')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 09')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '160.01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '180.75')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '135.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 10')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 10')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '180.76')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '200')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '150.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option List/button_Add Delivery Option'), 0)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

