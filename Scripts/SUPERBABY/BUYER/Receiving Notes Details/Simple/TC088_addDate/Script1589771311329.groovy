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

WebUI.setText(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/textfield_Event'), 'Event01')
WebUI.click(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/button_AddNewEntry'))

timestamp = WebUI.getText(findTestObject('SUPERBABY/BUYER/Receiving Notes Details/value_Timestamp'))

KeywordLogger log = new KeywordLogger()
log.logInfo(timestamp)

LocalDateTime now = LocalDateTime.now()
DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd/MM/yyyy HH:mm')
String nowString = formatter.format(now)
log.logInfo(nowString)

WebUI.verifyMatch(timestamp, nowString, false)

