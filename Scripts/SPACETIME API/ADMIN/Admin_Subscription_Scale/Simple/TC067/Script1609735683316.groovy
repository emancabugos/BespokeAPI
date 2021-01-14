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

WebUI.verifyElementPresent(findTestObject('SPACETIME API/ADMIN/PopUp Calendly_Subscription/textfield_Name_full_name'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME API/ADMIN/PopUp Calendly_Subscription/textfield_Email_email'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME API/ADMIN/PopUp Calendly_Subscription/button_Add Guests'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME API/ADMIN/PopUp Calendly_Subscription/textfield_Any specific concerns to raise during the call_question_2'), 
    0)

WebUI.click(findTestObject('SPACETIME API/ADMIN/PopUp Calendly_Subscription/button_Schedule Event'))

WebUI.verifyElementPresent(findTestObject('SPACETIME API/ADMIN/PopUp Calendly_Subscription/errorMsg_Cant be blank'), 0)

