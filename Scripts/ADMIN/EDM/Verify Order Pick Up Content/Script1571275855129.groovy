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

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Order Pickup')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Order Pickup'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Order Pickup'))

WebUI.waitForElementVisible(findTestObject('EDM/Common/textlabel_Email Subject'), 0)

WebUI.click(findTestObject('EDM/Common/btn_Show Details'))

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_to'), 0)

WebUI.verifyElementAttributeValue(Email, 'email', to, 0)

strEmail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_to'), 'email')

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_cc'), 0)

strMail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_cc'), 'email')

WebUI.verifyElementText(findTestObject('EDM/Order Pick Up/textlabel_Hi'), 'Hi trisha,')

WebUI.verifyElementText(findTestObject('EDM/Order Pick Up/textlabel_Your order is ready for pick'), 'Your order is ready for pick up!')

WebUI.verifyElementText(findTestObject('EDM/Order Pick Up/textlabel_INVOICE ID'), 'INVOICE ID 0625un1571275527irmb')

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/textlabel_timestamp'), 0)

WebUI.verifyElementText(findTestObject('EDM/Order Pick Up/textlabel_Item Name'), 'Item AAAA')

WebUI.verifyElementText(findTestObject('EDM/Order Pick Up/textlabel_Qty'), 'Qty: 1')

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/textlabel_ Pickupvalue'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/textlabel_Item Price'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/textlabel_NotifEmail'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/btn_VIEW ORDERS'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/textlabel_Please pick up your item f'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/textlabel_Regards'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Order Pick Up/linktext_url'), 0)

