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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

//WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)
//WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), '')
//WebUI.delay(5)
//WebElement element = WebUiCommonHelper.findWebElement(findTestObject('CONSUMER/Homepage/button_Search'), 30)
//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))
//WebUI.waitForElementVisible(findTestObject('null'), 0)
//WebUI.delay(2)
WebUI.waitForElementVisible(findTestObject('CONSUMER/Merchant Storefront/img_img-responsive'), 0)

WebUI.scrollToElement(findTestObject('CONSUMER/Merchant Storefront/img_img-responsive'), 0)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('CONSUMER/Merchant Storefront/img_img-responsive'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/linktext_SellerName'), 0)

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('CONSUMER/Item Details Page/linktext_SellerName'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))



