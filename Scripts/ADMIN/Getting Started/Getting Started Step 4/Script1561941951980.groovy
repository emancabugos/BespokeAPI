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

WebUI.click(findTestObject('ADMIN/Getting Started/Arcadier_image link'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 3 Invite Merchant')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 'Welcome to Arcadier Marketplaces!')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/step2_arrow'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/step2_arrow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/step3_arrow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/div_Step 4  Invite your mercha'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/step4_image'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/p_Get your merchants on board'), 0)

WebUI.comment('Click video tutorial')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/Step4_video tutorial'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/Step4_video tutorial'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/yt-formatted-string_Sellers Ov'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('invite merchant')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/div_Start Inviting'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/div_Start Inviting'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/user page/h1_Users'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 4/user page/div_Invite Merchant'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/user page/div_Invite Merchant'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 4/Invite popup/div_Invite your sellers to onb'), 
    0)

WebUI.setText(findTestObject('ADMIN/Getting Started/Step 4/Invite popup/textarea_invite-sellers-email-'), 'arcadierteam1@gmail.com')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 4/Invite popup/input_btn-send-direct-invite'))

