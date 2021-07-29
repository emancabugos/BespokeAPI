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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SUPERBABY/BUYER/Checkout Flow/Spot - Off (B2B)/Receiving Notes/navigate_RecevingNotes'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabelValue_ReceivingNotes'))

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/textlabel_ReceivingNotes'), 0)

valuern = WebUI.getText(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/textlabelValue_ReceivingNotes01'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/button_VoidReceipt'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/a_Void Popup/button_Okay'), 0)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/a_Void Popup/button_Okay'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabelValue_ReceivingNotes'), 0)

WebUI.setText(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_Search'), valuern)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_Apply'))

WebUI.delay(2)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabelValue_ReceivingNotes'))

WebUI.verifyElementVisible(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/button_AddNewEntry'))

WebUI.verifyElementClickable(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/button_AddNewEntry'))

WebUI.mouseOver(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/button_AddNewEntry'))

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

