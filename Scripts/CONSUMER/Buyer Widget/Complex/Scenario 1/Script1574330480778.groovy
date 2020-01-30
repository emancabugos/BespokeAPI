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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.comment('Search Item 01')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item01')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item01')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSupplier'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_ContactSupplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('null'), 0)

WebUI.waitForElementClickable(findTestObject('null'), 0)

WebUI.comment('Search Item 02')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item02')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item02')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSupplier'), 0)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_ContactSupplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('null'), 0)

WebUI.waitForElementClickable(findTestObject('null'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('MERCHANT/Inbox/Simple/goto_Inbox'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Create Offer for Item 01')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inbox/textlabel_Inbox'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textbox_search'), 'Item01')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Inbox/icon_search'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 'Item01')

WebUI.waitForElementAttributeValue(findTestObject('MERCHANT/Inbox/status_Enquiry'), 'text', 'ENQUIRY', 0)

WebUI.click(findTestObject('MERCHANT/Inbox/status_Enquiry'))

WebUI.waitForElementVisible(findTestObject(null), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/Chat Details Page/button_back'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/message_box'), 0)

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Create Offer'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), 0)

WebUI.setText(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), '5')

WebUI.setText(findTestObject('MERCHANT/Chat/a_Send Offer/textbox_price'), '2000')

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Send Offer'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Header/icon_inbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textfield_searchbar'), 0)

WebUI.comment('Create Offer for Item 02')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inbox/textlabel_Inbox'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textbox_search'), 'Item02')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Inbox/icon_search'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 'Item02')

WebUI.waitForElementAttributeValue(findTestObject('MERCHANT/Inbox/status_Enquiry'), 'text', 'ENQUIRY', 0)

WebUI.click(findTestObject('MERCHANT/Inbox/status_Enquiry'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/Chat Details Page/button_back'), 0)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/message_box'), 0)

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Create Offer'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), 0)

WebUI.setText(findTestObject('MERCHANT/Chat/a_Send Offer/textbox _quantity'), '5')

WebUI.setText(findTestObject('MERCHANT/Chat/a_Send Offer/textbox_price'), '2000')

WebUI.click(findTestObject('MERCHANT/Chat/a_Send Offer/button_Send Offer'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Utilities/Header/icon_inbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textfield_searchbar'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('MERCHANT/Inbox/Simple/goto_Inbox'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add to Comparison Table Item 01')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inbox/textlabel_Inbox'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textbox_search'), 'Item01')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Inbox/icon_search'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 'Item01')

WebUI.click(findTestObject('MERCHANT/Inbox/textlabel_itemname'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('null'), 0)

WebUI.click(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_arrowUp'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_AddListName'), 0)

WebUI.click(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_AddListName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_AddListName/textfield_ListName'), 0)

WebUI.setText(findTestObject('CONSUMER/Buyer Widget/a_AddListName/textfield_ListName'), 'List 01')

WebUI.click(findTestObject('CONSUMER/Buyer Widget/a_AddListName/button_Save'))

WebUI.waitForElementClickable(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_CompareNow'), 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Buyer Widget/a_Widget/dropdown_ListName'), 'List 01', true, 0)

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Delete/button_DeleteComparison'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Buyer Widget/a_insideWidget/textlabel_widgetItemName'), 'Item01')

WebUI.comment('Add To List 2')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_AddListName'), 0)

WebUI.click(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_AddListName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_AddListName/textfield_ListName'), 0)

WebUI.setText(findTestObject('CONSUMER/Buyer Widget/a_AddListName/textfield_ListName'), 'List 02')

WebUI.click(findTestObject('CONSUMER/Buyer Widget/a_AddListName/button_Save'))

WebUI.waitForElementClickable(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_CompareNow'), 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Buyer Widget/a_Widget/dropdown_ListName'), 'List 02', true, 0)

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Delete/button_DeleteComparison'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Buyer Widget/a_insideWidget/textlabel_widgetItemName'), 'Item01')

