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

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Order Shipped')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Order Shipped'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Order Shipped'))

WebUI.waitForElementVisible(findTestObject('EDM/Common/textlabel_Email Subject'), 0)

WebUI.click(findTestObject('EDM/Common/btn_Show Details'))

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_to'), 0)

WebUI.verifyElementAttributeValue(Email, 'email', to, 0)

strEmail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_to'), 'email')

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_cc'), 0)

strMail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_cc'), 'email')

WebUI.verifyElementText(findTestObject('EDM/Order Shipped/textlabel_Hi Trisha'), 'Hi trisha,')

WebUI.verifyElementText(findTestObject('EDM/Order Shipped/textlabel_Your order has been shipped'), 'Your order has been shipped!')

WebUI.verifyElementText(findTestObject('EDM/Order Shipped/textlabel_INVOICE ID'), 'INVOICE ID 0625un15711921148r1i')

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/textlabel_timestamp'), 0)

WebUI.verifyElementText(findTestObject('EDM/Order Shipped/textlabel_Item Name'), 'Item AAAA')

WebUI.verifyElementText(findTestObject('EDM/Order Shipped/textlabel_Qty'), 'Qty: 1')

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/textlabel_Delivery'), 0)

WebUI.verifyElementText(findTestObject('EDM/Order Shipped/textlabel_Item Price'), 'SGD $24.50')

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/textlabel_notifEmail'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/textlabel_Delivery Address'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/btn_VIEW ORDERS'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/textlabel_This will be at your doors'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/textlabel_Regards'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Shipped/link_url'), 0)

