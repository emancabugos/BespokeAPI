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

WebUI.comment('Getting Started Step 1 UI')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/span_Welcome to Arcadier Marke'), 'Welcome to Arcadier Marketplaces!')

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/p_Get your marketplace up and'), 'Get your marketplace up and running with the steps below!')

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/div_How to get your first tran'), 'How to get your first transaction!')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/monitor_img'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/div_Step 1  Customise'), 'Step 1: Customise')

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/p_Make the marketplace yours w'), 'Make the marketplace yours with your logo, background(s), favicon, additional panels and other features.')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/monitor_img'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/div_Start Customising'), 0)

WebUI.comment('Click Learn More')

WebUI.click(findTestObject('ADMIN/Getting Started/video_tutorial'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 1/h1_Arcadiers Landing Page Feat'), 0)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.comment('Click Start Customising')

WebUI.click(findTestObject('ADMIN/Getting Started/div_Start Customising'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 1/h1_General'), 0)

WebUI.uploadFile(findTestObject('ADMIN/Getting Started/Step 1/input_favicon_1'), 'C:\\\\Katalon\\\\Image\\\\favicon1.png')

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 1/p_Favicon Uploaded'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 1/p_Favicon Uploaded'), 'Favicon Uploaded!')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 1/span_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 1/Success Toaster Message/div_SuccessYour favicon was su'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 1/Success Toaster Message/div_Your favicon was successfu'), 
    'Your favicon was successfully saved.')

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Getting Started/Step 1/Success Toaster Message/div_SuccessYour favicon was su'), 
    0)

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'))

