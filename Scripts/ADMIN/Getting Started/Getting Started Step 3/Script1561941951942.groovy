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

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Arcadier_image link'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Arcadier_image link'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 3 Payment')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 'Welcome to Arcadier Marketplaces!')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/button_arrow'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/button_arrow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/div_Step 3  Add your payment m'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 3/step3_image'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/div_Step 3  Add your payment m'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 3/p_Make sure to set up your pay'), 'Make sure to set up your payment methods to enable online transactions on your marketplace.')

WebUI.comment('Click video tutorial')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/step 3_video'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/step 3_video'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/yt-formatted-string_Payments H'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('add payment')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/button_arrow left'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 3/div_Add Payments'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/div_Add Payments'))

WebUI.comment('Custom Payment')

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Add a custom payment method'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Add a custom payment method'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/input_payment-method-name'), 0)

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/input_payment-method-name'), 'Handshake')

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/textarea_custom-gateway-descri'), 'Custom Payment')

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/handshake'), 'https://cash.test.arcadier.io/payment/generatepaykey')

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/input_redirect-endpoint-url'), 'https://cash.test.arcadier.io/paypal/index')

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/div_Browse'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Configure Payments/Custom Payment/input_thumb'), 'C:\\\\Katalon\\\\Image\\\\logo1.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/div_btn btn-success btn-ok'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/div_btn btn-success btn-ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save Photo'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save Photo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/div_payment-status-color2'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/toggle_mandatory stripe'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 3/button_im done here'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/button_im done here'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

