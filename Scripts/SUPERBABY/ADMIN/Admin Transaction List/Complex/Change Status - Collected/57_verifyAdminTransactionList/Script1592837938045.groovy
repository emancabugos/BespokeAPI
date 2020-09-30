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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('SUPERBABY/ADMIN/Admin Transaction List/a_NavigateToTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Search Order Status\r\n'
WebUI.setText(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/textfield_SearchTransaction'), '')

WebUI.click(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/button_Apply'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/dropdown_OrderStatus'), 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('SUPERBABY/ADMIN/Admin Transaction List/dropdown_OrderStatus'), 'Collected', 
    false, 0)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

