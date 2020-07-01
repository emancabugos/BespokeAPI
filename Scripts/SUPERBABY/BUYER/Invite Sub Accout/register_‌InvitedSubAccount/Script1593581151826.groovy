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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.gmail.com')

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_username'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_username'), emailNotification)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_password'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_password'), emailPassword)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), subject)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Buyer Invite'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Buyer Invite'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/button_Create Account'), 0)

WebUI.click(findTestObject('ADMIN/Gmail Page/button_Create Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Register Page')

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_username'), 0)

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_firstname'), firstName)

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_lastname'), lastName)

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_username'), username)

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_password'), password)

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_reconfirm-password'), password)

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_notificationemail'), emailNotification)

WebUI.click(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/button_account-submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/icon_ViewCart'), 0)

WebUI.closeBrowser()

