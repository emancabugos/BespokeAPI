import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('ADMIN/Setup Payments/a_CustomPayment/button_EditSettings'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_CustomPayment/textfield_PaymentMethod'), 0)

WebUI.setText(findTestObject('ADMIN/Setup Payments/a_CustomPayment/textfield_PaymentMethod'), 'Custom Payment')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_CustomPayment/button_Browse'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_ImageUpload/imageholder_CustomPayment'), 0)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Setup Payments/a_ImageUpload/imageholder_CustomPayment'), 'C:\\Katalon\\Core\\Images\\UN Items\\item1.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_ImageUpload/button_ZoomIn'), 0)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_ImageUpload/button_Okay'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_ImageUpload/button_SavePhoto'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_ImageUpload/button_SavePhoto'))

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Setup Payments/a_CustomPayment/textarea_CustomPayment'), 'Custom Payment')

WebUI.setText(findTestObject('ADMIN/Setup Payments/a_CustomPayment/textfield_HandshakeConnectionURL'), 'https://cash.test.arcadier.io/payment/generatepaykey')

WebUI.setText(findTestObject('ADMIN/Setup Payments/a_CustomPayment/textfield_RedirectURL'), 'https://cash.test.arcadier.io/cash/agreement')

WebUI.scrollToElement(findTestObject('ADMIN/Setup Payments/a_CustomPayment/button_Save'), 0)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_CustomPayment/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

