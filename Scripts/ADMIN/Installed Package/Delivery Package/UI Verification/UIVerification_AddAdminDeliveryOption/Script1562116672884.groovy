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

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/sidemenu_Features Control'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/sidemenu_Features Control'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/icon_features'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery 2.0 List/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery 2.0 List/button_Add Delivery Option'), 
    0)

WebUI.click(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery 2.0 List/button_Add Delivery Option'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Delivery 2.0/icon_delivery 2.0'), 0)

WebUI.comment('UI')

WebUI.waitForElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Delivery Option Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_delivery option name'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Delivers to'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/dd_country'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Minimum lead time'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_minimum lead time'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Where are you delivering'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_delivering from'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Select if you would like'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/radio button_Weight (kg)'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/radio button_Price'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Delivery Rate(s)'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Name'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Range (kg)'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Delivery Cost'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/button_Add Delivery Rate'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_delivery rate name'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Range'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_range_start'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_range_end'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/radio button_Onwards'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlabel_Delivery Cost'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textbox_delivery cost'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/button_Save delivery rate'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/button_Save delivery'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Delivery 2.0/Delivery Edit/textlink_Cancel'), 0)

