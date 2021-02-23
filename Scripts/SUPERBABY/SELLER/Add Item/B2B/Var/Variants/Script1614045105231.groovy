import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), 0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Variants/toggle_variant'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Variant Options')

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 0)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option1'), 'Color')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices1'), 'Blue,')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option2'), 'Size')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices2'), 'Small,Medium,')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_option3'), 'Material')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/textbox_choices3'), 'Glass,Plastic,')

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

for (int pos = 1; pos <= rows_count; pos++) {
    TestObject element = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('/html/body/div[1]/div[2]/div[1]/div[3]/div/div[5]/div[2]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[' + 
        pos) + ']/td[6]/input')

    WebUI.setText(element, 'VARSKU' + pos)
}

WebUI.comment('Surcharge')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge1'), '10.5')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge2'), '1541.51')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge3'), '100.5')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varSurcharge/surcharge4'), '0.5')

WebUI.comment('Stock')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock1'), '100')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock2'), '5')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock3'), '0')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock4'), '1000')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock5'), '10')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock6'), '5')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock7'), '0')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Variants/varStock/stock8'), '1000')

