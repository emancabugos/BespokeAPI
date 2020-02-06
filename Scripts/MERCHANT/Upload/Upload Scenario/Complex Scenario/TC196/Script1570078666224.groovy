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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.comment('Country')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), 'Philippines')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), 
    0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Edit Bulk Pricing')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_price'), '69.50')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/radiobutton_Onwards'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/purchase_onwards'), '1')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/Delete/button_delete'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlink_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

