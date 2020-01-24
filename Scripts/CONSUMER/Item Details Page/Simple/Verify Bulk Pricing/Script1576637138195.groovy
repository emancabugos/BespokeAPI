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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'item02')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.click(findTestObject('CONSUMER/Search Result Page/Item02/Item Name_Item02'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_Description'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/textlabel_Bulk Pricing'), 
    0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/textlabel_Quantity'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/textlabel_Discount per item'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_0 - 100'))

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_201 - 300'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_2'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_201 - 300'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_3'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_401 - 500'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_4'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_501 - 600'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_5'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_601 - 700'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_6'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_701 - 800'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_7'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_801 - 900'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_8'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_801 - 900'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_9'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/range_901 - 1000'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Item Details Page/Bulk Pricing for item02/td_10'), 0)
