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

WebUI.comment('MY')

for (int pos = 1; pos <= 8; pos++) {
    TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[1]/div[3]/div/div[11]/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[' + 
        pos) + ']/td[6]/input')

    WebUI.setText(element, 'VARSKU' + pos)
}

WebUI.comment('Surcharge')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc1'), '10.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc2'), '1541.51')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc3'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc4'), '10.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc5'), '1541.51')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc6'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc7'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/sc8'), '10.5')

WebUI.comment('Stock')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock1'), '100')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock2'), '5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock3'), '0')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock4'), '1000')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock5'), '10')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock6'), '5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock7'), '0')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/MY/stock8'), '1000') 
WebUI.comment('PH')

for (int pos = 1; pos <= 8; pos++) {
    TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[1]/div[3]/div/div[11]/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[' + 
        pos) + ']/td[6]/input')

    WebUI.setText(element, 'VARSKU' + pos)
}

WebUI.comment('Surcharge')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc1'), '10.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc2'), '1541.51')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc3'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc4'), '10.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc5'), '1541.51')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc6'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc7'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/sc8'), '10.5')

WebUI.comment('Stock')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock1'), '100')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock2'), '5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock3'), '0')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock4'), '1000')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock5'), '10')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock6'), '5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock7'), '0')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/PH/stock8'), '1000')

WebUI.comment('SG')

for (int pos = 1; pos <= 8; pos++) {
    TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[1]/div[3]/div/div[11]/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[' + 
        pos) + ']/td[6]/input')

    WebUI.setText(element, 'VARSKU' + pos)
}

WebUI.comment('Surcharge')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc1'), '10.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc2'), '1541.51')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc3'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc4'), '10.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc5'), '1541.51')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc6'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc7'), '100.5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/sc8'), '10.5')

WebUI.comment('Stock')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock1'), '100')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock2'), '5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock3'), '0')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock4'), '1000')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock5'), '10')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock6'), '5')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock7'), '0')

WebUI.setText(findTestObject('MERCHANT_UPDATE/Location ID/Variants/Variants PricingStock/SG/stock8'), '1000')

