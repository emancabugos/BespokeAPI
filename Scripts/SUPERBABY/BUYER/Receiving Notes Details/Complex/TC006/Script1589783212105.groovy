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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

//WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/linktext_CreateNewNote'))
//WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'))
//WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/label_PO50311'))
//selectPO = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textfield_popupPO'), 'value')
//WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/button_popupYes'))
//POnumber = WebUI.getText(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/textlabelValue_PONo'))
WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/datepicker_datereceived'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/timepicker_timereceived'))

String gawadatereceived = WebUI.setText(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/timepicker_timereceived'), 
    '00:00', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/Page_0407bpth2/a_Create Receipt'))

WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes List/textlabelValue_ReceivingNotes'))

String datecreatedsaloob = WebUI.getAttribute(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/textlabelValue_DateReceived'), 
    'value')

WebUI.verifyMatch(datecreatedsaloob, gawadatereceived, false)