WebUI.back()

WebUI.comment('Add to Comparison Table Item 02 to List 02')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inbox/textlabel_Inbox'), 0)

WebUI.setText(findTestObject('MERCHANT/Inbox/textbox_search'), 'Item02')

WebUI.delay(2)

WebUI.click(findTestObject('MERCHANT/Inbox/icon_search'))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Inbox/textlabel_itemname'), 'Item02')

WebUI.click(findTestObject('MERCHANT/Inbox/textlabel_itemname'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('null'), 0)

WebUI.click(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_arrowUp'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Widget/button_AddListName'), 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Buyer Widget/a_Widget/dropdown_ListName'), 'List 02', true, 0)

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Delete/button_DeleteComparison'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Buyer Widget/a_insideWidget/textlabel_widgetItemName'), 'Item02')

WebUI.comment('Add to Comparison Table Item 02 to List 01')

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Buyer Widget/a_Widget/dropdown_ListName'), 'List 01', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyOptionSelectedByLabel(findTestObject('CONSUMER/Buyer Widget/a_Widget/dropdown_ListName'), 'List 01', true, 0)

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Buyer Widget/a_Delete/button_DeleteComparison'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Buyer Widget/a_insideWidget/textlabel_widgetItemName'), 'Item02')

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/button_ViewMoreCategories'), 0)

WebUI.click(findTestObject('CONSUMER/Homepage/icon_ComparisonList'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation List/breadcrumbs_Home'), 0)

TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//*[(text()="' + varItemname) + '")]')

WebUI.click(element)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/button_CreatePurchaseOrder'), 0)

WebUI.comment('Delivery Checkout Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

name = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Name'))

address = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Address'))

country = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Country'))

state = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_State'))

city = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_City'))

postalcode = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_PostalCode'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'))

WebUI.scrollToElement(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_ConsumerName'), name)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Address'), address)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Country'), country)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_City'), city)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_State'), state)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_PostalCode'), postalcode)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_radio1'))

WebUI.comment('Computation of Total Price')

actualSubtotal = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_SubTotalValue'))

WebUI.verifyEqual(df.format(subtotal), actualSubtotal)

delivery1 = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

delivery2 = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue2'))

WebUI.verifyEqual(delivery1, delivery2, FailureHandling.CONTINUE_ON_FAILURE)

def delivery = WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdelivery = new BigDecimal(delivery)

def total = intsubtotal + intdelivery

println(df.format(new BigDecimal(total)))

WebUI.verifyEqual(total, WebUI.getText(findTestObject('Object Repository/CONSUMER/Checkout Review Page/textlabel_TotalValue')), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'), 0)

invoice = WebUI.getText(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Transaction Complete Page/button_PurchaseHistory'))

WebUI.comment('Purchase History List')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Purchase History List/textfield_Search'), 0)

WebUI.sendKeys(findTestObject('CONSUMER/Purchase History List/textfield_Search'), invoice.toLowerCase())

WebUI.delay(1)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), 'text', invoice, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), invoice.toLowerCase())

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History List/tablecontent_Quantity'), quantityvalue)

ordertotal = WebUI.getText(findTestObject('CONSUMER/Purchase History List/tablecontent_Price'))

timestamp = WebUI.getText(findTestObject('CONSUMER/Purchase History List/tablecontent_Timestamp'))

WebUI.verifyEqual(df.format(total), ordertotal)

WebUI.comment('Verification on Purchase History Details')

WebUI.click(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'))

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_InvoiceIDValue'), invoice.toLowerCase(), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_TimestampValue'), timestamp, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_SubTotalValue'), df.format(subtotal), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_DeliveryCostsValue'), delivery, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_TotalValue'), df.format(total), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_PriceValue'), price, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History Details/textlabel_QtyValue'), quantityvalue, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.dragAndDropByOffset(findTestObject(null), 0, 5)

