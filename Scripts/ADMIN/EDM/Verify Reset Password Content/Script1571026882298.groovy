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

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'Reset Password')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_Reset Password'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_Reset Password'))

WebUI.waitForElementVisible(findTestObject('EDM/Common/textlabel_Email Subject'), 0)

WebUI.click(findTestObject('EDM/Common/btn_Show Details'))

WebUI.verifyElementPresent(findTestObject('EDM/Reset Password/textfield_to'), 0)

strEmail = WebUI.getAttribute(findTestObject('EDM/Reset Password/textfield_to'), 'email')

WebUI.verifyElementAttributeValue(Email, 'email', to, 0)

WebUI.verifyElementPresent(findTestObject('EDM/Reset Password/textfield_cc'), 0)

strMail = WebUI.getAttribute(findTestObject('EDM/Reset Password/textfield_cc'), 'email')

WebUI.verifyElementAttributeValue(Mail, 'email', cc, 0)

WebUI.verifyElementText(findTestObject('EDM/Reset Password/textlabel_Weve received a request to'), 'We’ve received a request to reset the password for 0625UN.')

WebUI.verifyElementText(findTestObject('EDM/Reset Password/textlabel_Please reset your password'), 'Please reset your password by clicking here ')

WebUI.verifyElementText(findTestObject('EDM/Reset Password/linktext_resetUrl'), 'https://625un.test.arcadier.io/user/marketplace/resetpassword?userId=62646&code=KRex%2b9RZXUfY18LFew7lTnnToE2Kh4DAw7HK%2fXqbjfjdL0L59KBj99pmn52BJj%2b58if1L2bsEudyuoIhb7YHS3lJ5gs0mSWolLesDjjXbm6rJkM9QuMqSVqfr1D2U1vEi12qVvhIm8MXxypcN2Ju6NuWGbo%3d')

WebUI.verifyElementText(findTestObject('EDM/Reset Password/textlabel_If you did not request to ch'), 'If you did not request to change your password, please contact your marketplace administrator immediately.')

