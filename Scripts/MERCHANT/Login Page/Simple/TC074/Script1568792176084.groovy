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

'Verify the redirection of Google button'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Landing Page/button_Sign in as Seller'), 0)

WebUI.click(findTestObject('CONSUMER/Landing Page/button_Sign in as Seller'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'), 0)

WebUI.click(findTestObject('CONSUMER/Login Buyer/button_GoogleLogin'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_username'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_username'), GlobalVariable.ConsumerNotif)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_username'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_password'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_password'), GlobalVariable.GoogleConsumer)

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('MERCHANT/Dashboard Page/textlabel_Dashboard'), 0)

WebUI.verifyElementVisible(findTestObject('MERCHANT/Dashboard Page/textlabel_Dashboard'))

WebUI.closeBrowser()

