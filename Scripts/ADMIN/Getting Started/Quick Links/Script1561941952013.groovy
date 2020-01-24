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

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Category Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_category'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Manage Categories  Sub-categ'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_category'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 2/Add Category/category_icon1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 2/Add Category/h1_Categories'), 'Categories')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Custom Field Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_custom field'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Add more fields for your lis'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_custom field'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Field/image1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Custom Field/h1_Custom Item Fields'), 'Custom Item Fields')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('General Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_general'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Customise logo homepage favi'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_general'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Step 1/image1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Getting Started/Step 1/h1_General'), 'General')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Custom Domain Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_custom domain'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Custom domain  SSL'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_(Starter  Above only)'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_custom domain'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Domain/image1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Custom Domain/h1_Custom Domain'), 'Custom Domain')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('External Link Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_external links'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Add your custom hyperlinks'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_external links'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/External Links/i_icon icon-hyperlink'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/External Links/h1_External Links'), 'External Links')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Private Marketplace')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_private marketplace'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Control who accesses your ma'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_private marketplace'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Private Settings/image1'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Private Settings/h1_Restricted Access Setting'), 'Restricted Access Setting')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Custom Code Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_custom code'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Input custom codes'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_(Basic  Above only)'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_custom code'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Code/i_icon icon-htmltag'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Custom Code/h1_Custom Code'), 'Custom Code')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Payment Config')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_payment'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Add  manage Payment Methods'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/i_icon icon-creditcard'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Configure Payments/h1_Payments'), 'Payments')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Invite Merchant')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_invie merchant'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_Manage  invite merchants'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_invie merchant'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Users/i_icon icon-users'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Admin Users/h1_Users'), 'Users')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.comment('Subscription Page')

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_subscription'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_View Subscription'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_subscription'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/i_icon icon-doller'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/h1_Subscription'), 'Subscription')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.click(findTestObject('ADMIN/Admin Permission/Admin Activity Log/a_Logout'))

