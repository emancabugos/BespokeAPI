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

WebUI.waitForElementPresent(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

if (payment == 'Stripe') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 'test321@gmail.com')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CardNumber'), '4242 4242 4242 4242')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_DateExpiry'), '1123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CVC'), '123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Name'), 'Jane Doe')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/button_Pay'))
} else if (payment == 'Paypal') {
    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', 
        true, 0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/tab_Paypal'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/tab_Paypal'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/textfield_Email'), 0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/textfield_Email'), 'hiveboxstaging03@yopmail.com')

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/textfield_Password'), 'welcome8')

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Login'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Pay'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Pay'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Return'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Return'))
} else if (payment == 'Omise') {
    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', 
        true, 0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/i_Frame'), 0)

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_CardNumber'), '4242424242424242')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_Name'), 'John Doe')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_Expiry'), '1123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_Security'), '123')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/button_PayNow'))
} else if (delivery == 'Custom') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), Custom, true)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'), 
        0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/textfield_Note'), 'test')

    WebUI.delay(1)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'))
}

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

