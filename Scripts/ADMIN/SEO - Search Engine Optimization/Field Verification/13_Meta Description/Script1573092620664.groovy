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

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Advanced'), 0)

WebUI.scrollToElement(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Account Settings'), 0)

WebUI.click(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Account Settings'))

WebUI.scrollToElement(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Content Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/New Sidebar Menu/sidemenu_Content Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/SEO/field verification/a_Layout'), 0)

WebUI.click(findTestObject('ADMIN/SEO/field verification/a_Layout'))

WebUI.waitForElementVisible(findTestObject('ADMIN/SEO/field verification/textlabel_mp desc'), 0)

marketplacedesc = WebUI.getText(findTestObject('ADMIN/SEO/field verification/textlabel_mp desc'))

WebUI.scrollToElement(findTestObject('ADMIN/New Sidebar Menu/sidemenu_AnalyticsSEO'), 0)

WebUI.click(findTestObject('ADMIN/New Sidebar Menu/sidemenu_AnalyticsSEO'))

WebUI.waitForElementVisible(findTestObject('ADMIN/SEO/a_SEO'), 0)

WebUI.click(findTestObject('ADMIN/SEO/a_SEO'))

WebUI.waitForElementVisible(findTestObject('ADMIN/SEO/textlabel_META DESCRIPTION - Search'), 0)

metadesc = WebUI.getAttribute(findTestObject('ADMIN/SEO/textarea_Meta Desc'), 'value')

WebUI.verifyMatch(marketplacedesc, metadesc, false)

