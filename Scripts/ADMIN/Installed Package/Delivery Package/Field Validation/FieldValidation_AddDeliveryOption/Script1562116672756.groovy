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

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), 0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotClickable(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Validation for empty Delivery Option Name')

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_DeliveryOptionName'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/arrowdown_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/selected_Country'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveringFrom'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_deleteDeliveyRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Weight'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for empty Delivers to')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveryOptionName'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveringFrom'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_deleteDeliveyRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Weight'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for empty Minimum lead time')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveryOptionName'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/arrowdown_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/selected_Country'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveringFrom'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_deleteDeliveyRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Weight'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for empty Where are you delivering from')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveryOptionName'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/arrowdown_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/selected_Country'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_deleteDeliveyRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textlabel_Weight'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for Empty Delivery Rate Name')

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for Empty Range from')

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for Empty Range to')

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for Empty Delivery Cost')

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for greater value of Range from ')

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/errortext_message'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/errortext_message'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.comment('Validation for same value')

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/errortext_message'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/errortext_message'), 
    0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    FailureHandling.STOP_ON_FAILURE)

