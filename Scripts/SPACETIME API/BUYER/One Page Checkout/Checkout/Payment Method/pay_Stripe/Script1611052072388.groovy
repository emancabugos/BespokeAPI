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

WebUI.scrollToElement(findTestObject('SPACETIME API/BUYER/One Page Checkout/a_Pay/togglebutton_Pay'), 0)

WebUI.click(findTestObject('SPACETIME API/BUYER/One Page Checkout/a_Pay/togglebutton_Pay'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/BUYER/One Page Checkout/a_Pay/dropdown_Pay'), 0)

WebUI.click(findTestObject('SPACETIME API/BUYER/One Page Checkout/a_Pay/dropdown_Pay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/BUYER/One Page Checkout/a_Pay/dropdown_Pay'), 'Stripe', false)

WebUI.click(findTestObject('SPACETIME API/BUYER/One Page Checkout/a_Order Total/button_PayNow'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/textfield_Email'), 0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/textfield_Email'), 'test321@gmail.com')

WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/textfield_CardNumber'), '4242 4242 4242 4242')

WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/textfield_DateExpiry'), '1123')

WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/textfield_CVC'), '123')

WebUI.sendKeys(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/textfield_Name'), 'Jane Doe')

WebUI.delay(0.5)

WebUI.click(findTestObject('SUPERBABY/BUYER/One Requisition Page (B2C)/a_Stripe_New/button_Pay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0.5)

