import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Variant Options')

WebUI.waitForElementVisible(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/option 1'), 0)

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/option 1'), 'Color')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/choice 1'), 'Blue,')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/option 2'), 'Size')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/choice 2'), 'Small,Medium,')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/option 3'), 'Material')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants/choice 3'), 'Glass,Plastic,')

