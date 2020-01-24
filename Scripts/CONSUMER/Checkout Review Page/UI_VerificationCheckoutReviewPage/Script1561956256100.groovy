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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/button_Previous'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_SellerName'), '')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/image_ItemName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_ItemName'), '')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_currency'))

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_itempriceValue'), '')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_Quantity'))

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_quantityValue'), '')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_SelectDeliveryMethod'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_MinimumLeadTime'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_MLTvalue'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_DeliveryCost1'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_deliverycostValue1'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_OrderSummary'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_DeliveryAddress'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/linktext_Edit'))

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_ConsumerName'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Address'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Country'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_City'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_State'), '')

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_PostalCode'), '')

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_SubTotal'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_DeliveryCost2'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/textlabel_Total'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'))

