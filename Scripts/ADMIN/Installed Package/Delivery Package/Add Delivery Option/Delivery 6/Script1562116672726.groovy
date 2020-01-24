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

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/Plug Ins/sidemenu_Plug-ins'), 0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/Plug Ins/sidemenu_Plug-ins'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/Plug Ins/sidemenu_Delivery 2.0'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/Plug Ins/sidemenu_Delivery 2.0'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'), 0)

if (WebUI.verifyElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/button_Edit')) == true) {
    WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'))
} else {
    findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit')

    WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), null)

    WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_Save'))

    WebUI.waitForElementNotClickable(findTestObject('ADMIN/Installed Packages/Delivery Package/textfield_Unit'), 0)

    WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/button_AddDeliveryOption'))
}

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveryOptionName'), 
    'Admin Delivery 6')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/dropdown_Country'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/linktext_SelectAll'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/textfield_Country'), 
    'Afghanistan')

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/checkbox_Country'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/checkbox_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/z_Country/selected_Country'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_MinimumleadTime'), 
    '1 week')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/textfield_DeliveringFrom'), 
    'Philippines')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Delivery Rate 1')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/label_Onwards'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_Range'), 
    0)

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_Range'), '5')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '20')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_Save'))

