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

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Welcome Mail')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Welcome Mail'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Welcome Mail'))

WebUI.waitForElementVisible(findTestObject('EDM/Common/textlabel_Email Subject'), 0)

WebUI.click(findTestObject('EDM/Common/btn_Show Details'))

WebUI.verifyElementPresent(findTestObject('EDM/Welcome Mail/textfield_to'), 0)

strEmail = WebUI.getAttribute(findTestObject('EDM/Welcome Mail/textfield_to'), 'email')

WebUI.verifyElementAttributeValue(Email, 'email', to, 0)

WebUI.verifyElementPresent(findTestObject('EDM/Welcome Mail/textfield_cc'), 0)

strMail = WebUI.getAttribute(findTestObject('EDM/Welcome Mail/textfield_cc'), 'email')

WebUI.verifyElementAttributeValue(Mail, 'email', cc, 0)

WebUI.verifyElementText(findTestObject('EDM/Welcome Mail/textlabel_hi'), 'Hi buyer002 ,')

WebUI.verifyElementText(findTestObject('EDM/Welcome Mail/textlabel_Welcome to marketplace'), 'Welcome to marketplace!')

WebUI.verifyElementText(findTestObject('EDM/Welcome Mail/textlabel_We hope that you enjoy shopp'), 'We hope that you enjoy shopping at marketplace as much as we enjoy bringing you new content!')

WebUI.verifyElementText(findTestObject('EDM/Welcome Mail/textlabel_Your login ID is trishatest0'), 'Your login ID is trishatest01@gmail.com.')

WebUI.verifyElementPresent(findTestObject('EDM/Welcome Mail/btn_START SHOPPING'), 0)

WebUI.verifyElementPresent(findTestObject('EDM/Start Selling/textlabel_Regards'), 0)

WebUI.verifyTextPresent('Regards,', false)

WebUI.verifyElementPresent(findTestObject('EDM/Start Selling/marketplace Name'), 0)

WebUI.verifyTextPresent('0625UN', false)

not_run: WebUI.verifyElementText(findTestObject('EDM/Welcome Mail/url_https625un.test.arcadier.io'), 'https://625un.test.arcadier.io')

