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

WebUI.verifyElementClickable(findTestObject('CONSUMER/Evaluation List/Delete Popup/delete icon'), FailureHandling.CONTINUE_ON_FAILURE)

listName = WebUI.getText(findTestObject('CONSUMER/Evaluation List/table_LIST NAME'))

WebUI.click(findTestObject('CONSUMER/Evaluation List/Delete Popup/delete icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation List/Delete Popup/textalbel_Okay'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation List/Delete Popup/textalbel_Okay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CONSUMER/Evaluation List/Delete Popup/delete icon'), 0)

WebUI.delay(0)

WebUI.verifyTextNotPresent(listName, false)

WebUI.comment('Verify Evaluation Table')

WebUI.verifyElementClickable(findTestObject('CONSUMER/Evaluation List/table_LIST NAME'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CONSUMER/Evaluation List/table_LIST NAME'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'), 0)

WebUI.verifyElementPresent(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'), 0)

WebUI.verifyOptionNotPresentByLabel(findTestObject('CONSUMER/Evaluation Table/dropdown_ListName'), listName, false, 0)

WebUI.callTestCase(findTestCase('CONSUMER/Search Result Page/Search per Page/Item Details Page/navigate_ItemDetails_Page'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), 15)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'))

WebUI.delay(2)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/textfield_Quantity'), '50')

WebUI.delay(2)

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_Compare'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_delete'), 0)

WebUI.verifyOptionNotPresentByLabel(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'), listName, false, 0)

