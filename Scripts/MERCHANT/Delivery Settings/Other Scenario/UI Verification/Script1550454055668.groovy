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

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Page_0201bp1 (1)/dropdown_Seller'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Page_0201bp1 (1)/dropdown_Seller'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Page_0201bp1 (1)/button_Delivery'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Page_0201bp1 (1)/dropdown_Seller'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Dashboard'), 0)

WebUI.verifyTextPresent('DASHBOARD', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Your Items'), 0)

WebUI.verifyTextPresent('YOUR ITEMS', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Upload'), 0)

WebUI.verifyTextPresent('UPLOAD', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Orders'), 0)

WebUI.verifyTextPresent('UPLOAD', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/image_translation'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/textlabel_EN'), 0)

WebUI.verifyTextPresent('EN', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/textlabel_sellername'), 0)

WebUI.verifyTextPresent(GlobalVariable.CustomMerchant, false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/dropdown_sellername'), 0)

WebUI.click(findTestObject('MERCHANT/Delivery Settings/Header/dropdown_sellername'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Purchases'), 0)

WebUI.verifyTextPresent('Purchases', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Settings'), 0)

WebUI.verifyTextPresent('Settings', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Header/button_Change Password'), 0)

WebUI.verifyTextPresent('Change Password', false)

WebUI.waitForElementPresent(findTestObject('MERCHANT/Delivery Settings/Header/button_Logout'), 0)

WebUI.verifyTextPresent('Logout', false)

WebUI.comment('marketplacelogo')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/image_marketplacelogo'), 0)

//WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/textfield_search'), 0)
//WebUI.waitForElementAttributeValue(findTestObject('MERCHANT/Delivery Settings/Search Header/textfield_search'), 'placeholder', 
//  'Search...', 0)
//WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/dropdownlist_All Categories'), 0)
//WebUI.verifyTextPresent('All Categories', false)
WebUI.verifyTextPresent('Delivery', false)

WebUI.verifyElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/button_mail'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/textlabel_cartcount'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/textlabel_cartcount'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/Search Header/textlabel_More'), 0)

WebUI.verifyTextPresent('MORE', false)

WebUI.comment('')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_Delivery Settings'), 0)

WebUI.verifyTextPresent('Delivery Settings', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_DeliveryOptions'), 0)

WebUI.verifyTextPresent('DELIVERY OPTIONS', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_DO Name'), 0)

WebUI.verifyTextPresent('NAME', false)

WebUI.waitForElementPresent(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_Delivers To'), 0)

WebUI.verifyTextPresent('DELIVERS TO', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_Add Delivery Option'), 0)

WebUI.verifyTextPresent('Add Delivery Option', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_doname values'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_dodeliversto values'), 
    0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_view'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_toggle'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_edit'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_deleteDO'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_PickupOptions'), 0)

WebUI.verifyTextPresent('PICK-UP OPTIONS', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel__Define the full address wher'), 
    0)

WebUI.verifyTextPresent('Define the full address where the buyer can pick-up from', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel__POName'), 0)

WebUI.verifyTextPresent('NAME', false)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/button_Add Pick-up Option'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Delivery Settings/DeliveryOptions/textlabel_PO values'), 0)

WebUI.verifyTextPresent('Add Pick-up Option', false)

