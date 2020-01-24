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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Order Confirmation')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_order confirmation'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_order confirmation'))

WebUI.waitForElementVisible(findTestObject('EDM/Common/textlabel_Email Subject'), 0)

WebUI.click(findTestObject('EDM/Common/btn_Show Details'))

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_to'), 0)

WebUI.verifyElementAttributeValue(Email, 'email', to, 0)

strEmail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_to'), 'email')

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_cc'), 0)

strMail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_cc'), 'email')

WebUI.verifyElementPresent(findTestObject('EDM/Received Orders/textlabel_Hi Trisha Buyer'), 0)

WebUI.verifyElementText(findTestObject('EDM/Received Orders/p_Weve received your order'), 'We’ve received your order!')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Thank you for placing your'), 'Thank you for placing your order with us. Your order will be ready shortly! We’ll notify you once your order is on its way, or when it’s ready for your collection!')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_If you have any questions'), 'If you have any questions, please contact us at 01qabonsol@gmail.com. If you wish to change your order please contact your seller directly and let us know.')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_INVOICE ID'), 'INVOICE ID 0625UN15711921148R1I')

WebUI.verifyElementPresent(findTestObject('EDM/Received Orders/textlabel_Timestamp'), 0)

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Item Name'), 'Item AAAA')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Qty'), 'Qty: 1')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Delivery'), 'Delivery')

WebUI.verifyElementPresent(findTestObject('EDM/Received Orders/textlabel_Item Price'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Received Orders/textlabel_Delivery Address'), 0)

WebUI.verifyElementText(findTestObject('EDM/Received Orders/Textlabel_Sub Total'), 'Sub TotalSGD 100.00')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Delivery Costs'), 'Delivery CostsSGD 10.00')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Bulk Costs'), 'Bulk Costs- SGD 0.00')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_TOTAL'), 'TOTAL')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Total Value'), 'SGD 110.00')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_Paid'), 'Paid')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/Textlabel_Paid Value'), 'SGD 0')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_To be collected'), 'To be collected')

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_To be collected value'), 'SGD 110.00')

WebUI.verifyElementPresent(findTestObject('EDM/Received Orders/btn_VIEW ORDERS'), 0)

WebUI.verifyElementText(findTestObject('EDM/Received Orders/textlabel_We hope to see you again soo'), 'We hope to see you again soon!')

WebUI.verifyElementPresent(findTestObject('EDM/Received Orders/textlabel_Regards'), 0)

